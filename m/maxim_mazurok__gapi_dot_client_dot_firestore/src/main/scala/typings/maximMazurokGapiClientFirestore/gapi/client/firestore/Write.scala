package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Write extends js.Object {
  
  /** An optional precondition on the document. The write will fail if this is set and not met by the target document. */
  var currentDocument: js.UndefOr[Precondition] = js.native
  
  /** A document name to delete. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. */
  var delete: js.UndefOr[String] = js.native
  
  /** Applies a transformation to a document. */
  var transform: js.UndefOr[DocumentTransform] = js.native
  
  /** A document to write. */
  var update: js.UndefOr[Document] = js.native
  
  /**
    * The fields to update in this write. This field can be set only when the operation is `update`. If the mask is not set for an `update` and the document exists, any existing data will
    * be overwritten. If the mask is set and the document on the server has fields not covered by the mask, they are left unchanged. Fields referenced in the mask, but not present in the
    * input document, are deleted from the document on the server. The field paths in this mask must not contain a reserved field name.
    */
  var updateMask: js.UndefOr[DocumentMask] = js.native
  
  /**
    * The transforms to perform after update. This field can be set only when the operation is `update`. If present, this write is equivalent to performing `update` and `transform` to the
    * same document atomically and in order.
    */
  var updateTransforms: js.UndefOr[js.Array[FieldTransform]] = js.native
}
object Write {
  
  @scala.inline
  def apply(): Write = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Write]
  }
  
  @scala.inline
  implicit class WriteOps[Self <: Write] (val x: Self) extends AnyVal {
    
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
    def setCurrentDocument(value: Precondition): Self = this.set("currentDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentDocument: Self = this.set("currentDocument", js.undefined)
    
    @scala.inline
    def setDelete(value: String): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setTransform(value: DocumentTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setUpdate(value: Document): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: DocumentMask): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
    
    @scala.inline
    def setUpdateTransformsVarargs(value: FieldTransform*): Self = this.set("updateTransforms", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTransforms(value: js.Array[FieldTransform]): Self = this.set("updateTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTransforms: Self = this.set("updateTransforms", js.undefined)
  }
}
