package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * # Server
  * Represents a connection to an orientdb server.
  *
  * @param options The server URL, or configuration object
  */
@js.native
trait Server extends js.Object {
  var config: ServerConfiguration = js.native
  var logger: Logger = js.native
  /**
    * Close the connection to the server.
    *
    * @return the disconnected server instance
    */
  def close(): Server = js.native
  /**
    * Configure the server instance.
    *
    * @param  config The configuration for the server.
    * @return            The configured server object.
    */
  def configure(config: ServerConfig): Server = js.native
  /**
    * Configure the logger for the server.
    *
    * @param  config The logger config
    * @return        The server instance with the configured logger.
    */
  def configureLogger(logger: Logger): Server = js.native
  /**
    * Configure the transport for the server.
    *
    * @param  config The server config.
    * @return        The configured server object.
    */
  def configureTransport(config: js.Any): Server = js.native
  /**
    * Create a database with the given name / config.
    *
    * @param  config The database name or configuration object.
    * @promise {Db}                  The database instance
    */
  def create(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Db] = js.native
  def create(name: DbConfig): bluebirdLib.bluebirdMod.namespaced[Db] = js.native
  /**
    * Destroy a database with the given name / config.
    *
    * @param   config The database name or configuration object.
    * @promise {Mixed}               The server response.
    */
  def drop(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Db] = js.native
  def drop(name: DbConfig): bluebirdLib.bluebirdMod.namespaced[Db] = js.native
  /**
    * Determine whether a database exists with the given name.
    *
    * @param   name        The database name.
    * @param   storageType The storage type, defaults to `plocal`.
    * @promise {Boolean}            true if the database exists.
    */
  def exists(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  def exists(name: java.lang.String, storageType: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  /**
    * Freeze the database with the given name.
    *
    * @param   name        The database name.
    * @param   storageType The storage type, defaults to `plocal`.
    * @return              The response from the server.
    */
  def freeze(name: java.lang.String): js.Any = js.native
  def freeze(name: java.lang.String, storageType: java.lang.String): js.Any = js.native
  /**
    * Initialize the server instance.
    */
  def init(): scala.Unit = js.native
  /**
    * List all the databases on the server.
    *
    * @return An array of databases.
    */
  def list(): bluebirdLib.bluebirdMod.namespaced[js.Array[Db]] = js.native
  /**
    * Release the database with the given name.
    *
    * @param   name        The database name.
    * @param   storageType The storage type, defaults to `plocal`.
    * @return              The response from the server.
    */
  def release(name: java.lang.String): js.Any = js.native
  def release(name: java.lang.String, storageType: java.lang.String): js.Any = js.native
  /**
    * Send an operation to the server,
    *
    * @param  operation The id of the operation to send.
    * @param  options    The options for the operation.
    * @promise {Mixed}            The result of the operation.
    */
  def send(operation: scala.Double, options: js.Any): js.Any = js.native
  def shutdown(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Use the database with the given name / config.
    *
    * @param  config The database name, or configuration object.
    * @return                   The database instance.
    */
  def use(name: java.lang.String): Db = js.native
  def use(name: DbConfig): Db = js.native
}

