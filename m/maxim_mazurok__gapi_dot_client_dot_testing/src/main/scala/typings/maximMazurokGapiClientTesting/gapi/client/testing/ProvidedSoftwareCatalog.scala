package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvidedSoftwareCatalog extends StObject {
  
  /**
    * A string representing the current version of AndroidX Test Orchestrator that is used in the environment. The package is available at
    * https://maven.google.com/web/index.html#androidx.test:orchestrator.
    */
  var androidxOrchestratorVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated: Use AndroidX Test Orchestrator going forward. A string representing the current version of Android Test Orchestrator that is used in the environment. The package is
    * available at https://maven.google.com/web/index.html#com.android.support.test:orchestrator.
    */
  var orchestratorVersion: js.UndefOr[String] = js.undefined
}
object ProvidedSoftwareCatalog {
  
  inline def apply(): ProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvidedSoftwareCatalog]
  }
  
  extension [Self <: ProvidedSoftwareCatalog](x: Self) {
    
    inline def setAndroidxOrchestratorVersion(value: String): Self = StObject.set(x, "androidxOrchestratorVersion", value.asInstanceOf[js.Any])
    
    inline def setAndroidxOrchestratorVersionUndefined: Self = StObject.set(x, "androidxOrchestratorVersion", js.undefined)
    
    inline def setOrchestratorVersion(value: String): Self = StObject.set(x, "orchestratorVersion", value.asInstanceOf[js.Any])
    
    inline def setOrchestratorVersionUndefined: Self = StObject.set(x, "orchestratorVersion", js.undefined)
  }
}
