package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.LinkedDataTypeRefreshModeChanged
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import typings.officeJsPreview.officeJsPreviewStrings.OnLoad
import typings.officeJsPreview.officeJsPreviewStrings.Periodic
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about a newly added linked data type, such as source and ID.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait RefreshModeChangedEventArgs extends StObject {
  
  /**
    * The linked data type refresh mode.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshMode: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic
  
  /**
    * The unique ID of the object whose refresh mode was changed.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: Double
  
  /**
    * Gets the source of the event. See `Excel.EventSource` for details.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: LinkedDataTypeRefreshModeChanged
}
object RefreshModeChangedEventArgs {
  
  inline def apply(
    refreshMode: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic,
    serviceId: Double,
    source: EventSource | Local | Remote
  ): RefreshModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(refreshMode = refreshMode.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LinkedDataTypeRefreshModeChanged")
    __obj.asInstanceOf[RefreshModeChangedEventArgs]
  }
  
  extension [Self <: RefreshModeChangedEventArgs](x: Self) {
    
    inline def setRefreshMode(value: LinkedDataTypeRefreshMode | Unknown_ | Manual | OnLoad | Periodic): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: Double): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: LinkedDataTypeRefreshModeChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
