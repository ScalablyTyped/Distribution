package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateLabel_Options extends js.Object {
  var color: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesCreateLabel_Options {
  @scala.inline
  def apply(
    color: java.lang.String,
    name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    description: java.lang.String = null
  ): IssuesCreateLabel_Options = {
    val __obj = js.Dynamic.literal(color = color, name = name, owner = owner, repo = repo)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IssuesCreateLabel_Options]
  }
}

