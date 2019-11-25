package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.off
  - typings.mongodb.mongodbStrings.slow_only
  - typings.mongodb.mongodbStrings.all
*/
trait ProfilingLevel extends js.Object

object ProfilingLevel {
  @scala.inline
  def all: typings.mongodb.mongodbStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def off: typings.mongodb.mongodbStrings.off = this.cast("off")
  @scala.inline
  def slow_only: typings.mongodb.mongodbStrings.slow_only = this.cast("slow_only")
}

