package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfiguration extends StObject {
  
  /** The emulation rule applying to the download traffic. */
  var downRule: js.UndefOr[TrafficRule] = js.undefined
  
  /** The unique opaque id for this network traffic configuration. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The emulation rule applying to the upload traffic. */
  var upRule: js.UndefOr[TrafficRule] = js.undefined
}
object NetworkConfiguration {
  
  inline def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDownRule(value: TrafficRule): Self = StObject.set(x, "downRule", value.asInstanceOf[js.Any])
    
    inline def setDownRuleUndefined: Self = StObject.set(x, "downRule", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUpRule(value: TrafficRule): Self = StObject.set(x, "upRule", value.asInstanceOf[js.Any])
    
    inline def setUpRuleUndefined: Self = StObject.set(x, "upRule", js.undefined)
  }
}
