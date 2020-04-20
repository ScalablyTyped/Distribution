package typings.pkijs.extensionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extensions extends js.Object {
  var extensions: js.Array[typings.pkijs.extensionMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Extensions {
  @scala.inline
  def apply(
    extensions: js.Array[typings.pkijs.extensionMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): Extensions = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[Extensions]
  }
}

