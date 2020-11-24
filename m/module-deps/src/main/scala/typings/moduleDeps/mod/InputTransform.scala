package typings.moduleDeps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputTransform extends js.Object {
  
  var global: js.UndefOr[Boolean] = js.native
  
  var options: js.Any = js.native
  
  var transform: String | js.Function0[_] = js.native
}
object InputTransform {
  
  @scala.inline
  def apply(options: js.Any, transform: String | js.Function0[_]): InputTransform = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTransform]
  }
  
  @scala.inline
  implicit class InputTransformOps[Self <: InputTransform] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformFunction0(value: () => _): Self = this.set("transform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransform(value: String | js.Function0[_]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
  }
}
