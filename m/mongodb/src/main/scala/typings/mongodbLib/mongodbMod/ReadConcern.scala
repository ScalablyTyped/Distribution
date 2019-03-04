package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadConcern extends js.Object {
  var level: mongodbLib.ReadConcernLevel
}

object ReadConcern {
  @scala.inline
  def apply(level: mongodbLib.ReadConcernLevel): ReadConcern = {
    val __obj = js.Dynamic.literal(level = level)
  
    __obj.asInstanceOf[ReadConcern]
  }
}

