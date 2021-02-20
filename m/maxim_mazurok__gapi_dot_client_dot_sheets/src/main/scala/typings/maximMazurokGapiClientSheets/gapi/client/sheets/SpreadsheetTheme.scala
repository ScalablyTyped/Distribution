package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetTheme extends StObject {
  
  /** Name of the primary font family. */
  var primaryFontFamily: js.UndefOr[String] = js.native
  
  /** The spreadsheet theme color pairs. To update you must provide all theme color pairs. */
  var themeColors: js.UndefOr[js.Array[ThemeColorPair]] = js.native
}
object SpreadsheetTheme {
  
  @scala.inline
  def apply(): SpreadsheetTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetTheme]
  }
  
  @scala.inline
  implicit class SpreadsheetThemeMutableBuilder[Self <: SpreadsheetTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimaryFontFamily(value: String): Self = StObject.set(x, "primaryFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryFontFamilyUndefined: Self = StObject.set(x, "primaryFontFamily", js.undefined)
    
    @scala.inline
    def setThemeColors(value: js.Array[ThemeColorPair]): Self = StObject.set(x, "themeColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorsUndefined: Self = StObject.set(x, "themeColors", js.undefined)
    
    @scala.inline
    def setThemeColorsVarargs(value: ThemeColorPair*): Self = StObject.set(x, "themeColors", js.Array(value :_*))
  }
}
