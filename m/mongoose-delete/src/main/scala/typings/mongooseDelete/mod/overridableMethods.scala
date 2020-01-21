package typings.mongooseDelete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongooseDelete.mongooseDeleteStrings.count
  - typings.mongooseDelete.mongooseDeleteStrings.countDocuments
  - typings.mongooseDelete.mongooseDeleteStrings.find
  - typings.mongooseDelete.mongooseDeleteStrings.findOne
  - typings.mongooseDelete.mongooseDeleteStrings.findOneAndUpdate
  - typings.mongooseDelete.mongooseDeleteStrings.update
*/
trait overridableMethods extends js.Object

object overridableMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typings.mongooseDelete.mongooseDeleteStrings.count = this.cast("count")
  @scala.inline
  def countDocuments: typings.mongooseDelete.mongooseDeleteStrings.countDocuments = this.cast("countDocuments")
  @scala.inline
  def find: typings.mongooseDelete.mongooseDeleteStrings.find = this.cast("find")
  @scala.inline
  def findOne: typings.mongooseDelete.mongooseDeleteStrings.findOne = this.cast("findOne")
  @scala.inline
  def findOneAndUpdate: typings.mongooseDelete.mongooseDeleteStrings.findOneAndUpdate = this.cast("findOneAndUpdate")
  @scala.inline
  def update: typings.mongooseDelete.mongooseDeleteStrings.update = this.cast("update")
}

