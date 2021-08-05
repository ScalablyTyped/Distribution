package typings.openapiSecurityHandler

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.OpenAPI.Request
import typings.openapiTypes.mod.OpenAPIV2.SecurityDefinitionsObject
import typings.openapiTypes.mod.OpenAPIV2.SecurityRequirementObject
import typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-security-handler", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with OpenAPISecurityHandler {
    def this(args: OpenAPISecurityHandlerArgs) = this()
    
    /* CompleteClass */
    override def handle(request: js.Any): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def handle(request: Request): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var operationSecurity: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var securitySets: js.Any = js.native
  }
  
  trait IOpenAPISecurityHandler extends StObject {
    
    def handle(request: Request): js.Promise[Unit]
  }
  object IOpenAPISecurityHandler {
    
    inline def apply(handle: Request => js.Promise[Unit]): IOpenAPISecurityHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[IOpenAPISecurityHandler]
    }
    
    extension [Self <: IOpenAPISecurityHandler](x: Self) {
      
      inline def setHandle(value: Request => js.Promise[Unit]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenAPISecurityHandler
    extends StObject
       with IOpenAPISecurityHandler {
    
    def handle(request: js.Any): js.Promise[Unit]
    
    /* private */ var operationSecurity: js.Any
    
    /* private */ var securitySets: js.Any
  }
  object OpenAPISecurityHandler {
    
    inline def apply(handle: js.Any => js.Promise[Unit], operationSecurity: js.Any, securitySets: js.Any): OpenAPISecurityHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), operationSecurity = operationSecurity.asInstanceOf[js.Any], securitySets = securitySets.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISecurityHandler]
    }
    
    extension [Self <: OpenAPISecurityHandler](x: Self) {
      
      inline def setHandle(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      inline def setOperationSecurity(value: js.Any): Self = StObject.set(x, "operationSecurity", value.asInstanceOf[js.Any])
      
      inline def setSecuritySets(value: js.Any): Self = StObject.set(x, "securitySets", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPISecurityHandlerArgs extends StObject {
    
    var loggingKey: String
    
    var operationSecurity: js.Array[
        SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
      ]
    
    var securityDefinitions: SecurityDefinitionsObject
    
    var securityHandlers: SecurityHandlers
  }
  object OpenAPISecurityHandlerArgs {
    
    inline def apply(
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
    
    extension [Self <: OpenAPISecurityHandlerArgs](x: Self) {
      
      inline def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      inline def setOperationSecurity(
        value: js.Array[
              SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
            ]
      ): Self = StObject.set(x, "operationSecurity", value.asInstanceOf[js.Any])
      
      inline def setOperationSecurityVarargs(value: (SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject)*): Self = StObject.set(x, "operationSecurity", js.Array(value :_*))
      
      inline def setSecurityDefinitions(value: SecurityDefinitionsObject): Self = StObject.set(x, "securityDefinitions", value.asInstanceOf[js.Any])
      
      inline def setSecurityHandlers(value: SecurityHandlers): Self = StObject.set(x, "securityHandlers", value.asInstanceOf[js.Any])
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
