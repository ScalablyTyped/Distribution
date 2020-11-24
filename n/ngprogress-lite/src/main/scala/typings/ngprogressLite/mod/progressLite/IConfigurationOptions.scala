package typings.ngprogressLite.mod.progressLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfigurationOptions extends js.Object {
  
  var ease: String = js.native
  
  var minimum: Double = js.native
  
  var speed: Double = js.native
  
  var template: String = js.native
  
  var trickleRate: Double = js.native
  
  var trickleSpeed: Double = js.native
}
object IConfigurationOptions {
  
  @scala.inline
  def apply(
    ease: String,
    minimum: Double,
    speed: Double,
    template: String,
    trickleRate: Double,
    trickleSpeed: Double
  ): IConfigurationOptions = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], trickleRate = trickleRate.asInstanceOf[js.Any], trickleSpeed = trickleSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurationOptions]
  }
  
  @scala.inline
  implicit class IConfigurationOptionsOps[Self <: IConfigurationOptions] (val x: Self) extends AnyVal {
    
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
    def setEase(value: String): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrickleRate(value: Double): Self = this.set("trickleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrickleSpeed(value: Double): Self = this.set("trickleSpeed", value.asInstanceOf[js.Any])
  }
}
