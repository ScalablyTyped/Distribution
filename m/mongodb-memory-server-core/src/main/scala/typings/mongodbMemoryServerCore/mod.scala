package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryCache
import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.mongodbMemoryServerCore.mongoInstanceMod.MongodOps
import typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetOptsT
import typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServerOptsT
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MongoBinary ()
    extends typings.mongodbMemoryServerCore.mongoBinaryMod.default
  
  @js.native
  class MongoInstance protected ()
    extends typings.mongodbMemoryServerCore.mongoInstanceMod.default {
    def this(opts: MongodOps) = this()
  }
  
  @js.native
  class MongoMemoryReplSet ()
    extends typings.mongodbMemoryServerCore.mongoMemoryReplSetMod.default {
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
    extends typings.mongodbMemoryServerCore.mongoMemoryServerMod.default {
    def this(opts: MongoMemoryServerOptsT) = this()
  }
  
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
  @js.native
  object MongoBinary extends js.Object {
    var cache: MongoBinaryCache = js.native
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
    /**
      * Create an new instance an call method "run"
      * @param opts Options passed to the new instance
      */
    def run(opts: MongodOps): js.Promise[typings.mongodbMemoryServerCore.mongoInstanceMod.MongoInstance] = js.native
  }
  
  /* static members */
  @js.native
  object MongoMemoryServer extends js.Object {
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    def create(): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
    def create(opts: MongoMemoryServerOptsT): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Create an Mongo-Memory-Sever Instance that can be awaited
      * @param opts Mongo-Memory-Sever Options
      */
    def create(): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
    def create(opts: MongoMemoryServerOptsT): js.Promise[typings.mongodbMemoryServerCore.mongoMemoryServerMod.MongoMemoryServer] = js.native
  }
  
}

