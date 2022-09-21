package typings.mnemonist.mod

import typings.mnemonist.kdTreeMod.default
import typings.mnemonist.typesMod.IArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "KDTree")
@js.native
open class KDTree[V] () extends default[V]
/* static members */
object KDTree {
  
  @JSImport("mnemonist", "KDTree")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[js.Tuple2[I, js.Array[Double]]], dimensions: Double): typings.mnemonist.kdTreeMod.KDTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.kdTreeMod.KDTree[I]]
  
  inline def fromAxes(axes: IArrayLike): typings.mnemonist.kdTreeMod.KDTree[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAxes")(axes.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.kdTreeMod.KDTree[Double]]
  inline def fromAxes[I](axes: IArrayLike, labels: js.Array[I]): typings.mnemonist.kdTreeMod.KDTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAxes")(axes.asInstanceOf[js.Any], labels.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.kdTreeMod.KDTree[I]]
}
