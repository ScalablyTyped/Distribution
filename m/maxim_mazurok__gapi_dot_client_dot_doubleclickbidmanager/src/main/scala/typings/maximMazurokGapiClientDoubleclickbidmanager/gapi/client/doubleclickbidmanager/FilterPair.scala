package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPair extends StObject {
  
  /** Filter type. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Filter value. */
  var value: js.UndefOr[String] = js.undefined
}
object FilterPair {
  
  inline def apply(): FilterPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPair]
  }
  
  extension [Self <: FilterPair](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
