package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Write extends StObject {
  
  /** An optional precondition on the document. The write will fail if this is set and not met by the target document. */
  var currentDocument: js.UndefOr[Precondition] = js.undefined
  
  /** A document name to delete. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. */
  var delete: js.UndefOr[String] = js.undefined
  
  /** Applies a transformation to a document. */
  var transform: js.UndefOr[DocumentTransform] = js.undefined
  
  /** A document to write. */
  var update: js.UndefOr[Document] = js.undefined
  
  /**
    * The fields to update in this write. This field can be set only when the operation is `update`. If the mask is not set for an `update` and the document exists, any existing data will
    * be overwritten. If the mask is set and the document on the server has fields not covered by the mask, they are left unchanged. Fields referenced in the mask, but not present in the
    * input document, are deleted from the document on the server. The field paths in this mask must not contain a reserved field name.
    */
  var updateMask: js.UndefOr[DocumentMask] = js.undefined
  
  /**
    * The transforms to perform after update. This field can be set only when the operation is `update`. If present, this write is equivalent to performing `update` and `transform` to the
    * same document atomically and in order.
    */
  var updateTransforms: js.UndefOr[js.Array[FieldTransform]] = js.undefined
}
object Write {
  
  @scala.inline
  def apply(): Write = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Write]
  }
  
  @scala.inline
  implicit class WriteMutableBuilder[Self <: Write] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentDocument(value: Precondition): Self = StObject.set(x, "currentDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDocumentUndefined: Self = StObject.set(x, "currentDocument", js.undefined)
    
    @scala.inline
    def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setTransform(value: DocumentTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setUpdate(value: Document): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMask(value: DocumentMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    @scala.inline
    def setUpdateTransforms(value: js.Array[FieldTransform]): Self = StObject.set(x, "updateTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTransformsUndefined: Self = StObject.set(x, "updateTransforms", js.undefined)
    
    @scala.inline
    def setUpdateTransformsVarargs(value: FieldTransform*): Self = StObject.set(x, "updateTransforms", js.Array(value :_*))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
