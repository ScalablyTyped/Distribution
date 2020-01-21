package typings.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodal.nodalStrings.serial
  - typings.nodal.nodalStrings.int
  - typings.nodal.nodalStrings.currency
  - typings.nodal.nodalStrings.float
  - typings.nodal.nodalStrings.string
  - typings.nodal.nodalStrings.text
  - typings.nodal.nodalStrings.datetime
  - typings.nodal.nodalStrings.boolean
  - typings.nodal.nodalStrings.json
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def boolean: typings.nodal.nodalStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currency: typings.nodal.nodalStrings.currency = this.cast("currency")
  @scala.inline
  def datetime: typings.nodal.nodalStrings.datetime = this.cast("datetime")
  @scala.inline
  def float: typings.nodal.nodalStrings.float = this.cast("float")
  @scala.inline
  def int: typings.nodal.nodalStrings.int = this.cast("int")
  @scala.inline
  def json: typings.nodal.nodalStrings.json = this.cast("json")
  @scala.inline
  def serial: typings.nodal.nodalStrings.serial = this.cast("serial")
  @scala.inline
  def string: typings.nodal.nodalStrings.string = this.cast("string")
  @scala.inline
  def text: typings.nodal.nodalStrings.text = this.cast("text")
}

