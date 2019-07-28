package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

import typings.openapiDashTypes.openapiDashTypesMod.OpenAPINs.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject extends Parameter {
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

