package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFailureState extends js.Object {
  
  /** Details about the last failed update attempt. */
  var details: js.UndefOr[String] = js.native
  
  /** What the component configuration would have been if the update had succeeded. */
  var failedConfiguration: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.UpdateFailureState with TopLevel[js.Any]
  ] = js.native
  
  /** Time of the latest failed update attempt. */
  var lastUpdateAttempt: js.UndefOr[String] = js.native
}
object UpdateFailureState {
  
  @scala.inline
  def apply(): UpdateFailureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFailureState]
  }
  
  @scala.inline
  implicit class UpdateFailureStateOps[Self <: UpdateFailureState] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setFailedConfiguration(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.UpdateFailureState with TopLevel[js.Any]
    ): Self = this.set("failedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedConfiguration: Self = this.set("failedConfiguration", js.undefined)
    
    @scala.inline
    def setLastUpdateAttempt(value: String): Self = this.set("lastUpdateAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateAttempt: Self = this.set("lastUpdateAttempt", js.undefined)
  }
}
