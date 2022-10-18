package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.anon.PartialMongoMemoryReplSet
import typings.mongodbMemoryServerCore.anon.RequiredReplSetOpts
import typings.mongodbMemoryServerCore.libMongoMemoryServerMod.AutomaticAuth
import typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer
import typings.mongodbMemoryServerCore.libUtilMongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoMemoryInstanceOpts
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoMemoryInstanceOptsBase
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.StorageEngine
import typings.mongodbMemoryServerCore.libUtilUtilsMod.Cleanup
import typings.node.childProcessMod.SpawnOptions
import typings.node.eventsMod.EventEmitter
import typings.tmp.mod.DirResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMongoMemoryReplSetMod {
  
  @JSImport("mongodb-memory-server-core/lib/MongoMemoryReplSet", JSImport.Default)
  @js.native
  open class default () extends MongoMemoryReplSet {
    def this(opts: PartialMongoMemoryReplSet) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core/lib/MongoMemoryReplSet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an instance of "MongoMemoryReplSet" and call start
      * @param opts Options for the ReplSet
      */
    inline def create(): js.Promise[MongoMemoryReplSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[MongoMemoryReplSet]]
    inline def create(opts: PartialMongoMemoryReplSet): js.Promise[MongoMemoryReplSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MongoMemoryReplSet]]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mongodbMemoryServerCore.libUtilUtilsMod.ManagerBase because Inheritance from two classes. Inlined start, start, stop, stop
  - typings.mongodbMemoryServerCore.libUtilUtilsMod.ManagerAdvanced because Inheritance from two classes. Inlined getUri, getUri, getUri, cleanup, cleanup */ @JSImport("mongodb-memory-server-core/lib/MongoMemoryReplSet", "MongoMemoryReplSet")
  @js.native
  open class MongoMemoryReplSet () extends EventEmitter {
    def this(opts: PartialMongoMemoryReplSet) = this()
    
    /** Options for the Binary across all instances */
    /* protected */ var _binaryOpts: MongoBinaryOpts = js.native
    
    /**
      * Connects to the first server from the list of servers and issues the `replSetInitiate`
      * command passing in a new replica set configuration object.
      * @throws if state is not "init"
      * @throws if "servers.length" is not 1 or above
      * @throws if package "mongodb" is not installed
      */
    /* protected */ def _initReplSet(): js.Promise[Unit] = js.native
    
    /**
      * Create the one Instance (without starting them)
      * @param instanceOpts Instance Options to use for this instance
      */
    /* protected */ def _initServer(instanceOpts: MongoMemoryInstanceOpts): MongoMemoryServer = js.native
    
    /** Options for individual instances */
    /* protected */ var _instanceOpts: js.Array[MongoMemoryInstanceOptsBase] = js.native
    
    /** TMPDIR for the keyfile, when auth is used */
    /* protected */ var _keyfiletmp: js.UndefOr[DirResult] = js.native
    
    /* protected */ var _ranCreateAuth: Boolean = js.native
    
    /** Options for the Replset itself and defaults for instances */
    /* protected */ var _replSetOpts: RequiredReplSetOpts = js.native
    
    /* protected */ var _state: MongoMemoryReplSetStates = js.native
    
    /**
      * Wait until the replSet has elected a Primary
      * @param timeout Timeout to not run infinitly, default: 30s
      * @param where Extra Parameter for logging to know where this function was called
      * @throws if timeout is reached
      */
    /* protected */ def _waitForPrimary(): js.Promise[Unit] = js.native
    /* protected */ def _waitForPrimary(timeout: Double): js.Promise[Unit] = js.native
    /* protected */ def _waitForPrimary(timeout: Double, where: String): js.Promise[Unit] = js.native
    /* protected */ def _waitForPrimary(timeout: Unit, where: String): js.Promise[Unit] = js.native
    
    /**
      * Get & Set "binaryOpts"
      * @throws if "state" is not "stopped"
      */
    def binaryOpts: MongoBinaryOpts = js.native
    def binaryOpts_=(`val`: MongoBinaryOpts): Unit = js.native
    
    /**
      * Remove the defined dbPath's
      * @param options Set how to run a cleanup, by default `{ doCleanup: true }` is used
      * @throws If "state" is not "stopped"
      * @throws If "instanceInfo" is not defined
      * @throws If an fs error occured
      */
    def cleanup(): js.Promise[Unit] = js.native
    /**
      * Remove the defined dbPath's
      * @param force Remove the dbPath even if it is no "tmpDir" (and re-check if tmpDir actually removed it)
      * @throws If "state" is not "stopped"
      * @throws If "instanceInfo" is not defined
      * @throws If an fs error occured
      *
      * @deprecated replace argument with `Cleanup` interface object
      */
    /** @deprecated replace argument with `Cleanup` interface object */
    def cleanup(force: Boolean): js.Promise[Unit] = js.native
    def cleanup(options: Cleanup): js.Promise[Unit] = js.native
    
    def emit(event: MongoMemoryReplSetEvents, args: Any*): Boolean = js.native
    
    /**
      * Helper function to determine if "auth" should be enabled
      * This function expectes to be run after the auth object has been transformed to a object
      * @returns "true" when "auth" should be enabled
      */
    /* protected */ def enableAuth(): Boolean = js.native
    
    /**
      * Ensure "_keyfiletmp" is defined
      * @returns the ensured "_keyfiletmp" value
      */
    /* protected */ def ensureKeyFile(): js.Promise[DirResult] = js.native
    
    /**
      * Returns instance options suitable for a MongoMemoryServer.
      * @param baseOpts Options to merge with
      * @param keyfileLocation The Keyfile location if "auth" is used
      */
    /* protected */ def getInstanceOpts(): MongoMemoryInstanceOpts = js.native
    /* protected */ def getInstanceOpts(baseOpts: Unit, keyfileLocation: String): MongoMemoryInstanceOpts = js.native
    /* protected */ def getInstanceOpts(baseOpts: MongoMemoryInstanceOptsBase): MongoMemoryInstanceOpts = js.native
    /* protected */ def getInstanceOpts(baseOpts: MongoMemoryInstanceOptsBase, keyfileLocation: String): MongoMemoryInstanceOpts = js.native
    
    /**
      * Returns an mongodb URI that is setup with all replSet servers
      * @param otherDb add an database into the uri (in mongodb its the auth database, in mongoose its the default database for models)
      * @param otherIp change the ip in the generated uri, default will otherwise always be "127.0.0.1"
      * @throws if state is not "running"
      * @throws if an server doesnt have "instanceInfo.port" defined
      * @returns an valid mongo URI, by the definition of https://docs.mongodb.com/manual/reference/connection-string/
      */
    def getUri(): String = js.native
    def getUri(otherDB: Boolean): String = js.native
    def getUri(otherDb: String): String = js.native
    def getUri(otherDb: String, otherIp: String): String = js.native
    def getUri(otherDb: Unit, otherIp: String): String = js.native
    
    /**
      * Initialize & start all servers in the replSet
      */
    /* protected */ def initAllServers(): js.Promise[Unit] = js.native
    
    /**
      * Get & Set "instanceOpts"
      * @throws if "state" is not "stopped"
      */
    def instanceOpts: js.Array[MongoMemoryInstanceOptsBase] = js.native
    def instanceOpts_=(`val`: js.Array[MongoMemoryInstanceOptsBase]): Unit = js.native
    
    def on(event: MongoMemoryReplSetEvents, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    def once(event: MongoMemoryReplSetEvents, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Get & Set "replSetOpts"
      * (Applies defaults)
      * @throws if "state" is not "stopped"
      */
    def replSetOpts: ReplSetOpts = js.native
    def replSetOpts_=(`val`: ReplSetOpts): Unit = js.native
    
    /**
      * All servers this ReplSet instance manages
      */
    var servers: js.Array[MongoMemoryServer] = js.native
    
    /**
      * Start underlying `mongod` instances.
      * @throws if state is already "running"
      */
    def start(): js.Promise[Unit] = js.native
    def start(forceSamePort: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Get Current state of this class
      */
    def state: MongoMemoryReplSetStates = js.native
    
    /**
      * Change "this._state" to "newState" and emit "newState"
      * @param newState The new State to set & emit
      */
    /* protected */ def stateChange(newState: MongoMemoryReplSetStates, args: Any*): Unit = js.native
    
    /**
      * Stop the underlying `mongod` instance(s).
      * @param cleanupOptions Set how to run ".cleanup", by default only `{ doCleanup: true }` is used
      */
    def stop(): js.Promise[Boolean] = js.native
    def stop(cleanupOptions: Cleanup): js.Promise[Boolean] = js.native
    /**
      * Stop the underlying `mongod` instance(s).
      * @param runCleanup run "this.cleanup"? (remove dbPath & reset "instanceInfo")
      *
      * @deprecated replace argument with `Cleanup` interface object
      */
    /** @deprecated replace argument with `Cleanup` interface object */
    def stop(runCleanup: Boolean): js.Promise[Boolean] = js.native
    
    /**
      * Wait until all instances are running
      * @throws if state is "stopped" (cannot wait on something that dosnt start)
      */
    def waitUntilRunning(): js.Promise[Unit] = js.native
  }
  /* static members */
  object MongoMemoryReplSet {
    
    @JSImport("mongodb-memory-server-core/lib/MongoMemoryReplSet", "MongoMemoryReplSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an instance of "MongoMemoryReplSet" and call start
      * @param opts Options for the ReplSet
      */
    inline def create(): js.Promise[MongoMemoryReplSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[MongoMemoryReplSet]]
    inline def create(opts: PartialMongoMemoryReplSet): js.Promise[MongoMemoryReplSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MongoMemoryReplSet]]
  }
  
  @js.native
  sealed trait MongoMemoryReplSetEvents extends StObject
  @JSImport("mongodb-memory-server-core/lib/MongoMemoryReplSet", "MongoMemoryReplSetEvents")
  @js.native
  object MongoMemoryReplSetEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MongoMemoryReplSetEvents & String] = js.native
    
    @js.native
    sealed trait stateChange
      extends StObject
         with MongoMemoryReplSetEvents
    /* "stateChange" */ val stateChange: typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSetEvents.stateChange & String = js.native
  }
  
  @js.native
  sealed trait MongoMemoryReplSetStates extends StObject
  @JSImport("mongodb-memory-server-core/lib/MongoMemoryReplSet", "MongoMemoryReplSetStates")
  @js.native
  object MongoMemoryReplSetStates extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MongoMemoryReplSetStates & String] = js.native
    
    @js.native
    sealed trait init
      extends StObject
         with MongoMemoryReplSetStates
    /* "init" */ val init: typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSetStates.init & String = js.native
    
    @js.native
    sealed trait running
      extends StObject
         with MongoMemoryReplSetStates
    /* "running" */ val running: typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSetStates.running & String = js.native
    
    @js.native
    sealed trait stopped
      extends StObject
         with MongoMemoryReplSetStates
    /* "stopped" */ val stopped: typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSetStates.stopped & String = js.native
  }
  
  trait MongoMemoryReplSetConfigSettings extends StObject {
    
    var catchUpTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var chainingAllowed: js.UndefOr[Boolean] = js.undefined
    
    var electionTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var heartbeatIntervalMillis: js.UndefOr[Double] = js.undefined
    
    var heartbeatTimeoutSecs: js.UndefOr[Double] = js.undefined
  }
  object MongoMemoryReplSetConfigSettings {
    
    inline def apply(): MongoMemoryReplSetConfigSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryReplSetConfigSettings]
    }
    
    extension [Self <: MongoMemoryReplSetConfigSettings](x: Self) {
      
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
  
  trait MongoMemoryReplSetOpts extends StObject {
    
    /**
      * Binary Options used for all instances
      */
    var binary: MongoBinaryOpts
    
    /**
      * Specific Options to use for some instances
      */
    var instanceOpts: js.Array[MongoMemoryInstanceOptsBase]
    
    /**
      * Options used for all instances
      * -> gets overwritten by specific "instanceOpts"
      */
    var replSet: ReplSetOpts
  }
  object MongoMemoryReplSetOpts {
    
    inline def apply(binary: MongoBinaryOpts, instanceOpts: js.Array[MongoMemoryInstanceOptsBase], replSet: ReplSetOpts): MongoMemoryReplSetOpts = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], instanceOpts = instanceOpts.asInstanceOf[js.Any], replSet = replSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoMemoryReplSetOpts]
    }
    
    extension [Self <: MongoMemoryReplSetOpts](x: Self) {
      
      inline def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setInstanceOpts(value: js.Array[MongoMemoryInstanceOptsBase]): Self = StObject.set(x, "instanceOpts", value.asInstanceOf[js.Any])
      
      inline def setInstanceOptsVarargs(value: MongoMemoryInstanceOptsBase*): Self = StObject.set(x, "instanceOpts", js.Array(value*))
      
      inline def setReplSet(value: ReplSetOpts): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplSetOpts extends StObject {
    
    /**
      * additional command line arguments passed to `mongod`
      * @default []
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * enable auth ("--auth" / "--noauth")
      * @default false
      */
    var auth: js.UndefOr[Boolean | AutomaticAuth] = js.undefined
    
    /**
      * Options for "rsConfig"
      * @default {}
      */
    var configSettings: js.UndefOr[MongoMemoryReplSetConfigSettings] = js.undefined
    
    /**
      * if this number is bigger than "instanceOpts.length", more "generic" servers get started
      * if this number is lower than "instanceOpts.length", no more "generic" servers get started (server count will be "instanceOpts.length")
      * @default 1
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * add an database into the uri (in mongodb its the auth database, in mongoose its the default database for models)
      * @default ""
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
      * Childprocess spawn options
      * @default {}
      */
    var spawn: js.UndefOr[SpawnOptions] = js.undefined
    
    /**
      *`mongod` storage engine type
      * @default 'ephemeralForTest'
      */
    var storageEngine: js.UndefOr[StorageEngine] = js.undefined
  }
  object ReplSetOpts {
    
    inline def apply(): ReplSetOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplSetOpts]
    }
    
    extension [Self <: ReplSetOpts](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setAuth(value: Boolean | AutomaticAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setConfigSettings(value: MongoMemoryReplSetConfigSettings): Self = StObject.set(x, "configSettings", value.asInstanceOf[js.Any])
      
      inline def setConfigSettingsUndefined: Self = StObject.set(x, "configSettings", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
      
      inline def setStorageEngine(value: StorageEngine): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
      
      inline def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    }
  }
}
