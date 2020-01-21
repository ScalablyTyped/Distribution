package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://mongodb.github.io/node-mongodb-native/3.1/api/global.html#ReadConcern
/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.local
  - typings.mongodb.mongodbStrings.available
  - typings.mongodb.mongodbStrings.majority
  - typings.mongodb.mongodbStrings.linearizable
  - typings.mongodb.mongodbStrings.snapshot
*/
trait ReadConcernLevel extends js.Object

object ReadConcernLevel {
  @scala.inline
  def available: typings.mongodb.mongodbStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linearizable: typings.mongodb.mongodbStrings.linearizable = this.cast("linearizable")
  @scala.inline
  def local: typings.mongodb.mongodbStrings.local = this.cast("local")
  @scala.inline
  def majority: typings.mongodb.mongodbStrings.majority = this.cast("majority")
  @scala.inline
  def snapshot: typings.mongodb.mongodbStrings.snapshot = this.cast("snapshot")
}

