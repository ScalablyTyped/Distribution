package typings.mergeAnything

import typings.mergeAnything.mergeAnythingStrings.deep
import typings.std.Record
import typings.tsToolbelt.outMiscBuiltInMod.BuiltIn
import typings.tsToolbelt.outObjectAssignMod.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMergeMod {
  
  @JSImport("merge-anything/dist/types/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge[T /* <: Record[String, Any] */, Tn /* <: js.Array[Record[String, Any]] */](
    `object`: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherObjects because its type Tn is not an array type */ otherObjects: Tn
  ): ExpandDeep[Assign[T, Tn, deep, BuiltIn, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(`object`.asInstanceOf[js.Any], otherObjects.asInstanceOf[js.Any])).asInstanceOf[ExpandDeep[Assign[T, Tn, deep, BuiltIn, Unit]]]
  
  inline def mergeAndCompare[T /* <: Record[String, Any] */, Tn /* <: js.Array[Record[String, Any]] */](
    compareFn: js.Function3[/* prop1 */ Any, /* prop2 */ Any, /* propName */ String | js.Symbol, Any],
    `object`: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherObjects because its type Tn is not an array type */ otherObjects: Tn
  ): ExpandDeep[Assign[T, Tn, deep, BuiltIn, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAndCompare")(compareFn.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], otherObjects.asInstanceOf[js.Any])).asInstanceOf[ExpandDeep[Assign[T, Tn, deep, BuiltIn, Unit]]]
  
  inline def mergeAndConcat[T /* <: Record[String, Any] */, Tn /* <: js.Array[Record[String, Any]] */](
    `object`: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherObjects because its type Tn is not an array type */ otherObjects: Tn
  ): ExpandDeep[Assign[T, Tn, deep, BuiltIn, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAndConcat")(`object`.asInstanceOf[js.Any], otherObjects.asInstanceOf[js.Any])).asInstanceOf[ExpandDeep[Assign[T, Tn, deep, BuiltIn, Unit]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Record<string | number | symbol, unknown> ? {[ K in keyof T ]: merge-anything.merge-anything/dist/types/merge.ExpandDeep<T[K]>} : T extends std.Array<infer E> ? std.Array<merge-anything.merge-anything/dist/types/merge.ExpandDeep<E>> : T
    }}}
    */
  @js.native
  trait ExpandDeep[T] extends StObject
}
