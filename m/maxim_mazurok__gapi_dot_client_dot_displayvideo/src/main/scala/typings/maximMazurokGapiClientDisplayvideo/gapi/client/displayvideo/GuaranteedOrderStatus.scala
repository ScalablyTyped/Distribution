package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuaranteedOrderStatus extends StObject {
  
  /**
    * Output only. The configuration status of the guaranteed order. Acceptable values are `PENDING` and `COMPLETED`. A guaranteed order must be configured (fill in the required fields,
    * choose creatives, and select a default campaign) before it can serve. Currently the configuration action can only be performed via UI.
    */
  var configStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The user-provided reason for pausing this guaranteed order. Must be UTF-8 encoded with a maximum length of 100 bytes. Only applicable when entity_status is set to
    * `ENTITY_STATUS_PAUSED`.
    */
  var entityPauseReason: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not the guaranteed order is servable. Acceptable values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_ARCHIVED`, and `ENTITY_STATUS_PAUSED`. Default value is
    * `ENTITY_STATUS_ACTIVE`.
    */
  var entityStatus: js.UndefOr[String] = js.undefined
}
object GuaranteedOrderStatus {
  
  inline def apply(): GuaranteedOrderStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuaranteedOrderStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuaranteedOrderStatus] (val x: Self) extends AnyVal {
    
    inline def setConfigStatus(value: String): Self = StObject.set(x, "configStatus", value.asInstanceOf[js.Any])
    
    inline def setConfigStatusUndefined: Self = StObject.set(x, "configStatus", js.undefined)
    
    inline def setEntityPauseReason(value: String): Self = StObject.set(x, "entityPauseReason", value.asInstanceOf[js.Any])
    
    inline def setEntityPauseReasonUndefined: Self = StObject.set(x, "entityPauseReason", js.undefined)
    
    inline def setEntityStatus(value: String): Self = StObject.set(x, "entityStatus", value.asInstanceOf[js.Any])
    
    inline def setEntityStatusUndefined: Self = StObject.set(x, "entityStatus", js.undefined)
  }
}
