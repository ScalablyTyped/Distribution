package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.node
  - typings.node.nodeStrings.mark
  - typings.node.nodeStrings.measure
  - typings.node.nodeStrings.gc
  - typings.node.nodeStrings.function
  - typings.node.nodeStrings.http2
  - typings.node.nodeStrings.http
*/
trait EntryType extends js.Object

object EntryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def function: typings.node.nodeStrings.function = this.cast("function")
  @scala.inline
  def gc: typings.node.nodeStrings.gc = this.cast("gc")
  @scala.inline
  def http: typings.node.nodeStrings.http = this.cast("http")
  @scala.inline
  def http2: typings.node.nodeStrings.http2 = this.cast("http2")
  @scala.inline
  def mark: typings.node.nodeStrings.mark = this.cast("mark")
  @scala.inline
  def measure: typings.node.nodeStrings.measure = this.cast("measure")
  @scala.inline
  def node: typings.node.nodeStrings.node = this.cast("node")
}

