package typings
package pinterestDashSdkLib.pinterestDashSdkMod.PDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinData extends js.Object {
  var board: java.lang.String
  var image_url: java.lang.String
  var link: java.lang.String
  var note: java.lang.String
}

object PinData {
  @scala.inline
  def apply(
    board: java.lang.String,
    image_url: java.lang.String,
    link: java.lang.String,
    note: java.lang.String
  ): PinData = {
    val __obj = js.Dynamic.literal(board = board, image_url = image_url, link = link, note = note)
  
    __obj.asInstanceOf[PinData]
  }
}

