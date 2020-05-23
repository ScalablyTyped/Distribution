package typings.nobleMac.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Buffer
  var uuid: String
}

object Data {
  @scala.inline
  def apply(data: Buffer, uuid: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

