package typings
package meteorLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ejson", "EJSON")
@js.native
object EJSONNs extends js.Object {
  var newBinary: js.Any = js.native
  def addType(
    name: java.lang.String,
    factory: js.Function1[/* val */ meteorLib.ejsonMod.JSONable, meteorLib.ejsonMod.EJSONableCustomType]
  ): scala.Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: meteorLib.ejsonMod.EJSON, b: meteorLib.ejsonMod.EJSON): scala.Boolean = js.native
  def equals(
    a: meteorLib.ejsonMod.EJSON,
    b: meteorLib.ejsonMod.EJSON,
    options: meteorLib.Anon_KeyOrderSensitive
  ): scala.Boolean = js.native
  def fromJSONValue(`val`: meteorLib.ejsonMod.JSONable): js.Any = js.native
  def isBinary(x: js.Object): scala.Boolean = js.native
  def parse(str: java.lang.String): meteorLib.ejsonMod.EJSON = js.native
  def stringify(`val`: meteorLib.ejsonMod.EJSON): java.lang.String = js.native
  def stringify(`val`: meteorLib.ejsonMod.EJSON, options: meteorLib.Anon_Canonical): java.lang.String = js.native
  def toJSONValue(`val`: meteorLib.ejsonMod.EJSON): meteorLib.ejsonMod.JSONable = js.native
}

