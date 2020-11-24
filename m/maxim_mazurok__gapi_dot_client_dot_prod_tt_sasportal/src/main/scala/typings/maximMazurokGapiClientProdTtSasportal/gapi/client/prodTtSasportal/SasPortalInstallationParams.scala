package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalInstallationParams extends js.Object {
  
  /**
    * Boresight direction of the horizontal plane of the antenna in degrees with respect to true north. The value of this parameter is an integer with a value between 0 and 359 inclusive.
    * A value of 0 degrees means true north; a value of 90 degrees means east. This parameter is optional for Category A devices and conditional for Category B devices.
    */
  var antennaAzimuth: js.UndefOr[Double] = js.native
  
  /**
    * 3-dB antenna beamwidth of the antenna in the horizontal-plane in degrees. This parameter is an unsigned integer having a value between 0 and 360 (degrees) inclusive; it is optional
    * for Category A devices and conditional for Category B devices.
    */
  var antennaBeamwidth: js.UndefOr[Double] = js.native
  
  /**
    * Antenna downtilt in degrees and is an integer with a value between -90 and +90 inclusive; a negative value means the antenna is tilted up (above horizontal). This parameter is
    * optional for Category A devices and conditional for Category B devices.
    */
  var antennaDowntilt: js.UndefOr[Double] = js.native
  
  /** Peak antenna gain in dBi. This parameter is an integer with a value between -127 and +128 (dBi) inclusive. */
  var antennaGain: js.UndefOr[Double] = js.native
  
  /** If an external antenna is used, the antenna model is optionally provided in this field. The string has a maximum length of 128 octets. */
  var antennaModel: js.UndefOr[String] = js.native
  
  /** If present, this parameter specifies whether the CBSD is a CPE-CBSD or not. */
  var cpeCbsdIndication: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter is the maximum device EIRP in units of dBm/10MHz and is an integer with a value between -127 and +47 (dBm/10 MHz) inclusive. If not included, SAS interprets it as
    * maximum allowable EIRP in units of dBm/10MHz for device category.
    */
  var eirpCapability: js.UndefOr[Double] = js.native
  
  /**
    * Device antenna height in meters. When the heightType parameter value is "AGL", the antenna height should be given relative to ground level. When the heightType parameter value is
    * "AMSL", it is given with respect to WGS84 datum.
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Specifies how the height is measured. */
  var heightType: js.UndefOr[String] = js.native
  
  /**
    * A positive number in meters to indicate accuracy of the device antenna horizontal location. This optional parameter should only be present if its value is less than the FCC
    * requirement of 50 meters.
    */
  var horizontalAccuracy: js.UndefOr[Double] = js.native
  
  /** Whether the device antenna is indoor or not. True: indoor. False: outdoor. */
  var indoorDeployment: js.UndefOr[Boolean] = js.native
  
  /**
    * Latitude of the device antenna location in degrees relative to the WGS 84 datum. The allowed range is from -90.000000 to +90.000000. Positive values represent latitudes north of the
    * equator; negative values south of the equator.
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * Longitude of the device antenna location. in degrees relative to the WGS 84 datum. The allowed range is from -180.000000 to +180.000000. Positive values represent longitudes east of
    * the prime meridian; negative values west of the prime meridian.
    */
  var longitude: js.UndefOr[Double] = js.native
  
  /**
    * A positive number in meters to indicate accuracy of the device antenna vertical location. This optional parameter should only be present if its value is less than the FCC
    * requirement of 3 meters.
    */
  var verticalAccuracy: js.UndefOr[Double] = js.native
}
object SasPortalInstallationParams {
  
  @scala.inline
  def apply(): SasPortalInstallationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalInstallationParams]
  }
  
  @scala.inline
  implicit class SasPortalInstallationParamsOps[Self <: SasPortalInstallationParams] (val x: Self) extends AnyVal {
    
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
    def setAntennaAzimuth(value: Double): Self = this.set("antennaAzimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntennaAzimuth: Self = this.set("antennaAzimuth", js.undefined)
    
    @scala.inline
    def setAntennaBeamwidth(value: Double): Self = this.set("antennaBeamwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntennaBeamwidth: Self = this.set("antennaBeamwidth", js.undefined)
    
    @scala.inline
    def setAntennaDowntilt(value: Double): Self = this.set("antennaDowntilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntennaDowntilt: Self = this.set("antennaDowntilt", js.undefined)
    
    @scala.inline
    def setAntennaGain(value: Double): Self = this.set("antennaGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntennaGain: Self = this.set("antennaGain", js.undefined)
    
    @scala.inline
    def setAntennaModel(value: String): Self = this.set("antennaModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntennaModel: Self = this.set("antennaModel", js.undefined)
    
    @scala.inline
    def setCpeCbsdIndication(value: Boolean): Self = this.set("cpeCbsdIndication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpeCbsdIndication: Self = this.set("cpeCbsdIndication", js.undefined)
    
    @scala.inline
    def setEirpCapability(value: Double): Self = this.set("eirpCapability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEirpCapability: Self = this.set("eirpCapability", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightType(value: String): Self = this.set("heightType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightType: Self = this.set("heightType", js.undefined)
    
    @scala.inline
    def setHorizontalAccuracy(value: Double): Self = this.set("horizontalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAccuracy: Self = this.set("horizontalAccuracy", js.undefined)
    
    @scala.inline
    def setIndoorDeployment(value: Boolean): Self = this.set("indoorDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndoorDeployment: Self = this.set("indoorDeployment", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setVerticalAccuracy(value: Double): Self = this.set("verticalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAccuracy: Self = this.set("verticalAccuracy", js.undefined)
  }
}
