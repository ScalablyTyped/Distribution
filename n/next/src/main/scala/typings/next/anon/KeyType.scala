package typings.next.anon

import typings.next.distLibLoadCustomRoutesMod.RouteHas
import typings.next.nextStrings.host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyType
  extends StObject
     with RouteHas {
  
  var key: Unit
  
  var `type`: host
  
  var value: String
}
object KeyType {
  
  inline def apply(key: Unit, value: String): KeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("host")
    __obj.asInstanceOf[KeyType]
  }
  
  extension [Self <: KeyType](x: Self) {
    
    inline def setKey(value: Unit): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: host): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
