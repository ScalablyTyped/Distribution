package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentTransform extends StObject {
  
  /** The name of the document to transform. */
  var document: js.UndefOr[String] = js.native
  
  /** The list of transformations to apply to the fields of the document, in order. This must not be empty. */
  var fieldTransforms: js.UndefOr[js.Array[FieldTransform]] = js.native
}
object DocumentTransform {
  
  @scala.inline
  def apply(): DocumentTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTransform]
  }
  
  @scala.inline
  implicit class DocumentTransformMutableBuilder[Self <: DocumentTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setFieldTransforms(value: js.Array[FieldTransform]): Self = StObject.set(x, "fieldTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformsUndefined: Self = StObject.set(x, "fieldTransforms", js.undefined)
    
    @scala.inline
    def setFieldTransformsVarargs(value: FieldTransform*): Self = StObject.set(x, "fieldTransforms", js.Array(value :_*))
  }
}
