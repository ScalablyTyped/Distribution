package typings.mergeAnything

import typings.mergeAnything.distTypesMergeMod.ExpandDeep
import typings.mergeAnything.mergeAnythingStrings.deep
import typings.std.Record
import typings.tsToolbelt.outMiscBuiltInMod.BuiltIn
import typings.tsToolbelt.outObjectAssignMod.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merge-anything", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatArrays(originVal: Any, newVal: Any): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatArrays")(originVal.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
  
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
}
