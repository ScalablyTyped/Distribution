package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.summary
  - typings.node.nodeStrings.detailed
*/
trait MeasureMemoryMode extends js.Object

object MeasureMemoryMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def detailed: typings.node.nodeStrings.detailed = this.cast("detailed")
  @scala.inline
  def summary: typings.node.nodeStrings.summary = this.cast("summary")
}

