package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationTime extends js.Object {
  
  var animationTime: Double = js.native
  
  var exponential: js.UndefOr[Boolean] = js.native
  
  var initial: js.UndefOr[Double] = js.native
  
  var springStiffness: Double = js.native
}
object AnimationTime {
  
  @scala.inline
  def apply(animationTime: Double, springStiffness: Double): AnimationTime = {
    val __obj = js.Dynamic.literal(animationTime = animationTime.asInstanceOf[js.Any], springStiffness = springStiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTime]
  }
  
  @scala.inline
  implicit class AnimationTimeOps[Self <: AnimationTime] (val x: Self) extends AnyVal {
    
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
    def setAnimationTime(value: Double): Self = this.set("animationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringStiffness(value: Double): Self = this.set("springStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponential(value: Boolean): Self = this.set("exponential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponential: Self = this.set("exponential", js.undefined)
    
    @scala.inline
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
  }
}
