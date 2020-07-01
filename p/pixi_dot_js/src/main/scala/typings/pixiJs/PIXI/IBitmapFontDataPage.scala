package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataPage
  * @property {number} id
  * @property {string} file
  */
trait IBitmapFontDataPage extends js.Object {
  var file: String
  var id: Double
}

object IBitmapFontDataPage {
  @scala.inline
  def apply(file: String, id: Double): IBitmapFontDataPage = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataPage]
  }
}

