package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject
  extends typings.openapiDashTypes.openapiDashTypesMod.OpenAPINs.Parameter
     with Response
     with Schema {
  @JSName("$ref")
  var $ref: String
}

object ReferenceObject {
  @scala.inline
  def apply($ref: String): ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref)
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

