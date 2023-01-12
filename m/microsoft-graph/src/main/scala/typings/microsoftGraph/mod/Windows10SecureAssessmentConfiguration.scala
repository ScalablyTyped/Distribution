package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Windows10SecureAssessmentConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Indicates whether or not to allow the app from printing during the test.
  var allowPrinting: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to allow screen capture capability during a test.
  var allowScreenCapture: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether or not to allow text suggestions during the test.
  var allowTextSuggestion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user),
    * an AAD account (username@tenant.com) or a local account (username).
    */
  var configurationAccount: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a
    * valid Url (http[s]://msdn.microsoft.com/).
    */
  var launchUri: js.UndefOr[NullableOption[String]] = js.undefined
}
object Windows10SecureAssessmentConfiguration {
  
  inline def apply(): Windows10SecureAssessmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10SecureAssessmentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Windows10SecureAssessmentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllowPrinting(value: Boolean): Self = StObject.set(x, "allowPrinting", value.asInstanceOf[js.Any])
    
    inline def setAllowPrintingUndefined: Self = StObject.set(x, "allowPrinting", js.undefined)
    
    inline def setAllowScreenCapture(value: Boolean): Self = StObject.set(x, "allowScreenCapture", value.asInstanceOf[js.Any])
    
    inline def setAllowScreenCaptureUndefined: Self = StObject.set(x, "allowScreenCapture", js.undefined)
    
    inline def setAllowTextSuggestion(value: Boolean): Self = StObject.set(x, "allowTextSuggestion", value.asInstanceOf[js.Any])
    
    inline def setAllowTextSuggestionUndefined: Self = StObject.set(x, "allowTextSuggestion", js.undefined)
    
    inline def setConfigurationAccount(value: NullableOption[String]): Self = StObject.set(x, "configurationAccount", value.asInstanceOf[js.Any])
    
    inline def setConfigurationAccountNull: Self = StObject.set(x, "configurationAccount", null)
    
    inline def setConfigurationAccountUndefined: Self = StObject.set(x, "configurationAccount", js.undefined)
    
    inline def setLaunchUri(value: NullableOption[String]): Self = StObject.set(x, "launchUri", value.asInstanceOf[js.Any])
    
    inline def setLaunchUriNull: Self = StObject.set(x, "launchUri", null)
    
    inline def setLaunchUriUndefined: Self = StObject.set(x, "launchUri", js.undefined)
  }
}
