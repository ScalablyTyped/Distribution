package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationDuration extends js.Object {
  
  var animationDuration: Double = js.native
  
  var hoverBehaviorDelay: Double = js.native
  
  var linkDefaults: EndConnectorType = js.native
  
  var nodeDefaults: Icon = js.native
  
  var promotedLink: StartConnectorType = js.native
}
object AnimationDuration {
  
  @scala.inline
  def apply(
    animationDuration: Double,
    hoverBehaviorDelay: Double,
    linkDefaults: EndConnectorType,
    nodeDefaults: Icon,
    promotedLink: StartConnectorType
  ): AnimationDuration = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], linkDefaults = linkDefaults.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], promotedLink = promotedLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDuration]
  }
  
  @scala.inline
  implicit class AnimationDurationOps[Self <: AnimationDuration] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = this.set("hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkDefaults(value: EndConnectorType): Self = this.set("linkDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDefaults(value: Icon): Self = this.set("nodeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotedLink(value: StartConnectorType): Self = this.set("promotedLink", value.asInstanceOf[js.Any])
  }
}
