package typings
package monocleDashTsLib.monocleDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts", "Traversal")
@js.native
class Traversal[S, A] protected () extends js.Object {
  def this(modifyF: ModifyF[S, A]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Traversal = js.native
  /** view a Traversal as a Fold */
  def asFold(): Fold[S, A] = js.native
  /** view a Traversal as a Setter */
  def asSetter(): Setter[S, A] = js.native
  /** compose a Traversal with a Traversal */
  def compose[B](ab: Traversal[A, B]): Traversal[S, B] = js.native
  /** compose a Traversal with a Fold */
  def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
  /** compose a Traversal with a Getter */
  def composeGetter[B](ab: Getter[A, B]): Fold[S, B] = js.native
  /** compose a Traversal with a Iso */
  def composeIso[B](ab: Iso[A, B]): Traversal[S, B] = js.native
  /** compose a Traversal with a Lens */
  def composeLens[B](ab: Lens[A, B]): Traversal[S, B] = js.native
  /** compose a Traversal with a Optional */
  def composeOptional[B](ab: Optional[A, B]): Traversal[S, B] = js.native
  /** compose a Traversal with a Prism */
  def composePrism[B](ab: Prism[A, B]): Traversal[S, B] = js.native
  /** compose a Traversal with a Setter */
  def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
  /** @alias of `compose` */
  def composeTraversal[B](ab: Traversal[A, B]): Traversal[S, B] = js.native
  def filter(predicate: fpDashTsLib.libFunctionMod.Predicate[A]): Traversal[S, A] = js.native
  /**
    * focus the items matched by a traversal to those that match a predicate
    *
    * @example
    * import { fromTraversable, Lens } from 'monocle-ts'
    * import { array } from 'fp-ts/lib/Array'
    *
    * interface Person {
    *   name: string;
    *   cool: boolean;
    * }
    *
    * const peopleTraversal = fromTraversable(array)<Person>()
    * const coolLens = Lens.fromProp<Person>()('cool')
    * const people = [{name: 'bill', cool: false}, {name: 'jill', cool: true}]
    *
    * const actual = peopleTraversal.filter(p => p.name === 'bill').composeLens(coolLens)
    *   .set(true)(people)
    *
    * assert.deepStrictEqual(actual, [{name: 'bill', cool: true}, {name: 'jill', cool: true}])
    */
  @JSName("filter")
  def filter_BA[B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): Traversal[S, B] = js.native
  def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
  def modifyF[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[F, S]]
  ] = js.native
  def modifyF[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type[F, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type[F, S]]
  ] = js.native
  def modifyF[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type2[F, _, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[F, _, S]]
  ] = js.native
  def modifyF[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type3[F, _, _, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[F, _, _, S]]
  ] = js.native
  def modifyF[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type2[F, L, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[F, L, S]]
  ] = js.native
  def modifyF[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type3[F, U, L, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[F, U, L, S]]
  ] = js.native
  def set(a: A): js.Function1[/* s */ S, S] = js.native
}

