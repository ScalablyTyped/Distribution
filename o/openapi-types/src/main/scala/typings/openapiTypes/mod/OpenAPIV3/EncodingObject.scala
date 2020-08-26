package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingObject extends js.Object {
  var allowReserved: js.UndefOr[Boolean] = js.native
  var contentType: js.UndefOr[String] = js.native
  var explode: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.native
  var style: js.UndefOr[String] = js.native
}

object EncodingObject {
  @scala.inline
  def apply(): EncodingObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingObject]
  }
  @scala.inline
  implicit class EncodingObjectOps[Self <: EncodingObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowReserved(value: Boolean): Self = this.set("allowReserved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReserved: Self = this.set("allowReserved", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setExplode(value: Boolean): Self = this.set("explode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplode: Self = this.set("explode", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

