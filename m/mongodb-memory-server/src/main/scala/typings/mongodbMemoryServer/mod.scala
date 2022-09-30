package typings.mongodbMemoryServer

import typings.mongodbMemoryServerCore.anon.PartialMongoMemoryReplSet
import typings.mongodbMemoryServerCore.anon.PartialMongodOpts
import typings.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServerOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongodb-memory-server", "MongoBinary")
  @js.native
  open class MongoBinary ()
    extends typings.mongodbMemoryServerCore.mod.MongoBinary
  /* static members */
  object MongoBinary {
    
    @JSImport("mongodb-memory-server", "MongoBinary")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Probe download path and download the binary
      * @param options Options Configuring which binary to download and to which path
      * @returns The BinaryPath the binary has been downloaded to
      */
    inline def download(options: RequiredMongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("download")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Probe all supported paths for an binary and return the binary path
      * @param opts Options configuring which binary to search for
      * @throws {Error} if no valid BinaryPath has been found
      * @returns The first found BinaryPath
      */
    inline def getPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[js.Promise[String]]
    inline def getPath(opts: MongoBinaryOpts): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("mongodb-memory-server", "MongoInstance")
  @js.native
  open class MongoInstance protected ()
    extends typings.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance {
    def this(opts: PartialMongodOpts) = this()
  }
  /* static members */
  object MongoInstance {
    
    @JSImport("mongodb-memory-server", "MongoInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an new instance an call method "start"
      * @param opts Options passed to the new instance
      */
    inline def create(opts: PartialMongodOpts): js.Promise[typings.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance]]
  }
  
  @JSImport("mongodb-memory-server", "MongoMemoryReplSet")
  @js.native
  open class MongoMemoryReplSet ()
    extends typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSet {
    def this(opts: PartialMongoMemoryReplSet) = this()
  }
  /* static members */
  object MongoMemoryReplSet {
    
    @JSImport("mongodb-memory-server", "MongoMemoryReplSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an instance of "MongoMemoryReplSet" and call start
      * @param opts Options for the ReplSet
      */
    inline def create(): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSet]]
    inline def create(opts: PartialMongoMemoryReplSet): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSet]]
  }
  
  @JSImport("mongodb-memory-server", "MongoMemoryServer")
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    * @param opts Mongo-Memory-Sever Options
    */
  open class MongoMemoryServer ()
    extends typings.mongodbMemoryServerCore.mod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOpts) = this()
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
    inline def create(): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer]]
    inline def create(opts: MongoMemoryServerOpts): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer]]
  }
}
