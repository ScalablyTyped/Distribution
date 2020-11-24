package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeightedLocation extends js.Object {
  
  def getLocation(): LatLng = js.native
  
  def getWeight(): Double = js.native
  
  def lat(): Double = js.native
  
  def lng(): Double = js.native
}
object WeightedLocation {
  
  @scala.inline
  def apply(getLocation: () => LatLng, getWeight: () => Double, lat: () => Double, lng: () => Double): WeightedLocation = {
    val __obj = js.Dynamic.literal(getLocation = js.Any.fromFunction0(getLocation), getWeight = js.Any.fromFunction0(getWeight), lat = js.Any.fromFunction0(lat), lng = js.Any.fromFunction0(lng))
    __obj.asInstanceOf[WeightedLocation]
  }
  
  @scala.inline
  implicit class WeightedLocationOps[Self <: WeightedLocation] (val x: Self) extends AnyVal {
    
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
    def setGetLocation(value: () => LatLng): Self = this.set("getLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWeight(value: () => Double): Self = this.set("getWeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLat(value: () => Double): Self = this.set("lat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLng(value: () => Double): Self = this.set("lng", js.Any.fromFunction0(value))
  }
}
