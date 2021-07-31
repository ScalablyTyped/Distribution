package typings.neteaseCaptcha

import typings.neteaseCaptcha.neteaseCaptchaStrings.`zh-CN`
import typings.neteaseCaptcha.neteaseCaptchaStrings.embed
import typings.neteaseCaptcha.neteaseCaptchaStrings.en
import typings.neteaseCaptcha.neteaseCaptchaStrings.float
import typings.neteaseCaptcha.neteaseCaptchaStrings.http
import typings.neteaseCaptcha.neteaseCaptchaStrings.https
import typings.neteaseCaptcha.neteaseCaptchaStrings.popup
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NeteaseCaptcha {
  
  trait Config extends StObject {
    
    /**
      * Verification code id
      */
    var captchaId: String
    
    /**
      * Selector string or HTMLElement to render widget into
      */
    var element: String | HTMLElement
    
    /**
      * Defaults to 'zh-CN'
      */
    var lang: js.UndefOr[`zh-CN` | en] = js.undefined
    
    /**
      * Defaults to 'float' on desktop, and 'popup' on mobile
      */
    var mode: js.UndefOr[float | embed | popup] = js.undefined
    
    var onReady: js.UndefOr[js.Function1[/* instance */ Instance, Unit]] = js.undefined
    
    var onVerify: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ Data, Unit]] = js.undefined
    
    /**
      * Defaults to page protocol
      */
    var protocol: js.UndefOr[http | https] = js.undefined
    
    /**
      * Defaults to 'auto'
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(captchaId: String, element: String | HTMLElement): Config = {
      val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptchaId(value: String): Self = StObject.set(x, "captchaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: String | HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: `zh-CN` | en): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMode(value: float | embed | popup): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnReady(value: /* instance */ Instance => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnVerify(value: (/* error */ js.Any, /* data */ Data) => Unit): Self = StObject.set(x, "onVerify", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnVerifyUndefined: Self = StObject.set(x, "onVerify", js.undefined)
      
      @scala.inline
      def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var validate: String
  }
  object Data {
    
    @scala.inline
    def apply(validate: String): Data = {
      val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidate(value: String): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
  
  type InitFunction = js.Function3[
    /* config */ Config, 
    /* onLoad */ js.UndefOr[onLoad], 
    /* onError */ js.UndefOr[onError], 
    Unit
  ]
  
  trait Instance extends StObject {
    
    /**
      * Destroy the current instance
      */
    def destroy(): Unit
    
    /**
      * Available when the mode is set to 'popup' - opens the popup to accept verification
      */
    var popUp: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Refresh the instance to get new verification information
      */
    def refresh(): Unit
  }
  object Instance {
    
    @scala.inline
    def apply(destroy: () => Unit, refresh: () => Unit): Instance = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPopUp(value: () => Unit): Self = StObject.set(x, "popUp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPopUpUndefined: Self = StObject.set(x, "popUp", js.undefined)
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
  
  type onError = js.Function1[/* error */ js.Any, Unit]
  
  type onLoad = js.Function1[/* instance */ Instance, Unit]
}
