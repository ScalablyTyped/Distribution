package typings.phantom.mod

import typings.phantom.phantomBooleans.`true`
import typings.phantom.phantomStrings.callback
import typings.phantom.phantomStrings.phantom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPhantomCallback extends js.Object {
  
  var method: callback = js.native
  
  var parent: phantom = js.native
  
  var target: js.Function = js.native
  
  var transform: `true` = js.native
}
object IPhantomCallback {
  
  @scala.inline
  def apply(method: callback, parent: phantom, target: js.Function, transform: `true`): IPhantomCallback = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPhantomCallback]
  }
  
  @scala.inline
  implicit class IPhantomCallbackOps[Self <: IPhantomCallback] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: callback): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: phantom): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: `true`): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
}
