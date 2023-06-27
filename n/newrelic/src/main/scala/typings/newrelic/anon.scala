package typings.newrelic

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CollectPendingData extends StObject {
    
    var collectPendingData: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var waitForIdle: js.UndefOr[Boolean] = js.undefined
  }
  object CollectPendingData {
    
    inline def apply(): CollectPendingData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectPendingData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectPendingData] (val x: Self) extends AnyVal {
      
      inline def setCollectPendingData(value: Boolean): Self = StObject.set(x, "collectPendingData", value.asInstanceOf[js.Any])
      
      inline def setCollectPendingDataUndefined: Self = StObject.set(x, "collectPendingData", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWaitForIdle(value: Boolean): Self = StObject.set(x, "waitForIdle", value.asInstanceOf[js.Any])
      
      inline def setWaitForIdleUndefined: Self = StObject.set(x, "waitForIdle", js.undefined)
    }
  }
  
  trait CustomAttributes extends StObject {
    
    var customAttributes: StringDictionary[String | Double | Boolean]
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    @JSName("error.expected")
    var errorDotexpected: Boolean
    
    @JSName("http.method")
    var httpDotmethod: String
    
    @JSName("http.statusCode")
    var httpDotstatusCode: String
    
    @JSName("request.uri")
    var requestDoturi: String
  }
  object CustomAttributes {
    
    inline def apply(
      customAttributes: StringDictionary[String | Double | Boolean],
      errorDotexpected: Boolean,
      httpDotmethod: String,
      httpDotstatusCode: String,
      requestDoturi: String
    ): CustomAttributes = {
      val __obj = js.Dynamic.literal(customAttributes = customAttributes.asInstanceOf[js.Any])
      __obj.updateDynamic("error.expected")(errorDotexpected.asInstanceOf[js.Any])
      __obj.updateDynamic("http.method")(httpDotmethod.asInstanceOf[js.Any])
      __obj.updateDynamic("http.statusCode")(httpDotstatusCode.asInstanceOf[js.Any])
      __obj.updateDynamic("request.uri")(requestDoturi.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomAttributes] (val x: Self) extends AnyVal {
      
      inline def setCustomAttributes(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorDotexpected(value: Boolean): Self = StObject.set(x, "error.expected", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHttpDotmethod(value: String): Self = StObject.set(x, "http.method", value.asInstanceOf[js.Any])
      
      inline def setHttpDotstatusCode(value: String): Self = StObject.set(x, "http.statusCode", value.asInstanceOf[js.Any])
      
      inline def setRequestDoturi(value: String): Self = StObject.set(x, "request.uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasToRemoveScriptWrapper extends StObject {
    
    var hasToRemoveScriptWrapper: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object HasToRemoveScriptWrapper {
    
    inline def apply(): HasToRemoveScriptWrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasToRemoveScriptWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasToRemoveScriptWrapper] (val x: Self) extends AnyVal {
      
      inline def setHasToRemoveScriptWrapper(value: Boolean): Self = StObject.set(x, "hasToRemoveScriptWrapper", value.asInstanceOf[js.Any])
      
      inline def setHasToRemoveScriptWrapperUndefined: Self = StObject.set(x, "hasToRemoveScriptWrapper", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  trait ModuleName extends StObject {
    
    var moduleName: String
    
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    def onRequire(): Unit
  }
  object ModuleName {
    
    inline def apply(moduleName: String, onRequire: () => Unit): ModuleName = {
      val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], onRequire = js.Any.fromFunction0(onRequire))
      __obj.asInstanceOf[ModuleName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleName] (val x: Self) extends AnyVal {
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnRequire(value: () => Unit): Self = StObject.set(x, "onRequire", js.Any.fromFunction0(value))
    }
  }
}
