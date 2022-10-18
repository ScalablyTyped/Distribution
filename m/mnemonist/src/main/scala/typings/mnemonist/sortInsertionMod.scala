package typings.mnemonist

import typings.mnemonist.utilsTypesMod.IArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortInsertionMod {
  
  @JSImport("mnemonist/sort/insertion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inplaceInsertionSort(array: IArrayLike, lo: Double, hi: Double): IArrayLike = (^.asInstanceOf[js.Dynamic].applyDynamic("inplaceInsertionSort")(array.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[IArrayLike]
  
  inline def inplaceInsertionSortIndices(array: IArrayLike, indices: IArrayLike, lo: Double, hi: Double): IArrayLike = (^.asInstanceOf[js.Dynamic].applyDynamic("inplaceInsertionSortIndices")(array.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[IArrayLike]
}
