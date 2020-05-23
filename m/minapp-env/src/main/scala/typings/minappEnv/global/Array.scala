package typings.minappEnv.global

import org.scalablytyped.runtime.TopLevel
import typings.minappEnv.ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Array")
@js.native
class Array[T] protected ()
  extends typings.minappEnv.Array[T] {
  def this(arrayLength: Double) = this()
  def this(items: T*) = this()
}

@JSGlobal("Array")
@js.native
object Array extends TopLevel[ArrayConstructor]

