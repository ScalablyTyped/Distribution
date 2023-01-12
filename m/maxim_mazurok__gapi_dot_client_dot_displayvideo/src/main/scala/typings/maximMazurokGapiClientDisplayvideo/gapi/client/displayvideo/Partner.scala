package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partner extends StObject {
  
  /** Ad server related settings of the partner. */
  var adServerConfig: js.UndefOr[PartnerAdServerConfig] = js.undefined
  
  /** Settings that control how partner data may be accessed. */
  var dataAccessConfig: js.UndefOr[PartnerDataAccessConfig] = js.undefined
  
  /** The display name of the partner. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The status of the partner. */
  var entityStatus: js.UndefOr[String] = js.undefined
  
  /** Settings that control which exchanges are enabled for the partner. */
  var exchangeConfig: js.UndefOr[ExchangeConfig] = js.undefined
  
  /** General settings of the partner. */
  var generalConfig: js.UndefOr[PartnerGeneralConfig] = js.undefined
  
  /** Output only. The resource name of the partner. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the partner. Assigned by the system. */
  var partnerId: js.UndefOr[String] = js.undefined
  
  /** Output only. The timestamp when the partner was last updated. Assigned by the system. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Partner {
  
  inline def apply(): Partner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partner] (val x: Self) extends AnyVal {
    
    inline def setAdServerConfig(value: PartnerAdServerConfig): Self = StObject.set(x, "adServerConfig", value.asInstanceOf[js.Any])
    
    inline def setAdServerConfigUndefined: Self = StObject.set(x, "adServerConfig", js.undefined)
    
    inline def setDataAccessConfig(value: PartnerDataAccessConfig): Self = StObject.set(x, "dataAccessConfig", value.asInstanceOf[js.Any])
    
    inline def setDataAccessConfigUndefined: Self = StObject.set(x, "dataAccessConfig", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
    
    inline def setExchangeConfig(value: ExchangeConfig): Self = StObject.set(x, "exchangeConfig", value.asInstanceOf[js.Any])
    
    inline def setExchangeConfigUndefined: Self = StObject.set(x, "exchangeConfig", js.undefined)
    
    inline def setGeneralConfig(value: PartnerGeneralConfig): Self = StObject.set(x, "generalConfig", value.asInstanceOf[js.Any])
    
    inline def setGeneralConfigUndefined: Self = StObject.set(x, "generalConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
