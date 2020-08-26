package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseObject extends js.Object {
  var content: js.UndefOr[StringDictionary[MediaTypeObject]] = js.native
  var description: String = js.native
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.native
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.native
}

object ResponseObject {
  @scala.inline
  def apply(description: String): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  @scala.inline
  implicit class ResponseObjectOps[Self <: ResponseObject] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: StringDictionary[MediaTypeObject]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setLinks(value: StringDictionary[ReferenceObject | LinkObject]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
  }
  
}

