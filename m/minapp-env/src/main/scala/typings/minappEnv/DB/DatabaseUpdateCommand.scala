package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.InternalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DB.DatabaseUpdateCommand")
@js.native
class DatabaseUpdateCommand protected () extends js.Object {
  def this(operator: UPDATE_COMMANDS_LITERAL, operands: Array[_]) = this()
  def this(operator: UPDATE_COMMANDS_LITERAL, operands: Array[_], fieldName: String) = this()
  def this(operator: UPDATE_COMMANDS_LITERAL, operands: Array[_], fieldName: InternalSymbol) = this()
  var fieldName: String | InternalSymbol = js.native
  var operands: Array[_] = js.native
  var operator: UPDATE_COMMANDS_LITERAL = js.native
  def _setFieldName(fieldName: String): DatabaseUpdateCommand = js.native
}

