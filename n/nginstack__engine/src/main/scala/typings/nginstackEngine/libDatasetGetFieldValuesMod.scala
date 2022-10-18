package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetGetFieldValuesMod {
  
  inline def apply(dataSet: DataSet, fieldNames: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply(dataSet.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def apply(dataSet: DataSet, fieldNames: js.Array[String]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply(dataSet.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @JSImport("@nginstack/engine/lib/dataset/getFieldValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
