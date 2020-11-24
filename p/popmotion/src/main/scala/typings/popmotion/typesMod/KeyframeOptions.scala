package typings.popmotion.typesMod

import typings.popmotion.easingTypesMod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframeOptions[V] extends js.Object {
  
  var duration: js.UndefOr[Double] = js.native
  
  var ease: js.UndefOr[Easing | js.Array[Easing]] = js.native
  
  var from: js.UndefOr[V] = js.native
  
  var offset: js.UndefOr[js.Array[Double]] = js.native
  
  var to: V | js.Array[V] = js.native
}
object KeyframeOptions {
  
  @scala.inline
  def apply[V](to: V | js.Array[V]): KeyframeOptions[V] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframeOptions[V]]
  }
  
  @scala.inline
  implicit class KeyframeOptionsOps[Self <: KeyframeOptions[_], V] (val x: Self with KeyframeOptions[V]) extends AnyVal {
    
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
    def setToVarargs(value: V*): Self = this.set("to", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: V | js.Array[V]): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEaseVarargs(value: Easing*): Self = this.set("ease", js.Array(value :_*))
    
    @scala.inline
    def setEaseFunction1(value: /* v */ Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEase(value: Easing | js.Array[Easing]): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    
    @scala.inline
    def setFrom(value: V): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
