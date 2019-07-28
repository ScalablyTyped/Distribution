package typings.openapiDashTypes.openapiDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.openapiDashTypes.openapiDashTypesStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OpenAPIV3Ns {
  type ArraySchemaObjectType = array
  type CallbackObject = StringDictionary[PathItemObject]
  type HeaderObject = ParameterBaseObject
  type PathsObject = StringDictionary[PathItemObject]
  type ResponsesObject = StringDictionary[ReferenceObject | ResponseObject]
  type SecurityRequirementObject = StringDictionary[js.Array[String]]
}
