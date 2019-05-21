package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateEndpoint extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var files: js.Object
  var `files.content`: js.UndefOr[java.lang.String] = js.undefined
  var public: js.UndefOr[scala.Boolean] = js.undefined
}

object GistsCreateEndpoint {
  @scala.inline
  def apply(
    files: js.Object,
    description: java.lang.String = null,
    `files.content`: java.lang.String = null,
    public: js.UndefOr[scala.Boolean] = js.undefined
  ): GistsCreateEndpoint = {
    val __obj = js.Dynamic.literal(files = files)
    if (description != null) __obj.updateDynamic("description")(description)
    if (`files.content` != null) __obj.updateDynamic("files.content")(`files.content`)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    __obj.asInstanceOf[GistsCreateEndpoint]
  }
}

