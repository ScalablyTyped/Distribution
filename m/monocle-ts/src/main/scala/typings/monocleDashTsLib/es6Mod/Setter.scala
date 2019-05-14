package typings
package monocleDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts/es6", "Setter")
@js.native
class Setter[S, A] protected () extends js.Object {
  def this(modify: js.Function1[/* f */ js.Function1[/* a */ A, A], js.Function1[/* s */ S, S]]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Setter = js.native
  /** compose a Setter with a Setter */
  def compose[B](ab: Setter[A, B]): Setter[S, B] = js.native
  /** compose a Setter with a Iso */
  def composeIso[B](ab: Iso[A, B]): Setter[S, B] = js.native
  /** compose a Setter with a Lens */
  def composeLens[B](ab: Lens[A, B]): Setter[S, B] = js.native
  /** compose a Setter with a Optional */
  def composeOptional[B](ab: Optional[A, B]): Setter[S, B] = js.native
  /** compose a Setter with a Prism */
  def composePrism[B](ab: Prism[A, B]): Setter[S, B] = js.native
  /** @alias of `compose` */
  def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
  /** compose a Setter with a Traversal */
  def composeTraversal[B](ab: Traversal[A, B]): Setter[S, B] = js.native
  def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
  def set(a: A): js.Function1[/* s */ S, S] = js.native
}

