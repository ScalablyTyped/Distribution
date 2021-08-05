package typings.nestdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait NewDoc[T /* <: G */, G] extends StObject {
    
    var newDoc: T
    
    var oldDoc: T
  }
  object NewDoc {
    
    inline def apply[T /* <: G */, G](newDoc: T, oldDoc: T): NewDoc[T, G] = {
      val __obj = js.Dynamic.literal(newDoc = newDoc.asInstanceOf[js.Any], oldDoc = oldDoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewDoc[T, G]]
    }
    
    extension [Self <: NewDoc[?, ?], T /* <: G */, G](x: Self & (NewDoc[T, G])) {
      
      inline def setNewDoc(value: T): Self = StObject.set(x, "newDoc", value.asInstanceOf[js.Any])
      
      inline def setOldDoc(value: T): Self = StObject.set(x, "oldDoc", value.asInstanceOf[js.Any])
    }
  }
}
