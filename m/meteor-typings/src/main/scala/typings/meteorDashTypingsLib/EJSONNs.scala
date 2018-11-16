package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("EJSON")
@js.native
object EJSONNs extends js.Object {
  var newBinary: js.Any = js.native
  def addType(
    name: java.lang.String,
    factory: js.Function1[/* val */ meteorDashTypingsLib.JSONable, meteorDashTypingsLib.EJSONableCustomType]
  ): scala.Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: meteorDashTypingsLib.EJSON, b: meteorDashTypingsLib.EJSON): scala.Boolean = js.native
  def equals(
    a: meteorDashTypingsLib.EJSON,
    b: meteorDashTypingsLib.EJSON,
    options: meteorDashTypingsLib.Anon_KeyOrderSensitive
  ): scala.Boolean = js.native
  def fromJSONValue(`val`: meteorDashTypingsLib.JSONable): js.Any = js.native
  def isBinary(x: js.Object): scala.Boolean = js.native
  def parse(str: java.lang.String): meteorDashTypingsLib.EJSON = js.native
  def stringify(`val`: meteorDashTypingsLib.EJSON): java.lang.String = js.native
  def stringify(`val`: meteorDashTypingsLib.EJSON, options: meteorDashTypingsLib.Anon_Indent): java.lang.String = js.native
  def toJSONValue(`val`: meteorDashTypingsLib.EJSON): meteorDashTypingsLib.JSONable = js.native
}

