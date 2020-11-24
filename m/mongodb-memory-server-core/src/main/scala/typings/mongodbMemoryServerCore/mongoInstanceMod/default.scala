package typings.mongodbMemoryServerCore.mongoInstanceMod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * Create an new instance an call method "run"
    * @param opts Options passed to the new instance
    */
  def run(opts: MongodOps): js.Promise[MongoInstance] = js.native
}
