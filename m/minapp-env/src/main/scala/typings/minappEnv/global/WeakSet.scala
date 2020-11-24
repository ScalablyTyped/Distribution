package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.Iterable
import typings.minappEnv.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends typings.minappEnv.WeakSet[T] {
  def this(iterable: Iterable[T]) = this()
  def this(values: typings.minappEnv.Array[T]) = this()
}
@JSGlobal("WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]
