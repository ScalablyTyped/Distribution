package typings
package nodegitLib.indexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/indexer", "Indexer")
@js.native
class Indexer () extends js.Object {
  def commit(stats: nodegitLib.transferDashProgressMod.TransferProgress): scala.Double = js.native
  def free(): scala.Unit = js.native
  def hash(): nodegitLib.oidMod.Oid = js.native
}

