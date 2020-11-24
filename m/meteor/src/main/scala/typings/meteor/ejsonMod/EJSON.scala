package typings.meteor.ejsonMod

import typings.meteor.anon.Canonical
import typings.meteor.anon.KeyOrderSensitive
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/ejson", "EJSON")
@js.native
object EJSON extends js.Object {
  
  def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = js.native
  
  def clone[T](`val`: T): T = js.native
  
  def equals(a: EJSON, b: EJSON): Boolean = js.native
  def equals(a: EJSON, b: EJSON, options: KeyOrderSensitive): Boolean = js.native
  
  def fromJSONValue(`val`: JSONable): js.Any = js.native
  
  def isBinary(x: js.Object): Boolean = js.native
  
  def newBinary(size: Double): Uint8Array = js.native
  
  def parse(str: String): EJSON = js.native
  
  def stringify(`val`: EJSON): String = js.native
  def stringify(`val`: EJSON, options: Canonical): String = js.native
  
  def toJSONValue(`val`: EJSON): JSONable = js.native
}
