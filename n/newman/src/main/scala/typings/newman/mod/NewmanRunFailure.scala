package typings.newman.mod

import typings.newman.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewmanRunFailure extends js.Object {
  
  /** The event where the failure occurred */
  var at: String = js.native
  
  var cursor: Ref | js.Object = js.native
  
  var error: NewmanRunExecutionAssertionError = js.native
  
  var parent: js.Any = js.native
  
  var source: js.UndefOr[NewmanRunExecutionItem] = js.native
}
object NewmanRunFailure {
  
  @scala.inline
  def apply(at: String, cursor: Ref | js.Object, error: NewmanRunExecutionAssertionError, parent: js.Any): NewmanRunFailure = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunFailure]
  }
  
  @scala.inline
  implicit class NewmanRunFailureOps[Self <: NewmanRunFailure] (val x: Self) extends AnyVal {
    
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
    def setAt(value: String): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: Ref | js.Object): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: NewmanRunExecutionAssertionError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: NewmanRunExecutionItem): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
