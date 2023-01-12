package typings.minappEnv.anon

import typings.minappEnv.AnyObject
import typings.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.ICloud.UploadFileParam> */
trait RQUploadFileParam extends StObject {
  
  var cloudPath: String
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var filePath: String
  
  var header: js.UndefOr[AnyObject] = js.undefined
}
object RQUploadFileParam {
  
  inline def apply(cloudPath: String, filePath: String): RQUploadFileParam = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQUploadFileParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RQUploadFileParam] (val x: Self) extends AnyVal {
    
    inline def setCloudPath(value: String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
