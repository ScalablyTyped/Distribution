package typings.mongodbMemoryServerCore

import typings.mongodb.mod.MongoClientOptions
import typings.mongodbMemoryServerCore.anon.PartialMongodOpts
import typings.mongodbMemoryServerCore.anon.ReadonlyMongoBinaryOpts
import typings.mongodbMemoryServerCore.anon.ReadonlySpawnOptions
import typings.mongodbMemoryServerCore.libUtilMongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.libUtilUtilsMod.Cleanup
import typings.node.bufferMod.global.Buffer
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMongoInstanceMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", JSImport.Default)
  @js.native
  open class default protected () extends MongoInstance {
    def this(opts: PartialMongodOpts) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an new instance an call method "start"
      * @param opts Options passed to the new instance
      */
    inline def create(opts: PartialMongodOpts): js.Promise[MongoInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MongoInstance]]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mongodbMemoryServerCore.libUtilUtilsMod.ManagerBase because Inheritance from two classes. Inlined start, start, stop, stop */ @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", "MongoInstance")
  @js.native
  open class MongoInstance protected () extends EventEmitter {
    def this(opts: PartialMongodOpts) = this()
    
    /**
      * Spawn an seperate process to kill the parent and the mongod instance to ensure "mongod" gets stopped in any case
      * @param parentPid Parent nodejs process
      * @param childPid Mongod process to kill
      * @fires MongoInstance#killerLaunched
      */
    def _launchKiller(parentPid: Double, childPid: Double): ChildProcess = js.native
    
    /**
      * Actually launch mongod
      * @param mongoBin The binary to run
      * @fires MongoInstance#instanceLaunched
      */
    def _launchMongod(mongoBin: String): ChildProcess = js.native
    
    val binaryOpts: ReadonlyMongoBinaryOpts = js.native
    
    /**
      * Run Checks on the line if the lines contain any thrown errors
      * @param line The Line to check
      */
    /* protected */ def checkErrorInLine(line: String): Unit = js.native
    
    /**
      * Write the CLOSE event to the debug function
      * @param code The Exit code to handle
      * @param signal The Signal to handle
      * @fires MongoInstance#instanceClosed
      */
    def closeHandler(): Unit = js.native
    def closeHandler(code: Double): Unit = js.native
    def closeHandler(code: Double, signal: String): Unit = js.native
    def closeHandler(code: Null, signal: String): Unit = js.native
    
    /**
      * Debug-log with template applied
      * @param msg The Message to log
      */
    /* protected */ def debug(msg: String, extra: Any*): Unit = js.native
    
    def emit(event: MongoInstanceEvents, args: Any*): Boolean = js.native
    
    /**
      * Event "error" handler
      * @param err The Error to handle
      * @fires MongoInstance#instanceRawError
      * @fires MongoInstance#instanceError
      */
    def errorHandler(err: String): Unit = js.native
    
    /**
      * Extra options to append to "mongoclient.connect"
      * Mainly used for authentication
      */
    var extraConnectionOptions: js.UndefOr[MongoClientOptions] = js.native
    
    var instanceOpts: MongoMemoryInstanceOpts = js.native
    
    /**
      * This boolean is "true" if the instance is elected to be PRIMARY
      */
    var isInstancePrimary: Boolean = js.native
    
    /**
      * This boolean is "true" if the instance is successfully started
      */
    var isInstanceReady: Boolean = js.native
    
    /**
      * This boolean is "true" if the instance is part of an replset
      */
    var isReplSet: Boolean = js.native
    
    /**
      * The "mongo_killer" Process reference
      */
    var killerProcess: js.UndefOr[ChildProcess] = js.native
    
    /**
      * The "mongod" Process reference
      */
    var mongodProcess: js.UndefOr[ChildProcess] = js.native
    
    def on(event: MongoInstanceEvents, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    def once(event: MongoInstanceEvents, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Create an array of arguments for the mongod instance
      */
    def prepareCommandArgs(): js.Array[String] = js.native
    
    val spawnOpts: ReadonlySpawnOptions = js.native
    
    /**
      * Create the mongod process
      * @fires MongoInstance#instanceStarted
      */
    def start(): js.Promise[Unit] = js.native
    def start(forceSamePort: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Write STDERR to debug function
      * @param message The STDERR line to write
      * @fires MongoInstance#instanceSTDERR
      */
    def stderrHandler(message: String): Unit = js.native
    def stderrHandler(message: Buffer): Unit = js.native
    
    /**
      * Write STDOUT to debug function and process some special messages
      * @param message The STDOUT line to write/parse
      * @fires MongoInstance#instanceSTDOUT
      * @fires MongoInstance#instanceReady
      * @fires MongoInstance#instanceError
      * @fires MongoInstance#instancePrimary
      * @fires MongoInstance#instanceReplState
      */
    def stdoutHandler(message: String): Unit = js.native
    def stdoutHandler(message: Buffer): Unit = js.native
    
    /**
      * Shutdown all related processes (Mongod Instance & Killer Process)
      */
    def stop(): js.Promise[Boolean] = js.native
    /** @deprecated replace argument with `Cleanup` interface object */
    def stop(cleanup: Boolean): js.Promise[Boolean] = js.native
    def stop(cleanup: Cleanup): js.Promise[Boolean] = js.native
  }
  /* static members */
  object MongoInstance {
    
    @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", "MongoInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an new instance an call method "start"
      * @param opts Options passed to the new instance
      */
    inline def create(opts: PartialMongodOpts): js.Promise[MongoInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MongoInstance]]
  }
  
  @js.native
  sealed trait MongoInstanceEvents extends StObject
  @JSImport("mongodb-memory-server-core/lib/util/MongoInstance", "MongoInstanceEvents")
  @js.native
  object MongoInstanceEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MongoInstanceEvents & String] = js.native
    
    @js.native
    sealed trait instanceClosed
      extends StObject
         with MongoInstanceEvents
    /* "instanceClosed" */ val instanceClosed: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceClosed & String = js.native
    
    /** Raw Errors and Custom Errors */
    @js.native
    sealed trait instanceError
      extends StObject
         with MongoInstanceEvents
    /* "instanceError" */ val instanceError: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceError & String = js.native
    
    @js.native
    sealed trait instanceLaunched
      extends StObject
         with MongoInstanceEvents
    /* "instanceLaunched" */ val instanceLaunched: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceLaunched & String = js.native
    
    @js.native
    sealed trait instancePrimary
      extends StObject
         with MongoInstanceEvents
    /* "instancePrimary" */ val instancePrimary: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instancePrimary & String = js.native
    
    /** Only Raw Error (emitted by mongodProcess) */
    @js.native
    sealed trait instanceRawError
      extends StObject
         with MongoInstanceEvents
    /* "instanceRawError" */ val instanceRawError: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceRawError & String = js.native
    
    @js.native
    sealed trait instanceReady
      extends StObject
         with MongoInstanceEvents
    /* "instanceReady" */ val instanceReady: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceReady & String = js.native
    
    @js.native
    sealed trait instanceReplState
      extends StObject
         with MongoInstanceEvents
    /* "instanceReplState" */ val instanceReplState: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceReplState & String = js.native
    
    @js.native
    sealed trait instanceSTDERR
      extends StObject
         with MongoInstanceEvents
    /* "instanceSTDERR" */ val instanceSTDERR: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceSTDERR & String = js.native
    
    @js.native
    sealed trait instanceSTDOUT
      extends StObject
         with MongoInstanceEvents
    /* "instanceSTDOUT" */ val instanceSTDOUT: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceSTDOUT & String = js.native
    
    @js.native
    sealed trait instanceStarted
      extends StObject
         with MongoInstanceEvents
    /* "instanceStarted" */ val instanceStarted: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.instanceStarted & String = js.native
    
    @js.native
    sealed trait killerLaunched
      extends StObject
         with MongoInstanceEvents
    /* "killerLaunched" */ val killerLaunched: typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstanceEvents.killerLaunched & String = js.native
  }
  
  trait MongoMemoryInstanceOpts
    extends StObject
       with MongoMemoryInstanceOptsBase {
    
    /**
      * Set which parameter will be used
      * true -> "--auth"
      * false -> "--noauth"
      * @default false
      */
    var auth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Currently unused option
      * @default undefined
      */
    var dbName: js.UndefOr[String] = js.undefined
    
    /**
      * for binding to all IP addresses set it to `::,0.0.0.0`, by default '127.0.0.1'
      * Adds "--bind_ip"
      * @default undefined
      */
    var ip: js.UndefOr[String] = js.undefined
    
    /**
      * Location for the "--keyfile" argument
      * Only has an effect when "auth" is enabled and is a replset
      * Adds "--keyfile"
      * @default undefined
      */
    var keyfileLocation: js.UndefOr[String] = js.undefined
    
    /**
      * Set that this instance is part of a replset
      * Adds "--replSet"
      * @default undefined
      */
    var replSet: js.UndefOr[String] = js.undefined
  }
  object MongoMemoryInstanceOpts {
    
    inline def apply(): MongoMemoryInstanceOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryInstanceOpts]
    }
    
    extension [Self <: MongoMemoryInstanceOpts](x: Self) {
      
      inline def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setKeyfileLocation(value: String): Self = StObject.set(x, "keyfileLocation", value.asInstanceOf[js.Any])
      
      inline def setKeyfileLocationUndefined: Self = StObject.set(x, "keyfileLocation", js.undefined)
      
      inline def setReplSet(value: String): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
      
      inline def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
    }
  }
  
  trait MongoMemoryInstanceOptsBase extends StObject {
    
    /**
      * Extra Arguments to add
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Set which storage path to use
      * Adds "--dbpath"
      * @default TmpDir
      */
    var dbPath: js.UndefOr[String] = js.undefined
    
    /**
      * Set which port to use
      * Adds "--port"
      * @default from get-port
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the Replica-Member-Config
      * Only has a effect when started with "MongoMemoryReplSet"
      */
    var replicaMemberConfig: js.UndefOr[ReplicaMemberConfig] = js.undefined
    
    /**
      * Set which Storage Engine to use
      * Adds "--storageEngine"
      * @default "ephemeralForTest"
      */
    var storageEngine: js.UndefOr[StorageEngine] = js.undefined
  }
  object MongoMemoryInstanceOptsBase {
    
    inline def apply(): MongoMemoryInstanceOptsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryInstanceOptsBase]
    }
    
    extension [Self <: MongoMemoryInstanceOptsBase](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      inline def setDbPathUndefined: Self = StObject.set(x, "dbPath", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReplicaMemberConfig(value: ReplicaMemberConfig): Self = StObject.set(x, "replicaMemberConfig", value.asInstanceOf[js.Any])
      
      inline def setReplicaMemberConfigUndefined: Self = StObject.set(x, "replicaMemberConfig", js.undefined)
      
      inline def setStorageEngine(value: StorageEngine): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
      
      inline def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
    }
  }
  
  trait MongodOpts extends StObject {
    
    /** mongo binary options */
    var binary: MongoBinaryOpts
    
    /** instance options */
    var instance: MongoMemoryInstanceOpts
    
    /** child process spawn options */
    var spawn: SpawnOptions
  }
  object MongodOpts {
    
    inline def apply(binary: MongoBinaryOpts, instance: MongoMemoryInstanceOpts, spawn: SpawnOptions): MongodOpts = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], spawn = spawn.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongodOpts]
    }
    
    extension [Self <: MongodOpts](x: Self) {
      
      inline def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: MongoMemoryInstanceOpts): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplicaMemberConfig extends StObject {
    
    /**
      * A boolean that identifies an arbiter.
      * @default false - A value of `true` indicates that the member is an arbiter.
      */
    var arbiterOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean that indicates whether the mongod builds indexes on this member.
      * You can only set this value when adding a member to a replica set.
      * @default true
      */
    var buildIndexes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The replica set hides this instance and does not include the member in the output of `db.hello()` or `hello`.
      * @default true
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A number that indicates the relative eligibility of a member to become a primary.
      * Specify higher values to make a member more eligible to become primary, and lower values to make the member less eligible.
      * @default 1 for primary/secondary; 0 for arbiters.
      */
    var priority: js.UndefOr[Double] = js.undefined
    
    /**
      * Mongodb 5.x only - The number of seconds "behind" the primary that this replica set member should "lag".
      * @default 0
      */
    var secondaryDelaySecs: js.UndefOr[Double] = js.undefined
    
    /**
      * Mongodb 4.x only - The number of seconds "behind" the primary that this replica set member should "lag".
      * For mongodb 5.x, use `secondaryDelaySecs` instead.
      * @see {@link https://docs.mongodb.com/v4.4/tutorial/configure-a-delayed-replica-set-member/}
      * @default 0
      */
    var slaveDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * A tags document contains user-defined tag field and value pairs for the replica set member.
      * @default null
      * @example
      * ```ts
      * { "<tag1>": "<string1>", "<tag2>": "<string2>",... }
      * ```
      */
    var tags: js.UndefOr[Any] = js.undefined
    
    /**
      * The number of votes a server will cast in a replica set election.
      * The number of votes each member has is either 1 or 0, and arbiters always have exactly 1 vote.
      * @default 1
      */
    var votes: js.UndefOr[Double] = js.undefined
  }
  object ReplicaMemberConfig {
    
    inline def apply(): ReplicaMemberConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaMemberConfig]
    }
    
    extension [Self <: ReplicaMemberConfig](x: Self) {
      
      inline def setArbiterOnly(value: Boolean): Self = StObject.set(x, "arbiterOnly", value.asInstanceOf[js.Any])
      
      inline def setArbiterOnlyUndefined: Self = StObject.set(x, "arbiterOnly", js.undefined)
      
      inline def setBuildIndexes(value: Boolean): Self = StObject.set(x, "buildIndexes", value.asInstanceOf[js.Any])
      
      inline def setBuildIndexesUndefined: Self = StObject.set(x, "buildIndexes", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSecondaryDelaySecs(value: Double): Self = StObject.set(x, "secondaryDelaySecs", value.asInstanceOf[js.Any])
      
      inline def setSecondaryDelaySecsUndefined: Self = StObject.set(x, "secondaryDelaySecs", js.undefined)
      
      inline def setSlaveDelay(value: Double): Self = StObject.set(x, "slaveDelay", value.asInstanceOf[js.Any])
      
      inline def setSlaveDelayUndefined: Self = StObject.set(x, "slaveDelay", js.undefined)
      
      inline def setTags(value: Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVotes(value: Double): Self = StObject.set(x, "votes", value.asInstanceOf[js.Any])
      
      inline def setVotesUndefined: Self = StObject.set(x, "votes", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger
  */
  trait StorageEngine extends StObject
  object StorageEngine {
    
    inline def devnull: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull = "devnull".asInstanceOf[typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull]
    
    inline def ephemeralForTest: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest = "ephemeralForTest".asInstanceOf[typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest]
    
    inline def mmapv1: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1 = "mmapv1".asInstanceOf[typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1]
    
    inline def wiredTiger: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger = "wiredTiger".asInstanceOf[typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger]
  }
}
