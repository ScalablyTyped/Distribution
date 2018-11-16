package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("EJSON")
@js.native
object EJSONNs extends js.Object {
  var newBinary: js.Any = js.native
  def addType(
    name: java.lang.String,
    factory: js.Function1[/* val */ meteorLib.JSONable, meteorLib.EJSONableCustomType]
  ): scala.Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: meteorLib.EJSON, b: meteorLib.EJSON): scala.Boolean = js.native
  def equals(a: meteorLib.EJSON, b: meteorLib.EJSON, options: meteorLib.Anon_KeyOrderSensitive): scala.Boolean = js.native
  def fromJSONValue(`val`: meteorLib.JSONable): js.Any = js.native
  def isBinary(x: js.Object): scala.Boolean = js.native
  def parse(str: java.lang.String): meteorLib.EJSON = js.native
  def stringify(`val`: meteorLib.EJSON): java.lang.String = js.native
  def stringify(`val`: meteorLib.EJSON, options: meteorLib.Anon_Indent): java.lang.String = js.native
  def toJSONValue(`val`: meteorLib.EJSON): meteorLib.JSONable = js.native
}

