package typings.mongodbMemoryServer

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
  
  @JSImport("mongodb-memory-server", "MongoBinary")
  @js.native
  class MongoBinary ()
    extends typings.mongodbMemoryServerCore.mod.MongoBinary
  /* static members */
  object MongoBinary {
    
    @JSImport("mongodb-memory-server", "MongoBinary")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mongodb-memory-server", "MongoBinary.cache")
    @js.native
    def cache: MongoBinaryCache = js.native
    @scala.inline
    def cache_=(x: MongoBinaryCache): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
    
    /**
      * Check if specified version already exists in the cache
      * @param version The Version to check for
      */
    @scala.inline
    def getCachePath(version: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCachePath")(version.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    @scala.inline
    def getDownloadPath(options: RequiredMongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadPath")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @return The first found BinaryPath
      */
    @scala.inline
    def getPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[js.Promise[String]]
    @scala.inline
    def getPath(opts: MongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe if the provided "systemBinary" is an existing path
      * @param systemBinary The Path to probe for an System-Binary
      * @return System Binary path or empty string
      */
    @scala.inline
    def getSystemPath(systemBinary: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemPath")(systemBinary.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("mongodb-memory-server", "MongoInstance")
  @js.native
  class MongoInstance protected ()
    extends typings.mongodbMemoryServerCore.mod.MongoInstance {
    def this(opts: MongodOps) = this()
  }
  /* static members */
  object MongoInstance {
    
    @JSImport("mongodb-memory-server", "MongoInstance")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mongodb-memory-server", "MongoInstance.childProcessList")
    @js.native
    def childProcessList: js.Array[ChildProcess] = js.native
    @scala.inline
    def childProcessList_=(x: js.Array[ChildProcess]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childProcessList")(x.asInstanceOf[js.Any])
    
    /**
      * Create an new instance an call method "run"
      * @param opts Options passed to the new instance
      */
    @scala.inline
    def run(opts: MongodOps): js.Promise[typings.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance]]
  }
  
  @JSImport("mongodb-memory-server", "MongoMemoryReplSet")
  @js.native
  class MongoMemoryReplSet ()
    extends typings.mongodbMemoryServerCore.mod.MongoMemoryReplSet {
    def this(opts: MongoMemoryReplSetOptsT) = this()
  }
  
  @JSImport("mongodb-memory-server", "MongoMemoryServer")
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class MongoMemoryServer ()
    extends typings.mongodbMemoryServerCore.mod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  /* static members */
  object MongoMemoryServer {
    
    @JSImport("mongodb-memory-server", "MongoMemoryServer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    @scala.inline
    def create(): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer]]
    @scala.inline
    def create(opts: MongoMemoryServerOptsT): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer]]
  }
}
