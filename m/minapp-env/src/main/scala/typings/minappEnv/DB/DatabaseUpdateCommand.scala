package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseUpdateCommand extends StObject {
  
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
  implicit class DatabaseUpdateCommandMutableBuilder[Self <: DatabaseUpdateCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String | InternalSymbol): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperands(value: Array[_]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: UPDATE_COMMANDS_LITERAL): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setFieldName(value: String => DatabaseUpdateCommand): Self = StObject.set(x, "_setFieldName", js.Any.fromFunction1(value))
  }
}
