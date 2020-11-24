package typings.plottable.drawStepMod

import typings.plottable.animatorMod.IAnimator
import typings.plottable.interfacesMod.AttributeToProjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawStep extends js.Object {
  
  var animator: IAnimator = js.native
  
  var attrToProjector: AttributeToProjector = js.native
}
object DrawStep {
  
  @scala.inline
  def apply(animator: IAnimator, attrToProjector: AttributeToProjector): DrawStep = {
    val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToProjector = attrToProjector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawStep]
  }
  
  @scala.inline
  implicit class DrawStepOps[Self <: DrawStep] (val x: Self) extends AnyVal {
    
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
    def setAnimator(value: IAnimator): Self = this.set("animator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrToProjector(value: AttributeToProjector): Self = this.set("attrToProjector", value.asInstanceOf[js.Any])
  }
}
