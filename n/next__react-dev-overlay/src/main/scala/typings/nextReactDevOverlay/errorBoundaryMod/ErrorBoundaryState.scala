package typings.nextReactDevOverlay.errorBoundaryMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorBoundaryState extends js.Object {
  
  var error: Error | Null = js.native
}
object ErrorBoundaryState {
  
  @scala.inline
  def apply(): ErrorBoundaryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorBoundaryState]
  }
  
  @scala.inline
  implicit class ErrorBoundaryStateOps[Self <: ErrorBoundaryState] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
}
