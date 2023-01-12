package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCommonExceptionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithCode
    - typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithMessage
    - typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithName
    - java.lang.String
  */
  type Exception = _Exception | String
  
  trait ExceptionWithCode
    extends StObject
       with _Exception {
    
    var code: String | Double
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ExceptionWithCode {
    
    inline def apply(code: String | Double): ExceptionWithCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionWithCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionWithCode] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait ExceptionWithMessage
    extends StObject
       with _Exception {
    
    var code: js.UndefOr[String | Double] = js.undefined
    
    var message: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ExceptionWithMessage {
    
    inline def apply(message: String): ExceptionWithMessage = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionWithMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionWithMessage] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait ExceptionWithName
    extends StObject
       with _Exception {
    
    var code: js.UndefOr[String | Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ExceptionWithName {
    
    inline def apply(name: String): ExceptionWithName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptionWithName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptionWithName] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait _Exception extends StObject
  object _Exception {
    
    inline def ExceptionWithCode(code: String | Double): typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithCode]
    }
    
    inline def ExceptionWithMessage(message: String): typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithMessage = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithMessage]
    }
    
    inline def ExceptionWithName(name: String): typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.opentelemetryApi.buildSrcCommonExceptionMod.ExceptionWithName]
    }
  }
}
