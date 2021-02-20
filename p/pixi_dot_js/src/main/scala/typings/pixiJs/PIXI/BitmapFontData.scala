package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normalized parsed data from .fnt files.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait BitmapFontData extends StObject {
  
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
  implicit class BitmapFontDataMutableBuilder[Self <: BitmapFontData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChar(value: js.Array[IBitmapFontDataChar]): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharVarargs(value: IBitmapFontDataChar*): Self = StObject.set(x, "char", js.Array(value :_*))
    
    @scala.inline
    def setCommon(value: js.Array[IBitmapFontDataCommon]): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonVarargs(value: IBitmapFontDataCommon*): Self = StObject.set(x, "common", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: js.Array[IBitmapFontDataInfo]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoVarargs(value: IBitmapFontDataInfo*): Self = StObject.set(x, "info", js.Array(value :_*))
    
    @scala.inline
    def setKerning(value: js.Array[IBitmapFontDataKerning]): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningVarargs(value: IBitmapFontDataKerning*): Self = StObject.set(x, "kerning", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: js.Array[IBitmapFontDataPage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageVarargs(value: IBitmapFontDataPage*): Self = StObject.set(x, "page", js.Array(value :_*))
  }
}
