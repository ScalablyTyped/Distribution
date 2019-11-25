package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject
  extends typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Parameter
     with Response
     with Schema {
  @JSName("$ref")
  var $ref: String
}

object ReferenceObject {
  @scala.inline
  def apply($ref: String): ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

