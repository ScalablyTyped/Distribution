package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DocumentCreated object, for use in `documentCreated.set({ ... })`. */
@js.native
trait DocumentCreatedUpdateData extends js.Object {
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc..
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var body: js.UndefOr[BodyUpdateData] = js.native
  /**
    *
    * Gets the properties of the document.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.native
}

object DocumentCreatedUpdateData {
  @scala.inline
  def apply(): DocumentCreatedUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCreatedUpdateData]
  }
  @scala.inline
  implicit class DocumentCreatedUpdateDataOps[Self <: DocumentCreatedUpdateData] (val x: Self) extends AnyVal {
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
    def setBody(value: BodyUpdateData): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setProperties(value: DocumentPropertiesUpdateData): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

