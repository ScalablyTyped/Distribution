package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[T] extends js.Object {
  def all[T](): bluebirdLib.bluebirdMod.^[js.Array[T]] = js.native
  def all[T](params: js.Any): bluebirdLib.bluebirdMod.^[js.Array[T]] = js.native
  def column(name: java.lang.String): Query[T] = js.native
  def defaults(defaults: js.Any): Query[T] = js.native
  def exec[T](): bluebirdLib.bluebirdMod.^[T] = js.native
  def exec[T](params: js.Any): bluebirdLib.bluebirdMod.^[T] = js.native
  def one[T](): bluebirdLib.bluebirdMod.^[T] = js.native
  def one[T](params: js.Any): bluebirdLib.bluebirdMod.^[T] = js.native
  def scalar[T](): bluebirdLib.bluebirdMod.^[T] = js.native
  def scalar[T](params: js.Any): bluebirdLib.bluebirdMod.^[T] = js.native
  def transform[R](transformer: js.Function1[/* item */ T | (T with Record), R]): Query[R] = js.native
}

