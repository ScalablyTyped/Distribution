package typings.minappEnv.anon

import typings.minappEnv.DB.IUpdateCondition
import typings.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.DB.IUpdateSingleDocumentOptions> */
trait RQIUpdateSingleDocumentOp extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var data: IUpdateCondition
}
object RQIUpdateSingleDocumentOp {
  
  inline def apply(data: IUpdateCondition): RQIUpdateSingleDocumentOp = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIUpdateSingleDocumentOp]
  }
  
  extension [Self <: RQIUpdateSingleDocumentOp](x: Self) {
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
