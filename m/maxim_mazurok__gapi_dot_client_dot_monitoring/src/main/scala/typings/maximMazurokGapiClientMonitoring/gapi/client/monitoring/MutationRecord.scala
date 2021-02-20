package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutationRecord extends StObject {
  
  /** When the change occurred. */
  var mutateTime: js.UndefOr[String] = js.native
  
  /** The email address of the user making the change. */
  var mutatedBy: js.UndefOr[String] = js.native
}
object MutationRecord {
  
  @scala.inline
  def apply(): MutationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationRecord]
  }
  
  @scala.inline
  implicit class MutationRecordMutableBuilder[Self <: MutationRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMutateTime(value: String): Self = StObject.set(x, "mutateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutateTimeUndefined: Self = StObject.set(x, "mutateTime", js.undefined)
    
    @scala.inline
    def setMutatedBy(value: String): Self = StObject.set(x, "mutatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutatedByUndefined: Self = StObject.set(x, "mutatedBy", js.undefined)
  }
}
