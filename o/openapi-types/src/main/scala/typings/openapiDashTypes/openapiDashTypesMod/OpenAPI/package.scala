package typings.openapiDashTypes.openapiDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OpenAPI {
  import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ParameterObject
  import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.ReferenceObject

  type Parameters = js.Array[
    typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.Parameter | ParameterObject | ReferenceObject | typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.ReferenceObject
  ]
}
