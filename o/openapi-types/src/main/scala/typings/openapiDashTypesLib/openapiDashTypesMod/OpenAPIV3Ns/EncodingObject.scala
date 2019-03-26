package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingObject extends js.Object {
  var allowReserved: js.UndefOr[scala.Boolean] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var explode: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object EncodingObject {
  @scala.inline
  def apply(
    allowReserved: js.UndefOr[scala.Boolean] = js.undefined,
    contentType: java.lang.String = null,
    explode: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[ReferenceObject | HeaderObject] = null,
    style: java.lang.String = null
  ): EncodingObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowReserved)) __obj.updateDynamic("allowReserved")(allowReserved)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(explode)) __obj.updateDynamic("explode")(explode)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[EncodingObject]
  }
}

