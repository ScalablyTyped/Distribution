package typings.pixiTextBitmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/text-bitmap", "TextFormat")
@js.native
open class TextFormat () extends StObject
/* static members */
object TextFormat {
  
  @JSImport("@pixi/text-bitmap", "TextFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert text font data to a javascript object.
    * @param txt - Raw string data to be converted
    * @returns - Parsed font data
    */
  inline def parse(txt: String): BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(txt.asInstanceOf[js.Any]).asInstanceOf[BitmapFontData]
  
  /**
    * Check if resource refers to txt font data.
    * @param data
    * @returns - True if resource could be treated as font data, false otherwise.
    */
  inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
