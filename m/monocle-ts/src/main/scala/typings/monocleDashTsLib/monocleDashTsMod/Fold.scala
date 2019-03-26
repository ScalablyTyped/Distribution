package typings
package monocleDashTsLib.monocleDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts", "Fold")
@js.native
class Fold[S, A] protected () extends js.Object {
  def this(foldMap: js.Function1[
      /* M */ fpDashTsLib.libMonoidMod.Monoid[_], 
      js.Function1[/* f */ js.Function1[/* a */ A, _], js.Function1[/* s */ S, _]]
    ]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Fold = js.native
  var foldMapFirst: js.Any = js.native
  /** check if all targets satisfy the predicate */
  def all(p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libFunctionMod.Predicate[S] = js.native
  /** compose a Fold with a Fold */
  def compose[B](ab: Fold[A, B]): Fold[S, B] = js.native
  /** @alias of `compose` */
  def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
  /** compose a Fold with a Getter */
  def composeGetter[B](ab: Getter[A, B]): Fold[S, B] = js.native
  /** compose a Fold with a Iso */
  def composeIso[B](ab: Iso[A, B]): Fold[S, B] = js.native
  /** compose a Fold with a Lens */
  def composeLens[B](ab: Lens[A, B]): Fold[S, B] = js.native
  /** compose a Fold with a Optional */
  def composeOptional[B](ab: Optional[A, B]): Fold[S, B] = js.native
  /** compose a Fold with a Prism */
  def composePrism[B](ab: Prism[A, B]): Fold[S, B] = js.native
  /** compose a Fold with a Traversal */
  def composeTraversal[B](ab: Traversal[A, B]): Fold[S, B] = js.native
  /** check if at least one target satisfies the predicate */
  def exist(p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libFunctionMod.Predicate[S] = js.native
  def find(p: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[/* s */ S, fpDashTsLib.libOptionMod.Option[A]] = js.native
  /** find the first target of a Fold matching the predicate */
  @JSName("find")
  def find_BA[B /* <: A */](p: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* s */ S, fpDashTsLib.libOptionMod.Option[B]] = js.native
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* s */ S, M]] = js.native
  /** get all the targets of a Fold */
  def getAll(s: S): js.Array[A] = js.native
  /** get the first target of a Fold */
  def headOption(s: S): fpDashTsLib.libOptionMod.Option[A] = js.native
}

