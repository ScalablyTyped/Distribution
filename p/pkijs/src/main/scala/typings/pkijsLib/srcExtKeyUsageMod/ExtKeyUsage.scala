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
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyPurposes: js.Array[java.lang.String],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): ExtKeyUsage = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, keyPurposes = keyPurposes, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[ExtKeyUsage]
  }
}

