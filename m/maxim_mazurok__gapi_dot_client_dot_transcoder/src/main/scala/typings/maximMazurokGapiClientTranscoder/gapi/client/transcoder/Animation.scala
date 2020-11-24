package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  /** End previous animation. */
  var animationEnd: js.UndefOr[AnimationEnd] = js.native
  
  /** Display overlay object with fade animation. */
  var animationFade: js.UndefOr[AnimationFade] = js.native
  
  /** Display static overlay object. */
  var animationStatic: js.UndefOr[AnimationStatic] = js.native
}
object Animation {
  
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    
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
    def setAnimationEnd(value: AnimationEnd): Self = this.set("animationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEnd: Self = this.set("animationEnd", js.undefined)
    
    @scala.inline
    def setAnimationFade(value: AnimationFade): Self = this.set("animationFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationFade: Self = this.set("animationFade", js.undefined)
    
    @scala.inline
    def setAnimationStatic(value: AnimationStatic): Self = this.set("animationStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationStatic: Self = this.set("animationStatic", js.undefined)
  }
}
