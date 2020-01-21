package typings.prettier.mod

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastPath[T] extends js.Object {
  var stack: js.Array[_] = js.native
  def call[U](callback: js.Function1[/* path */ this.type, U], names: PropertyKey*): U = js.native
  def each(callback: js.Function1[/* path */ this.type, Unit], names: PropertyKey*): Unit = js.native
  def getName(): Null | PropertyKey = js.native
  def getNode(): Null | T = js.native
  def getNode(count: Double): Null | T = js.native
  def getParentNode(): Null | T = js.native
  def getParentNode(count: Double): Null | T = js.native
  def getValue(): T = js.native
  def map[U](callback: js.Function2[/* path */ this.type, /* index */ Double, U], names: PropertyKey*): js.Array[U] = js.native
}

