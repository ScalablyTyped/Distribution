package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDeviceGrant extends js.Object {
  
  /** Type of channel used. */
  var channelType: js.UndefOr[String] = js.native
  
  /** The expiration time of the grant. */
  var expireTime: js.UndefOr[String] = js.native
  
  /** The transmission frequency range. */
  var frequencyRange: js.UndefOr[SasPortalFrequencyRange] = js.native
  
  /** Grant Id. */
  var grantId: js.UndefOr[String] = js.native
  
  /**
    * Maximum Equivalent Isotropically Radiated Power (EIRP) permitted by the grant. The maximum EIRP is in units of dBm/MHz. The value of maxEirp represents the average (RMS) EIRP that
    * would be measured by the procedure defined in FCC part 96.41(e)(3).
    */
  var maxEirp: js.UndefOr[Double] = js.native
  
  /** The DPA move lists on which this grant appears. */
  var moveList: js.UndefOr[js.Array[SasPortalDpaMoveList]] = js.native
  
  /** State of the grant. */
  var state: js.UndefOr[String] = js.native
  
  /** If the grant is suspended, the reason(s) for suspension. */
  var suspensionReason: js.UndefOr[js.Array[String]] = js.native
}
object SasPortalDeviceGrant {
  
  @scala.inline
  def apply(): SasPortalDeviceGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceGrant]
  }
  
  @scala.inline
  implicit class SasPortalDeviceGrantOps[Self <: SasPortalDeviceGrant] (val x: Self) extends AnyVal {
    
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
    def setChannelType(value: String): Self = this.set("channelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelType: Self = this.set("channelType", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setFrequencyRange(value: SasPortalFrequencyRange): Self = this.set("frequencyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyRange: Self = this.set("frequencyRange", js.undefined)
    
    @scala.inline
    def setGrantId(value: String): Self = this.set("grantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantId: Self = this.set("grantId", js.undefined)
    
    @scala.inline
    def setMaxEirp(value: Double): Self = this.set("maxEirp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEirp: Self = this.set("maxEirp", js.undefined)
    
    @scala.inline
    def setMoveListVarargs(value: SasPortalDpaMoveList*): Self = this.set("moveList", js.Array(value :_*))
    
    @scala.inline
    def setMoveList(value: js.Array[SasPortalDpaMoveList]): Self = this.set("moveList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveList: Self = this.set("moveList", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSuspensionReasonVarargs(value: String*): Self = this.set("suspensionReason", js.Array(value :_*))
    
    @scala.inline
    def setSuspensionReason(value: js.Array[String]): Self = this.set("suspensionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionReason: Self = this.set("suspensionReason", js.undefined)
  }
}
