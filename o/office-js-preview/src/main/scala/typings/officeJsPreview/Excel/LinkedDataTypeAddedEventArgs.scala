package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.LinkedDataTypeLinkedDataTypeAdded
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The argument that is passed to the event handler after a new linked data type is added to the workbook.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait LinkedDataTypeAddedEventArgs extends StObject {
  
  /**
    * The unique ID of the new linked data type.
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
  var `type`: LinkedDataTypeLinkedDataTypeAdded
}
object LinkedDataTypeAddedEventArgs {
  
  inline def apply(serviceId: Double, source: EventSource | Local | Remote): LinkedDataTypeAddedEventArgs = {
    val __obj = js.Dynamic.literal(serviceId = serviceId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LinkedDataTypeLinkedDataTypeAdded")
    __obj.asInstanceOf[LinkedDataTypeAddedEventArgs]
  }
  
  extension [Self <: LinkedDataTypeAddedEventArgs](x: Self) {
    
    inline def setServiceId(value: Double): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: LinkedDataTypeLinkedDataTypeAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
