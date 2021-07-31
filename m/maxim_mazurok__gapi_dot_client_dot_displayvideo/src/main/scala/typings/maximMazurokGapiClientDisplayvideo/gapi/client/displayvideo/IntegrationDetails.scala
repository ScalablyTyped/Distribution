package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegrationDetails extends StObject {
  
  /** Additional details of the entry in string format. Must be UTF-8 encoded with a length of no more than 1000 characters. */
  var details: js.UndefOr[String] = js.undefined
  
  /**
    * An external identifier to be associated with the entry. The integration code will show up together with the entry in many places in the system, for example, reporting. Must be UTF-8
    * encoded with a length of no more than 500 characters.
    */
  var integrationCode: js.UndefOr[String] = js.undefined
}
object IntegrationDetails {
  
  @scala.inline
  def apply(): IntegrationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationDetails]
  }
  
  @scala.inline
  implicit class IntegrationDetailsMutableBuilder[Self <: IntegrationDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setIntegrationCode(value: String): Self = StObject.set(x, "integrationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationCodeUndefined: Self = StObject.set(x, "integrationCode", js.undefined)
  }
}
