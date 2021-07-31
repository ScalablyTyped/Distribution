package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidMatrix extends StObject {
  
  /** Required. The ids of the set of Android device to be used. Use the TestEnvironmentDiscoveryService to get supported options. */
  var androidModelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The ids of the set of Android OS version to be used. Use the TestEnvironmentDiscoveryService to get supported options. */
  var androidVersionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The set of locales the test device will enable for testing. Use the TestEnvironmentDiscoveryService to get supported options. */
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The set of orientations to test with. Use the TestEnvironmentDiscoveryService to get supported options. */
  var orientations: js.UndefOr[js.Array[String]] = js.undefined
}
object AndroidMatrix {
  
  @scala.inline
  def apply(): AndroidMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidMatrix]
  }
  
  @scala.inline
  implicit class AndroidMatrixMutableBuilder[Self <: AndroidMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidModelIds(value: js.Array[String]): Self = StObject.set(x, "androidModelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidModelIdsUndefined: Self = StObject.set(x, "androidModelIds", js.undefined)
    
    @scala.inline
    def setAndroidModelIdsVarargs(value: String*): Self = StObject.set(x, "androidModelIds", js.Array(value :_*))
    
    @scala.inline
    def setAndroidVersionIds(value: js.Array[String]): Self = StObject.set(x, "androidVersionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidVersionIdsUndefined: Self = StObject.set(x, "androidVersionIds", js.undefined)
    
    @scala.inline
    def setAndroidVersionIdsVarargs(value: String*): Self = StObject.set(x, "androidVersionIds", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    @scala.inline
    def setOrientations(value: js.Array[String]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    @scala.inline
    def setOrientationsVarargs(value: String*): Self = StObject.set(x, "orientations", js.Array(value :_*))
  }
}
