package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a linked data type.
  A linked data type is a data type connected to an online data source.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait LinkedDataTypeLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The name of the data provider for the linked data type. This may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dataProvider: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns the code point for the font icon to be used in the data type options pane.
    1st-party only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var fontIconCodePoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The local time-zone date and time since the workbook was opened when the linked data type was last refreshed.
    Returns `undefined` if the linked data type has not been refreshed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lastRefreshed: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The name of the linked data type. This may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The frequency, in seconds, at which the linked data type is refreshed if `refreshMode` is set to "Periodic".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var periodicRefreshInterval: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns any warnings encountered after an attempt to load refresh data for this linked data type from the workbook.
    1st-party only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshDataLoadWarnings: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The mechanism by which the data for the linked data type is retrieved.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The unique id of the linked data type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Returns an array with all the refresh modes supported by the linked data type. The contents of the array may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var supportedRefreshModes: js.UndefOr[Boolean] = js.undefined
}
object LinkedDataTypeLoadOptions {
  
  @scala.inline
  def apply(): LinkedDataTypeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeLoadOptions]
  }
  
  @scala.inline
  implicit class LinkedDataTypeLoadOptionsMutableBuilder[Self <: LinkedDataTypeLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setDataProvider(value: Boolean): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataProviderUndefined: Self = StObject.set(x, "dataProvider", js.undefined)
    
    @scala.inline
    def setFontIconCodePoint(value: Boolean): Self = StObject.set(x, "fontIconCodePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontIconCodePointUndefined: Self = StObject.set(x, "fontIconCodePoint", js.undefined)
    
    @scala.inline
    def setLastRefreshed(value: Boolean): Self = StObject.set(x, "lastRefreshed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshedUndefined: Self = StObject.set(x, "lastRefreshed", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPeriodicRefreshInterval(value: Boolean): Self = StObject.set(x, "periodicRefreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodicRefreshIntervalUndefined: Self = StObject.set(x, "periodicRefreshInterval", js.undefined)
    
    @scala.inline
    def setRefreshDataLoadWarnings(value: Boolean): Self = StObject.set(x, "refreshDataLoadWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshDataLoadWarningsUndefined: Self = StObject.set(x, "refreshDataLoadWarnings", js.undefined)
    
    @scala.inline
    def setRefreshMode(value: Boolean): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
    
    @scala.inline
    def setServiceId(value: Boolean): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    @scala.inline
    def setSupportedRefreshModes(value: Boolean): Self = StObject.set(x, "supportedRefreshModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRefreshModesUndefined: Self = StObject.set(x, "supportedRefreshModes", js.undefined)
  }
}
