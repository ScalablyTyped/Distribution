package typings.ngFacebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<facebook-js-sdk.facebook.InitParams> */
  @js.native
  trait PartialInitParams extends StObject {
    
    var appId: js.UndefOr[String] = js.native
    
    var autoLogAppEvents: js.UndefOr[Boolean] = js.native
    
    var cookie: js.UndefOr[Boolean] = js.native
    
    var frictionlessRequests: js.UndefOr[Boolean] = js.native
    
    var hideFlashCallback: js.UndefOr[Boolean] = js.native
    
    var status: js.UndefOr[Boolean] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var xfbml: js.UndefOr[Boolean] = js.native
  }
  object PartialInitParams {
    
    @scala.inline
    def apply(): PartialInitParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInitParams]
    }
    
    @scala.inline
    implicit class PartialInitParamsMutableBuilder[Self <: PartialInitParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setAutoLogAppEvents(value: Boolean): Self = StObject.set(x, "autoLogAppEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLogAppEventsUndefined: Self = StObject.set(x, "autoLogAppEvents", js.undefined)
      
      @scala.inline
      def setCookie(value: Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setFrictionlessRequests(value: Boolean): Self = StObject.set(x, "frictionlessRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionlessRequestsUndefined: Self = StObject.set(x, "frictionlessRequests", js.undefined)
      
      @scala.inline
      def setHideFlashCallback(value: Boolean): Self = StObject.set(x, "hideFlashCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideFlashCallbackUndefined: Self = StObject.set(x, "hideFlashCallback", js.undefined)
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setXfbml(value: Boolean): Self = StObject.set(x, "xfbml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXfbmlUndefined: Self = StObject.set(x, "xfbml", js.undefined)
    }
  }
}
