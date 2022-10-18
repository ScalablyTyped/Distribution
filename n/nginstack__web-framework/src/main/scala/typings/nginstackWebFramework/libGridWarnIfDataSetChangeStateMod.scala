package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridWarnIfDataSetChangeStateMod {
  
  inline def apply(ds: DataSet, message: String, func: js.Function1[/* arg0 */ DataSet, Any]): Any = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], message.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(ds: DataSet, message: String, func: js.Function1[/* arg0 */ DataSet, Any], thisObj: Any): Any = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], message.asInstanceOf[js.Any], func.asInstanceOf[js.Any], thisObj.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/web-framework/lib/grid/warnIfDataSetChangeState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/grid/warnIfDataSetChangeState", "logger_")
  @js.native
  def logger: typings.nginstackEngine.libLogLoggerMod.^ = js.native
  
  inline def logger_=(x: typings.nginstackEngine.libLogLoggerMod.^): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger_")(x.asInstanceOf[js.Any])
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
