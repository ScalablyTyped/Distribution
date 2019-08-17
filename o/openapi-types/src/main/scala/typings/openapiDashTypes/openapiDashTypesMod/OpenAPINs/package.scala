package typings.openapiDashTypes.openapiDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OpenAPINs {
  import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns.ParameterObject
  import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns.ReferenceObject

  type Parameters = js.Array[
    typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2Ns.Parameter | ParameterObject | ReferenceObject | typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2Ns.ReferenceObject
  ]
}
