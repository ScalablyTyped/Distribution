package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.Iterable
import typings.minappEnv.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Set")
@js.native
class Set[T] ()
  extends typings.minappEnv.Set[T] {
  def this(iterable: Iterable[T]) = this()
  def this(values: typings.minappEnv.Array[T]) = this()
}

@JSGlobal("Set")
@js.native
object Set extends TopLevel[SetConstructor]

