package typings.pinterestDashSdk.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinData extends js.Object {
  var board: String
  var image_url: String
  var link: String
  var note: String
}

object PinData {
  @scala.inline
  def apply(board: String, image_url: String, link: String, note: String): PinData = {
    val __obj = js.Dynamic.literal(board = board, image_url = image_url, link = link, note = note)
  
    __obj.asInstanceOf[PinData]
  }
}

