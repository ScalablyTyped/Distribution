package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.anon.Consumes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DefinitionsObject = StringDictionary[SchemaObject]

type ExampleObject = StringDictionary[Any]

type HeaderObject = ItemsObject

type HeadersObject = StringDictionary[HeaderObject]

type MimeTypes = js.Array[String]

type OperationObject[T /* <: js.Object */] = Consumes & T

type Parameters = js.Array[ReferenceObject | Parameter]

type ParametersDefinitionsObject = StringDictionary[ParameterObject]

type PathsObject[T /* <: js.Object */] = StringDictionary[PathItemObject[T]]

type ResponsesDefinitionsObject = StringDictionary[ResponseObject]

type ScopesObject = StringDictionary[Any]

type SecurityDefinitionsObject = StringDictionary[SecuritySchemeObject]

type SecurityRequirementObject = StringDictionary[js.Array[String]]
