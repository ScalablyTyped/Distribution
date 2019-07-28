package typings.meteor.ejsonMod

import typings.meteor.Anon_Canonical
import typings.meteor.Anon_KeyOrderSensitive
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
      /* val */ typings.meteor.ejsonMod.JSONable, 
      typings.meteor.ejsonMod.EJSONableCustomType
    ]
  ): Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: typings.meteor.ejsonMod.EJSON, b: typings.meteor.ejsonMod.EJSON): Boolean = js.native
  def equals(
    a: typings.meteor.ejsonMod.EJSON,
    b: typings.meteor.ejsonMod.EJSON,
    options: Anon_KeyOrderSensitive
  ): Boolean = js.native
  def fromJSONValue(`val`: typings.meteor.ejsonMod.JSONable): js.Any = js.native
  def isBinary(x: js.Object): Boolean = js.native
  def parse(str: String): typings.meteor.ejsonMod.EJSON = js.native
  def stringify(`val`: typings.meteor.ejsonMod.EJSON): String = js.native
  def stringify(`val`: typings.meteor.ejsonMod.EJSON, options: Anon_Canonical): String = js.native
  def toJSONValue(`val`: typings.meteor.ejsonMod.EJSON): typings.meteor.ejsonMod.JSONable = js.native
}

