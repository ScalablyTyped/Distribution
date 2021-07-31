package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentsTarget extends StObject {
  
  /**
    * The names of the documents to retrieve. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will fail if any of the document is not
    * a child resource of the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String]] = js.undefined
}
object DocumentsTarget {
  
  @scala.inline
  def apply(): DocumentsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentsTarget]
  }
  
  @scala.inline
  implicit class DocumentsTargetMutableBuilder[Self <: DocumentsTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value :_*))
  }
}
