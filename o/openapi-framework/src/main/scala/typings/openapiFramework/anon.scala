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
    
    @scala.inline
    def apply(): Coercer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Coercer]
    }
    
    @scala.inline
    implicit class CoercerMutableBuilder[Self <: Coercer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoercer(value: IOpenAPIRequestCoercer): Self = StObject.set(x, "coercer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      @scala.inline
      def setDefaultSetter(value: IOpenAPIDefaultSetter): Self = StObject.set(x, "defaultSetter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSetterUndefined: Self = StObject.set(x, "defaultSetter", js.undefined)
      
      @scala.inline
      def setRequestValidator(value: IOpenAPIRequestValidator): Self = StObject.set(x, "requestValidator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestValidatorUndefined: Self = StObject.set(x, "requestValidator", js.undefined)
      
      @scala.inline
      def setResponseValidator(value: IOpenAPIResponseValidator): Self = StObject.set(x, "responseValidator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseValidatorUndefined: Self = StObject.set(x, "responseValidator", js.undefined)
      
      @scala.inline
      def setSecurityHandler(value: IOpenAPISecurityHandler): Self = StObject.set(x, "securityHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityHandlerUndefined: Self = StObject.set(x, "securityHandler", js.undefined)
    }
  }
  
  trait Enum extends StObject {
    
    var `enum`: js.Array[String]
  }
  object Enum {
    
    @scala.inline
    def apply(`enum`: js.Array[String]): Enum = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enum]
    }
    
    @scala.inline
    implicit class EnumMutableBuilder[Self <: Enum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
    }
  }
}
