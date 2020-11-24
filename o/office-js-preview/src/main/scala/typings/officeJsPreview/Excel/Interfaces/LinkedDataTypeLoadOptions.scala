package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a linked data type.
  A linked data type is a data type connected to an online data source.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait LinkedDataTypeLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The name of the data provider for the linked data type. This may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dataProvider: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns the code point for the font icon to be used in the data type options pane.
    1st-party only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var fontIconCodePoint: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The local time-zone date and time since the workbook was opened when the linked data type was last refreshed.
    Returns `undefined` if the linked data type has not been refreshed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lastRefreshed: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The name of the linked data type. This may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The frequency, in seconds, at which the linked data type is refreshed if `refreshMode` is set to "Periodic".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var periodicRefreshInterval: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns any warnings encountered after an attempt to load refresh data for this linked data type from the workbook.
    1st-party only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshDataLoadWarnings: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The mechanism by which the data for the linked data type is retrieved.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshMode: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The unique id of the linked data type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Returns an array with all the refresh modes supported by the linked data type. The contents of the array may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var supportedRefreshModes: js.UndefOr[Boolean] = js.native
}
object LinkedDataTypeLoadOptions {
  
  @scala.inline
  def apply(): LinkedDataTypeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeLoadOptions]
  }
  
  @scala.inline
  implicit class LinkedDataTypeLoadOptionsOps[Self <: LinkedDataTypeLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setDataProvider(value: Boolean): Self = this.set("dataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataProvider: Self = this.set("dataProvider", js.undefined)
    
    @scala.inline
    def setFontIconCodePoint(value: Boolean): Self = this.set("fontIconCodePoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontIconCodePoint: Self = this.set("fontIconCodePoint", js.undefined)
    
    @scala.inline
    def setLastRefreshed(value: Boolean): Self = this.set("lastRefreshed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRefreshed: Self = this.set("lastRefreshed", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPeriodicRefreshInterval(value: Boolean): Self = this.set("periodicRefreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodicRefreshInterval: Self = this.set("periodicRefreshInterval", js.undefined)
    
    @scala.inline
    def setRefreshDataLoadWarnings(value: Boolean): Self = this.set("refreshDataLoadWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshDataLoadWarnings: Self = this.set("refreshDataLoadWarnings", js.undefined)
    
    @scala.inline
    def setRefreshMode(value: Boolean): Self = this.set("refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshMode: Self = this.set("refreshMode", js.undefined)
    
    @scala.inline
    def setServiceId(value: Boolean): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
    
    @scala.inline
    def setSupportedRefreshModes(value: Boolean): Self = this.set("supportedRefreshModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedRefreshModes: Self = this.set("supportedRefreshModes", js.undefined)
  }
}
