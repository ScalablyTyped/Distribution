package typings
package mithrilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Options extends js.Object {
  def apply[T](options: mithrilLib.mithrilMod.RequestOptions[T] with Anon_Url): js.Promise[T] = js.native
  def apply[T](url: java.lang.String): js.Promise[T] = js.native
  def apply[T](url: java.lang.String, options: mithrilLib.mithrilMod.RequestOptions[T]): js.Promise[T] = js.native
}

