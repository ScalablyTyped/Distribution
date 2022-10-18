package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetGetFirstFieldValueMod {
  
  inline def apply(ds: DataSet, fieldNames: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/dataset/getFirstFieldValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
