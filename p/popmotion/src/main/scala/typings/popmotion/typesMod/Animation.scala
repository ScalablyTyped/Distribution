package typings.popmotion.typesMod

import typings.popmotion.anon.Done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation[V] extends js.Object {
  
  def flipTarget(): Unit = js.native
  
  def next(t: Double): Done[V] = js.native
}
object Animation {
  
  @scala.inline
  def apply[V](flipTarget: () => Unit, next: Double => Done[V]): Animation[V] = {
    val __obj = js.Dynamic.literal(flipTarget = js.Any.fromFunction0(flipTarget), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[Animation[V]]
  }
  
  @scala.inline
  implicit class AnimationOps[Self <: Animation[_], V] (val x: Self with Animation[V]) extends AnyVal {
    
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
    def setFlipTarget(value: () => Unit): Self = this.set("flipTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: Double => Done[V]): Self = this.set("next", js.Any.fromFunction1(value))
  }
}
