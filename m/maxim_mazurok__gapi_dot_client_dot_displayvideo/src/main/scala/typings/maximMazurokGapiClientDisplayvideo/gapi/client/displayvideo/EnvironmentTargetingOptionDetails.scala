package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentTargetingOptionDetails extends StObject {
  
  /** Output only. The serving environment. */
  var environment: js.UndefOr[String] = js.undefined
}
object EnvironmentTargetingOptionDetails {
  
  @scala.inline
  def apply(): EnvironmentTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class EnvironmentTargetingOptionDetailsMutableBuilder[Self <: EnvironmentTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
