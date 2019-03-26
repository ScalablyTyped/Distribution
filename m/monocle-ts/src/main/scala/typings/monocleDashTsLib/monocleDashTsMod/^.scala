package typings
package monocleDashTsLib.monocleDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromFoldable[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function0[Fold[fpDashTsLib.libHKTMod.HKT[F, _], _]] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function0[Fold[fpDashTsLib.libHKTMod.Type[F, _], _]] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F]): js.Function0[Fold[fpDashTsLib.libHKTMod.Type2[F, _, _], _]] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable3[F]): js.Function0[Fold[fpDashTsLib.libHKTMod.Type3[F, _, _, _], _]] = js.native
  def fromTraversable[T](T: fpDashTsLib.libTraversableMod.Traversable[T]): js.Function0[Traversal[fpDashTsLib.libHKTMod.HKT[T, _], _]] = js.native
  def fromTraversable[T /* <: fpDashTsLib.libHKTMod.URIS */](T: fpDashTsLib.libTraversableMod.Traversable1[T]): js.Function0[Traversal[fpDashTsLib.libHKTMod.Type[T, _], _]] = js.native
  def fromTraversable[T /* <: fpDashTsLib.libHKTMod.URIS2 */](T: fpDashTsLib.libTraversableMod.Traversable2[T]): js.Function0[Traversal[fpDashTsLib.libHKTMod.Type2[T, _, _], _]] = js.native
  def fromTraversable[T /* <: fpDashTsLib.libHKTMod.URIS3 */](T: fpDashTsLib.libTraversableMod.Traversable3[T]): js.Function0[Traversal[fpDashTsLib.libHKTMod.Type3[T, _, _, _], _]] = js.native
}

