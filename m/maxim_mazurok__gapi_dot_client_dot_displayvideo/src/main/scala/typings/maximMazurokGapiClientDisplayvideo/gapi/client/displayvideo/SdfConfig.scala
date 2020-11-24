package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdfConfig extends js.Object {
  
  /** An administrator email address to which the SDF processing status reports will be sent. */
  var adminEmail: js.UndefOr[String] = js.native
  
  /** Required. The version of SDF being used. */
  var version: js.UndefOr[String] = js.native
}
object SdfConfig {
  
  @scala.inline
  def apply(): SdfConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdfConfig]
  }
  
  @scala.inline
  implicit class SdfConfigOps[Self <: SdfConfig] (val x: Self) extends AnyVal {
    
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
    def setAdminEmail(value: String): Self = this.set("adminEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminEmail: Self = this.set("adminEmail", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
