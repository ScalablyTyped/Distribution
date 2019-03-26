package typings
package monocleDashTsLib.monocleDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyF[S, A] extends js.Object {
  def apply[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[F, S]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type[F, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type[F, S]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type2[F, _, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[F, _, S]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type3[F, _, _, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[F, _, _, S]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type2[F, L, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[F, L, S]]
  ] = js.native
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function1[
    /* f */ js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type3[F, U, L, A]], 
    js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[F, U, L, S]]
  ] = js.native
}

