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
  @JSName("modifyF")
  def modifyF_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Array, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Array, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Const, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Const, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Const, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Const, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Const, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Either, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Either, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Either, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Either, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Either, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Eq]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Eq, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Eq, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Free, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Free, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Free, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Free, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Free, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.FreeGroup, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.FreeGroup, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.IO, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.IO, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.IOEither, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.IOEither, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_IOEither[L](
    F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.IOEither, L]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.IOEither, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.IOEither, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Identity, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Identity, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[monocleDashTsLib.monocleDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type3[monocleDashTsLib.monocleDashTsLibStrings.IxIO, _, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type3[monocleDashTsLib.monocleDashTsLibStrings.IxIO, _, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_IxIO[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[monocleDashTsLib.monocleDashTsLibStrings.IxIO, U, L]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type3[monocleDashTsLib.monocleDashTsLibStrings.IxIO, U, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type3[monocleDashTsLib.monocleDashTsLibStrings.IxIO, U, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Map, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Map, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Map, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Map, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Map, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_NonEmptyArray(
    F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.NonEmptyArray, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.NonEmptyArray, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_NonEmptyArray2v(
    F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.NonEmptyArray2v, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.NonEmptyArray2v, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Option, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Option, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Ord]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Ord, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Ord, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Pair, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Pair, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Reader, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Reader, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Reader, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Reader, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Reader, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_ReaderTaskEither(
    F: fpDashTsLib.libApplicativeMod.Applicative3[monocleDashTsLib.monocleDashTsLibStrings.ReaderTaskEither]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type3[monocleDashTsLib.monocleDashTsLibStrings.ReaderTaskEither, _, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type3[monocleDashTsLib.monocleDashTsLibStrings.ReaderTaskEither, _, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[monocleDashTsLib.monocleDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type3[monocleDashTsLib.monocleDashTsLibStrings.ReaderTaskEither, U, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type3[monocleDashTsLib.monocleDashTsLibStrings.ReaderTaskEither, U, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Record]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Record, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Record, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_State(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.State, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.State, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.State, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.State, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.State, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Store, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Store, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Store, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Store, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Store, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.StrMap, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.StrMap, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Task, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Task, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.TaskEither, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.TaskEither, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_TaskEither[L](
    F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.TaskEither, L]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.TaskEither, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.TaskEither, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_These(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.These, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.These, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.These, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.These, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.These, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Traced, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Traced, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Traced, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Traced, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Traced, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Tree, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Tree, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Tuple, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Tuple, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Tuple, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Tuple, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Tuple, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Validation, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Validation, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Validation[L](
    F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Validation, L]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Validation, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Validation, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[monocleDashTsLib.monocleDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Writer, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Writer, _, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[monocleDashTsLib.monocleDashTsLibStrings.Writer, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Writer, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Writer, L, S]
    ]
  ] = js.native
  @JSName("modifyF")
  def modifyF_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[monocleDashTsLib.monocleDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Zipper, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.Zipper, S]
    ]
  ] = js.native
  def set(a: A): js.Function1[/* s */ S, S] = js.native
}

