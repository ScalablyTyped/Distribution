package typings.popmotion.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InertiaOptions extends DecayOptions {
  
  var bounceDamping: js.UndefOr[Double] = js.native
  
  var bounceStiffness: js.UndefOr[Double] = js.native
  
  var driver: js.UndefOr[Driver] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* v */ Double, Unit]] = js.native
  
  var restSpeed: js.UndefOr[Double] = js.native
}
object InertiaOptions {
  
  @scala.inline
  def apply(): InertiaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InertiaOptions]
  }
  
  @scala.inline
  implicit class InertiaOptionsOps[Self <: InertiaOptions] (val x: Self) extends AnyVal {
    
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
    def setBounceDamping(value: Double): Self = this.set("bounceDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceDamping: Self = this.set("bounceDamping", js.undefined)
    
    @scala.inline
    def setBounceStiffness(value: Double): Self = this.set("bounceStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceStiffness: Self = this.set("bounceStiffness", js.undefined)
    
    @scala.inline
    def setDriver(value: /* update */ Update => DriverControls): Self = this.set("driver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* v */ Double => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setRestSpeed(value: Double): Self = this.set("restSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestSpeed: Self = this.set("restSpeed", js.undefined)
  }
}
