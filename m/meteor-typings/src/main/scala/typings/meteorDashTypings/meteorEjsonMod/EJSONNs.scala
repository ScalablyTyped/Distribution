package typings.meteorDashTypings.meteorEjsonMod

import typings.meteorDashTypings.Anon_Canonical
import typings.meteorDashTypings.Anon_KeyOrderSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ejson", "EJSON")
@js.native
object EJSONNs extends js.Object {
  var newBinary: js.Any = js.native
  def addType(
    name: String,
    factory: js.Function1[
      /* val */ typings.meteorDashTypings.meteorEjsonMod.JSONable, 
      typings.meteorDashTypings.meteorEjsonMod.EJSONableCustomType
    ]
  ): Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(
    a: typings.meteorDashTypings.meteorEjsonMod.EJSON,
    b: typings.meteorDashTypings.meteorEjsonMod.EJSON
  ): Boolean = js.native
  def equals(
    a: typings.meteorDashTypings.meteorEjsonMod.EJSON,
    b: typings.meteorDashTypings.meteorEjsonMod.EJSON,
    options: Anon_KeyOrderSensitive
  ): Boolean = js.native
  def fromJSONValue(`val`: typings.meteorDashTypings.meteorEjsonMod.JSONable): js.Any = js.native
  def isBinary(x: js.Object): Boolean = js.native
  def parse(str: String): typings.meteorDashTypings.meteorEjsonMod.EJSON = js.native
  def stringify(`val`: typings.meteorDashTypings.meteorEjsonMod.EJSON): String = js.native
  def stringify(`val`: typings.meteorDashTypings.meteorEjsonMod.EJSON, options: Anon_Canonical): String = js.native
  def toJSONValue(`val`: typings.meteorDashTypings.meteorEjsonMod.EJSON): typings.meteorDashTypings.meteorEjsonMod.JSONable = js.native
}

