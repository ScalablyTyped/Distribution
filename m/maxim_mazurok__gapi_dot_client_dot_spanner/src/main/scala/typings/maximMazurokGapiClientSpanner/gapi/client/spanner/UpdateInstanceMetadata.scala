package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInstanceMetadata extends StObject {
  
  /** The time at which this operation was cancelled. If set, this operation is in the process of undoing itself (which is guaranteed to succeed) and cannot be cancelled again. */
  var cancelTime: js.UndefOr[String] = js.native
  
  /** The time at which this operation failed or was completed successfully. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The desired end state of the update. */
  var instance: js.UndefOr[Instance] = js.native
  
  /** The time at which UpdateInstance request was received. */
  var startTime: js.UndefOr[String] = js.native
}
object UpdateInstanceMetadata {
  
  @scala.inline
  def apply(): UpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceMetadata]
  }
  
  @scala.inline
  implicit class UpdateInstanceMetadataMutableBuilder[Self <: UpdateInstanceMetadata] (val x: Self) extends AnyVal {
    
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
