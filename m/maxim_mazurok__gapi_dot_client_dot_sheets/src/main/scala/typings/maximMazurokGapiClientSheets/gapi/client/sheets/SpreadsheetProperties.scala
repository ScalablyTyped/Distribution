package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetProperties extends StObject {
  
  /** The amount of time to wait before volatile functions are recalculated. */
  var autoRecalc: js.UndefOr[String] = js.undefined
  
  /** The default format of all cells in the spreadsheet. CellData.effectiveFormat will not be set if the cell's format is equal to this default format. This field is read-only. */
  var defaultFormat: js.UndefOr[CellFormat] = js.undefined
  
  /** Determines whether and how circular references are resolved with iterative calculation. Absence of this field means that circular references result in calculation errors. */
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSettings] = js.undefined
  
  /**
    * The locale of the spreadsheet in one of the following formats: * an ISO 639-1 language code such as `en` * an ISO 639-2 language code such as `fil`, if no 639-1 code exists * a
    * combination of the ISO language code and country code, such as `en_US` Note: when updating this field, not all locales/languages are supported.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /** Theme applied to the spreadsheet. */
  var spreadsheetTheme: js.UndefOr[SpreadsheetTheme] = js.undefined
  
  /** The time zone of the spreadsheet, in CLDR format such as `America/New_York`. If the time zone isn't recognized, this may be a custom time zone such as `GMT-07:00`. */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /** The title of the spreadsheet. */
  var title: js.UndefOr[String] = js.undefined
}
object SpreadsheetProperties {
  
  @scala.inline
  def apply(): SpreadsheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetProperties]
  }
  
  @scala.inline
  implicit class SpreadsheetPropertiesMutableBuilder[Self <: SpreadsheetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRecalc(value: String): Self = StObject.set(x, "autoRecalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRecalcUndefined: Self = StObject.set(x, "autoRecalc", js.undefined)
    
    @scala.inline
    def setDefaultFormat(value: CellFormat): Self = StObject.set(x, "defaultFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFormatUndefined: Self = StObject.set(x, "defaultFormat", js.undefined)
    
    @scala.inline
    def setIterativeCalculationSettings(value: IterativeCalculationSettings): Self = StObject.set(x, "iterativeCalculationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterativeCalculationSettingsUndefined: Self = StObject.set(x, "iterativeCalculationSettings", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setSpreadsheetTheme(value: SpreadsheetTheme): Self = StObject.set(x, "spreadsheetTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetThemeUndefined: Self = StObject.set(x, "spreadsheetTheme", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
