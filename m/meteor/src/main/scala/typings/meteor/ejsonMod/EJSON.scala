package typings.meteor.ejsonMod

import typings.meteor.AnonCanonical
import typings.meteor.AnonKeyOrderSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/ejson", "EJSON")
@js.native
object EJSON extends js.Object {
  var newBinary: js.Any = js.native
  def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = js.native
  def clone[T](`val`: T): T = js.native
  def equals(a: EJSON, b: EJSON): Boolean = js.native
  def equals(a: EJSON, b: EJSON, options: AnonKeyOrderSensitive): Boolean = js.native
  def fromJSONValue(`val`: JSONable): js.Any = js.native
  def isBinary(x: js.Object): Boolean = js.native
  def parse(str: String): EJSON = js.native
  def stringify(`val`: EJSON): String = js.native
  def stringify(`val`: EJSON, options: AnonCanonical): String = js.native
  def toJSONValue(`val`: EJSON): JSONable = js.native
}

