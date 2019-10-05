package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", "writeHeapSnapshot")
@js.native
object writeHeapSnapshot extends js.Object {
  /**
    *
    * @param fileName The file path where the V8 heap snapshot is to be
    * saved. If not specified, a file name with the pattern
    * `'Heap-${yyyymmdd}-${hhmmss}-${pid}-${thread_id}.heapsnapshot'` will be
    * generated, where `{pid}` will be the PID of the Node.js process,
    * `{thread_id}` will be `0` when `writeHeapSnapshot()` is called from
    * the main Node.js thread or the id of a worker thread.
    */
  def apply(): java.lang.String = js.native
  def apply(fileName: java.lang.String): java.lang.String = js.native
}

