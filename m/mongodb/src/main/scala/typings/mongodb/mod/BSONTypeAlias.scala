package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.number
  - typings.mongodb.mongodbStrings.double
  - typings.mongodb.mongodbStrings.string
  - typings.mongodb.mongodbStrings.`object`
  - typings.mongodb.mongodbStrings.array
  - typings.mongodb.mongodbStrings.binData
  - typings.mongodb.mongodbStrings.undefined
  - typings.mongodb.mongodbStrings.objectId
  - typings.mongodb.mongodbStrings.bool
  - typings.mongodb.mongodbStrings.date
  - typings.mongodb.mongodbStrings.`null`
  - typings.mongodb.mongodbStrings.regex
  - typings.mongodb.mongodbStrings.dbPointer
  - typings.mongodb.mongodbStrings.javascript
  - typings.mongodb.mongodbStrings.symbol
  - typings.mongodb.mongodbStrings.javascriptWithScope
  - typings.mongodb.mongodbStrings.int
  - typings.mongodb.mongodbStrings.timestamp
  - typings.mongodb.mongodbStrings.long
  - typings.mongodb.mongodbStrings.decimal
  - typings.mongodb.mongodbStrings.minKey
  - typings.mongodb.mongodbStrings.maxKey
*/
trait BSONTypeAlias extends js.Object

object BSONTypeAlias {
  @scala.inline
  def array: typings.mongodb.mongodbStrings.array = this.cast("array")
  @scala.inline
  def binData: typings.mongodb.mongodbStrings.binData = this.cast("binData")
  @scala.inline
  def bool: typings.mongodb.mongodbStrings.bool = this.cast("bool")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.mongodb.mongodbStrings.date = this.cast("date")
  @scala.inline
  def dbPointer: typings.mongodb.mongodbStrings.dbPointer = this.cast("dbPointer")
  @scala.inline
  def decimal: typings.mongodb.mongodbStrings.decimal = this.cast("decimal")
  @scala.inline
  def double: typings.mongodb.mongodbStrings.double = this.cast("double")
  @scala.inline
  def int: typings.mongodb.mongodbStrings.int = this.cast("int")
  @scala.inline
  def javascript: typings.mongodb.mongodbStrings.javascript = this.cast("javascript")
  @scala.inline
  def javascriptWithScope: typings.mongodb.mongodbStrings.javascriptWithScope = this.cast("javascriptWithScope")
  @scala.inline
  def long: typings.mongodb.mongodbStrings.long = this.cast("long")
  @scala.inline
  def maxKey: typings.mongodb.mongodbStrings.maxKey = this.cast("maxKey")
  @scala.inline
  def minKey: typings.mongodb.mongodbStrings.minKey = this.cast("minKey")
  @scala.inline
  def `null`: typings.mongodb.mongodbStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.mongodb.mongodbStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.mongodb.mongodbStrings.`object` = this.cast("object")
  @scala.inline
  def objectId: typings.mongodb.mongodbStrings.objectId = this.cast("objectId")
  @scala.inline
  def regex: typings.mongodb.mongodbStrings.regex = this.cast("regex")
  @scala.inline
  def string: typings.mongodb.mongodbStrings.string = this.cast("string")
  @scala.inline
  def symbol: typings.mongodb.mongodbStrings.symbol = this.cast("symbol")
  @scala.inline
  def timestamp: typings.mongodb.mongodbStrings.timestamp = this.cast("timestamp")
  @scala.inline
  def undefined: typings.mongodb.mongodbStrings.undefined = this.cast("undefined")
}

