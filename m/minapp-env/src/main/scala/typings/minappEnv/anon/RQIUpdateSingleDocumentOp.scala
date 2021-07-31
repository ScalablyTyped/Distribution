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
  
  @scala.inline
  def apply(data: IUpdateCondition): RQIUpdateSingleDocumentOp = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIUpdateSingleDocumentOp]
  }
  
  @scala.inline
  implicit class RQIUpdateSingleDocumentOpMutableBuilder[Self <: RQIUpdateSingleDocumentOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
