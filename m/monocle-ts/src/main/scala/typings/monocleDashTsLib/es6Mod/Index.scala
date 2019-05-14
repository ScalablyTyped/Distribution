package typings
package monocleDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts/es6", "Index")
@js.native
class Index[S, I, A] protected () extends js.Object {
  def this(index: js.Function1[/* i */ I, Optional[S, A]]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Index = js.native
  /** lift an instance of `Index` using an `Iso` */
  def fromIso[T](iso: Iso[T, S]): Index[T, I, A] = js.native
  def index(i: I): Optional[S, A] = js.native
}

/* static members */
@JSImport("monocle-ts/es6", "Index")
@js.native
object Index extends js.Object {
  def fromAt[T, J, B](at: monocleDashTsLib.es6Mod.At[T, J, fpDashTsLib.libOptionMod.Option[B]]): monocleDashTsLib.es6Mod.Index[T, J, B] = js.native
}

