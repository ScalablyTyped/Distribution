package typings.mnemonist

import typings.mnemonist.typesMod.IArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quickMod {
  
  @JSImport("mnemonist/sort/quick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inplaceQuickSort(array: IArrayLike, lo: Double, hi: Double): IArrayLike = (^.asInstanceOf[js.Dynamic].applyDynamic("inplaceQuickSort")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[IArrayLike]
  
  inline def inplaceQuickSortIndices(array: IArrayLike, indices: IArrayLike, lo: Double, hi: Double): IArrayLike = (^.asInstanceOf[js.Dynamic].applyDynamic("inplaceQuickSortIndices")(array.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[IArrayLike]
}
