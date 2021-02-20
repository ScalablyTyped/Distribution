package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvidedSoftwareCatalog extends StObject {
  
  /** A string representing the current version of Android Test Orchestrator that is provided by TestExecutionService. Example: "1.0.2 beta". */
  var orchestratorVersion: js.UndefOr[String] = js.native
}
object ProvidedSoftwareCatalog {
  
  @scala.inline
  def apply(): ProvidedSoftwareCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvidedSoftwareCatalog]
  }
  
  @scala.inline
  implicit class ProvidedSoftwareCatalogMutableBuilder[Self <: ProvidedSoftwareCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrchestratorVersion(value: String): Self = StObject.set(x, "orchestratorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrchestratorVersionUndefined: Self = StObject.set(x, "orchestratorVersion", js.undefined)
  }
}
