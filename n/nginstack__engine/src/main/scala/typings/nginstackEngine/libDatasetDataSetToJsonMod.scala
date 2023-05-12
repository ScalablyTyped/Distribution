package typings.nginstackEngine

import typings.nginstackEngine.anon.OnlyFilled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetDataSetToJsonMod {
  
  inline def apply(ds: DataSet): String = ^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(ds: DataSet, options: OnlyFilled): String = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/dataset/dataSetToJson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
