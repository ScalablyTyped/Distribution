package typings.openapiTypes

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.OpenAPIV2.ExternalDocumentationObject
import typings.openapiTypes.mod.OpenAPIV2.MimeTypes
import typings.openapiTypes.mod.OpenAPIV2.Parameter
import typings.openapiTypes.mod.OpenAPIV2.SecurityRequirementObject
import typings.openapiTypes.mod.OpenAPIV31.CallbackObject
import typings.openapiTypes.mod.OpenAPIV31.InfoObject
import typings.openapiTypes.mod.OpenAPIV31.ParameterObject
import typings.openapiTypes.mod.OpenAPIV31.ReferenceObject
import typings.openapiTypes.mod.OpenAPIV31.RequestBodyObject
import typings.openapiTypes.mod.OpenAPIV31.ResponsesObject
import typings.openapiTypes.mod.OpenAPIV31.ServerObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthorizationCode extends StObject {
    
    var authorizationCode: js.UndefOr[Scopes] = js.undefined
    
    var clientCredentials: js.UndefOr[RefreshUrl] = js.undefined
    
    var `implicit`: js.UndefOr[AuthorizationUrl] = js.undefined
    
    var password: js.UndefOr[RefreshUrl] = js.undefined
  }
  object AuthorizationCode {
    
    inline def apply(): AuthorizationCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationCode] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationCode(value: Scopes): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationCodeUndefined: Self = StObject.set(x, "authorizationCode", js.undefined)
      
      inline def setClientCredentials(value: RefreshUrl): Self = StObject.set(x, "clientCredentials", value.asInstanceOf[js.Any])
      
      inline def setClientCredentialsUndefined: Self = StObject.set(x, "clientCredentials", js.undefined)
      
      inline def setImplicit(value: AuthorizationUrl): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
      
      inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
      
      inline def setPassword(value: RefreshUrl): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
  
  trait AuthorizationUrl extends StObject {
    
    var authorizationUrl: String
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
  }
  object AuthorizationUrl {
    
    inline def apply(authorizationUrl: String, scopes: StringDictionary[String]): AuthorizationUrl = {
      val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationUrl] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      inline def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Callbacks extends StObject {
    
    var callbacks: js.UndefOr[Record[String, ReferenceObject | CallbackObject]] = js.undefined
    
    var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.undefined
    
    var requestBody: js.UndefOr[ReferenceObject | RequestBodyObject] = js.undefined
    
    var responses: js.UndefOr[ResponsesObject] = js.undefined
    
    var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  }
  object Callbacks {
    
    inline def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: Record[String, ReferenceObject | CallbackObject]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setParameters(value: js.Array[ReferenceObject | ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: (ReferenceObject | ParameterObject)*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setRequestBody(value: ReferenceObject | RequestBodyObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      
      inline def setResponses(value: ResponsesObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
      
      inline def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      inline def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value*))
    }
  }
  
  trait Consumes extends StObject {
    
    var consumes: js.UndefOr[MimeTypes] = js.undefined
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
    
    var operationId: js.UndefOr[String] = js.undefined
    
    var parameters: js.UndefOr[typings.openapiTypes.mod.OpenAPIV2.Parameters] = js.undefined
    
    var produces: js.UndefOr[MimeTypes] = js.undefined
    
    var responses: typings.openapiTypes.mod.OpenAPIV2.ResponsesObject
    
    var schemes: js.UndefOr[js.Array[String]] = js.undefined
    
    var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Consumes {
    
    inline def apply(responses: typings.openapiTypes.mod.OpenAPIV2.ResponsesObject): Consumes = {
      val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consumes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Consumes] (val x: Self) extends AnyVal {
      
      inline def setConsumes(value: MimeTypes): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
      
      inline def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
      
      inline def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value*))
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
      
      inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
      
      inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      inline def setParameters(value: typings.openapiTypes.mod.OpenAPIV2.Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: (typings.openapiTypes.mod.OpenAPIV2.ReferenceObject | Parameter)*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setProduces(value: MimeTypes): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
      
      inline def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
      
      inline def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value*))
      
      inline def setResponses(value: typings.openapiTypes.mod.OpenAPIV2.ResponsesObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
      
      inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
      
      inline def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value*))
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait Deprecated extends StObject {
    
    var callbacks: js.UndefOr[
        StringDictionary[
          typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.CallbackObject
        ]
      ] = js.undefined
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var externalDocs: js.UndefOr[typings.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject] = js.undefined
    
    var operationId: js.UndefOr[String] = js.undefined
    
    var parameters: js.UndefOr[
        js.Array[
          typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject
        ]
      ] = js.undefined
    
    var requestBody: js.UndefOr[
        typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.RequestBodyObject
      ] = js.undefined
    
    var responses: typings.openapiTypes.mod.OpenAPIV3.ResponsesObject
    
    var security: js.UndefOr[js.Array[typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject]] = js.undefined
    
    var servers: js.UndefOr[js.Array[typings.openapiTypes.mod.OpenAPIV3.ServerObject]] = js.undefined
    
    var summary: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Deprecated {
    
    inline def apply(responses: typings.openapiTypes.mod.OpenAPIV3.ResponsesObject): Deprecated = {
      val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deprecated]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deprecated] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(
        value: StringDictionary[
              typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.CallbackObject
            ]
      ): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExternalDocs(value: typings.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
      
      inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
      
      inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      inline def setParameters(
        value: js.Array[
              typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject
            ]
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(
        value: (typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject)*
      ): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setRequestBody(
        value: typings.openapiTypes.mod.OpenAPIV3.ReferenceObject | typings.openapiTypes.mod.OpenAPIV3.RequestBodyObject
      ): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      
      inline def setResponses(value: typings.openapiTypes.mod.OpenAPIV3.ResponsesObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setSecurity(value: js.Array[typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      inline def setSecurityVarargs(value: typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value*))
      
      inline def setServers(value: js.Array[typings.openapiTypes.mod.OpenAPIV3.ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      inline def setServersVarargs(value: typings.openapiTypes.mod.OpenAPIV3.ServerObject*): Self = StObject.set(x, "servers", js.Array(value*))
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait Info extends StObject {
    
    var info: InfoObject
    
    var jsonSchemaDialect: js.UndefOr[String] = js.undefined
    
    var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  }
  object Info {
    
    inline def apply(info: InfoObject): Info = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      inline def setInfo(value: InfoObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setJsonSchemaDialect(value: String): Self = StObject.set(x, "jsonSchemaDialect", value.asInstanceOf[js.Any])
      
      inline def setJsonSchemaDialectUndefined: Self = StObject.set(x, "jsonSchemaDialect", js.undefined)
      
      inline def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      inline def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value*))
    }
  }
  
  trait Parameters extends StObject {
    
    var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.undefined
    
    var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  }
  object Parameters {
    
    inline def apply(): Parameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      inline def setParameters(value: js.Array[ReferenceObject | ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: (ReferenceObject | ParameterObject)*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      inline def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value*))
    }
  }
  
  trait RefreshUrl extends StObject {
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
    
    var tokenUrl: String
  }
  object RefreshUrl {
    
    inline def apply(scopes: StringDictionary[String], tokenUrl: String): RefreshUrl = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefreshUrl] (val x: Self) extends AnyVal {
      
      inline def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      inline def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scopes extends StObject {
    
    var authorizationUrl: String
    
    var refreshUrl: js.UndefOr[String] = js.undefined
    
    var scopes: StringDictionary[String]
    
    var tokenUrl: String
  }
  object Scopes {
    
    inline def apply(authorizationUrl: String, scopes: StringDictionary[String], tokenUrl: String): Scopes = {
      val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scopes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrl(value: String): Self = StObject.set(x, "refreshUrl", value.asInstanceOf[js.Any])
      
      inline def setRefreshUrlUndefined: Self = StObject.set(x, "refreshUrl", js.undefined)
      
      inline def setScopes(value: StringDictionary[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    }
  }
}
