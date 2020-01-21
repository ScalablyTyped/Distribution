package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.primary
  - typings.mongodb.mongodbStrings.primaryPreferred
  - typings.mongodb.mongodbStrings.secondary
  - typings.mongodb.mongodbStrings.secondaryPreferred
  - typings.mongodb.mongodbStrings.nearest
*/
trait ReadPreferenceMode extends ReadPreferenceOrMode

object ReadPreferenceMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nearest: typings.mongodb.mongodbStrings.nearest = this.cast("nearest")
  @scala.inline
  def primary: typings.mongodb.mongodbStrings.primary = this.cast("primary")
  @scala.inline
  def primaryPreferred: typings.mongodb.mongodbStrings.primaryPreferred = this.cast("primaryPreferred")
  @scala.inline
  def secondary: typings.mongodb.mongodbStrings.secondary = this.cast("secondary")
  @scala.inline
  def secondaryPreferred: typings.mongodb.mongodbStrings.secondaryPreferred = this.cast("secondaryPreferred")
}

