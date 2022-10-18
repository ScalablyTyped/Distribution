package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetGetDistinctValuesMod {
  
  inline def apply(ds: DataSet, fieldName: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @JSImport("@nginstack/engine/lib/dataset/getDistinctValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
