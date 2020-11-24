package typings.mongodbMemoryServerCore.mongoMemoryReplSetMod

import typings.mongodbMemoryServerCore.anon.AutoStart
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.init
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.running
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.stopped
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropT
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoMemoryReplSet extends EventEmitter {
  
  /**
    * Connects to the first server from the list of servers and issues the `replSetInitiate`
    * command passing in a new replica set configuration object.
    */
  def _initReplSet(): js.Promise[Unit] = js.native
  
  /**
    * Create the one Instance (without starting them)
    * @param instanceOpts Instance Options to use for this instance
    */
  def _initServer(instanceOpts: MongoMemoryInstancePropT): typings.mongodbMemoryServerCore.mongoMemoryServerMod.default = js.native
  
  var _state: init | running | stopped = js.native
  
  /**
    * Wait until the replSet has elected an Primary
    * @param timeout Timeout to not run infinitly
    */
  def _waitForPrimary(): js.Promise[Unit] = js.native
  def _waitForPrimary(timeout: Double): js.Promise[Unit] = js.native
  
  /**
    * Get the Connection String for mongodb to connect
    * @param otherDb use a different database than what was set on creation?
    * @deprecated
    */
  def getConnectionString(): js.Promise[String] = js.native
  def getConnectionString(otherDb: String): js.Promise[String] = js.native
  def getConnectionString(otherDb: Boolean): js.Promise[String] = js.native
  
  /**
    * Returns database name.
    */
  def getDbName(): js.Promise[String] = js.native
  
  /**
    * Returns instance options suitable for a MongoMemoryServer.
    * @param baseOpts Options to merge with
    */
  def getInstanceOpts(): MongoMemoryInstancePropT = js.native
  def getInstanceOpts(baseOpts: MongoMemoryInstancePropBaseT): MongoMemoryInstancePropT = js.native
  
  /**
    * Returns a mongodb: URI to connect to a given database.
    * @param otherDb use a different database than what was set on creation?
    */
  def getUri(): js.Promise[String] = js.native
  def getUri(otherDb: String): js.Promise[String] = js.native
  def getUri(otherDb: Boolean): js.Promise[String] = js.native
  
  var opts: AutoStart = js.native
  
  var servers: js.Array[typings.mongodbMemoryServerCore.mongoMemoryServerMod.default] = js.native
  
  /**
    * Start underlying `mongod` instances.
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Stop the underlying `mongod` instance(s).
    */
  def stop(): js.Promise[Boolean] = js.native
  
  /**
    * Wait until all instances are running
    */
  def waitUntilRunning(): js.Promise[Unit] = js.native
}
