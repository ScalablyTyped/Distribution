package typings.nivoPie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Array[PieDatum]
}

object Data {
  @scala.inline
  def apply(data: js.Array[PieDatum]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

