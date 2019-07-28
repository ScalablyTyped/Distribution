package typings.noble

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Buffer
  var uuid: String
}

object Anon_Data {
  @scala.inline
  def apply(data: Buffer, uuid: String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, uuid = uuid)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

