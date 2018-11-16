package typings
package meteorDashTypingsLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ejson", "EJSON")
@js.native
object EJSONNs extends js.Object {
  var newBinary: js.Any = js.native
  def addType(
    name: java.lang.String,
    factory: js.Function1[
      /* val */ meteorDashTypingsLib.ejsonMod.JSONable, 
      meteorDashTypingsLib.ejsonMod.EJSONableCustomType
    ]
  ): scala.Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: meteorDashTypingsLib.ejsonMod.EJSON, b: meteorDashTypingsLib.ejsonMod.EJSON): scala.Boolean = js.native
  def equals(
    a: meteorDashTypingsLib.ejsonMod.EJSON,
    b: meteorDashTypingsLib.ejsonMod.EJSON,
    options: meteorDashTypingsLib.Anon_KeyOrderSensitive
  ): scala.Boolean = js.native
  def fromJSONValue(`val`: meteorDashTypingsLib.ejsonMod.JSONable): js.Any = js.native
  def isBinary(x: js.Object): scala.Boolean = js.native
  def parse(str: java.lang.String): meteorDashTypingsLib.ejsonMod.EJSON = js.native
  def stringify(`val`: meteorDashTypingsLib.ejsonMod.EJSON): java.lang.String = js.native
  def stringify(`val`: meteorDashTypingsLib.ejsonMod.EJSON, options: meteorDashTypingsLib.Anon_Indent): java.lang.String = js.native
  def toJSONValue(`val`: meteorDashTypingsLib.ejsonMod.EJSON): meteorDashTypingsLib.ejsonMod.JSONable = js.native
}

