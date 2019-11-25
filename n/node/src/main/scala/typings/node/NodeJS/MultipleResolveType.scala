package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.resolve
  - typings.node.nodeStrings.reject
*/
trait MultipleResolveType extends js.Object

object MultipleResolveType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def reject: typings.node.nodeStrings.reject = this.cast("reject")
  @scala.inline
  def resolve: typings.node.nodeStrings.resolve = this.cast("resolve")
}

