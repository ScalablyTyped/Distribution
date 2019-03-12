package typings
package pkijsLib.srcExtKeyUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtKeyUsage extends js.Object {
  var keyPurposes: js.Array[java.lang.String]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ExtKeyUsage {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    keyPurposes: js.Array[java.lang.String],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): ExtKeyUsage = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyPurposes = keyPurposes, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[ExtKeyUsage]
  }
}

