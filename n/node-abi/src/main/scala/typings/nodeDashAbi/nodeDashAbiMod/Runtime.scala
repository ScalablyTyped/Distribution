package typings.nodeDashAbi.nodeDashAbiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashAbi.nodeDashAbiStrings.electron
  - typings.nodeDashAbi.nodeDashAbiStrings.node
  - typings.nodeDashAbi.nodeDashAbiStrings.`node-webkit`
*/
trait Runtime extends js.Object

object Runtime {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def electron: typings.nodeDashAbi.nodeDashAbiStrings.electron = this.cast("electron")
  @scala.inline
  def node: typings.nodeDashAbi.nodeDashAbiStrings.node = this.cast("node")
  @scala.inline
  def `node-webkit`: typings.nodeDashAbi.nodeDashAbiStrings.`node-webkit` = this.cast("node-webkit")
}

