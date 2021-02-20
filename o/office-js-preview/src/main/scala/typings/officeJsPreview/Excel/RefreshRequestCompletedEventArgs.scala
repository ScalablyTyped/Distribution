package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.LinkedDataTypeRefreshRequestCompleted
import typings.officeJsPreview.officeJsPreviewStrings.Local
import typings.officeJsPreview.officeJsPreviewStrings.Remote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * The argument that is passed to the event handler upon completion of refresh request to an external service or link.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait RefreshRequestCompletedEventArgs extends StObject {
  
  /**
    *
    * Indicates if the request to refresh was successful.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshed: Boolean = js.native
  
  /**
    *
    * The unique id of the object whose refresh request was completed.
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
  var `type`: LinkedDataTypeRefreshRequestCompleted = js.native
  
  /**
    *
    * An array that contains any warnings generated from the refresh request.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var warnings: js.UndefOr[js.Array[String]] = js.native
}
object RefreshRequestCompletedEventArgs {
  
  @scala.inline
  def apply(
    refreshed: Boolean,
    serviceId: Double,
    source: EventSource | Local | Remote,
    `type`: LinkedDataTypeRefreshRequestCompleted
  ): RefreshRequestCompletedEventArgs = {
    val __obj = js.Dynamic.literal(refreshed = refreshed.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshRequestCompletedEventArgs]
  }
  
  @scala.inline
  implicit class RefreshRequestCompletedEventArgsMutableBuilder[Self <: RefreshRequestCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshed(value: Boolean): Self = StObject.set(x, "refreshed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: Double): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource | Local | Remote): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LinkedDataTypeRefreshRequestCompleted): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
