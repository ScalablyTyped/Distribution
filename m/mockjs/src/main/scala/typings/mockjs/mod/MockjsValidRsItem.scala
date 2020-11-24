package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockjsValidRsItem extends js.Object {
  
  var action: S = js.native
  
  var actual: S = js.native
  
  var expected: S = js.native
  
  var message: S = js.native
  
  var path: js.Array[S] = js.native
  
  var `type`: S = js.native
}
object MockjsValidRsItem {
  
  @scala.inline
  def apply(action: S, actual: S, expected: S, message: S, path: js.Array[S], `type`: S): MockjsValidRsItem = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockjsValidRsItem]
  }
  
  @scala.inline
  implicit class MockjsValidRsItemOps[Self <: MockjsValidRsItem] (val x: Self) extends AnyVal {
    
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
    def setAction(value: S): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActual(value: S): Self = this.set("actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected(value: S): Self = this.set("expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: S): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: S*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[S]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: S): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
