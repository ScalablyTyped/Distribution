package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  /** List of resources IDs. For example, "Patient/1234". */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
}
object Resources {
  
  inline def apply(): Resources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resources]
  }
  
  extension [Self <: Resources](x: Self) {
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
