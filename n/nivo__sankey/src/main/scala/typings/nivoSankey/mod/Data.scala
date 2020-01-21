package typings.nivoSankey.mod

import typings.nivoSankey.AnonLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: AnonLinks
}

object Data {
  @scala.inline
  def apply(data: AnonLinks): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

