package typings.passportApple

import typings.passportApple.passportAppleStrings.`name email`
import typings.passportApple.passportAppleStrings.form_post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Responsemode extends StObject {
    
    var response_mode: form_post = js.native
    
    var response_type: `name email` = js.native
    
    var scope: `name email` = js.native
    
    var state: js.UndefOr[String] = js.native
  }
  object Responsemode {
    
    @scala.inline
    def apply(response_mode: form_post, response_type: `name email`, scope: `name email`): Responsemode = {
      val __obj = js.Dynamic.literal(response_mode = response_mode.asInstanceOf[js.Any], response_type = response_type.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Responsemode]
    }
    
    @scala.inline
    implicit class ResponsemodeMutableBuilder[Self <: Responsemode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse_mode(value: form_post): Self = StObject.set(x, "response_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_type(value: `name email`): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: `name email`): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
