package typings.nodeGcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error extends StObject {
    
    var error: js.UndefOr[String] = js.native
    
    var message_id: js.UndefOr[String] = js.native
    
    var registration_id: js.UndefOr[String] = js.native
  }
  object Error {
    
    @scala.inline
    def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage_idUndefined: Self = StObject.set(x, "message_id", js.undefined)
      
      @scala.inline
      def setRegistration_id(value: String): Self = StObject.set(x, "registration_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistration_idUndefined: Self = StObject.set(x, "registration_id", js.undefined)
    }
  }
}
