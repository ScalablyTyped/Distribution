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
@js.native
trait BitmapFontData extends js.Object {
  /**
    * @member {PIXI.IBitmapFontDataChar[]} PIXI.BitmapFontData#char
    * @readOnly
    */
  val char: js.Array[IBitmapFontDataChar] = js.native
  /**
    * @member {PIXI.IBitmapFontDataCommon[]} PIXI.BitmapFontData#common
    * @readOnly
    */
  val common: js.Array[IBitmapFontDataCommon] = js.native
  /**
    * @member {PIXI.IBitmapFontDataInfo[]} PIXI.BitmapFontData#info
    * @readOnly
    */
  val info: js.Array[IBitmapFontDataInfo] = js.native
  /**
    * @member {PIXI.IBitmapFontDataKerning[]} PIXI.BitmapFontData#kerning
    * @readOnly
    */
  val kerning: js.Array[IBitmapFontDataKerning] = js.native
  /**
    * @member {PIXI.IBitmapFontDataPage[]} PIXI.BitmapFontData#page
    * @readOnly
    */
  val page: js.Array[IBitmapFontDataPage] = js.native
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
  @scala.inline
  implicit class BitmapFontDataOps[Self <: BitmapFontData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharVarargs(value: IBitmapFontDataChar*): Self = this.set("char", js.Array(value :_*))
    @scala.inline
    def setChar(value: js.Array[IBitmapFontDataChar]): Self = this.set("char", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommonVarargs(value: IBitmapFontDataCommon*): Self = this.set("common", js.Array(value :_*))
    @scala.inline
    def setCommon(value: js.Array[IBitmapFontDataCommon]): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoVarargs(value: IBitmapFontDataInfo*): Self = this.set("info", js.Array(value :_*))
    @scala.inline
    def setInfo(value: js.Array[IBitmapFontDataInfo]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setKerningVarargs(value: IBitmapFontDataKerning*): Self = this.set("kerning", js.Array(value :_*))
    @scala.inline
    def setKerning(value: js.Array[IBitmapFontDataKerning]): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageVarargs(value: IBitmapFontDataPage*): Self = this.set("page", js.Array(value :_*))
    @scala.inline
    def setPage(value: js.Array[IBitmapFontDataPage]): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}

