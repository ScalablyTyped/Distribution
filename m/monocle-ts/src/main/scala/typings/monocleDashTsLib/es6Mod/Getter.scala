package typings
package monocleDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts/es6", "Getter")
@js.native
class Getter[S, A] protected () extends js.Object {
  def this(get: js.Function1[/* s */ S, A]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Getter = js.native
  /** view a Getter as a Fold */
  def asFold(): Fold[S, A] = js.native
  /** compose a Getter with a Getter */
  def compose[B](ab: Getter[A, B]): Getter[S, B] = js.native
  /** compose a Getter with a Fold */
  def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
  /** @alias of `compose` */
  def composeGetter[B](ab: Getter[A, B]): Getter[S, B] = js.native
  /** compose a Getter with a Iso */
  def composeIso[B](ab: Iso[A, B]): Getter[S, B] = js.native
  /** compose a Getter with a Lens */
  def composeLens[B](ab: Lens[A, B]): Getter[S, B] = js.native
  /** compose a Getter with a Optional */
  def composeOptional[B](ab: Optional[A, B]): Fold[S, B] = js.native
  /** compose a Getter with a Prism */
  def composePrism[B](ab: Prism[A, B]): Fold[S, B] = js.native
  /** compose a Getter with a Optional */
  def composeTraversal[B](ab: Traversal[A, B]): Fold[S, B] = js.native
  def get(s: S): A = js.native
}

