package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetFieldValuesAreEqualMod {
  
  inline def apply(ds: DataSet, fieldNames: js.Array[String], fieldValues: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], fieldValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@nginstack/engine/lib/dataset/fieldValuesAreEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
