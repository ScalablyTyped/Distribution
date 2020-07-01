package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Normalized parsed data from .fnt files.
  *
  * @class
  * @memberof PIXI
  */
trait BitmapFontData extends js.Object {
  /**
    * @member {PIXI.IBitmapFontDataChar[]} PIXI.BitmapFontData#char
    * @readOnly
    */
  val char: js.Array[IBitmapFontDataChar]
  /**
    * @member {PIXI.IBitmapFontDataCommon[]} PIXI.BitmapFontData#common
    * @readOnly
    */
  val common: js.Array[IBitmapFontDataCommon]
  /**
    * @member {PIXI.IBitmapFontDataInfo[]} PIXI.BitmapFontData#info
    * @readOnly
    */
  val info: js.Array[IBitmapFontDataInfo]
  /**
    * @member {PIXI.IBitmapFontDataKerning[]} PIXI.BitmapFontData#kerning
    * @readOnly
    */
  val kerning: js.Array[IBitmapFontDataKerning]
  /**
    * @member {PIXI.IBitmapFontDataPage[]} PIXI.BitmapFontData#page
    * @readOnly
    */
  val page: js.Array[IBitmapFontDataPage]
}

object BitmapFontData {
  @scala.inline
  def apply(
    char: js.Array[IBitmapFontDataChar],
    common: js.Array[IBitmapFontDataCommon],
    info: js.Array[IBitmapFontDataInfo],
    kerning: js.Array[IBitmapFontDataKerning],
    page: js.Array[IBitmapFontDataPage]
  ): BitmapFontData = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapFontData]
  }
}

