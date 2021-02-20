package typings.minappEnv.anon

import typings.minappEnv.Array
import typings.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.ICloud.GetTempFileURLParam> */
@js.native
trait RQGetTempFileURLParam extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.native
  
  var fileList: Array[String] = js.native
}
object RQGetTempFileURLParam {
  
  @scala.inline
  def apply(fileList: Array[String]): RQGetTempFileURLParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQGetTempFileURLParam]
  }
  
  @scala.inline
  implicit class RQGetTempFileURLParamMutableBuilder[Self <: RQGetTempFileURLParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setFileList(value: Array[String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
  }
}
