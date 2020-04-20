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
  def nearest: typings.mongodb.mongodbStrings.nearest = "nearest".asInstanceOf[typings.mongodb.mongodbStrings.nearest]
  @scala.inline
  def primary: typings.mongodb.mongodbStrings.primary = "primary".asInstanceOf[typings.mongodb.mongodbStrings.primary]
  @scala.inline
  def primaryPreferred: typings.mongodb.mongodbStrings.primaryPreferred = "primaryPreferred".asInstanceOf[typings.mongodb.mongodbStrings.primaryPreferred]
  @scala.inline
  def secondary: typings.mongodb.mongodbStrings.secondary = "secondary".asInstanceOf[typings.mongodb.mongodbStrings.secondary]
  @scala.inline
  def secondaryPreferred: typings.mongodb.mongodbStrings.secondaryPreferred = "secondaryPreferred".asInstanceOf[typings.mongodb.mongodbStrings.secondaryPreferred]
}

