package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDocumentStyleRequest extends js.Object {
  
  /**
    * The styles to set on the document. Certain document style changes may cause other changes in order to mirror the behavior of the Docs editor. See the documentation of DocumentStyle
    * for more information.
    */
  var documentStyle: js.UndefOr[DocumentStyle] = js.native
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `document_style` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the background, set `fields` to `"background"`.
    */
  var fields: js.UndefOr[String] = js.native
}
object UpdateDocumentStyleRequest {
  
  @scala.inline
  def apply(): UpdateDocumentStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocumentStyleRequest]
  }
  
  @scala.inline
  implicit class UpdateDocumentStyleRequestOps[Self <: UpdateDocumentStyleRequest] (val x: Self) extends AnyVal {
    
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
    def setDocumentStyle(value: DocumentStyle): Self = this.set("documentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentStyle: Self = this.set("documentStyle", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
}
