package typings
package meteorDashTypingsLib.meteorEjsonMod

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
      /* val */ meteorDashTypingsLib.meteorEjsonMod.JSONable, 
      meteorDashTypingsLib.meteorEjsonMod.EJSONableCustomType
    ]
  ): scala.Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: meteorDashTypingsLib.meteorEjsonMod.EJSON, b: meteorDashTypingsLib.meteorEjsonMod.EJSON): scala.Boolean = js.native
  def equals(
    a: meteorDashTypingsLib.meteorEjsonMod.EJSON,
    b: meteorDashTypingsLib.meteorEjsonMod.EJSON,
    options: meteorDashTypingsLib.Anon_KeyOrderSensitive
  ): scala.Boolean = js.native
  def fromJSONValue(`val`: meteorDashTypingsLib.meteorEjsonMod.JSONable): js.Any = js.native
  def isBinary(x: js.Object): scala.Boolean = js.native
  def parse(str: java.lang.String): meteorDashTypingsLib.meteorEjsonMod.EJSON = js.native
  def stringify(`val`: meteorDashTypingsLib.meteorEjsonMod.EJSON): java.lang.String = js.native
  def stringify(`val`: meteorDashTypingsLib.meteorEjsonMod.EJSON, options: meteorDashTypingsLib.Anon_Canonical): java.lang.String = js.native
  def toJSONValue(`val`: meteorDashTypingsLib.meteorEjsonMod.EJSON): meteorDashTypingsLib.meteorEjsonMod.JSONable = js.native
}

