package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Partner extends js.Object {
  
  /** Ad server related settings of the partner. */
  var adServerConfig: js.UndefOr[PartnerAdServerConfig] = js.native
  
  /** Settings that control how partner data may be accessed. */
  var dataAccessConfig: js.UndefOr[PartnerDataAccessConfig] = js.native
  
  /** The display name of the partner. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The status of the partner. */
  var entityStatus: js.UndefOr[String] = js.native
  
  /** Settings that control which exchanges are enabled for the partner. */
  var exchangeConfig: js.UndefOr[ExchangeConfig] = js.native
  
  /** General settings of the partner. */
  var generalConfig: js.UndefOr[PartnerGeneralConfig] = js.native
  
  /** Output only. The resource name of the partner. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the partner. Assigned by the system. */
  var partnerId: js.UndefOr[String] = js.native
  
  /** Output only. The timestamp when the partner was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.native
}
object Partner {
  
  @scala.inline
  def apply(): Partner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partner]
  }
  
  @scala.inline
  implicit class PartnerOps[Self <: Partner] (val x: Self) extends AnyVal {
    
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
    def setAdServerConfig(value: PartnerAdServerConfig): Self = this.set("adServerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdServerConfig: Self = this.set("adServerConfig", js.undefined)
    
    @scala.inline
    def setDataAccessConfig(value: PartnerDataAccessConfig): Self = this.set("dataAccessConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAccessConfig: Self = this.set("dataAccessConfig", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEntityStatus(value: String): Self = this.set("entityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityStatus: Self = this.set("entityStatus", js.undefined)
    
    @scala.inline
    def setExchangeConfig(value: ExchangeConfig): Self = this.set("exchangeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchangeConfig: Self = this.set("exchangeConfig", js.undefined)
    
    @scala.inline
    def setGeneralConfig(value: PartnerGeneralConfig): Self = this.set("generalConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneralConfig: Self = this.set("generalConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerId: Self = this.set("partnerId", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
