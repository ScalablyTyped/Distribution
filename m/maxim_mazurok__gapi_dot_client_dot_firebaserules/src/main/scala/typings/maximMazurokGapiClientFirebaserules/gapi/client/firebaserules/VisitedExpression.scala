package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisitedExpression extends js.Object {
  
  /** Position in the `Source` or `Ruleset` where an expression was visited. */
  var sourcePosition: js.UndefOr[SourcePosition] = js.native
  
  /** The evaluated value for the visited expression, e.g. true/false */
  var value: js.UndefOr[js.Any] = js.native
}
object VisitedExpression {
  
  @scala.inline
  def apply(): VisitedExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitedExpression]
  }
  
  @scala.inline
  implicit class VisitedExpressionOps[Self <: VisitedExpression] (val x: Self) extends AnyVal {
    
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
    def setSourcePosition(value: SourcePosition): Self = this.set("sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePosition: Self = this.set("sourcePosition", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
