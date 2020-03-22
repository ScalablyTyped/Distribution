package typings.postmanCollection

import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAny extends js.Object {
  var any: AnonOut = js.native
  @JSName("boolean")
  var boolean_Original: BooleanConstructor = js.native
  var json: AnonIn = js.native
  @JSName("number")
  var number_Original: NumberConstructor = js.native
  @JSName("string")
  var string_Original: StringConstructor = js.native
  def boolean[T](): Boolean = js.native
  def boolean[T](value: T): Boolean = js.native
  def number(): Double = js.native
  def number(value: js.Any): Double = js.native
  def string(): String = js.native
  def string(value: js.Any): String = js.native
}

