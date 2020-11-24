package typings.miniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnimationArgs extends js.Object {
  
  /**
    * Animation delay, in ms, 0 by default.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Animation duration, in ms, 400 by default.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Define animation effect, linear by default, effective
    *  values including linear, ease, ease-in, ease-in-out,
    * ease-out, step-start and step-end .
    */
  var timeFunction: js.UndefOr[String] = js.native
  
  /**
    * Set transform-origin, 50% 50% 0 by default.
    */
  var transformOrigin: js.UndefOr[String] = js.native
}
object CreateAnimationArgs {
  
  @scala.inline
  def apply(): CreateAnimationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnimationArgs]
  }
  
  @scala.inline
  implicit class CreateAnimationArgsOps[Self <: CreateAnimationArgs] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setTimeFunction(value: String): Self = this.set("timeFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFunction: Self = this.set("timeFunction", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
  }
}
