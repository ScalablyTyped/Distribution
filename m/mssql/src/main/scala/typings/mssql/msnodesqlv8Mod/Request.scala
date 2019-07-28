package typings.mssql.msnodesqlv8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql/msnodesqlv8", "Request")
@js.native
class Request ()
  extends typings.mssql.mssqlMod.Request {
  def this(connection: typings.mssql.mssqlMod.ConnectionPool) = this()
  def this(preparedStatement: typings.mssql.mssqlMod.PreparedStatement) = this()
  def this(transaction: typings.mssql.mssqlMod.Transaction) = this()
}

