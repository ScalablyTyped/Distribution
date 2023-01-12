package typings.openapiFramework

import org.scalablytyped.runtime.Instantiable1
import typings.openapiDefaultSetter.mod.IOpenAPIDefaultSetter
import typings.openapiDefaultSetter.mod.OpenAPIDefaultSetterArgs
import typings.openapiRequestCoercer.mod.IOpenAPIRequestCoercer
import typings.openapiRequestCoercer.mod.OpenAPIRequestCoercerArgs
import typings.openapiRequestValidator.mod.IOpenAPIRequestValidator
import typings.openapiRequestValidator.mod.OpenAPIRequestValidatorArgs
import typings.openapiResponseValidator.mod.IOpenAPIResponseValidator
import typings.openapiResponseValidator.mod.OpenAPIResponseValidatorArgs
import typings.openapiSecurityHandler.mod.IOpenAPISecurityHandler
import typings.openapiSecurityHandler.mod.OpenAPISecurityHandlerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Coercer extends StObject {
    
    var coercer: js.UndefOr[Instantiable1[/* args */ OpenAPIRequestCoercerArgs, IOpenAPIRequestCoercer]] = js.undefined
    
    var defaultSetter: js.UndefOr[Instantiable1[/* args */ OpenAPIDefaultSetterArgs, IOpenAPIDefaultSetter]] = js.undefined
    
    var requestValidator: js.UndefOr[Instantiable1[/* args */ OpenAPIRequestValidatorArgs, IOpenAPIRequestValidator]] = js.undefined
    
    var responseValidator: js.UndefOr[
        Instantiable1[/* args */ OpenAPIResponseValidatorArgs, IOpenAPIResponseValidator]
      ] = js.undefined
    
    var securityHandler: js.UndefOr[Instantiable1[/* args */ OpenAPISecurityHandlerArgs, IOpenAPISecurityHandler]] = js.undefined
  }
  object Coercer {
    
    inline def apply(): Coercer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Coercer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Coercer] (val x: Self) extends AnyVal {
      
      inline def setCoercer(value: Instantiable1[/* args */ OpenAPIRequestCoercerArgs, IOpenAPIRequestCoercer]): Self = StObject.set(x, "coercer", value.asInstanceOf[js.Any])
      
      inline def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      inline def setDefaultSetter(value: Instantiable1[/* args */ OpenAPIDefaultSetterArgs, IOpenAPIDefaultSetter]): Self = StObject.set(x, "defaultSetter", value.asInstanceOf[js.Any])
      
      inline def setDefaultSetterUndefined: Self = StObject.set(x, "defaultSetter", js.undefined)
      
      inline def setRequestValidator(value: Instantiable1[/* args */ OpenAPIRequestValidatorArgs, IOpenAPIRequestValidator]): Self = StObject.set(x, "requestValidator", value.asInstanceOf[js.Any])
      
      inline def setRequestValidatorUndefined: Self = StObject.set(x, "requestValidator", js.undefined)
      
      inline def setResponseValidator(value: Instantiable1[/* args */ OpenAPIResponseValidatorArgs, IOpenAPIResponseValidator]): Self = StObject.set(x, "responseValidator", value.asInstanceOf[js.Any])
      
      inline def setResponseValidatorUndefined: Self = StObject.set(x, "responseValidator", js.undefined)
      
      inline def setSecurityHandler(value: Instantiable1[/* args */ OpenAPISecurityHandlerArgs, IOpenAPISecurityHandler]): Self = StObject.set(x, "securityHandler", value.asInstanceOf[js.Any])
      
      inline def setSecurityHandlerUndefined: Self = StObject.set(x, "securityHandler", js.undefined)
    }
  }
  
  trait DefaultSetter extends StObject {
    
    var coercer: js.UndefOr[IOpenAPIRequestCoercer] = js.undefined
    
    var defaultSetter: js.UndefOr[IOpenAPIDefaultSetter] = js.undefined
    
    var requestValidator: js.UndefOr[IOpenAPIRequestValidator] = js.undefined
    
    var responseValidator: js.UndefOr[IOpenAPIResponseValidator] = js.undefined
    
    var securityHandler: js.UndefOr[IOpenAPISecurityHandler] = js.undefined
  }
  object DefaultSetter {
    
    inline def apply(): DefaultSetter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSetter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultSetter] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enum] (val x: Self) extends AnyVal {
      
      inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
    }
  }
}
