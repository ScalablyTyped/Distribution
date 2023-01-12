package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalDeviceGrant extends StObject {
  
  /** Type of channel used. */
  var channelType: js.UndefOr[String] = js.undefined
  
  /** The expiration time of the grant. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** The transmission frequency range. */
  var frequencyRange: js.UndefOr[SasPortalFrequencyRange] = js.undefined
  
  /** Grant Id. */
  var grantId: js.UndefOr[String] = js.undefined
  
  /** The transmit expiration time of the last heartbeat. */
  var lastHeartbeatTransmitExpireTime: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum Equivalent Isotropically Radiated Power (EIRP) permitted by the grant. The maximum EIRP is in units of dBm/MHz. The value of `maxEirp` represents the average (RMS) EIRP that
    * would be measured by the procedure defined in FCC part 96.41(e)(3).
    */
  var maxEirp: js.UndefOr[Double] = js.undefined
  
  /** The DPA move lists on which this grant appears. */
  var moveList: js.UndefOr[js.Array[SasPortalDpaMoveList]] = js.undefined
  
  /** State of the grant. */
  var state: js.UndefOr[String] = js.undefined
  
  /** If the grant is suspended, the reason(s) for suspension. */
  var suspensionReason: js.UndefOr[js.Array[String]] = js.undefined
}
object SasPortalDeviceGrant {
  
  inline def apply(): SasPortalDeviceGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceGrant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalDeviceGrant] (val x: Self) extends AnyVal {
    
    inline def setChannelType(value: String): Self = StObject.set(x, "channelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "channelType", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setFrequencyRange(value: SasPortalFrequencyRange): Self = StObject.set(x, "frequencyRange", value.asInstanceOf[js.Any])
    
    inline def setFrequencyRangeUndefined: Self = StObject.set(x, "frequencyRange", js.undefined)
    
    inline def setGrantId(value: String): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "grantId", js.undefined)
    
    inline def setLastHeartbeatTransmitExpireTime(value: String): Self = StObject.set(x, "lastHeartbeatTransmitExpireTime", value.asInstanceOf[js.Any])
    
    inline def setLastHeartbeatTransmitExpireTimeUndefined: Self = StObject.set(x, "lastHeartbeatTransmitExpireTime", js.undefined)
    
    inline def setMaxEirp(value: Double): Self = StObject.set(x, "maxEirp", value.asInstanceOf[js.Any])
    
    inline def setMaxEirpUndefined: Self = StObject.set(x, "maxEirp", js.undefined)
    
    inline def setMoveList(value: js.Array[SasPortalDpaMoveList]): Self = StObject.set(x, "moveList", value.asInstanceOf[js.Any])
    
    inline def setMoveListUndefined: Self = StObject.set(x, "moveList", js.undefined)
    
    inline def setMoveListVarargs(value: SasPortalDpaMoveList*): Self = StObject.set(x, "moveList", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSuspensionReason(value: js.Array[String]): Self = StObject.set(x, "suspensionReason", value.asInstanceOf[js.Any])
    
    inline def setSuspensionReasonUndefined: Self = StObject.set(x, "suspensionReason", js.undefined)
    
    inline def setSuspensionReasonVarargs(value: String*): Self = StObject.set(x, "suspensionReason", js.Array(value*))
  }
}
