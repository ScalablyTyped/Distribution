package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataCommon
  * @property {number} lineHeight
  */
trait IBitmapFontDataCommon extends StObject {
  
  var lineHeight: Double
}
object IBitmapFontDataCommon {
  
  @scala.inline
  def apply(lineHeight: Double): IBitmapFontDataCommon = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataCommon]
  }
  
  @scala.inline
  implicit class IBitmapFontDataCommonMutableBuilder[Self <: IBitmapFontDataCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
