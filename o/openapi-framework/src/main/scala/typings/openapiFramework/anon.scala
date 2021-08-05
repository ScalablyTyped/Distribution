package typings.openapiFramework

import typings.openapiDefaultSetter.mod.IOpenAPIDefaultSetter
import typings.openapiRequestCoercer.mod.IOpenAPIRequestCoercer
import typings.openapiRequestValidator.mod.IOpenAPIRequestValidator
import typings.openapiResponseValidator.mod.IOpenAPIResponseValidator
import typings.openapiSecurityHandler.mod.IOpenAPISecurityHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Coercer extends StObject {
    
    var coercer: js.UndefOr[IOpenAPIRequestCoercer] = js.undefined
    
    var defaultSetter: js.UndefOr[IOpenAPIDefaultSetter] = js.undefined
    
    var requestValidator: js.UndefOr[IOpenAPIRequestValidator] = js.undefined
    
    var responseValidator: js.UndefOr[IOpenAPIResponseValidator] = js.undefined
    
    var securityHandler: js.UndefOr[IOpenAPISecurityHandler] = js.undefined
  }
  object Coercer {
    
    inline def apply(): Coercer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Coercer]
    }
    
    extension [Self <: Coercer](x: Self) {
      
      inline def setCoercer(value: IOpenAPIRequestCoercer): Self = StObject.set(x, "coercer", value.asInstanceOf[js.Any])
      
      inline def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      inline def setDefaultSetter(value: IOpenAPIDefaultSetter): Self = StObject.set(x, "defaultSetter", value.asInstanceOf[js.Any])
      
      inline def setDefaultSetterUndefined: Self = StObject.set(x, "defaultSetter", js.undefined)
      
      inline def setRequestValidator(value: IOpenAPIRequestValidator): Self = StObject.set(x, "requestValidator", value.asInstanceOf[js.Any])
      
      inline def setRequestValidatorUndefined: Self = StObject.set(x, "requestValidator", js.undefined)
      
      inline def setResponseValidator(value: IOpenAPIResponseValidator): Self = StObject.set(x, "responseValidator", value.asInstanceOf[js.Any])
      
      inline def setResponseValidatorUndefined: Self = StObject.set(x, "responseValidator", js.undefined)
      
      inline def setSecurityHandler(value: IOpenAPISecurityHandler): Self = StObject.set(x, "securityHandler", value.asInstanceOf[js.Any])
      
      inline def setSecurityHandlerUndefined: Self = StObject.set(x, "securityHandler", js.undefined)
    }
  }
  
  trait Enum extends StObject {
    
    var `enum`: js.Array[String]
  }
  object Enum {
    
    inline def apply(`enum`: js.Array[String]): Enum = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enum]
    }
    
    extension [Self <: Enum](x: Self) {
      
      inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
    }
  }
}
