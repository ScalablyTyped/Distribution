package typings.musicmetadata.MM

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Picture extends js.Object {
  var data: Buffer
  var format: String
}

object Picture {
  @scala.inline
  def apply(data: Buffer, format: String): Picture = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Picture]
  }
}

