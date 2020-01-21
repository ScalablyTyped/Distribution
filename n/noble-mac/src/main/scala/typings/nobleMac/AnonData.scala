package typings.nobleMac

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: Buffer
  var uuid: String
}

object AnonData {
  @scala.inline
  def apply(data: Buffer, uuid: String): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

