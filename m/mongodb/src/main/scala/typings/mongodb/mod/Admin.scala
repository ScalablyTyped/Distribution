package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Admin")
@js.native
open class Admin () extends StObject {
  
  /**
    * Add a user to the database
    *
    * @param username - The username for the new user
    * @param passwordOrOptions - An optional password for the new user, or the options for the command
    * @param options - Optional settings for the command
    * @deprecated Use the createUser command in `db.command()` instead.
    * @see https://www.mongodb.com/docs/manual/reference/command/createUser/
    */
  def addUser(username: String): js.Promise[Document] = js.native
  def addUser(username: String, passwordOrOptions: String): js.Promise[Document] = js.native
  def addUser(username: String, passwordOrOptions: String, options: AddUserOptions): js.Promise[Document] = js.native
  def addUser(username: String, passwordOrOptions: Unit, options: AddUserOptions): js.Promise[Document] = js.native
  def addUser(username: String, passwordOrOptions: AddUserOptions): js.Promise[Document] = js.native
  def addUser(username: String, passwordOrOptions: AddUserOptions, options: AddUserOptions): js.Promise[Document] = js.native
  
  /**
    * Retrieve the server build information
    *
    * @param options - Optional settings for the command
    */
  def buildInfo(): js.Promise[Document] = js.native
  def buildInfo(options: CommandOperationOptions): js.Promise[Document] = js.native
  
  /* Excluded from this release type: s */
  /* Excluded from this release type: __constructor */
  /**
    * Execute a command
    *
    * The driver will ensure the following fields are attached to the command sent to the server:
    * - `lsid` - sourced from an implicit session or options.session
    * - `$readPreference` - defaults to primary or can be configured by options.readPreference
    * - `$db` - sourced from the name of this database
    *
    * If the client has a serverApi setting:
    * - `apiVersion`
    * - `apiStrict`
    * - `apiDeprecationErrors`
    *
    * When in a transaction:
    * - `readConcern` - sourced from readConcern set on the TransactionOptions
    * - `writeConcern` - sourced from writeConcern set on the TransactionOptions
    *
    * Attaching any of the above fields to the command will have no effect as the driver will overwrite the value.
    *
    * @param command - The command to execute
    * @param options - Optional settings for the command
    */
  def command(command: Document): js.Promise[Document] = js.native
  def command(command: Document, options: RunCommandOptions): js.Promise[Document] = js.native
  
  /**
    * List the available databases
    *
    * @param options - Optional settings for the command
    */
  def listDatabases(): js.Promise[ListDatabasesResult] = js.native
  def listDatabases(options: ListDatabasesOptions): js.Promise[ListDatabasesResult] = js.native
  
  /**
    * Ping the MongoDB server and retrieve results
    *
    * @param options - Optional settings for the command
    */
  def ping(): js.Promise[Document] = js.native
  def ping(options: CommandOperationOptions): js.Promise[Document] = js.native
  
  /**
    * Remove a user from a database
    *
    * @param username - The username to remove
    * @param options - Optional settings for the command
    */
  def removeUser(username: String): js.Promise[Boolean] = js.native
  def removeUser(username: String, options: RemoveUserOptions): js.Promise[Boolean] = js.native
  
  /**
    * Get ReplicaSet status
    *
    * @param options - Optional settings for the command
    */
  def replSetGetStatus(): js.Promise[Document] = js.native
  def replSetGetStatus(options: CommandOperationOptions): js.Promise[Document] = js.native
  
  /**
    * Retrieve the server build information
    *
    * @param options - Optional settings for the command
    */
  def serverInfo(): js.Promise[Document] = js.native
  def serverInfo(options: CommandOperationOptions): js.Promise[Document] = js.native
  
  /**
    * Retrieve this db's server status.
    *
    * @param options - Optional settings for the command
    */
  def serverStatus(): js.Promise[Document] = js.native
  def serverStatus(options: CommandOperationOptions): js.Promise[Document] = js.native
  
  /**
    * Validate an existing collection
    *
    * @param collectionName - The name of the collection to validate.
    * @param options - Optional settings for the command
    */
  def validateCollection(collectionName: String): js.Promise[Document] = js.native
  def validateCollection(collectionName: String, options: ValidateCollectionOptions): js.Promise[Document] = js.native
}
