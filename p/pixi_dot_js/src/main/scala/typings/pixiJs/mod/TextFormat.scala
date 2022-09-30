package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "TextFormat")
@js.native
open class TextFormat ()
  extends typings.pixiTextBitmap.mod.TextFormat
/* static members */
object TextFormat {
  
  @JSImport("pixi.js", "TextFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert text font data to a javascript object.
    * @param txt - Raw string data to be converted
    * @returns - Parsed font data
    */
  inline def parse(txt: String): typings.pixiTextBitmap.mod.BitmapFontData = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(txt.asInstanceOf[js.Any]).asInstanceOf[typings.pixiTextBitmap.mod.BitmapFontData]
  
  /**
    * Check if resource refers to txt font data.
    * @param data
    * @returns - True if resource could be treated as font data, false otherwise.
    */
  inline def test(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
