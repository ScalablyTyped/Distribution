package typings.mergeAnything

import typings.mergeAnything.distTypesMergeMod.Merge_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merge-anything", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatArrays(originVal: Any, newVal: Any): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatArrays")(originVal.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
  
  inline def merge[T, Tn /* <: js.Array[Any] */](
    `object`: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherObjects because its type Tn is not an array type */ otherObjects: Tn
  ): Merge_[T, Tn] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(`object`.asInstanceOf[js.Any], otherObjects.asInstanceOf[js.Any])).asInstanceOf[Merge_[T, Tn]]
  
  inline def mergeAndCompare[T, Tn /* <: js.Array[Any] */](
    compareFn: js.Function3[/* prop1 */ Any, /* prop2 */ Any, /* propName */ String | js.Symbol, Any],
    `object`: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherObjects because its type Tn is not an array type */ otherObjects: Tn
  ): Merge_[T, Tn] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAndCompare")(compareFn.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], otherObjects.asInstanceOf[js.Any])).asInstanceOf[Merge_[T, Tn]]
  
  inline def mergeAndConcat[T, Tn /* <: js.Array[Any] */](
    `object`: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherObjects because its type Tn is not an array type */ otherObjects: Tn
  ): Merge_[T, Tn] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAndConcat")(`object`.asInstanceOf[js.Any], otherObjects.asInstanceOf[js.Any])).asInstanceOf[Merge_[T, Tn]]
}
