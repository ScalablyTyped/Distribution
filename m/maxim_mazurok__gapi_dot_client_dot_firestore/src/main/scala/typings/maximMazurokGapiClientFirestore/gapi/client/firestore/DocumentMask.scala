package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMask extends StObject {
  
  /** The list of field paths in the mask. See Document.fields for a field path syntax reference. */
  var fieldPaths: js.UndefOr[js.Array[String]] = js.undefined
}
object DocumentMask {
  
  @scala.inline
  def apply(): DocumentMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMask]
  }
  
  @scala.inline
  implicit class DocumentMaskMutableBuilder[Self <: DocumentMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldPaths(value: js.Array[String]): Self = StObject.set(x, "fieldPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldPathsUndefined: Self = StObject.set(x, "fieldPaths", js.undefined)
    
    @scala.inline
    def setFieldPathsVarargs(value: String*): Self = StObject.set(x, "fieldPaths", js.Array(value :_*))
  }
}
