package typings.oracledb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oracledb", "startup")
@js.native
object startup extends js.Object {
  /**
    * This is the simplified form of connection.startup() used for starting a database instance up.
    * It accepts connection credentials and starts the database instance completely.
    * 
    * As part of the start up process, a standalone connection using the oracledb.SYSOPER privilege is internally created and closed.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#startupshutdown
    * @since 5.0
    */
  def apply(creds: DBCredentials): js.Promise[Unit] = js.native
  def apply(creds: DBCredentials, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(creds: DBCredentials, opts: StartupOptions): js.Promise[Unit] = js.native
  def apply(creds: DBCredentials, opts: StartupOptions, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

