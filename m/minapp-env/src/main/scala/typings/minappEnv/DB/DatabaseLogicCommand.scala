package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DB.DatabaseLogicCommand")
@js.native
class DatabaseLogicCommand () extends js.Object {
  var fieldName: String | InternalSymbol = js.native
  var operands: Array[_] = js.native
  var operator: LOGIC_COMMANDS_LITERAL | String = js.native
  def _setFieldName(fieldName: String): DatabaseLogicCommand = js.native
  def and(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
  def or(expressions: (DatabaseLogicCommand | IQueryCondition)*): DatabaseLogicCommand = js.native
}

