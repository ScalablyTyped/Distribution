package typings.mongodbMemoryServerCore

import org.scalablytyped.runtime.StringDictionary
import typings.mongodbMemoryServerCore.anon.ClientSource
import typings.mongodbMemoryServerCore.anon.Db
import typings.mongodbMemoryServerCore.anon.PartialMongodOpts
import typings.mongodbMemoryServerCore.anon.RequiredAutomaticAuth
import typings.mongodbMemoryServerCore.libUtilMongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstance
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoMemoryInstanceOpts
import typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.StorageEngine
import typings.mongodbMemoryServerCore.libUtilUtilsMod.Cleanup
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.`SCRAM-SHA-1`
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.`SCRAM-SHA-256`
import typings.node.childProcessMod.SpawnOptions
import typings.node.eventsMod.EventEmitter
import typings.std.NonNullable
import typings.tmp.mod.DirResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMongoMemoryServerMod {
  
  @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", JSImport.Default)
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    * @param opts Mongo-Memory-Sever Options
    */
  open class default () extends MongoMemoryServer {
    def this(opts: MongoMemoryServerOpts) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    inline def create(): js.Promise[MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[MongoMemoryServer]]
    inline def create(opts: MongoMemoryServerOpts): js.Promise[MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MongoMemoryServer]]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mongodbMemoryServerCore.libUtilUtilsMod.ManagerBase because Inheritance from two classes. Inlined start, start, stop, stop
  - typings.mongodbMemoryServerCore.libUtilUtilsMod.ManagerAdvanced because Inheritance from two classes. Inlined getUri, getUri, getUri, cleanup, cleanup */ @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", "MongoMemoryServer")
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    * @param opts Mongo-Memory-Sever Options
    */
  open class MongoMemoryServer () extends EventEmitter {
    def this(opts: MongoMemoryServerOpts) = this()
    
    /**
      * Information about the started instance
      */
    /* protected */ var _instanceInfo: js.UndefOr[MongoInstanceData] = js.native
    
    /**
      * Internal Function to start an instance
      * @param forceSamePort Force to use the Same Port, if already an "instanceInfo" exists
      * @private
      */
    def _startUpInstance(): js.Promise[Unit] = js.native
    def _startUpInstance(forceSamePort: Boolean): js.Promise[Unit] = js.native
    
    /**
      * The Current State of this instance
      */
    /* protected */ var _state: MongoMemoryServerStates = js.native
    
    /**
      * Original Auth Configuration (this.opts can be changed if stopped, but auth cannot be changed here)
      */
    val auth: js.UndefOr[RequiredAutomaticAuth] = js.native
    
    /**
      * Helper function to determine if the "auth" object is set and not to be disabled
      * This function expectes to be run after the auth object has been transformed to a object
      * @returns "true" when "auth" should be enabled
      */
    /* protected */ def authObjectEnable(): Boolean = js.native
    
    /**
      * Remove the defined dbPath
      * @param options Set how to run a cleanup, by default `{ doCleanup: true }` is used
      * @throws If "state" is not "stopped"
      * @throws If "instanceInfo" is not defined
      * @throws If an fs error occured
      */
    def cleanup(): js.Promise[Unit] = js.native
    /**
      * Remove the defined dbPath
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
    
    /**
      * Create the Root user and additional users using the [localhost exception](https://www.mongodb.com/docs/manual/core/localhost-exception/#std-label-localhost-exception)
      * This Function assumes "this.opts.auth" is already processed into "this.auth"
      * @param data Used to get "ip" and "port"
      * @internal
      */
    def createAuth(data: StartupInstanceData): js.Promise[Unit] = js.native
    
    /**
      * Debug-log with template applied
      * @param msg The Message to log
      */
    /* protected */ def debug(msg: String, extra: Any*): Unit = js.native
    
    def emit(event: MongoMemoryServerEvents, args: Any*): Boolean = js.native
    
    /**
      * Ensure that the instance is running
      * -> throws if instance cannot be started
      */
    def ensureInstance(): js.Promise[MongoInstanceData] = js.native
    
    /**
      * Find an new unlocked port
      * @param port An User defined default port
      */
    /* protected */ def getNewPort(): js.Promise[Double] = js.native
    /* protected */ def getNewPort(port: Double): js.Promise[Double] = js.native
    
    /**
      * Construct Instance Starting Options
      */
    /* protected */ def getStartOptions(): js.Promise[MongoMemoryServerGetStartOptions] = js.native
    /* protected */ def getStartOptions(forceSamePort: Boolean): js.Promise[MongoMemoryServerGetStartOptions] = js.native
    
    /**
      * Generate the Connection string used by mongodb
      * @param otherDb add an database into the uri (in mongodb its the auth database, in mongoose its the default database for models)
      * @param otherIp change the ip in the generated uri, default will otherwise always be "127.0.0.1"
      * @throws if state is not "running" (or "starting")
      * @throws if an server doesnt have "instanceInfo.port" defined
      * @returns an valid mongo URI, by the definition of https://docs.mongodb.com/manual/reference/connection-string/
      */
    def getUri(): String = js.native
    def getUri(otherDB: Boolean): String = js.native
    def getUri(otherDb: String): String = js.native
    def getUri(otherDb: String, otherIp: String): String = js.native
    def getUri(otherDb: Unit, otherIp: String): String = js.native
    
    /**
      * Get Information about the currently running instance, if it is not running it returns "undefined"
      */
    def instanceInfo: js.UndefOr[MongoInstanceData] = js.native
    
    def on(event: MongoMemoryServerEvents, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    def once(event: MongoMemoryServerEvents, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * General Options for this Instance
      */
    var opts: MongoMemoryServerOpts = js.native
    
    /**
      * Start the Mongod Instance
      * @param forceSamePort Force to use the Same Port, if already an "instanceInfo" exists
      * @throws if state is not "new" or "stopped"
      */
    def start(): js.Promise[Unit] = js.native
    def start(forceSamePort: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Get Current state of this class
      */
    def state: MongoMemoryServerStates = js.native
    
    /**
      * Change "this._state" to "newState" and emit "stateChange" with "newState"
      * @param newState The new State to set & emit
      */
    /* protected */ def stateChange(newState: MongoMemoryServerStates): Unit = js.native
    
    /**
      * Stop the current In-Memory Instance
      * @param cleanupOptions Set how to run ".cleanup", by default only `{ doCleanup: true }` is used
      */
    def stop(): js.Promise[Boolean] = js.native
    def stop(cleanupOptions: Cleanup): js.Promise[Boolean] = js.native
    /**
      * Stop the current In-Memory Instance
      * @param runCleanup run "this.cleanup"? (remove dbPath & reset "instanceInfo")
      *
      * @deprecated replace argument with `Cleanup` interface object
      */
    /** @deprecated replace argument with `Cleanup` interface object */
    def stop(runCleanup: Boolean): js.Promise[Boolean] = js.native
  }
  /* static members */
  object MongoMemoryServer {
    
    @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", "MongoMemoryServer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    inline def create(): js.Promise[MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[MongoMemoryServer]]
    inline def create(opts: MongoMemoryServerOpts): js.Promise[MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MongoMemoryServer]]
  }
  
  @js.native
  sealed trait MongoMemoryServerEvents extends StObject
  @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", "MongoMemoryServerEvents")
  @js.native
  object MongoMemoryServerEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MongoMemoryServerEvents & String] = js.native
    
    @js.native
    sealed trait stateChange
      extends StObject
         with MongoMemoryServerEvents
    /* "stateChange" */ val stateChange: typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServerEvents.stateChange & String = js.native
  }
  
  @js.native
  sealed trait MongoMemoryServerStates extends StObject
  @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", "MongoMemoryServerStates")
  @js.native
  object MongoMemoryServerStates extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MongoMemoryServerStates & String] = js.native
    
    @js.native
    sealed trait `new`
      extends StObject
         with MongoMemoryServerStates
    /* "new" */ val `new`: typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServerStates.`new` & String = js.native
    
    @js.native
    sealed trait running
      extends StObject
         with MongoMemoryServerStates
    /* "running" */ val running: typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServerStates.running & String = js.native
    
    @js.native
    sealed trait starting
      extends StObject
         with MongoMemoryServerStates
    /* "starting" */ val starting: typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServerStates.starting & String = js.native
    
    @js.native
    sealed trait stopped
      extends StObject
         with MongoMemoryServerStates
    /* "stopped" */ val stopped: typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServerStates.stopped & String = js.native
  }
  
  trait AutomaticAuth extends StObject {
    
    /**
      * mongodb-memory-server automatically creates a root user (with "root" role)
      * @default 'mongodb-memory-server-root'
      */
    var customRootName: js.UndefOr[String] = js.undefined
    
    /**
      * mongodb-memory-server automatically creates a root user with this password
      * @default 'rootuser'
      */
    var customRootPwd: js.UndefOr[String] = js.undefined
    
    /**
      * Disable Automatic User creation
      * @default false because when defining this object it usually means that AutomaticAuth is wanted
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Extra Users to create besides the root user
      * @default []
      */
    var extraUsers: js.UndefOr[js.Array[CreateUser]] = js.undefined
    
    /**
      * Force to run "createAuth"
      * @default false "createAuth" is normally only run when the given "dbPath" is empty (no files)
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom Keyfile content to use (only has an effect in replset's)
      * Note: This is not secure, this is for test environments only!
      * @default "0123456789"
      */
    var keyfileContent: js.UndefOr[String] = js.undefined
  }
  object AutomaticAuth {
    
    inline def apply(): AutomaticAuth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutomaticAuth]
    }
    
    extension [Self <: AutomaticAuth](x: Self) {
      
      inline def setCustomRootName(value: String): Self = StObject.set(x, "customRootName", value.asInstanceOf[js.Any])
      
      inline def setCustomRootNameUndefined: Self = StObject.set(x, "customRootName", js.undefined)
      
      inline def setCustomRootPwd(value: String): Self = StObject.set(x, "customRootPwd", value.asInstanceOf[js.Any])
      
      inline def setCustomRootPwdUndefined: Self = StObject.set(x, "customRootPwd", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setExtraUsers(value: js.Array[CreateUser]): Self = StObject.set(x, "extraUsers", value.asInstanceOf[js.Any])
      
      inline def setExtraUsersUndefined: Self = StObject.set(x, "extraUsers", js.undefined)
      
      inline def setExtraUsersVarargs(value: CreateUser*): Self = StObject.set(x, "extraUsers", js.Array(value*))
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setKeyfileContent(value: String): Self = StObject.set(x, "keyfileContent", value.asInstanceOf[js.Any])
      
      inline def setKeyfileContentUndefined: Self = StObject.set(x, "keyfileContent", js.undefined)
    }
  }
  
  trait CreateUser
    extends StObject
       with CreateUserMongoDB {
    
    /**
      * In which Database to create this user in
      * @default 'admin' by default the "admin" database is used
      */
    var database: js.UndefOr[String] = js.undefined
  }
  object CreateUser {
    
    inline def apply(createUser: String, pwd: String, roles: js.Array[Db | UserRoles]): CreateUser = {
      val __obj = js.Dynamic.literal(createUser = createUser.asInstanceOf[js.Any], pwd = pwd.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateUser]
    }
    
    extension [Self <: CreateUser](x: Self) {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    }
  }
  
  trait CreateUserMongoDB extends StObject {
    
    /**
      * The authentication restrictions the server enforces on the created user.
      * Specifies a list of IP addresses and CIDR ranges from which the user is allowed to connect to the server or from which the server can accept users.
      */
    var authenticationRestrictions: js.UndefOr[js.Array[ClientSource]] = js.undefined
    
    /**
      * Username
      */
    var createUser: String
    
    /**
      * Any arbitrary information.
      * This field can be used to store any data an admin wishes to associate with this particular user.
      * @example this could be the user’s full name or employee id.
      */
    var customData: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Indicates whether the server or the client digests the password.
      * "true" - The Server digests the Password
      * "false" - The Client digests the Password
      */
    var digestPassword: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the specific SCRAM mechanism or mechanisms for creating SCRAM user credentials.
      */
    var mechanisms: js.UndefOr[js.Array[`SCRAM-SHA-1` | `SCRAM-SHA-256`]] = js.undefined
    
    /**
      * Password
      */
    var pwd: String
    
    /**
      * The Roles for the user, can be an empty array
      */
    var roles: js.Array[Db | UserRoles]
  }
  object CreateUserMongoDB {
    
    inline def apply(createUser: String, pwd: String, roles: js.Array[Db | UserRoles]): CreateUserMongoDB = {
      val __obj = js.Dynamic.literal(createUser = createUser.asInstanceOf[js.Any], pwd = pwd.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateUserMongoDB]
    }
    
    extension [Self <: CreateUserMongoDB](x: Self) {
      
      inline def setAuthenticationRestrictions(value: js.Array[ClientSource]): Self = StObject.set(x, "authenticationRestrictions", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationRestrictionsUndefined: Self = StObject.set(x, "authenticationRestrictions", js.undefined)
      
      inline def setAuthenticationRestrictionsVarargs(value: ClientSource*): Self = StObject.set(x, "authenticationRestrictions", js.Array(value*))
      
      inline def setCreateUser(value: String): Self = StObject.set(x, "createUser", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: StringDictionary[Any]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setDigestPassword(value: Boolean): Self = StObject.set(x, "digestPassword", value.asInstanceOf[js.Any])
      
      inline def setDigestPasswordUndefined: Self = StObject.set(x, "digestPassword", js.undefined)
      
      inline def setMechanisms(value: js.Array[`SCRAM-SHA-1` | `SCRAM-SHA-256`]): Self = StObject.set(x, "mechanisms", value.asInstanceOf[js.Any])
      
      inline def setMechanismsUndefined: Self = StObject.set(x, "mechanisms", js.undefined)
      
      inline def setMechanismsVarargs(value: (`SCRAM-SHA-1` | `SCRAM-SHA-256`)*): Self = StObject.set(x, "mechanisms", js.Array(value*))
      
      inline def setPwd(value: String): Self = StObject.set(x, "pwd", value.asInstanceOf[js.Any])
      
      inline def setRoles(value: js.Array[Db | UserRoles]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: (Db | UserRoles)*): Self = StObject.set(x, "roles", js.Array(value*))
    }
  }
  
  trait MongoInstanceData
    extends StObject
       with StartupInstanceData {
    
    @JSName("dbPath")
    var dbPath_MongoInstanceData: NonNullable[
        js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: mongodb-memory-server-core.mongodb-memory-server-core/lib/util/MongoInstance.MongoMemoryInstanceOpts['dbPath'] */ js.Any
        ]
      ]
    
    var instance: MongoInstance
  }
  object MongoInstanceData {
    
    inline def apply(instance: MongoInstance): MongoInstanceData = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoInstanceData]
    }
    
    extension [Self <: MongoInstanceData](x: Self) {
      
      inline def setDbPath(
        value: NonNullable[
              js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: mongodb-memory-server-core.mongodb-memory-server-core/lib/util/MongoInstance.MongoMemoryInstanceOpts['dbPath'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      inline def setDbPathUndefined: Self = StObject.set(x, "dbPath", js.undefined)
      
      inline def setInstance(value: MongoInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  trait MongoMemoryServerGetStartOptions extends StObject {
    
    /** Defines wheter should {@link MongoMemoryServer.createAuth} be run */
    var createAuth: Boolean
    
    var data: StartupInstanceData
    
    var mongodOptions: PartialMongodOpts
  }
  object MongoMemoryServerGetStartOptions {
    
    inline def apply(createAuth: Boolean, data: StartupInstanceData, mongodOptions: PartialMongodOpts): MongoMemoryServerGetStartOptions = {
      val __obj = js.Dynamic.literal(createAuth = createAuth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], mongodOptions = mongodOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoMemoryServerGetStartOptions]
    }
    
    extension [Self <: MongoMemoryServerGetStartOptions](x: Self) {
      
      inline def setCreateAuth(value: Boolean): Self = StObject.set(x, "createAuth", value.asInstanceOf[js.Any])
      
      inline def setData(value: StartupInstanceData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMongodOptions(value: PartialMongodOpts): Self = StObject.set(x, "mongodOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait MongoMemoryServerOpts extends StObject {
    
    /**
      * Defining this enables automatic user creation
      */
    var auth: js.UndefOr[AutomaticAuth] = js.undefined
    
    var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
    
    var instance: js.UndefOr[MongoMemoryInstanceOpts] = js.undefined
    
    var spawn: js.UndefOr[SpawnOptions] = js.undefined
  }
  object MongoMemoryServerOpts {
    
    inline def apply(): MongoMemoryServerOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryServerOpts]
    }
    
    extension [Self <: MongoMemoryServerOpts](x: Self) {
      
      inline def setAuth(value: AutomaticAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setInstance(value: MongoMemoryInstanceOpts): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
  
  trait StartupInstanceData extends StObject {
    
    var dbName: NonNullable[js.UndefOr[String]]
    
    var dbPath: js.UndefOr[String] = js.undefined
    
    var ip: NonNullable[js.UndefOr[String]]
    
    var keyfileLocation: js.UndefOr[NonNullable[js.UndefOr[String]]] = js.undefined
    
    var launchTimeout: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.undefined
    
    var port: NonNullable[js.UndefOr[Double]]
    
    var replSet: js.UndefOr[NonNullable[js.UndefOr[String]]] = js.undefined
    
    var storageEngine: NonNullable[js.UndefOr[StorageEngine]]
    
    var tmpDir: js.UndefOr[DirResult] = js.undefined
  }
  object StartupInstanceData {
    
    inline def apply(): StartupInstanceData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartupInstanceData]
    }
    
    extension [Self <: StartupInstanceData](x: Self) {
      
      inline def setDbName(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      inline def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      inline def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      inline def setDbPathUndefined: Self = StObject.set(x, "dbPath", js.undefined)
      
      inline def setIp(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setKeyfileLocation(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "keyfileLocation", value.asInstanceOf[js.Any])
      
      inline def setKeyfileLocationUndefined: Self = StObject.set(x, "keyfileLocation", js.undefined)
      
      inline def setLaunchTimeout(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "launchTimeout", value.asInstanceOf[js.Any])
      
      inline def setLaunchTimeoutUndefined: Self = StObject.set(x, "launchTimeout", js.undefined)
      
      inline def setPort(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReplSet(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
      
      inline def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
      
      inline def setStorageEngine(value: NonNullable[js.UndefOr[StorageEngine]]): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
      
      inline def setStorageEngineUndefined: Self = StObject.set(x, "storageEngine", js.undefined)
      
      inline def setTmpDir(value: DirResult): Self = StObject.set(x, "tmpDir", value.asInstanceOf[js.Any])
      
      inline def setTmpDirUndefined: Self = StObject.set(x, "tmpDir", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.read
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.readWrite
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.dbAdmin
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.dbOwner
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.userAdmin
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.clusterAdmin
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.clusterManager
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.clusterMonitor
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.hostManager
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.backup
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.restore
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.readAnyDatabase
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.readWriteAnyDatabase
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.userAdminAnyDatabase
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.dbAdminAnyDatabase
    - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.root
    - java.lang.String
  */
  type UserRoles = _UserRoles | String
  
  trait _UserRoles extends StObject
}
