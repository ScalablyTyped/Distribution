package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoInstanceMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server-core/lib/util/MongoInstance", JSImport.Default)
@js.native
class default protected () extends MongoInstance {
  def this(opts: MongodOps) = this()
}

/* static members */
@JSImport("mongodb-memory-server-core/lib/util/MongoInstance", JSImport.Default)
@js.native
object default extends js.Object {
  var childProcessList: js.Array[ChildProcess] = js.native
  def run(opts: MongodOps): js.Promise[MongoInstance] = js.native
}

