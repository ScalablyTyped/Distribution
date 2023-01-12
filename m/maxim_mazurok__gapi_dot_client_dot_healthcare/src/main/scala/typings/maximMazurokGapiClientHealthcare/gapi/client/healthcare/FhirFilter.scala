package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FhirFilter extends StObject {
  
  /** List of resources to include in the output. If this list is empty or not specified, all resources are included in the output. */
  var resources: js.UndefOr[Resources] = js.undefined
}
object FhirFilter {
  
  inline def apply(): FhirFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FhirFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FhirFilter] (val x: Self) extends AnyVal {
    
    inline def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
