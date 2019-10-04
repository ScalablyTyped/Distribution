package typings.pgDashPromise.pgDashPromiseMod

import typings.spex.spexMod.ISpexBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Additional methods available inside tasks + transactions;
// API: http://vitaly-t.github.io/pg-promise/Task.html
@js.native
trait ITask[Ext]
  extends IBaseProtocol[Ext]
     with ISpexBase {
  val ctx: ITaskContext = js.native
}

