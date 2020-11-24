package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoCoordinates extends js.Object {
  
  // Optional. The altitude (height), in feet, above sea level for the item. Read-only.
  var altitude: js.UndefOr[NullableOption[Double]] = js.native
  
  // Optional. The latitude, in decimal, for the item. Read-only.
  var latitude: js.UndefOr[NullableOption[Double]] = js.native
  
  // Optional. The longitude, in decimal, for the item. Read-only.
  var longitude: js.UndefOr[NullableOption[Double]] = js.native
}
object GeoCoordinates {
  
  @scala.inline
  def apply(): GeoCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoCoordinates]
  }
  
  @scala.inline
  implicit class GeoCoordinatesOps[Self <: GeoCoordinates] (val x: Self) extends AnyVal {
    
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
    def setAltitude(value: NullableOption[Double]): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setAltitudeNull: Self = this.set("altitude", null)
    
    @scala.inline
    def setLatitude(value: NullableOption[Double]): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLatitudeNull: Self = this.set("latitude", null)
    
    @scala.inline
    def setLongitude(value: NullableOption[Double]): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setLongitudeNull: Self = this.set("longitude", null)
  }
}
