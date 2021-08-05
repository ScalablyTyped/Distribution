package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.anon.AutoStart
import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.init
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.running
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.stopped
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropT
import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.SpawnOptions
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoMemoryReplSetMod {
  
  @JSImport("mongodb-memory-server-core/lib/MongoMemoryReplSet", JSImport.Default)
  @js.native
  class default () extends MongoMemoryReplSet {
    def this(opts: MongoMemoryReplSetOptsT) = this()
  }
  
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
  
  trait MongoMemoryReplSetConfigSettingsT extends StObject {
    
    var catchUpTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var chainingAllowed: js.UndefOr[Boolean] = js.undefined
    
    var electionTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var heartbeatIntervalMillis: js.UndefOr[Double] = js.undefined
    
    var heartbeatTimeoutSecs: js.UndefOr[Double] = js.undefined
  }
  object MongoMemoryReplSetConfigSettingsT {
    
    inline def apply(): MongoMemoryReplSetConfigSettingsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryReplSetConfigSettingsT]
    }
    
    extension [Self <: MongoMemoryReplSetConfigSettingsT](x: Self) {
      
      inline def setCatchUpTimeoutMillis(value: Double): Self = StObject.set(x, "catchUpTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setCatchUpTimeoutMillisUndefined: Self = StObject.set(x, "catchUpTimeoutMillis", js.undefined)
      
      inline def setChainingAllowed(value: Boolean): Self = StObject.set(x, "chainingAllowed", value.asInstanceOf[js.Any])
      
      inline def setChainingAllowedUndefined: Self = StObject.set(x, "chainingAllowed", js.undefined)
      
      inline def setElectionTimeoutMillis(value: Double): Self = StObject.set(x, "electionTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setElectionTimeoutMillisUndefined: Self = StObject.set(x, "electionTimeoutMillis", js.undefined)
      
      inline def setHeartbeatIntervalMillis(value: Double): Self = StObject.set(x, "heartbeatIntervalMillis", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatIntervalMillisUndefined: Self = StObject.set(x, "heartbeatIntervalMillis", js.undefined)
      
      inline def setHeartbeatTimeoutSecs(value: Double): Self = StObject.set(x, "heartbeatTimeoutSecs", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatTimeoutSecsUndefined: Self = StObject.set(x, "heartbeatTimeoutSecs", js.undefined)
    }
  }
  
  trait MongoMemoryReplSetOptsT extends StObject {
    
    /**
      * Auto-Start the replSet?
      * @default true
      */
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
    
    var instanceOpts: js.UndefOr[js.Array[MongoMemoryInstancePropBaseT]] = js.undefined
    
    var replSet: js.UndefOr[ReplSetOpts] = js.undefined
  }
  object MongoMemoryReplSetOptsT {
    
    inline def apply(): MongoMemoryReplSetOptsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryReplSetOptsT]
    }
    
    extension [Self <: MongoMemoryReplSetOptsT](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setInstanceOpts(value: js.Array[MongoMemoryInstancePropBaseT]): Self = StObject.set(x, "instanceOpts", value.asInstanceOf[js.Any])
      
      inline def setInstanceOptsUndefined: Self = StObject.set(x, "instanceOpts", js.undefined)
      
      inline def setInstanceOptsVarargs(value: MongoMemoryInstancePropBaseT*): Self = StObject.set(x, "instanceOpts", js.Array(value :_*))
      
      inline def setReplSet(value: ReplSetOpts): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
      
      inline def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
    }
  }
  
  trait ReplSetOpts extends StObject {
    
    /**
      * additional command line args passed to `mongod`
      * @default []
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * enable auth ("--auth" / "--noauth")
      * @default false
      */
    var auth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options for "rsConfig"
      * @default {}
      */
    var configSettings: js.UndefOr[MongoMemoryReplSetConfigSettingsT] = js.undefined
    
    /**
      * number of `mongod` servers to start
      * @default 1
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * database name used in connection string
      * @default uuidv4()
      */
    var dbName: js.UndefOr[String] = js.undefined
    
    /**
      * bind to all IP addresses specify `::,0.0.0.0`
      * @default '127.0.0.1'
      */
    var ip: js.UndefOr[String] = js.undefined
    
    /**
      * replSet name
      * @default 'testset'
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * oplog size (in MB)
      * @default 1
      */
    var oplogSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Childprocess spawn options
      * @default {}
      */
    var spawn: js.UndefOr[SpawnOptions] = js.undefined
    
    /**
      *`mongod` storage engine type
      * @default 'ephemeralForTest'
      */
    var storageEngine: js.UndefOr[StorageEngineT] = js.undefined
  }
  object ReplSetOpts {
    
    inline def apply(): ReplSetOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplSetOpts]
    }
    
    extension [Self <: ReplSetOpts](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setConfigSettings(value: MongoMemoryReplSetConfigSettingsT): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
      
      inline def setConfigSettingsUndefined: Self = StObject.set(x, "configSettings", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOplogSize(value: Double): Self = StObject.set(x, "oplogSize", value.asInstanceOf[js.Any])
      
      inline def setOplogSizeUndefined: Self = StObject.set(x, "oplogSize", js.undefined)
      
      inline def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
      
      inline def setStorageEngine(value: StorageEngineT): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
      
      inline def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    }
  }
}
