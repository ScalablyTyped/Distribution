package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestBodyObject extends js.Object {
  var content: org.scalablytyped.runtime.StringDictionary[MediaTypeObject]
  var description: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestBodyObject {
  @scala.inline
  def apply(
    content: org.scalablytyped.runtime.StringDictionary[MediaTypeObject],
    description: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestBodyObject = {
    val __obj = js.Dynamic.literal(content = content)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[RequestBodyObject]
  }
}

