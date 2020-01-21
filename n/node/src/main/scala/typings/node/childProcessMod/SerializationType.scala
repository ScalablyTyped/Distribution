package typings.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.json
  - typings.node.nodeStrings.advanced
*/
trait SerializationType extends js.Object

object SerializationType {
  @scala.inline
  def advanced: typings.node.nodeStrings.advanced = this.cast("advanced")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def json: typings.node.nodeStrings.json = this.cast("json")
}

