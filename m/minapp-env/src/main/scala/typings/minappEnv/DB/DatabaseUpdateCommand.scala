package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseUpdateCommand extends js.Object {
  
  def _setFieldName(fieldName: String): DatabaseUpdateCommand = js.native
  
  var fieldName: String | InternalSymbol = js.native
  
  var operands: Array[_] = js.native
  
  var operator: UPDATE_COMMANDS_LITERAL = js.native
}
object DatabaseUpdateCommand {
  
  @scala.inline
  def apply(
    _setFieldName: String => DatabaseUpdateCommand,
    fieldName: String | InternalSymbol,
    operands: Array[_],
    operator: UPDATE_COMMANDS_LITERAL
  ): DatabaseUpdateCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), fieldName = fieldName.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUpdateCommand]
  }
  
  @scala.inline
  implicit class DatabaseUpdateCommandOps[Self <: DatabaseUpdateCommand] (val x: Self) extends AnyVal {
    
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
    def set_setFieldName(value: String => DatabaseUpdateCommand): Self = this.set("_setFieldName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFieldName(value: String | InternalSymbol): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperands(value: Array[_]): Self = this.set("operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: UPDATE_COMMANDS_LITERAL): Self = this.set("operator", value.asInstanceOf[js.Any])
  }
}
