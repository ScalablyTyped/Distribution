package typings.pixiJs.global.PIXI

import typings.pixiJs.PIXI.IBitmapFontDataChar
import typings.pixiJs.PIXI.IBitmapFontDataCommon
import typings.pixiJs.PIXI.IBitmapFontDataInfo
import typings.pixiJs.PIXI.IBitmapFontDataKerning
import typings.pixiJs.PIXI.IBitmapFontDataPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normalized parsed data from .fnt files.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.BitmapFontData")
@js.native
class BitmapFontData ()
  extends StObject
     with typings.pixiJs.PIXI.BitmapFontData {
  
  /**
    * @member {PIXI.IBitmapFontDataChar[]} PIXI.BitmapFontData#char
    * @readOnly
    */
  /* CompleteClass */
  override val char: js.Array[IBitmapFontDataChar] = js.native
  
  /**
    * @member {PIXI.IBitmapFontDataCommon[]} PIXI.BitmapFontData#common
    * @readOnly
    */
  /* CompleteClass */
  override val common: js.Array[IBitmapFontDataCommon] = js.native
  
  /**
    * @member {PIXI.IBitmapFontDataInfo[]} PIXI.BitmapFontData#info
    * @readOnly
    */
  /* CompleteClass */
  override val info: js.Array[IBitmapFontDataInfo] = js.native
  
  /**
    * @member {PIXI.IBitmapFontDataKerning[]} PIXI.BitmapFontData#kerning
    * @readOnly
    */
  /* CompleteClass */
  override val kerning: js.Array[IBitmapFontDataKerning] = js.native
  
  /**
    * @member {PIXI.IBitmapFontDataPage[]} PIXI.BitmapFontData#page
    * @readOnly
    */
  /* CompleteClass */
  override val page: js.Array[IBitmapFontDataPage] = js.native
}
