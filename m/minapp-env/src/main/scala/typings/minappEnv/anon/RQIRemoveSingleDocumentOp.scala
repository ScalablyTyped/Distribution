package typings.minappEnv.anon

import typings.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.DB.IRemoveSingleDocumentOptions> */
trait RQIRemoveSingleDocumentOp extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
}
object RQIRemoveSingleDocumentOp {
  
  inline def apply(): RQIRemoveSingleDocumentOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RQIRemoveSingleDocumentOp]
  }
  
  extension [Self <: RQIRemoveSingleDocumentOp](x: Self) {
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
