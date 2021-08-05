package typings.minappEnv.anon

import typings.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.DB.ICountDocumentOptions> */
trait RQICountDocumentOptions extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
}
object RQICountDocumentOptions {
  
  inline def apply(): RQICountDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RQICountDocumentOptions]
  }
  
  extension [Self <: RQICountDocumentOptions](x: Self) {
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
