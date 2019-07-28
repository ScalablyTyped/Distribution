package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadConcern extends js.Object {
  var level: ReadConcernLevel
}

object ReadConcern {
  @scala.inline
  def apply(level: ReadConcernLevel): ReadConcern = {
    val __obj = js.Dynamic.literal(level = level)
  
    __obj.asInstanceOf[ReadConcern]
  }
}

