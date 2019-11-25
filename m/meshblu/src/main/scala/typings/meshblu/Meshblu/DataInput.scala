package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataInput extends js.Object {
  var online: Boolean
  var uuid: String
  var x: Double
  var y: Double
}

object DataInput {
  @scala.inline
  def apply(online: Boolean, uuid: String, x: Double, y: Double): DataInput = {
    val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataInput]
  }
}

