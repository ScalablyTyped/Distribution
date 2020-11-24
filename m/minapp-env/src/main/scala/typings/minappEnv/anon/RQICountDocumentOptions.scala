package typings.minappEnv.anon

import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.DB.ICountDocumentOptions> */
@js.native
trait RQICountDocumentOptions extends js.Object {
  
  var config: js.UndefOr[ICloudConfig] = js.native
}
object RQICountDocumentOptions {
  
  @scala.inline
  def apply(): RQICountDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RQICountDocumentOptions]
  }
  
  @scala.inline
  implicit class RQICountDocumentOptionsOps[Self <: RQICountDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
}
