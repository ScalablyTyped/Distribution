package typings.popmotionPopcorn.interpolateMod

import typings.popmotionEasing.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolateOptions[T] extends js.Object {
  
  var clamp: js.UndefOr[Boolean] = js.native
  
  var ease: js.UndefOr[MixEasing] = js.native
  
  var mixer: js.UndefOr[MixerFactory[T]] = js.native
}
object InterpolateOptions {
  
  @scala.inline
  def apply[T](): InterpolateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolateOptions[T]]
  }
  
  @scala.inline
  implicit class InterpolateOptionsOps[Self <: InterpolateOptions[_], T] (val x: Self with InterpolateOptions[T]) extends AnyVal {
    
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
    def setClamp(value: Boolean): Self = this.set("clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClamp: Self = this.set("clamp", js.undefined)
    
    @scala.inline
    def setEaseVarargs(value: Easing*): Self = this.set("ease", js.Array(value :_*))
    
    @scala.inline
    def setEaseFunction1(value: /* v */ Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEase(value: MixEasing): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    
    @scala.inline
    def setMixer(value: (T, T) => Mix[T]): Self = this.set("mixer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMixer: Self = this.set("mixer", js.undefined)
  }
}
