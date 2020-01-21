package typings.nodeForge.mod

import typings.nodeForge.nodeForgeStrings.raw_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeForge.nodeForgeStrings.raw_
  - typings.nodeForge.nodeForgeStrings.utf8
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def raw: raw_ = this.cast("raw")
  @scala.inline
  def utf8: typings.nodeForge.nodeForgeStrings.utf8 = this.cast("utf8")
}

