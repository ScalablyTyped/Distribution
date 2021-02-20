package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * # Server
  * Represents a connection to an orientdb server.
  *
  * @param options The server URL, or configuration object
  */
@JSImport("orientjs", "OServer")
@js.native
class OServer () extends StObject {
  def this(options: ServerConfig) = this()
  
  /**
    * Close the connection to the server.
    *
    * @return the disconnected server instance
    */
  def close(): OServer = js.native
  
  var config: ServerConfiguration = js.native
  
  /**
    * Configure the server instance.
    *
    * @param  config The configuration for the server.
    * @return            The configured server object.
    */
  def configure(config: ServerConfig): OServer = js.native
  
  /**
    * Configure the logger for the server.
    *
    * @param  config The logger config
    * @return        The server instance with the configured logger.
    */
  def configureLogger(logger: OLogger): OServer = js.native
  
  /**
    * Configure the transport for the server.
    *
    * @param  config The server config.
    * @return        The configured server object.
    */
  def configureTransport(config: js.Any): OServer = js.native
  
  /**
    * Create a database with the given name / config.
    *
    * @param  config The database name or configuration object.
    * @promise {Db}                  The database instance
    */
  def create(name: String): js.Promise[ODB] = js.native
  def create(name: DbConfig): js.Promise[ODB] = js.native
  
  /**
    * Destroy a database with the given name / config.
    *
    * @param   config The database name or configuration object.
    * @promise {Mixed}               The server response.
    */
  def drop(name: String): js.Promise[ODB] = js.native
  def drop(name: DbConfig): js.Promise[ODB] = js.native
  
  /**
    * Determine whether a database exists with the given name.
    *
    * @param   name        The database name.
    * @param   storageType The storage type, defaults to `plocal`.
    * @promise {Boolean}            true if the database exists.
    */
  def exists(name: String): js.Promise[Boolean] = js.native
  def exists(name: String, storageType: String): js.Promise[Boolean] = js.native
  
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
  def list(): js.Promise[js.Array[ODB]] = js.native
  
  var logger: OLogger = js.native
  
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
  
  def shutdown(): js.Promise[_] = js.native
  
  /**
    * Use the database with the given name / config.
    *
    * @param  config The database name, or configuration object.
    * @return                   The database instance.
    */
  def use(name: String): ODB = js.native
  def use(name: DbConfig): ODB = js.native
}
