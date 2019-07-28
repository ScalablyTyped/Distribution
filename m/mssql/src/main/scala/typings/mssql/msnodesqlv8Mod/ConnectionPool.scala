package typings.mssql.msnodesqlv8Mod

import typings.mssql.mssqlMod.config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql/msnodesqlv8", "ConnectionPool")
@js.native
class ConnectionPool protected ()
  extends typings.mssql.mssqlMod.ConnectionPool {
  def this(config: config) = this()
  def this(connectionString: String) = this()
  def this(config: config, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]) = this()
  def this(connectionString: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]) = this()
}

