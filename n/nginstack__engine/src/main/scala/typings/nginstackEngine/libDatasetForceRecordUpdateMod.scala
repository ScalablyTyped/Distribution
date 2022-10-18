package typings.nginstackEngine

import typings.nginstackEngine.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetForceRecordUpdateMod {
  
  inline def apply(queryFunc: js.Function0[DataSet], updateFunc: js.Function1[/* arg0 */ DataSet, Any]): DataSet = (^.asInstanceOf[js.Dynamic].apply(queryFunc.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any])).asInstanceOf[DataSet]
  inline def apply(
    queryFunc: js.Function0[DataSet],
    updateFunc: js.Function1[/* arg0 */ DataSet, Any],
    opt_options: Context
  ): DataSet = (^.asInstanceOf[js.Dynamic].apply(queryFunc.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[DataSet]
  
  @JSImport("@nginstack/engine/lib/dataset/forceRecordUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
