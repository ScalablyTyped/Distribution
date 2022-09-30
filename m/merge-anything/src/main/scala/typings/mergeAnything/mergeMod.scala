package typings.mergeAnything

import org.scalablytyped.runtime.TopLevel
import typings.mergeAnything.mergeAnythingStrings.deep
import typings.std.Record
import typings.tsToolbelt.builtInMod.BuiltIn
import typings.tsToolbelt.objectAssignMod.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
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
  
  type ExpandDeep[T] = T | js.Array[Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: any}
    */ typings.mergeAnything.mergeAnythingStrings.ExpandDeep & TopLevel[Any])
}
