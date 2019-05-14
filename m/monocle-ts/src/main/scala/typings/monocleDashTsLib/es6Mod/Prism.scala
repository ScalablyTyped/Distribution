package typings
package monocleDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts/es6", "Prism")
@js.native
class Prism[S, A] protected () extends js.Object {
  def this(getOption: js.Function1[/* s */ S, fpDashTsLib.libOptionMod.Option[A]], reverseGet: js.Function1[/* a */ A, S]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Prism = js.native
  /** view a Prism as a Fold */
  def asFold(): Fold[S, A] = js.native
  /** view a Prism as a Optional */
  def asOptional(): Optional[S, A] = js.native
  /** view a Prism as a Setter */
  def asSetter(): Setter[S, A] = js.native
  /** view a Prism as a Traversal */
  def asTraversal(): Traversal[S, A] = js.native
  /** compose a Prism with a Prism */
  def compose[B](ab: Prism[A, B]): Prism[S, B] = js.native
  /** compose a Prism with a Fold */
  def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
  /** compose a Prism with a Getter */
  def composeGetter[B](ab: Getter[A, B]): Fold[S, B] = js.native
  /** compose a Prism with a Iso */
  def composeIso[B](ab: Iso[A, B]): Prism[S, B] = js.native
  /** compose a Prism with a Lens */
  def composeLens[B](ab: Lens[A, B]): Optional[S, B] = js.native
  /** compose a Prism with a Optional */
  def composeOptional[B](ab: Optional[A, B]): Optional[S, B] = js.native
  /** @alias of `compose` */
  def composePrism[B](ab: Prism[A, B]): Prism[S, B] = js.native
  /** compose a Prism with a Setter */
  def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
  /** compose a Prism with a Traversal */
  def composeTraversal[B](ab: Traversal[A, B]): Traversal[S, B] = js.native
  def getOption(s: S): fpDashTsLib.libOptionMod.Option[A] = js.native
  def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
  def modifyOption(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, fpDashTsLib.libOptionMod.Option[S]] = js.native
  def reverseGet(a: A): S = js.native
  /** set the target of a Prism with a value */
  def set(a: A): js.Function1[/* s */ S, S] = js.native
}

/* static members */
@JSImport("monocle-ts/es6", "Prism")
@js.native
object Prism extends js.Object {
  def fromPredicate[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): monocleDashTsLib.es6Mod.Prism[A, A] = js.native
  @JSName("fromPredicate")
  def fromPredicate_SAS[S, A /* <: S */](refinement: fpDashTsLib.libFunctionMod.Refinement[S, A]): monocleDashTsLib.es6Mod.Prism[S, A] = js.native
  /**
    * Use `fromPredicate` instead
    * @deprecated
    */
  def fromRefinement[S, A /* <: S */](refinement: fpDashTsLib.libFunctionMod.Refinement[S, A]): monocleDashTsLib.es6Mod.Prism[S, A] = js.native
  def some[A](): monocleDashTsLib.es6Mod.Prism[fpDashTsLib.libOptionMod.Option[A], A] = js.native
}

