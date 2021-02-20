package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidDevice extends StObject {
  
  /** Required. The id of the Android device to be used. Use the TestEnvironmentDiscoveryService to get supported options. */
  var androidModelId: js.UndefOr[String] = js.native
  
  /** Required. The id of the Android OS version to be used. Use the TestEnvironmentDiscoveryService to get supported options. */
  var androidVersionId: js.UndefOr[String] = js.native
  
  /** Required. The locale the test device used for testing. Use the TestEnvironmentDiscoveryService to get supported options. */
  var locale: js.UndefOr[String] = js.native
  
  /** Required. How the device is oriented during the test. Use the TestEnvironmentDiscoveryService to get supported options. */
  var orientation: js.UndefOr[String] = js.native
}
object AndroidDevice {
  
  @scala.inline
  def apply(): AndroidDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDevice]
  }
  
  @scala.inline
  implicit class AndroidDeviceMutableBuilder[Self <: AndroidDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidModelId(value: String): Self = StObject.set(x, "androidModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidModelIdUndefined: Self = StObject.set(x, "androidModelId", js.undefined)
    
    @scala.inline
    def setAndroidVersionId(value: String): Self = StObject.set(x, "androidVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidVersionIdUndefined: Self = StObject.set(x, "androidVersionId", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
