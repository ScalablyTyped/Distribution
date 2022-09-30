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
    * @param password - An optional password for the new user
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def addUser(username: String): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def addUser(username: String, callback: Callback[Document]): Unit = js.native
  def addUser(username: String, options: AddUserOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def addUser(username: String, options: AddUserOptions, callback: Callback[Document]): Unit = js.native
  def addUser(username: String, password: String): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def addUser(username: String, password: String, callback: Callback[Document]): Unit = js.native
  def addUser(username: String, password: String, options: AddUserOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def addUser(username: String, password: String, options: AddUserOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Retrieve the server build information
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def buildInfo(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def buildInfo(callback: Callback[Document]): Unit = js.native
  def buildInfo(options: CommandOperationOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def buildInfo(options: CommandOperationOptions, callback: Callback[Document]): Unit = js.native
  
  /* Excluded from this release type: s */
  /* Excluded from this release type: __constructor */
  /**
    * Execute a command
    *
    * @param command - The command to execute
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def command(command: Document): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def command(command: Document, callback: Callback[Document]): Unit = js.native
  def command(command: Document, options: RunCommandOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def command(command: Document, options: RunCommandOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * List the available databases
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def listDatabases(): js.Promise[ListDatabasesResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def listDatabases(callback: Callback[ListDatabasesResult]): Unit = js.native
  def listDatabases(options: ListDatabasesOptions): js.Promise[ListDatabasesResult] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def listDatabases(options: ListDatabasesOptions, callback: Callback[ListDatabasesResult]): Unit = js.native
  
  /**
    * Ping the MongoDB server and retrieve results
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def ping(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def ping(callback: Callback[Document]): Unit = js.native
  def ping(options: CommandOperationOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def ping(options: CommandOperationOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Remove a user from a database
    *
    * @param username - The username to remove
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def removeUser(username: String): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def removeUser(username: String, callback: Callback[Boolean]): Unit = js.native
  def removeUser(username: String, options: RemoveUserOptions): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def removeUser(username: String, options: RemoveUserOptions, callback: Callback[Boolean]): Unit = js.native
  
  /**
    * Get ReplicaSet status
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def replSetGetStatus(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def replSetGetStatus(callback: Callback[Document]): Unit = js.native
  def replSetGetStatus(options: CommandOperationOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def replSetGetStatus(options: CommandOperationOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Retrieve the server build information
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def serverInfo(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def serverInfo(callback: Callback[Document]): Unit = js.native
  def serverInfo(options: CommandOperationOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def serverInfo(options: CommandOperationOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Retrieve this db's server status.
    *
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def serverStatus(): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def serverStatus(callback: Callback[Document]): Unit = js.native
  def serverStatus(options: CommandOperationOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def serverStatus(options: CommandOperationOptions, callback: Callback[Document]): Unit = js.native
  
  /**
    * Validate an existing collection
    *
    * @param collectionName - The name of the collection to validate.
    * @param options - Optional settings for the command
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def validateCollection(collectionName: String): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def validateCollection(collectionName: String, callback: Callback[Document]): Unit = js.native
  def validateCollection(collectionName: String, options: ValidateCollectionOptions): js.Promise[Document] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def validateCollection(collectionName: String, options: ValidateCollectionOptions, callback: Callback[Document]): Unit = js.native
}
