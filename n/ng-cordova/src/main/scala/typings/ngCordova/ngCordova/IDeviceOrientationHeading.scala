package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceOrientationHeading extends js.Object {
  
  var headingAccuracy: js.UndefOr[Double] = js.native
  
  var magneticHeading: Double = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var trueHeading: js.UndefOr[Double] = js.native
}
object IDeviceOrientationHeading {
  
  @scala.inline
  def apply(magneticHeading: Double): IDeviceOrientationHeading = {
    val __obj = js.Dynamic.literal(magneticHeading = magneticHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceOrientationHeading]
  }
  
  @scala.inline
  implicit class IDeviceOrientationHeadingOps[Self <: IDeviceOrientationHeading] (val x: Self) extends AnyVal {
    
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
    def setMagneticHeading(value: Double): Self = this.set("magneticHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingAccuracy(value: Double): Self = this.set("headingAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingAccuracy: Self = this.set("headingAccuracy", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTrueHeading(value: Double): Self = this.set("trueHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrueHeading: Self = this.set("trueHeading", js.undefined)
  }
}
