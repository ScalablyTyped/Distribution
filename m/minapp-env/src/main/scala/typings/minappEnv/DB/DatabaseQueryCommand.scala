package typings.minappEnv.DB

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DB.DatabaseQueryCommand")
@js.native
class DatabaseQueryCommand () extends DatabaseLogicCommand {
  @JSName("operator")
  var operator_DatabaseQueryCommand: QUERY_COMMANDS_LITERAL | String = js.native
  def eq(`val`: js.Any): DatabaseLogicCommand = js.native
  def gt(`val`: js.Any): DatabaseLogicCommand = js.native
  def gte(`val`: js.Any): DatabaseLogicCommand = js.native
  def in(`val`: Array[_]): DatabaseLogicCommand = js.native
  def lt(`val`: js.Any): DatabaseLogicCommand = js.native
  def lte(`val`: js.Any): DatabaseLogicCommand = js.native
  def neq(`val`: js.Any): DatabaseLogicCommand = js.native
  def nin(`val`: Array[_]): DatabaseLogicCommand = js.native
}

