package typings
package monocleDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyF[S, A] extends js.Object {
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative1[
      monocleDashTsLib.monocleDashTsLibStrings.Array | monocleDashTsLib.monocleDashTsLibStrings.Eq | monocleDashTsLib.monocleDashTsLibStrings.FreeGroup | monocleDashTsLib.monocleDashTsLibStrings.IO | monocleDashTsLib.monocleDashTsLibStrings.Identity | monocleDashTsLib.monocleDashTsLibStrings.NonEmptyArray | monocleDashTsLib.monocleDashTsLibStrings.NonEmptyArray2v | monocleDashTsLib.monocleDashTsLibStrings.Option | monocleDashTsLib.monocleDashTsLibStrings.Ord | monocleDashTsLib.monocleDashTsLibStrings.Pair | monocleDashTsLib.monocleDashTsLibStrings.Record | monocleDashTsLib.monocleDashTsLibStrings.StrMap | monocleDashTsLib.monocleDashTsLibStrings.Task | monocleDashTsLib.monocleDashTsLibStrings.Tree | monocleDashTsLib.monocleDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.StrMap, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type[monocleDashTsLib.monocleDashTsLibStrings.StrMap, S]
    ]
  ] = js.native
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative2[
      monocleDashTsLib.monocleDashTsLibStrings.Const | monocleDashTsLib.monocleDashTsLibStrings.Either | monocleDashTsLib.monocleDashTsLibStrings.Free | monocleDashTsLib.monocleDashTsLibStrings.IOEither | monocleDashTsLib.monocleDashTsLibStrings.Map | monocleDashTsLib.monocleDashTsLibStrings.Reader | monocleDashTsLib.monocleDashTsLibStrings.State | monocleDashTsLib.monocleDashTsLibStrings.Store | monocleDashTsLib.monocleDashTsLibStrings.TaskEither | monocleDashTsLib.monocleDashTsLibStrings.These | monocleDashTsLib.monocleDashTsLibStrings.Traced | monocleDashTsLib.monocleDashTsLibStrings.Tuple | monocleDashTsLib.monocleDashTsLibStrings.Validation | monocleDashTsLib.monocleDashTsLibStrings.Writer
    ]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Writer, _, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Writer, _, S]
    ]
  ] = js.native
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative3[
      monocleDashTsLib.monocleDashTsLibStrings.IxIO | monocleDashTsLib.monocleDashTsLibStrings.ReaderTaskEither
    ]
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
  def apply[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[F, S]]
  ] = js.native
  def apply[L](
    F: fpDashTsLib.libApplicativeMod.Applicative2C[
      monocleDashTsLib.monocleDashTsLibStrings.Const | monocleDashTsLib.monocleDashTsLibStrings.Either | monocleDashTsLib.monocleDashTsLibStrings.Free | monocleDashTsLib.monocleDashTsLibStrings.IOEither | monocleDashTsLib.monocleDashTsLibStrings.Map | monocleDashTsLib.monocleDashTsLibStrings.Reader | monocleDashTsLib.monocleDashTsLibStrings.State | monocleDashTsLib.monocleDashTsLibStrings.Store | monocleDashTsLib.monocleDashTsLibStrings.TaskEither | monocleDashTsLib.monocleDashTsLibStrings.These | monocleDashTsLib.monocleDashTsLibStrings.Traced | monocleDashTsLib.monocleDashTsLibStrings.Tuple | monocleDashTsLib.monocleDashTsLibStrings.Validation | monocleDashTsLib.monocleDashTsLibStrings.Writer, 
      L
    ]
  ): js.Function1[
    /* f */ js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Writer, L, A]
    ], 
    js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[monocleDashTsLib.monocleDashTsLibStrings.Writer, L, S]
    ]
  ] = js.native
  def apply[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[
      monocleDashTsLib.monocleDashTsLibStrings.IxIO | monocleDashTsLib.monocleDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ]
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
}

