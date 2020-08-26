package typings.oracledb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oracledb", "shutdown")
@js.native
object shutdown extends js.Object {
  /**
    * This is the simplified form of connection.shutdown() used for shutting down a database instance. It accepts connection
    * credentials and shuts the database instance completely down.
    * 
    * Internally it creates, and closes, a standalone connection using the oracledb.SYSOPER privilege.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#startupshutdown
    * @since 5.0
    */
  def apply(creds: DBCredentials): js.Promise[Unit] = js.native
  def apply(creds: DBCredentials, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(creds: DBCredentials, mode: Double): js.Promise[Unit] = js.native
  def apply(creds: DBCredentials, mode: Double, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

