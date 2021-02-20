package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchJobInstanceDetails extends StObject {
  
  /** The number of times the agent that the agent attempts to apply the patch. */
  var attemptCount: js.UndefOr[String] = js.native
  
  /** If the patch fails, this field provides the reason. */
  var failureReason: js.UndefOr[String] = js.native
  
  /** The unique identifier for the instance. This identifier is defined by the server. */
  var instanceSystemId: js.UndefOr[String] = js.native
  
  /** The instance name in the form `projects/∗/zones/∗/instances/ *` */
  var name: js.UndefOr[String] = js.native
  
  /** Current state of instance patch. */
  var state: js.UndefOr[String] = js.native
}
object PatchJobInstanceDetails {
  
  @scala.inline
  def apply(): PatchJobInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchJobInstanceDetails]
  }
  
  @scala.inline
  implicit class PatchJobInstanceDetailsMutableBuilder[Self <: PatchJobInstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptCount(value: String): Self = StObject.set(x, "attemptCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptCountUndefined: Self = StObject.set(x, "attemptCount", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setInstanceSystemId(value: String): Self = StObject.set(x, "instanceSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceSystemIdUndefined: Self = StObject.set(x, "instanceSystemId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
