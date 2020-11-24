package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookFunctionResult extends Entity {
  
  var error: js.UndefOr[NullableOption[String]] = js.native
  
  var value: js.UndefOr[NullableOption[_]] = js.native
}
object WorkbookFunctionResult {
  
  @scala.inline
  def apply(): WorkbookFunctionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFunctionResult]
  }
  
  @scala.inline
  implicit class WorkbookFunctionResultOps[Self <: WorkbookFunctionResult] (val x: Self) extends AnyVal {
    
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
    def setError(value: NullableOption[String]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setValue(value: NullableOption[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
