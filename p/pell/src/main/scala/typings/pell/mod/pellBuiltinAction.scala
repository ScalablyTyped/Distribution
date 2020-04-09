package typings.pell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pell.pellStrings.bold
  - typings.pell.pellStrings.italic
  - typings.pell.pellStrings.underline
  - typings.pell.pellStrings.strikethrough
  - typings.pell.pellStrings.heading1
  - typings.pell.pellStrings.heading2
  - typings.pell.pellStrings.paragraph
  - typings.pell.pellStrings.quote
  - typings.pell.pellStrings.olist
  - typings.pell.pellStrings.ulist
  - typings.pell.pellStrings.code
  - typings.pell.pellStrings.line
  - typings.pell.pellStrings.link
  - typings.pell.pellStrings.image
*/
trait pellBuiltinAction extends pellAction

object pellBuiltinAction {
  @scala.inline
  def bold: typings.pell.pellStrings.bold = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.pell.pellStrings.code = this.cast("code")
  @scala.inline
  def heading1: typings.pell.pellStrings.heading1 = this.cast("heading1")
  @scala.inline
  def heading2: typings.pell.pellStrings.heading2 = this.cast("heading2")
  @scala.inline
  def image: typings.pell.pellStrings.image = this.cast("image")
  @scala.inline
  def italic: typings.pell.pellStrings.italic = this.cast("italic")
  @scala.inline
  def line: typings.pell.pellStrings.line = this.cast("line")
  @scala.inline
  def link: typings.pell.pellStrings.link = this.cast("link")
  @scala.inline
  def olist: typings.pell.pellStrings.olist = this.cast("olist")
  @scala.inline
  def paragraph: typings.pell.pellStrings.paragraph = this.cast("paragraph")
  @scala.inline
  def quote: typings.pell.pellStrings.quote = this.cast("quote")
  @scala.inline
  def strikethrough: typings.pell.pellStrings.strikethrough = this.cast("strikethrough")
  @scala.inline
  def ulist: typings.pell.pellStrings.ulist = this.cast("ulist")
  @scala.inline
  def underline: typings.pell.pellStrings.underline = this.cast("underline")
}

