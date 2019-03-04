package typings
package pkijsLib.srcAltNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltName extends js.Object {
  var altNames: js.Array[pkijsLib.srcGeneralNameMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AltName {
  @scala.inline
  def apply(
    altNames: js.Array[pkijsLib.srcGeneralNameMod.default],
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): AltName = {
    val __obj = js.Dynamic.literal(altNames = altNames, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[AltName]
  }
}

