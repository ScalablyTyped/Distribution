package typings
package monocleDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts/es6", "Iso")
@js.native
class Iso[S, A] protected () extends js.Object {
  def this(get: js.Function1[/* s */ S, A], reverseGet: js.Function1[/* a */ A, S]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Iso = js.native
  /** view an Iso as a Fold */
  def asFold(): Fold[S, A] = js.native
  /** view an Iso as a Getter */
  def asGetter(): Getter[S, A] = js.native
  /** view an Iso as a Lens */
  def asLens(): Lens[S, A] = js.native
  /** view an Iso as a Optional */
  def asOptional(): Optional[S, A] = js.native
  /** view an Iso as a Prism */
  def asPrism(): Prism[S, A] = js.native
  /** view an Iso as a Setter */
  def asSetter(): Setter[S, A] = js.native
  /** view an Iso as a Traversal */
  def asTraversal(): Traversal[S, A] = js.native
  /** compose an Iso with an Iso */
  def compose[B](ab: Iso[A, B]): Iso[S, B] = js.native
  /** compose an Iso with a Fold */
  def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
  /** compose an Iso with a Getter */
  def composeGetter[B](ab: Getter[A, B]): Getter[S, B] = js.native
  /** @alias of `compose` */
  def composeIso[B](ab: Iso[A, B]): Iso[S, B] = js.native
  /** compose an Iso with a Lens */
  def composeLens[B](ab: Lens[A, B]): Lens[S, B] = js.native
  /** compose an Iso with an Optional */
  def composeOptional[B](ab: Optional[A, B]): Optional[S, B] = js.native
  /** compose an Iso with a Prism */
  def composePrism[B](ab: Prism[A, B]): Prism[S, B] = js.native
  /** compose an Iso with a Setter */
  def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
  /** compose an Iso with a Traversal */
  def composeTraversal[B](ab: Traversal[A, B]): Traversal[S, B] = js.native
  def from(a: A): S = js.native
  def get(s: S): A = js.native
  def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
  /** reverse the `Iso`: the source becomes the target and the target becomes the source */
  def reverse(): Iso[A, S] = js.native
  def reverseGet(a: A): S = js.native
  def to(s: S): A = js.native
  def unwrap(s: S): A = js.native
  def wrap(a: A): S = js.native
}

