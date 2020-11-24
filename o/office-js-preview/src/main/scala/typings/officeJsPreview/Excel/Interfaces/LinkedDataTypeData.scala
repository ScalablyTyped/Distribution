package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.LinkedDataTypeRefreshMode
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import typings.officeJsPreview.officeJsPreviewStrings.OnLoad
import typings.officeJsPreview.officeJsPreviewStrings.Periodic
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `linkedDataType.toJSON()`. */
@js.native
trait LinkedDataTypeData extends js.Object {
  
  /**
    *
    * The name of the data provider for the linked data type. This may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dataProvider: js.UndefOr[String] = js.native
  
  /**
    *
    * The local time-zone date and time since the workbook was opened when the linked data type was last refreshed.
    Returns `undefined` if the linked data type has not been refreshed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var lastRefreshed: js.UndefOr[Date] = js.native
  
  /**
    *
    * The name of the linked data type. This may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * The frequency, in seconds, at which the linked data type is refreshed if `refreshMode` is set to "Periodic".
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var periodicRefreshInterval: js.UndefOr[Double] = js.native
  
  /**
    *
    * The mechanism by which the data for the linked data type is retrieved.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshMode: js.UndefOr[LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic] = js.native
  
  /**
    *
    * The unique id of the linked data type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: js.UndefOr[Double] = js.native
  
  /**
    *
    * Returns an array with all the refresh modes supported by the linked data type. The contents of the array may change when information is retrieved from the service.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var supportedRefreshModes: js.UndefOr[js.Array[LinkedDataTypeRefreshMode]] = js.native
}
object LinkedDataTypeData {
  
  @scala.inline
  def apply(): LinkedDataTypeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeData]
  }
  
  @scala.inline
  implicit class LinkedDataTypeDataOps[Self <: LinkedDataTypeData] (val x: Self) extends AnyVal {
    
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
    def setDataProvider(value: String): Self = this.set("dataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataProvider: Self = this.set("dataProvider", js.undefined)
    
    @scala.inline
    def setLastRefreshed(value: Date): Self = this.set("lastRefreshed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRefreshed: Self = this.set("lastRefreshed", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPeriodicRefreshInterval(value: Double): Self = this.set("periodicRefreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodicRefreshInterval: Self = this.set("periodicRefreshInterval", js.undefined)
    
    @scala.inline
    def setRefreshMode(value: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic): Self = this.set("refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshMode: Self = this.set("refreshMode", js.undefined)
    
    @scala.inline
    def setServiceId(value: Double): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
    
    @scala.inline
    def setSupportedRefreshModesVarargs(value: LinkedDataTypeRefreshMode*): Self = this.set("supportedRefreshModes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedRefreshModes(value: js.Array[LinkedDataTypeRefreshMode]): Self = this.set("supportedRefreshModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedRefreshModes: Self = this.set("supportedRefreshModes", js.undefined)
  }
}
