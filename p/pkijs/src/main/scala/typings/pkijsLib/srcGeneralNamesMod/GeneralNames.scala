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
    fromSchema: js.Any => scala.Unit,
    names: js.Array[pkijsLib.srcGeneralNameMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): GeneralNames = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), names = names, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[GeneralNames]
  }
}

