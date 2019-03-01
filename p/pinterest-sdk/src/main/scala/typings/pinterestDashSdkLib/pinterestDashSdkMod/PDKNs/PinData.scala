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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("board")(board)
    __obj.updateDynamic("image_url")(image_url)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[PinData]
  }
}

