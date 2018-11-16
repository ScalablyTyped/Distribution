package typings
package mssqlLib.msnodesqlv8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql/msnodesqlv8", "ConnectionPool")
@js.native
class ConnectionPool protected ()
  extends mssqlLib.mssqlMod.ConnectionPool {
  def this(config: mssqlLib.mssqlMod.config) = this()
  def this(connectionString: java.lang.String) = this()
  def this(config: mssqlLib.mssqlMod.config, callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]) = this()
  def this(connectionString: java.lang.String, callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]) = this()
}

