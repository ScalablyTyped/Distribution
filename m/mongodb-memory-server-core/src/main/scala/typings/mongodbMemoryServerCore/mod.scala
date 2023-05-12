package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.anon.PartialMongoMemoryReplSet
import typings.mongodbMemoryServerCore.anon.PartialMongodOpts
import typings.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServerOpts
import typings.mongodbMemoryServerCore.libUtilMongoBinaryMod.MongoBinaryOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongodb-memory-server-core", JSImport.Default)
  @js.native
  /**
    * Create a Mongo-Memory-Sever Instance
    * @param opts Mongo-Memory-Sever Options
    */
  open class default ()
    extends typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOpts) = this()
  }
  /* static members */
  object default {
    
    @JSImport("mongodb-memory-server-core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    inline def create(): js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer]]
    inline def create(opts: MongoMemoryServerOpts): js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer]]
  }
  
  @JSImport("mongodb-memory-server-core", "MongoBinary")
  @js.native
  open class MongoBinary ()
    extends typings.mongodbMemoryServerCore.libUtilMongoBinaryMod.MongoBinary
  /* static members */
  object MongoBinary {
    
    @JSImport("mongodb-memory-server-core", "MongoBinary")
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
  
  @JSImport("mongodb-memory-server-core", "MongoInstance")
  @js.native
  open class MongoInstance protected ()
    extends typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstance {
    def this(opts: PartialMongodOpts) = this()
  }
  /* static members */
  object MongoInstance {
    
    @JSImport("mongodb-memory-server-core", "MongoInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an new instance an call method "start"
      * @param opts Options passed to the new instance
      */
    inline def create(opts: PartialMongodOpts): js.Promise[typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstance] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.libUtilMongoInstanceMod.MongoInstance]]
  }
  
  @JSImport("mongodb-memory-server-core", "MongoMemoryReplSet")
  @js.native
  open class MongoMemoryReplSet ()
    extends typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet {
    def this(opts: PartialMongoMemoryReplSet) = this()
  }
  /* static members */
  object MongoMemoryReplSet {
    
    @JSImport("mongodb-memory-server-core", "MongoMemoryReplSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an instance of "MongoMemoryReplSet" and call start
      * @param opts Options for the ReplSet
      */
    inline def create(): js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet]]
    inline def create(opts: PartialMongoMemoryReplSet): js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryReplSetMod.MongoMemoryReplSet]]
  }
  
  @JSImport("mongodb-memory-server-core", "MongoMemoryServer")
  @js.native
  /**
    * Create a Mongo-Memory-Sever Instance
    * @param opts Mongo-Memory-Sever Options
    */
  open class MongoMemoryServer ()
    extends typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOpts) = this()
  }
  /* static members */
  object MongoMemoryServer {
    
    @JSImport("mongodb-memory-server-core", "MongoMemoryServer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    inline def create(): js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer]]
    inline def create(opts: MongoMemoryServerOpts): js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.mongodbMemoryServerCore.libMongoMemoryServerMod.MongoMemoryServer]]
  }
}
