package typings
package pkijsLib.srcPolicyMappingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyMappings extends js.Object {
  var mappings: js.Array[pkijsLib.srcPolicyMappingMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyMappings {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    mappings: js.Array[pkijsLib.srcPolicyMappingMod.default],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): PolicyMappings = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, mappings = mappings, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[PolicyMappings]
  }
}

