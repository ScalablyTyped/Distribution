package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerDataAccessConfig extends js.Object {
  
  /** Structured Data Files (SDF) settings for the partner. The SDF configuration for the partner. */
  var sdfConfig: js.UndefOr[SdfConfig] = js.native
}
object PartnerDataAccessConfig {
  
  @scala.inline
  def apply(): PartnerDataAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerDataAccessConfig]
  }
  
  @scala.inline
  implicit class PartnerDataAccessConfigOps[Self <: PartnerDataAccessConfig] (val x: Self) extends AnyVal {
    
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
    def setSdfConfig(value: SdfConfig): Self = this.set("sdfConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdfConfig: Self = this.set("sdfConfig", js.undefined)
  }
}
