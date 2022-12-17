package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.anon.Deprecated
import typings.openapiTypes.openapiTypesStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArraySchemaObjectType = array

type CallbackObject = StringDictionary[PathItemObject[js.Object]]

type HeaderObject = ParameterBaseObject

type OperationObject[T /* <: js.Object */] = Deprecated & T

type PathsObject[T /* <: js.Object */, P /* <: js.Object */] = StringDictionary[js.UndefOr[PathItemObject[T] & P]]

type ResponsesObject = StringDictionary[ReferenceObject | ResponseObject]

type SecurityRequirementObject = StringDictionary[js.Array[String]]
