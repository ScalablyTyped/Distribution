package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseUpdateCommand extends StObject {
  
  def _setFieldName(fieldName: String): DatabaseUpdateCommand
  
  var fieldName: String | InternalSymbol
  
  var operands: Array[Any]
  
  var operator: UPDATE_COMMANDS_LITERAL
}
object DatabaseUpdateCommand {
  
  inline def apply(
    _setFieldName: String => DatabaseUpdateCommand,
    fieldName: String | InternalSymbol,
    operands: Array[Any],
    operator: UPDATE_COMMANDS_LITERAL
  ): DatabaseUpdateCommand = {
    val __obj = js.Dynamic.literal(_setFieldName = js.Any.fromFunction1(_setFieldName), fieldName = fieldName.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUpdateCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseUpdateCommand] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String | InternalSymbol): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setOperands(value: Array[Any]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: UPDATE_COMMANDS_LITERAL): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def set_setFieldName(value: String => DatabaseUpdateCommand): Self = StObject.set(x, "_setFieldName", js.Any.fromFunction1(value))
  }
}
