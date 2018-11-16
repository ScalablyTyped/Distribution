package typings
package mssqlLib.msnodesqlv8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql/msnodesqlv8", "Request")
@js.native
class Request ()
  extends mssqlLib.mssqlMod.Request {
  def this(connection: mssqlLib.mssqlMod.ConnectionPool) = this()
  def this(preparedStatement: mssqlLib.mssqlMod.PreparedStatement) = this()
  def this(transaction: mssqlLib.mssqlMod.Transaction) = this()
}

