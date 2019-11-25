package typings.needle.needleMod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.needle.needleStrings.delete
  - typings.needle.needleStrings.patch
  - typings.needle.needleStrings.post
  - typings.needle.needleStrings.put
*/
trait NeedleReadWriteHttpVerbs extends js.Object

object NeedleReadWriteHttpVerbs {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.needle.needleStrings.delete = this.cast("delete")
  @scala.inline
  def patch: typings.needle.needleStrings.patch = this.cast("patch")
  @scala.inline
  def post: typings.needle.needleStrings.post = this.cast("post")
  @scala.inline
  def put: typings.needle.needleStrings.put = this.cast("put")
}

