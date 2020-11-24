package typings.oracleOraclejet.ojmoduleElementMod

import typings.oracleOraclejet.anon.InsertNewView
import typings.oracleOraclejet.anon.IsInitial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleElementAnimation extends js.Object {
  
  def animate(context: InsertNewView): js.Promise[_] = js.native
  
  def canAnimate(context: IsInitial): Boolean = js.native
  
  def prepareAnimation(context: IsInitial): js.Object = js.native
}
object ModuleElementAnimation {
  
  @scala.inline
  def apply(
    animate: InsertNewView => js.Promise[_],
    canAnimate: IsInitial => Boolean,
    prepareAnimation: IsInitial => js.Object
  ): ModuleElementAnimation = {
    val __obj = js.Dynamic.literal(animate = js.Any.fromFunction1(animate), canAnimate = js.Any.fromFunction1(canAnimate), prepareAnimation = js.Any.fromFunction1(prepareAnimation))
    __obj.asInstanceOf[ModuleElementAnimation]
  }
  
  @scala.inline
  implicit class ModuleElementAnimationOps[Self <: ModuleElementAnimation] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: InsertNewView => js.Promise[_]): Self = this.set("animate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanAnimate(value: IsInitial => Boolean): Self = this.set("canAnimate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrepareAnimation(value: IsInitial => js.Object): Self = this.set("prepareAnimation", js.Any.fromFunction1(value))
  }
}
