package typings.nestdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait NewDoc[T /* <: G */, G] extends StObject {
    
    var newDoc: T = js.native
    
    var oldDoc: T = js.native
  }
  object NewDoc {
    
    @scala.inline
    def apply[T /* <: G */, G](newDoc: T, oldDoc: T): NewDoc[T, G] = {
      val __obj = js.Dynamic.literal(newDoc = newDoc.asInstanceOf[js.Any], oldDoc = oldDoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewDoc[T, G]]
    }
    
    @scala.inline
    implicit class NewDocMutableBuilder[Self <: NewDoc[_, _], T /* <: G */, G] (val x: Self with (NewDoc[T, G])) extends AnyVal {
      
      @scala.inline
      def setNewDoc(value: T): Self = StObject.set(x, "newDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldDoc(value: T): Self = StObject.set(x, "oldDoc", value.asInstanceOf[js.Any])
    }
  }
}
