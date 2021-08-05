package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryCache
import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.mongoInstanceMod.MongodOps
import typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetOptsT
import typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServerOptsT
import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongodb-memory-server-core", JSImport.Default)
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class default ()
    extends typings.mongodbMemoryServerCore.mongoMemoryServerMod.default {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    inline def create(): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer]]
    inline def create(opts: MongoMemoryServerOptsT): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer]]
  }
  
  @JSImport("mongodb-memory-server-core", "MongoBinary")
  @js.native
  class MongoBinary ()
    extends typings.mongodbMemoryServerCore.mongoBinaryMod.default
  /* static members */
  object MongoBinary {
    
    @JSImport("mongodb-memory-server-core", "MongoBinary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mongodb-memory-server-core", "MongoBinary.cache")
    @js.native
    def cache: MongoBinaryCache = js.native
    inline def cache_=(x: MongoBinaryCache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
    
    /**
      * Check if specified version already exists in the cache
      * @param version The Version to check for
      */
    inline def getCachePath(version: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCachePath")(version.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    inline def getDownloadPath(options: RequiredMongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadPath")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @return The first found BinaryPath
      */
    inline def getPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[js.Promise[String]]
    inline def getPath(opts: MongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe if the provided "systemBinary" is an existing path
      * @param systemBinary The Path to probe for an System-Binary
      * @return System Binary path or empty string
      */
    inline def getSystemPath(systemBinary: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemPath")(systemBinary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("mongodb-memory-server-core", "MongoInstance")
  @js.native
  class MongoInstance protected ()
    extends typings.mongodbMemoryServerCore.mongoInstanceMod.default {
    def this(opts: MongodOps) = this()
  }
  /* static members */
  object MongoInstance {
    
    @JSImport("mongodb-memory-server-core", "MongoInstance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mongodb-memory-server-core", "MongoInstance.childProcessList")
    @js.native
    def childProcessList: js.Array[ChildProcess] = js.native
    inline def childProcessList_=(x: js.Array[ChildProcess]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childProcessList")(x.asInstanceOf[js.Any])
    
    /**
      * Create an new instance an call method "run"
      * @param opts Options passed to the new instance
      */
    inline def run(opts: MongodOps): js.Promise[typings.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance]]
  }
  
  @JSImport("mongodb-memory-server-core", "MongoMemoryReplSet")
  @js.native
  class MongoMemoryReplSet ()
    extends typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.default {
    def this(opts: MongoMemoryReplSetOptsT) = this()
  }
  
  @JSImport("mongodb-memory-server-core", "MongoMemoryServer")
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class MongoMemoryServer ()
    extends typings.mongodbMemoryServerCore.mongoMemoryServerMod.default {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  /* static members */
  object MongoMemoryServer {
    
    @JSImport("mongodb-memory-server-core", "MongoMemoryServer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    inline def create(): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer]]
    inline def create(opts: MongoMemoryServerOptsT): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer]]
  }
}
