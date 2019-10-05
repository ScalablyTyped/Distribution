package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingObject extends js.Object {
  var allowReserved: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var explode: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

object EncodingObject {
  @scala.inline
  def apply(
    allowReserved: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    explode: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[ReferenceObject | HeaderObject] = null,
    style: String = null
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

