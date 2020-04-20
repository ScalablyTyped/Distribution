package typings.minappEnv

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakSet[T] extends js.Object {
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.minappEnv.minappEnvStrings.WeakSet = js.native
  def add(value: T): this.type = js.native
  def delete(value: T): scala.Boolean = js.native
  def has(value: T): scala.Boolean = js.native
}

@JSGlobal("WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]

