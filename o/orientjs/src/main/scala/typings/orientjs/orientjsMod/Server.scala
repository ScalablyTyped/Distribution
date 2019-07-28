package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * # Server
  * Represents a connection to an orientdb server.
  *
  * @param options The server URL, or configuration object
  */
@JSImport("orientjs", "Server")
@js.native
class Server () extends js.Object {
  def this(options: ServerConfig) = this()
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
  def create(name: String): typings.bluebird.bluebirdMod.^[Db] = js.native
  def create(name: DbConfig): typings.bluebird.bluebirdMod.^[Db] = js.native
  /**
    * Destroy a database with the given name / config.
    *
    * @param   config The database name or configuration object.
    * @promise {Mixed}               The server response.
    */
  def drop(name: String): typings.bluebird.bluebirdMod.^[Db] = js.native
  def drop(name: DbConfig): typings.bluebird.bluebirdMod.^[Db] = js.native
  /**
    * Determine whether a database exists with the given name.
    *
    * @param   name        The database name.
    * @param   storageType The storage type, defaults to `plocal`.
    * @promise {Boolean}            true if the database exists.
    */
  def exists(name: String): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  def exists(name: String, storageType: String): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  /**
    * Freeze the database with the given name.
    *
    * @param   name        The database name.
    * @param   storageType The storage type, defaults to `plocal`.
    * @return              The response from the server.
    */
  def freeze(name: String): js.Any = js.native
  def freeze(name: String, storageType: String): js.Any = js.native
  /**
    * Initialize the server instance.
    */
  def init(): Unit = js.native
  /**
    * List all the databases on the server.
    *
    * @return An array of databases.
    */
  def list(): typings.bluebird.bluebirdMod.^[js.Array[Db]] = js.native
  /**
    * Release the database with the given name.
    *
    * @param   name        The database name.
    * @param   storageType The storage type, defaults to `plocal`.
    * @return              The response from the server.
    */
  def release(name: String): js.Any = js.native
  def release(name: String, storageType: String): js.Any = js.native
  /**
    * Send an operation to the server,
    *
    * @param  operation The id of the operation to send.
    * @param  options    The options for the operation.
    * @promise {Mixed}            The result of the operation.
    */
  def send(operation: Double, options: js.Any): js.Any = js.native
  def shutdown(): typings.bluebird.bluebirdMod.^[_] = js.native
  /**
    * Use the database with the given name / config.
    *
    * @param  config The database name, or configuration object.
    * @return                   The database instance.
    */
  def use(name: String): Db = js.native
  def use(name: DbConfig): Db = js.native
}

