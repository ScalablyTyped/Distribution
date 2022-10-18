package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetForEachRecordMod {
  
  inline def apply(ds: DataSet, f: js.Function1[/* arg0 */ DataSet, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(ds: DataSet, f: js.Function1[/* arg0 */ DataSet, Any], opt_obj: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], f.asInstanceOf[js.Any], opt_obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/forEachRecord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
