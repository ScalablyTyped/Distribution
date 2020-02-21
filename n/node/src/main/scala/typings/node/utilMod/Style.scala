package typings.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.special
  - typings.node.nodeStrings.number
  - typings.node.nodeStrings.bigint
  - typings.node.nodeStrings.boolean
  - typings.node.nodeStrings.undefined
  - typings.node.nodeStrings.`null`
  - typings.node.nodeStrings.string
  - typings.node.nodeStrings.symbol
  - typings.node.nodeStrings.date
  - typings.node.nodeStrings.regexp
  - typings.node.nodeStrings.module
*/
trait Style extends js.Object

object Style {
  @scala.inline
  def bigint: typings.node.nodeStrings.bigint = this.cast("bigint")
  @scala.inline
  def boolean: typings.node.nodeStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.node.nodeStrings.date = this.cast("date")
  @scala.inline
  def module: typings.node.nodeStrings.module = this.cast("module")
  @scala.inline
  def `null`: typings.node.nodeStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.node.nodeStrings.number = this.cast("number")
  @scala.inline
  def regexp: typings.node.nodeStrings.regexp = this.cast("regexp")
  @scala.inline
  def special: typings.node.nodeStrings.special = this.cast("special")
  @scala.inline
  def string: typings.node.nodeStrings.string = this.cast("string")
  @scala.inline
  def symbol: typings.node.nodeStrings.symbol = this.cast("symbol")
  @scala.inline
  def undefined: typings.node.nodeStrings.undefined = this.cast("undefined")
}

