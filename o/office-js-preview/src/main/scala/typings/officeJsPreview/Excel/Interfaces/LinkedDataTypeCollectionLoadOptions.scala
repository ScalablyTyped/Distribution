package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of linked data types.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait LinkedDataTypeCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The name of the data provider for the linked data type. This may change when information is retrieved from the service.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dataProvider: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The local time-zone date and time since the workbook was opened when the linked data type was last refreshed.
    Returns `undefined` if the linked data type has not been refreshed.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lastRefreshed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The name of the linked data type. This may change when information is retrieved from the service.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The frequency, in seconds, at which the linked data type is refreshed if `refreshMode` is set to "Periodic".
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var periodicRefreshInterval: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The mechanism by which the data for the linked data type is retrieved.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The unique ID of the linked data type.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Returns an array with all the refresh modes supported by the linked data type. The contents of the array may change when information is retrieved from the service.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var supportedRefreshModes: js.UndefOr[Boolean] = js.undefined
}
object LinkedDataTypeCollectionLoadOptions {
  
  inline def apply(): LinkedDataTypeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeCollectionLoadOptions]
  }
  
  extension [Self <: LinkedDataTypeCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setDataProvider(value: Boolean): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
    
    inline def setDataProviderUndefined: Self = StObject.set(x, "dataProvider", js.undefined)
    
    inline def setLastRefreshed(value: Boolean): Self = StObject.set(x, "lastRefreshed", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshedUndefined: Self = StObject.set(x, "lastRefreshed", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeriodicRefreshInterval(value: Boolean): Self = StObject.set(x, "periodicRefreshInterval", value.asInstanceOf[js.Any])
    
    inline def setPeriodicRefreshIntervalUndefined: Self = StObject.set(x, "periodicRefreshInterval", js.undefined)
    
    inline def setRefreshMode(value: Boolean): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
    
    inline def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
    
    inline def setServiceId(value: Boolean): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    inline def setSupportedRefreshModes(value: Boolean): Self = StObject.set(x, "supportedRefreshModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedRefreshModesUndefined: Self = StObject.set(x, "supportedRefreshModes", js.undefined)
  }
}
