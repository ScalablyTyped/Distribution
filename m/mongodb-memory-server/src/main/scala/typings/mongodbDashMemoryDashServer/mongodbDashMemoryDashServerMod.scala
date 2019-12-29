package typings.mongodbDashMemoryDashServer

import typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryReplSetMod.MongoMemoryReplSetOptsT
import typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod.MongoMemoryServerOptsT
import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.DebugFn
import typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod.MongoBinaryCache
import typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryMod.MongoBinaryOpts
import typings.mongodbDashMemoryDashServerDashCore.libUtilMongoInstanceMod.MongodOps
import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server", JSImport.Namespace)
@js.native
object mongodbDashMemoryDashServerMod extends js.Object {
  @js.native
  class MongoBinary ()
    extends typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreMod.MongoBinary
  
  @js.native
  class MongoInstance protected ()
    extends typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreMod.MongoInstance {
    def this(opts: MongodOps) = this()
  }
  
  @js.native
  class MongoMemoryReplSet ()
    extends typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreMod.MongoMemoryReplSet {
    def this(opts: MongoMemoryReplSetOptsT) = this()
  }
  
  @js.native
  /**
    * Create an Mongo-Memory-Sever Instance
    *
    * Note: because of JavaScript limitations, autoStart cannot be awaited here, use ".create" for async/await ability
    * @param opts Mongo-Memory-Sever Options
    */
  class MongoMemoryServer ()
    extends typings.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreMod.MongoMemoryServer {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  
  /* static members */
  @js.native
  object MongoBinary extends js.Object {
    var cache: MongoBinaryCache = js.native
    @JSName("debug")
    var debug_Original: DebugFn = js.native
    def debug(args: js.Any*): js.Any = js.native
    def getCachePath(version: String): js.Promise[String] = js.native
    def getDownloadPath(options: js.Any): js.Promise[String] = js.native
    def getPath(): js.Promise[String] = js.native
    def getPath(opts: MongoBinaryOpts): js.Promise[String] = js.native
    def getSystemPath(systemBinary: String): js.Promise[String] = js.native
    def hasValidBinPath(files: js.Array[String]): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MongoInstance extends js.Object {
    var childProcessList: js.Array[ChildProcess] = js.native
    def run(opts: MongodOps): js.Promise[
        typings.mongodbDashMemoryDashServerDashCore.libUtilMongoInstanceMod.MongoInstance
      ] = js.native
  }
  
  /* static members */
  @js.native
  object MongoMemoryServer extends js.Object {
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    def create(): js.Promise[
        typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod.MongoMemoryServer
      ] = js.native
    def create(opts: MongoMemoryServerOptsT): js.Promise[
        typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod.MongoMemoryServer
      ] = js.native
  }
  
}

