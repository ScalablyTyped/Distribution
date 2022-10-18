package typings.nginstackEngine

import typings.nginstackEngine.anon.OnlyFilled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetRecordToObjectMod {
  
  inline def apply(dataSet: DataSet): Any = ^.asInstanceOf[js.Dynamic].apply(dataSet.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(dataSet: DataSet, opt_options: OnlyFilled): Any = (^.asInstanceOf[js.Dynamic].apply(dataSet.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/dataset/recordToObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
