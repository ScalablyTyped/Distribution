package typings.miniCreateReactContext.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerProps[T] extends js.Object {
  
  var children: RenderFn[T] | js.Array[RenderFn[T]] = js.native
  
  var observedBits: js.UndefOr[Double] = js.native
}
object ConsumerProps {
  
  @scala.inline
  def apply[T](children: RenderFn[T] | js.Array[RenderFn[T]]): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  
  @scala.inline
  implicit class ConsumerPropsOps[Self <: ConsumerProps[_], T] (val x: Self with ConsumerProps[T]) extends AnyVal {
    
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
    def setChildrenVarargs(value: RenderFn[T]*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildrenFunction1(value: T => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: RenderFn[T] | js.Array[RenderFn[T]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedBits(value: Double): Self = this.set("observedBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservedBits: Self = this.set("observedBits", js.undefined)
  }
}
