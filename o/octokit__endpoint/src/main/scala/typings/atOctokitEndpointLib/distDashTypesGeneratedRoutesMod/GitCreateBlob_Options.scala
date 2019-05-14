package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateBlob_Options extends js.Object {
  var content: java.lang.String
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object GitCreateBlob_Options {
  @scala.inline
  def apply(
    content: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    encoding: java.lang.String = null
  ): GitCreateBlob_Options = {
    val __obj = js.Dynamic.literal(content = content, owner = owner, repo = repo)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[GitCreateBlob_Options]
  }
}

