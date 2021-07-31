package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfigurationCatalog extends StObject {
  
  var configurations: js.UndefOr[js.Array[NetworkConfiguration]] = js.undefined
}
object NetworkConfigurationCatalog {
  
  @scala.inline
  def apply(): NetworkConfigurationCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigurationCatalog]
  }
  
  @scala.inline
  implicit class NetworkConfigurationCatalogMutableBuilder[Self <: NetworkConfigurationCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurations(value: js.Array[NetworkConfiguration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    @scala.inline
    def setConfigurationsVarargs(value: NetworkConfiguration*): Self = StObject.set(x, "configurations", js.Array(value :_*))
  }
}
