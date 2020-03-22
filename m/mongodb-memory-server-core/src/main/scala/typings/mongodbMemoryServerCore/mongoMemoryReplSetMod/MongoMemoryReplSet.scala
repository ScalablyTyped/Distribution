package typings.mongodbMemoryServerCore.mongoMemoryReplSetMod

import typings.mongodbMemoryServerCore.AnonAutoStart
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.init
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.running
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.stopped
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropT
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryReplSet extends EventEmitter {
  var _state: init | running | stopped = js.native
  var opts: AnonAutoStart = js.native
  var servers: js.Array[typings.mongodbMemoryServerCore.mongoMemoryServerMod.default] = js.native
  /**
    * Connects to the first server from the list of servers and issues the `replSetInitiate`
    * command passing in a new replica set configuration object.
    */
  def _initReplSet(): js.Promise[Unit] = js.native
  def _initServer(instanceOpts: MongoMemoryInstancePropT): typings.mongodbMemoryServerCore.mongoMemoryServerMod.default = js.native
  def _waitForPrimary(): js.Promise[Unit] = js.native
  def _waitForPrimary(timeout: Double): js.Promise[Unit] = js.native
  def getConnectionString(): js.Promise[String] = js.native
  def getConnectionString(otherDb: String): js.Promise[String] = js.native
  def getConnectionString(otherDb: Boolean): js.Promise[String] = js.native
  /**
    * Returns database name.
    */
  def getDbName(): js.Promise[String] = js.native
  /**
    * Returns instance options suitable for a MongoMemoryServer.
    * @param {MongoMemoryInstancePropBaseT} baseOpts
    */
  def getInstanceOpts(): MongoMemoryInstancePropT = js.native
  def getInstanceOpts(baseOpts: MongoMemoryInstancePropBaseT): MongoMemoryInstancePropT = js.native
  /**
    * Returns a mongodb: URI to connect to a given database.
    */
  def getUri(): js.Promise[String] = js.native
  def getUri(otherDb: String): js.Promise[String] = js.native
  def getUri(otherDb: Boolean): js.Promise[String] = js.native
  /**
    * Start underlying `mongod` instances.
    */
  def start(): js.Promise[Unit] = js.native
  /**
    * Stop the underlying `mongod` instance(s).
    */
  def stop(): js.Promise[Boolean] = js.native
  def waitUntilRunning(): js.Promise[Unit] = js.native
}

