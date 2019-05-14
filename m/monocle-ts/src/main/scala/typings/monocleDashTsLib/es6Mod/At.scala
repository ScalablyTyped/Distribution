package typings
package monocleDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts/es6", "At")
@js.native
class At[S, I, A] protected () extends js.Object {
  def this(at: js.Function1[/* i */ I, Lens[S, A]]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.At = js.native
  def at(i: I): Lens[S, A] = js.native
  /** lift an instance of `At` using an `Iso` */
  def fromIso[T](iso: Iso[T, S]): At[T, I, A] = js.native
}

