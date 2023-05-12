package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentCoreOptions extends StObject {
  
  var documentID: Double
}
object DocumentCoreOptions {
  
  inline def apply(documentID: Double): DocumentCoreOptions = {
    val __obj = js.Dynamic.literal(documentID = documentID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentCoreOptions] (val x: Self) extends AnyVal {
    
    inline def setDocumentID(value: Double): Self = StObject.set(x, "documentID", value.asInstanceOf[js.Any])
  }
}
