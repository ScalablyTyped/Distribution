package typings.opentelemetryCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShimWrapped extends js.Object {
  
  var __original: js.Function = js.native
  
  var __unwrap: js.Function = js.native
  
  var __wrapped: Boolean = js.native
}
object ShimWrapped {
  
  @scala.inline
  def apply(__original: js.Function, __unwrap: js.Function, __wrapped: Boolean): ShimWrapped = {
    val __obj = js.Dynamic.literal(__original = __original.asInstanceOf[js.Any], __unwrap = __unwrap.asInstanceOf[js.Any], __wrapped = __wrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShimWrapped]
  }
  
  @scala.inline
  implicit class ShimWrappedOps[Self <: ShimWrapped] (val x: Self) extends AnyVal {
    
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
    def set__original(value: js.Function): Self = this.set("__original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__unwrap(value: js.Function): Self = this.set("__unwrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__wrapped(value: Boolean): Self = this.set("__wrapped", value.asInstanceOf[js.Any])
  }
}
