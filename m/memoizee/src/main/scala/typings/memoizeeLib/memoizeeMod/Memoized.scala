package typings
package memoizeeLib.memoizeeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Memoized[F] extends js.Object {
  @JSName("clear")
  var clear_Original: F with js.Function0[scala.Unit] = js.native
  var delete: F = js.native
  def clear(): scala.Unit = js.native
}

