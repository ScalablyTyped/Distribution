package typings.mergeAnything

import typings.mergeAnything.distTypesTypeUtilsAssignMod.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMergeMod {
  
  @JSImport("merge-anything/dist/types/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Record<string | number | symbol, unknown> ? Ts extends std.Array<std.Record<string | number | symbol, unknown>> ? merge-anything.merge-anything/dist/types/typeUtils/PrettyPrint.PrettyPrint<merge-anything.merge-anything/dist/types/typeUtils/Assign.Assign<T, Ts>, never> : merge-anything.merge-anything/dist/types/typeUtils/List.Pop<Ts> : merge-anything.merge-anything/dist/types/typeUtils/List.Pop<Ts>
    }}}
    */
  type Merge_[T, Ts /* <: js.Array[Any] */] = Assign[T, Ts]
}
