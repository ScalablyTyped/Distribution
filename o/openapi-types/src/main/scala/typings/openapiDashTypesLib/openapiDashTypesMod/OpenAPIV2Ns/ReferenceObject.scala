package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject
  extends openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Parameter
     with Response
     with Schema {
  @JSName("$ref")
  var $ref: java.lang.String
}

object ReferenceObject {
  @scala.inline
  def apply($ref: java.lang.String): ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref)
  
    __obj.asInstanceOf[ReferenceObject]
  }
}

