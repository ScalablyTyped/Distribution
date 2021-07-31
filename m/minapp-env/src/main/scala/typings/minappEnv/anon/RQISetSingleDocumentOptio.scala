package typings.minappEnv.anon

import typings.minappEnv.DB.IUpdateCondition
import typings.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.DB.ISetSingleDocumentOptions> */
trait RQISetSingleDocumentOptio extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var data: IUpdateCondition
}
object RQISetSingleDocumentOptio {
  
  @scala.inline
  def apply(data: IUpdateCondition): RQISetSingleDocumentOptio = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQISetSingleDocumentOptio]
  }
  
  @scala.inline
  implicit class RQISetSingleDocumentOptioMutableBuilder[Self <: RQISetSingleDocumentOptio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
