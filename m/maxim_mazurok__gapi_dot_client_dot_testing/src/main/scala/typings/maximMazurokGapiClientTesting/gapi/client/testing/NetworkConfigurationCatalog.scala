package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfigurationCatalog extends StObject {
  
  var configurations: js.UndefOr[js.Array[NetworkConfiguration]] = js.undefined
}
object NetworkConfigurationCatalog {
  
  inline def apply(): NetworkConfigurationCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigurationCatalog]
  }
  
  extension [Self <: NetworkConfigurationCatalog](x: Self) {
    
    inline def setConfigurations(value: js.Array[NetworkConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: NetworkConfiguration*): Self = StObject.set(x, "configurations", js.Array(value*))
  }
}
