package typings.openapiSecurityHandler

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.OpenAPI.Request
import typings.openapiTypes.mod.OpenAPIV2.SecurityDefinitionsObject
import typings.openapiTypes.mod.OpenAPIV2.SecurityRequirementObject
import typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-security-handler", JSImport.Default)
  @js.native
  class default protected () extends OpenAPISecurityHandler {
    def this(args: OpenAPISecurityHandlerArgs) = this()
  }
  
  @js.native
  trait IOpenAPISecurityHandler extends StObject {
    
    def handle(request: Request): js.Promise[Unit] = js.native
  }
  object IOpenAPISecurityHandler {
    
    @scala.inline
    def apply(handle: Request => js.Promise[Unit]): IOpenAPISecurityHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[IOpenAPISecurityHandler]
    }
    
    @scala.inline
    implicit class IOpenAPISecurityHandlerMutableBuilder[Self <: IOpenAPISecurityHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: Request => js.Promise[Unit]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OpenAPISecurityHandler extends IOpenAPISecurityHandler {
    
    def handle(request: js.Any): js.Promise[Unit] = js.native
    
    var operationSecurity: js.Any = js.native
    
    var securitySets: js.Any = js.native
  }
  object OpenAPISecurityHandler {
    
    @scala.inline
    def apply(handle: js.Any => js.Promise[Unit], operationSecurity: js.Any, securitySets: js.Any): OpenAPISecurityHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), operationSecurity = operationSecurity.asInstanceOf[js.Any], securitySets = securitySets.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISecurityHandler]
    }
    
    @scala.inline
    implicit class OpenAPISecurityHandlerMutableBuilder[Self <: OpenAPISecurityHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOperationSecurity(value: js.Any): Self = StObject.set(x, "operationSecurity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecuritySets(value: js.Any): Self = StObject.set(x, "securitySets", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenAPISecurityHandlerArgs extends StObject {
    
    var loggingKey: String = js.native
    
    var operationSecurity: js.Array[
        SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
      ] = js.native
    
    var securityDefinitions: SecurityDefinitionsObject = js.native
    
    var securityHandlers: SecurityHandlers = js.native
  }
  object OpenAPISecurityHandlerArgs {
    
    @scala.inline
    def apply(
      loggingKey: String,
      operationSecurity: js.Array[
          SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
        ],
      securityDefinitions: SecurityDefinitionsObject,
      securityHandlers: SecurityHandlers
    ): OpenAPISecurityHandlerArgs = {
      val __obj = js.Dynamic.literal(loggingKey = loggingKey.asInstanceOf[js.Any], operationSecurity = operationSecurity.asInstanceOf[js.Any], securityDefinitions = securityDefinitions.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISecurityHandlerArgs]
    }
    
    @scala.inline
    implicit class OpenAPISecurityHandlerArgsMutableBuilder[Self <: OpenAPISecurityHandlerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationSecurity(
        value: js.Array[
              SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
            ]
      ): Self = StObject.set(x, "operationSecurity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationSecurityVarargs(value: (SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject)*): Self = StObject.set(x, "operationSecurity", js.Array(value :_*))
      
      @scala.inline
      def setSecurityDefinitions(value: SecurityDefinitionsObject): Self = StObject.set(x, "securityDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityHandlers(value: SecurityHandlers): Self = StObject.set(x, "securityHandlers", value.asInstanceOf[js.Any])
    }
  }
  
  type SecurityHandler = js.Function3[
    /* req */ Request, 
    /* scopes */ js.Array[SecurityScope], 
    /* definition */ SecuritySchemeObject, 
    js.Promise[Boolean] | Boolean
  ]
  
  type SecurityHandlers = StringDictionary[SecurityHandler]
  
  type SecurityScope = String
}
