package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompassHeading extends js.Object {
  
  var headingAccuracy: js.UndefOr[Double] = js.native
  
  var magneticHeading: js.UndefOr[Double] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var trueHeading: js.UndefOr[Double] = js.native
}
object CompassHeading {
  
  @scala.inline
  def apply(): CompassHeading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompassHeading]
  }
  
  @scala.inline
  implicit class CompassHeadingOps[Self <: CompassHeading] (val x: Self) extends AnyVal {
    
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
    def setHeadingAccuracy(value: Double): Self = this.set("headingAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingAccuracy: Self = this.set("headingAccuracy", js.undefined)
    
    @scala.inline
    def setMagneticHeading(value: Double): Self = this.set("magneticHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagneticHeading: Self = this.set("magneticHeading", js.undefined)
    
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
