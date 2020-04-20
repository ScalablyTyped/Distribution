package typings.pkijs.extKeyUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtKeyUsage extends js.Object {
  var keyPurposes: js.Array[String]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ExtKeyUsage {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyPurposes: js.Array[String],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): ExtKeyUsage = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyPurposes = keyPurposes.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[ExtKeyUsage]
  }
}

