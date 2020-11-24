package typings.meteor.global

import typings.meteor.EJSONableCustomType
import typings.meteor.JSONable
import typings.meteor.anon.Canonical
import typings.meteor.anon.KeyOrderSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("EJSON")
@js.native
object EJSON extends js.Object {
  
  def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = js.native
  
  def clone[T](`val`: T): T = js.native
  
  def equals(a: typings.meteor.EJSON, b: typings.meteor.EJSON): Boolean = js.native
  def equals(a: typings.meteor.EJSON, b: typings.meteor.EJSON, options: KeyOrderSensitive): Boolean = js.native
  
  def fromJSONValue(`val`: JSONable): js.Any = js.native
  
  def isBinary(x: js.Object): Boolean = js.native
  
  var newBinary: js.Any = js.native
  
  def parse(str: String): typings.meteor.EJSON = js.native
  
  def stringify(`val`: typings.meteor.EJSON): String = js.native
  def stringify(`val`: typings.meteor.EJSON, options: Canonical): String = js.native
  
  def toJSONValue(`val`: typings.meteor.EJSON): JSONable = js.native
}
