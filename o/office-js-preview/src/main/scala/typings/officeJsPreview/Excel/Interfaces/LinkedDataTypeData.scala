package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import typings.officeJsPreview.officeJsPreviewStrings.OnLoad
import typings.officeJsPreview.officeJsPreviewStrings.Periodic
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `linkedDataType.toJSON()`. */
trait LinkedDataTypeData extends StObject {
  
  /**
    *
    * The name of the data provider for the linked data type. This may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dataProvider: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The local time-zone date and time since the workbook was opened when the linked data type was last refreshed.
    Returns `undefined` if the linked data type has not been refreshed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lastRefreshed: js.UndefOr[Date] = js.undefined
  
  /**
    *
    * The name of the linked data type. This may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The frequency, in seconds, at which the linked data type is refreshed if `refreshMode` is set to "Periodic".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var periodicRefreshInterval: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * The mechanism by which the data for the linked data type is retrieved.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshMode: js.UndefOr[LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic] = js.undefined
  
  /**
    *
    * The unique id of the linked data type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Returns an array with all the refresh modes supported by the linked data type. The contents of the array may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var supportedRefreshModes: js.UndefOr[js.Array[LinkedDataTypeRefreshMode]] = js.undefined
}
object LinkedDataTypeData {
  
  @scala.inline
  def apply(): LinkedDataTypeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeData]
  }
  
  @scala.inline
  implicit class LinkedDataTypeDataMutableBuilder[Self <: LinkedDataTypeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataProvider(value: String): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataProviderUndefined: Self = StObject.set(x, "dataProvider", js.undefined)
    
    @scala.inline
    def setLastRefreshed(value: Date): Self = StObject.set(x, "lastRefreshed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshedUndefined: Self = StObject.set(x, "lastRefreshed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPeriodicRefreshInterval(value: Double): Self = StObject.set(x, "periodicRefreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodicRefreshIntervalUndefined: Self = StObject.set(x, "periodicRefreshInterval", js.undefined)
    
    @scala.inline
    def setRefreshMode(value: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
    
    @scala.inline
    def setServiceId(value: Double): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    @scala.inline
    def setSupportedRefreshModes(value: js.Array[LinkedDataTypeRefreshMode]): Self = StObject.set(x, "supportedRefreshModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRefreshModesUndefined: Self = StObject.set(x, "supportedRefreshModes", js.undefined)
    
    @scala.inline
    def setSupportedRefreshModesVarargs(value: LinkedDataTypeRefreshMode*): Self = StObject.set(x, "supportedRefreshModes", js.Array(value :_*))
  }
}
