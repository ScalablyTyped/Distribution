package typings.parseFullName.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parseFullName.parseFullNameStrings.title
  - typings.parseFullName.parseFullNameStrings.first
  - typings.parseFullName.parseFullNameStrings.middle
  - typings.parseFullName.parseFullNameStrings.last
  - typings.parseFullName.parseFullNameStrings.nick
  - typings.parseFullName.parseFullNameStrings.suffix
  - typings.parseFullName.parseFullNameStrings.error
  - typings.parseFullName.parseFullNameStrings.all
*/
trait partToReturn extends js.Object

object partToReturn {
  @scala.inline
  def all: typings.parseFullName.parseFullNameStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.parseFullName.parseFullNameStrings.error = this.cast("error")
  @scala.inline
  def first: typings.parseFullName.parseFullNameStrings.first = this.cast("first")
  @scala.inline
  def last: typings.parseFullName.parseFullNameStrings.last = this.cast("last")
  @scala.inline
  def middle: typings.parseFullName.parseFullNameStrings.middle = this.cast("middle")
  @scala.inline
  def nick: typings.parseFullName.parseFullNameStrings.nick = this.cast("nick")
  @scala.inline
  def suffix: typings.parseFullName.parseFullNameStrings.suffix = this.cast("suffix")
  @scala.inline
  def title: typings.parseFullName.parseFullNameStrings.title = this.cast("title")
}

