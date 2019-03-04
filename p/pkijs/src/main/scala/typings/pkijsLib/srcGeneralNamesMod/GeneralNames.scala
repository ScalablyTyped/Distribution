package typings
package pkijsLib.srcGeneralNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralNames extends js.Object {
  var names: js.Array[pkijsLib.srcGeneralNameMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralNames {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    names: js.Array[pkijsLib.srcGeneralNameMod.default],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): GeneralNames = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, names = names, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[GeneralNames]
  }
}

