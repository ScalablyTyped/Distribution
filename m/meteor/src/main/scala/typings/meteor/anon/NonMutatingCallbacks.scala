package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonMutatingCallbacks extends js.Object {
  
  var nonMutatingCallbacks: js.UndefOr[Boolean] = js.native
}
object NonMutatingCallbacks {
  
  @scala.inline
  def apply(): NonMutatingCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonMutatingCallbacks]
  }
  
  @scala.inline
  implicit class NonMutatingCallbacksOps[Self <: NonMutatingCallbacks] (val x: Self) extends AnyVal {
    
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
    def setNonMutatingCallbacks(value: Boolean): Self = this.set("nonMutatingCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonMutatingCallbacks: Self = this.set("nonMutatingCallbacks", js.undefined)
  }
}
