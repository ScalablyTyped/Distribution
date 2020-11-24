package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actual extends js.Object {
  
  /** The `actual` property on the error instance. */
  var actual: js.UndefOr[js.Any] = js.native
  
  /** The `expected` property on the error instance. */
  var expected: js.UndefOr[js.Any] = js.native
  
  /** If provided, the error message is set to this value. */
  var message: js.UndefOr[String] = js.native
  
  /** The `operator` property on the error instance. */
  var operator: js.UndefOr[String] = js.native
  
  /** If provided, the generated stack trace omits frames before this function. */
  var stackStartFn: js.UndefOr[js.Function] = js.native
}
object Actual {
  
  @scala.inline
  def apply(): Actual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actual]
  }
  
  @scala.inline
  implicit class ActualOps[Self <: Actual] (val x: Self) extends AnyVal {
    
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
    def setActual(value: js.Any): Self = this.set("actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActual: Self = this.set("actual", js.undefined)
    
    @scala.inline
    def setExpected(value: js.Any): Self = this.set("expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpected: Self = this.set("expected", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setStackStartFn(value: js.Function): Self = this.set("stackStartFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackStartFn: Self = this.set("stackStartFn", js.undefined)
  }
}
