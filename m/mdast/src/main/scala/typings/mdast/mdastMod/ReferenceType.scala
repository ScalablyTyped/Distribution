package typings.mdast.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mdast.mdastStrings.shortcut
  - typings.mdast.mdastStrings.collapsed
  - typings.mdast.mdastStrings.full
*/
trait ReferenceType extends js.Object

object ReferenceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collapsed: typings.mdast.mdastStrings.collapsed = this.cast("collapsed")
  @scala.inline
  def full: typings.mdast.mdastStrings.full = this.cast("full")
  @scala.inline
  def shortcut: typings.mdast.mdastStrings.shortcut = this.cast("shortcut")
}

