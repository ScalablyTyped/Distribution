package typings.mssql.msnodesqlv8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql/msnodesqlv8", "PreparedStatement")
@js.native
class PreparedStatement ()
  extends typings.mssql.mssqlMod.PreparedStatement {
  def this(connection: typings.mssql.mssqlMod.ConnectionPool) = this()
  def this(transaction: typings.mssql.mssqlMod.Transaction) = this()
}

