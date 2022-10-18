package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetFindFieldsMod {
  
  inline def apply(ds: DataSet, fieldNames: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@nginstack/engine/lib/dataset/findFields", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
