package typings.mongodbDashMemoryDashServerDashCore.libMongoMemoryServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("mongodb-memory-server-core/lib/MongoMemoryServer", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Create an Mongo-Memory-Sever Instance that can be awaited
    * @param opts Mongo-Memory-Sever Options
    */
  def create(): js.Promise[MongoMemoryServer] = js.native
  def create(opts: MongoMemoryServerOptsT): js.Promise[MongoMemoryServer] = js.native
}

