package typings.pkijs.infoAccessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoAccess extends js.Object {
  var accessDescriptions: js.Array[typings.pkijs.accessDescriptionMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object InfoAccess {
  @scala.inline
  def apply(
    accessDescriptions: js.Array[typings.pkijs.accessDescriptionMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): InfoAccess = {
    val __obj = js.Dynamic.literal(accessDescriptions = accessDescriptions.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[InfoAccess]
  }
}

