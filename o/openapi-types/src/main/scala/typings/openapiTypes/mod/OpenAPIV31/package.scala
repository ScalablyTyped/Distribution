package typings.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.TopLevel
import typings.openapiTypes.anon.Callbacks
import typings.openapiTypes.anon.Info
import typings.openapiTypes.anon.Parameters
import typings.openapiTypes.openapiTypesStrings.components
import typings.openapiTypes.openapiTypesStrings.paths
import typings.openapiTypes.openapiTypesStrings.webhooks
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApiKeySecurityScheme = typings.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme

type ArraySchemaObjectType = typings.openapiTypes.mod.OpenAPIV3.ArraySchemaObjectType

type CallbackObject = Record[String, PathItemObject[js.Object] | ReferenceObject]

type ContactObject = typings.openapiTypes.mod.OpenAPIV3.ContactObject

type DiscriminatorObject = typings.openapiTypes.mod.OpenAPIV3.DiscriminatorObject

type Document[T /* <: js.Object */] = Modify[
Omit[typings.openapiTypes.mod.OpenAPIV3.Document[T], paths | components], 
((Pick[PathsWebhooksComponents[T], paths]) & (Omit[Partial[PathsWebhooksComponents[T]], paths]) & Info) | ((Pick[PathsWebhooksComponents[T], webhooks]) & (Omit[Partial[PathsWebhooksComponents[T]], webhooks]) & Info) | ((Pick[PathsWebhooksComponents[T], components]) & (Omit[Partial[PathsWebhooksComponents[T]], components]) & Info)]

type EncodingObject = typings.openapiTypes.mod.OpenAPIV3.EncodingObject

type ExampleObject = typings.openapiTypes.mod.OpenAPIV3.ExampleObject

type ExternalDocumentationObject = typings.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject

type HeaderObject = typings.openapiTypes.mod.OpenAPIV3.HeaderObject

type HttpMethods = typings.openapiTypes.mod.OpenAPIV3.HttpMethods

type HttpSecurityScheme = typings.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme

type Modify[T, R] = (Omit[T, /* keyof R */ String]) & R

type OAuth2SecurityScheme = typings.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme

type OpenIdSecurityScheme = typings.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme

type OperationObject[T /* <: js.Object */] = (Modify[typings.openapiTypes.mod.OpenAPIV3.OperationObject[T], Callbacks]) & T

type ParameterBaseObject = typings.openapiTypes.mod.OpenAPIV3.ParameterBaseObject

type ParameterObject = typings.openapiTypes.mod.OpenAPIV3.ParameterObject

type PathItemObject[T /* <: js.Object */] = (Modify[typings.openapiTypes.mod.OpenAPIV3.PathItemObject[T], Parameters]) & typings.openapiTypes.openapiTypesStrings.PathItemObject & TopLevel[Any]

type PathsObject[T /* <: js.Object */, P /* <: js.Object */] = Record[String, js.UndefOr[PathItemObject[T] & P]]

type ResponsesObject = Record[String, ReferenceObject | ResponseObject]

type SecurityRequirementObject = typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject

type SecuritySchemeObject = typings.openapiTypes.mod.OpenAPIV3.SecuritySchemeObject

type TagObject = typings.openapiTypes.mod.OpenAPIV3.TagObject

type XMLObject = typings.openapiTypes.mod.OpenAPIV3.XMLObject
