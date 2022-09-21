package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosTestLoop extends StObject {
  
  /** Output only. The bundle id for the application under test. */
  var appBundleId: js.UndefOr[String] = js.undefined
  
  /** Required. The .ipa of the application to test. */
  var appIpa: js.UndefOr[FileReference] = js.undefined
  
  /** The list of scenarios that should be run during the test. Defaults to the single scenario 0 if unspecified. */
  var scenarios: js.UndefOr[js.Array[Double]] = js.undefined
}
object IosTestLoop {
  
  inline def apply(): IosTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTestLoop]
  }
  
  extension [Self <: IosTestLoop](x: Self) {
    
    inline def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
    
    inline def setAppBundleIdUndefined: Self = StObject.set(x, "appBundleId", js.undefined)
    
    inline def setAppIpa(value: FileReference): Self = StObject.set(x, "appIpa", value.asInstanceOf[js.Any])
    
    inline def setAppIpaUndefined: Self = StObject.set(x, "appIpa", js.undefined)
    
    inline def setScenarios(value: js.Array[Double]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    inline def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
    
    inline def setScenariosVarargs(value: Double*): Self = StObject.set(x, "scenarios", js.Array(value*))
  }
}
