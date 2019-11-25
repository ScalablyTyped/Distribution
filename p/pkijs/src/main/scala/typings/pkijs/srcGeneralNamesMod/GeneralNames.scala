package typings.pkijs.srcGeneralNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralNames extends js.Object {
  var names: js.Array[typings.pkijs.srcGeneralNameMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object GeneralNames {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    names: js.Array[typings.pkijs.srcGeneralNameMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): GeneralNames = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), names = names.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[GeneralNames]
  }
}

