package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReadme_Options extends js.Object {
  var owner: java.lang.String
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
}

object ReposGetReadme_Options {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, ref: java.lang.String = null): ReposGetReadme_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ReposGetReadme_Options]
  }
}

