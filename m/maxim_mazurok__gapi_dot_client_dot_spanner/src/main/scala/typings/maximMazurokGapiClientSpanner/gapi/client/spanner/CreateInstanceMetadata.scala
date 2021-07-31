package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceMetadata extends StObject {
  
  /** The time at which this operation was cancelled. If set, this operation is in the process of undoing itself (which is guaranteed to succeed) and cannot be cancelled again. */
  var cancelTime: js.UndefOr[String] = js.undefined
  
  /** The time at which this operation failed or was completed successfully. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The instance being created. */
  var instance: js.UndefOr[Instance] = js.undefined
  
  /** The time at which the CreateInstance request was received. */
  var startTime: js.UndefOr[String] = js.undefined
}
object CreateInstanceMetadata {
  
  @scala.inline
  def apply(): CreateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceMetadata]
  }
  
  @scala.inline
  implicit class CreateInstanceMetadataMutableBuilder[Self <: CreateInstanceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelTime(value: String): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
