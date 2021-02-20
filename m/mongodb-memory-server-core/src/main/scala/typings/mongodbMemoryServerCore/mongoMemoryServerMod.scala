package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreBooleans.`false`
import typings.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropT
import typings.mongodbMemoryServerCore.typesMod.StorageEngineT
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import typings.tmp.mod.DirResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoMemoryServerMod {
  
  @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", JSImport.Default)
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class default () extends MongoMemoryServer {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  /* static members */
  object default {
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", "default.create")
    @js.native
    def create(): js.Promise[MongoMemoryServer] = js.native
    @JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", "default.create")
    @js.native
    def create(opts: MongoMemoryServerOptsT): js.Promise[MongoMemoryServer] = js.native
  }
  
  @js.native
  trait MongoInstanceDataT extends StartupInstanceData {
    
    var childProcess: js.UndefOr[ChildProcess] = js.native
    
    @JSName("dbPath")
    var dbPath_MongoInstanceDataT: String = js.native
    
    var instance: typings.mongodbMemoryServerCore.mongoInstanceMod.default = js.native
    
    @JSName("uri")
    var uri_MongoInstanceDataT: String = js.native
  }
  object MongoInstanceDataT {
    
    @scala.inline
    def apply(
      dbName: String,
      dbPath: String,
      instance: typings.mongodbMemoryServerCore.mongoInstanceMod.default,
      ip: String,
      port: Double,
      storageEngine: StorageEngineT,
      uri: String
    ): MongoInstanceDataT = {
      val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], dbPath = dbPath.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoInstanceDataT]
    }
    
    @scala.inline
    implicit class MongoInstanceDataTMutableBuilder[Self <: MongoInstanceDataT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildProcess(value: ChildProcess): Self = StObject.set(x, "childProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildProcessUndefined: Self = StObject.set(x, "childProcess", js.undefined)
      
      @scala.inline
      def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance(value: typings.mongodbMemoryServerCore.mongoInstanceMod.default): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MongoMemoryServer extends StObject {
    
    /**
      * Internal Function to start an instance
      * @private
      */
    def _startUpInstance(): js.Promise[MongoInstanceDataT] = js.native
    
    /**
      * Ensure that the instance is running
      * -> throws if instance cannot be started
      */
    def ensureInstance(): js.Promise[MongoInstanceDataT] = js.native
    
    /**
      * Get a mongodb-URI for a different DataBase
      * @param otherDbName Set this to "true" to generate a random DataBase name, otherwise a string to specify a DataBase name
      * @deprecated
      */
    def getConnectionString(): js.Promise[String] = js.native
    def getConnectionString(otherDbName: String): js.Promise[String] = js.native
    def getConnectionString(otherDbName: Boolean): js.Promise[String] = js.native
    
    /**
      * Get the DB-Name of the currently running Instance
      * Note: calls "ensureInstance"
      */
    def getDbName(): js.Promise[String] = js.native
    
    /**
      * Get the DB-Path of the currently running Instance
      * Note: calls "ensureInstance"
      */
    def getDbPath(): js.Promise[String] = js.native
    
    /**
      * Get Information about the currently running instance, if it is not running it returns "false"
      */
    def getInstanceInfo(): MongoInstanceDataT | `false` = js.native
    
    /**
      * Get the Port of the currently running Instance
      * Note: calls "ensureInstance"
      */
    def getPort(): js.Promise[Double] = js.native
    
    /**
      * Get a mongodb-URI for a different DataBase
      * @param otherDbName Set this to "true" to generate a random DataBase name, otherwise a string to specify a DataBase name
      */
    def getUri(): js.Promise[String] = js.native
    def getUri(otherDbName: String): js.Promise[String] = js.native
    def getUri(otherDbName: Boolean): js.Promise[String] = js.native
    
    var instanceInfoSync: MongoInstanceDataT | Null = js.native
    
    var opts: MongoMemoryServerOptsT = js.native
    
    var runningInstance: js.Promise[MongoInstanceDataT] | Null = js.native
    
    /**
      * Start the in-memory Instance
      * (when options.autoStart is true, this already got called)
      */
    def start(): js.Promise[Boolean] = js.native
    
    /**
      * Stop the current In-Memory Instance
      */
    def stop(): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait MongoMemoryServerOptsT extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.native
    
    var binary: js.UndefOr[MongoBinaryOpts] = js.native
    
    var instance: js.UndefOr[MongoMemoryInstancePropT] = js.native
    
    var spawn: js.UndefOr[SpawnOptions] = js.native
  }
  object MongoMemoryServerOptsT {
    
    @scala.inline
    def apply(): MongoMemoryServerOptsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoMemoryServerOptsT]
    }
    
    @scala.inline
    implicit class MongoMemoryServerOptsTMutableBuilder[Self <: MongoMemoryServerOptsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setBinary(value: MongoBinaryOpts): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setInstance(value: MongoMemoryInstancePropT): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setSpawn(value: SpawnOptions): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
  
  @js.native
  trait StartupInstanceData extends StObject {
    
    var dbName: String = js.native
    
    var dbPath: js.UndefOr[String] = js.native
    
    var ip: String = js.native
    
    var port: Double = js.native
    
    var replSet: js.UndefOr[String] = js.native
    
    var storageEngine: StorageEngineT = js.native
    
    var tmpDir: js.UndefOr[DirResult] = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  object StartupInstanceData {
    
    @scala.inline
    def apply(dbName: String, ip: String, port: Double, storageEngine: StorageEngineT): StartupInstanceData = {
      val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartupInstanceData]
    }
    
    @scala.inline
    implicit class StartupInstanceDataMutableBuilder[Self <: StartupInstanceData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbPath(value: String): Self = StObject.set(x, "dbPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbPathUndefined: Self = StObject.set(x, "dbPath", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplSet(value: String): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
      
      @scala.inline
      def setStorageEngine(value: StorageEngineT): Self = StObject.set(x, "storageEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpDir(value: DirResult): Self = StObject.set(x, "tmpDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpDirUndefined: Self = StObject.set(x, "tmpDir", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
