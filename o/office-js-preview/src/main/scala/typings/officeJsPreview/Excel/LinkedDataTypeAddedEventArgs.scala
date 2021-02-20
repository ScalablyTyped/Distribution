package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.LinkedDataTypeLinkedDataTypeAdded
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * The argument that is passed to the event handler after a new linked data type is added to the workbook.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait LinkedDataTypeAddedEventArgs extends StObject {
  
  /**
    *
    * The unique id of the new linked data type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var serviceId: Double = js.native
  
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var source: EventSource | Local | Remote = js.native
  
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: LinkedDataTypeLinkedDataTypeAdded = js.native
}
object LinkedDataTypeAddedEventArgs {
  
  @scala.inline
  def apply(serviceId: Double, source: EventSource | Local | Remote, `type`: LinkedDataTypeLinkedDataTypeAdded): LinkedDataTypeAddedEventArgs = {
    val __obj = js.Dynamic.literal(serviceId = serviceId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedDataTypeAddedEventArgs]
  }
  
  @scala.inline
  implicit class LinkedDataTypeAddedEventArgsMutableBuilder[Self <: LinkedDataTypeAddedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceId(value: Double): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LinkedDataTypeLinkedDataTypeAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
