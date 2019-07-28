package typings.pkijs.srcAltNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltName extends js.Object {
  var altNames: js.Array[typings.pkijs.srcGeneralNameMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AltName {
  @scala.inline
  def apply(
    altNames: js.Array[typings.pkijs.srcGeneralNameMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AltName = {
    val __obj = js.Dynamic.literal(altNames = altNames, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[AltName]
  }
}

