package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.insert
  - typings.mongodb.mongodbStrings.delete
  - typings.mongodb.mongodbStrings.replace
  - typings.mongodb.mongodbStrings.update
  - typings.mongodb.mongodbStrings.drop
  - typings.mongodb.mongodbStrings.rename
  - typings.mongodb.mongodbStrings.dropDatabase
  - typings.mongodb.mongodbStrings.invalidate
*/
trait ChangeEventTypes extends js.Object

object ChangeEventTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.mongodb.mongodbStrings.delete = this.cast("delete")
  @scala.inline
  def drop: typings.mongodb.mongodbStrings.drop = this.cast("drop")
  @scala.inline
  def dropDatabase: typings.mongodb.mongodbStrings.dropDatabase = this.cast("dropDatabase")
  @scala.inline
  def insert: typings.mongodb.mongodbStrings.insert = this.cast("insert")
  @scala.inline
  def invalidate: typings.mongodb.mongodbStrings.invalidate = this.cast("invalidate")
  @scala.inline
  def rename: typings.mongodb.mongodbStrings.rename = this.cast("rename")
  @scala.inline
  def replace: typings.mongodb.mongodbStrings.replace = this.cast("replace")
  @scala.inline
  def update: typings.mongodb.mongodbStrings.update = this.cast("update")
}

