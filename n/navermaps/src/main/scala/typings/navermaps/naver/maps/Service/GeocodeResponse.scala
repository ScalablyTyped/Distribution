package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Addresses
import typings.navermaps.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocodeResponse extends StObject {
  
  // Deprecated!! https://navermaps.github.io/maps.js.ncp/docs/naver.maps.Service.html#toc28__anchor
  var result: Items
  
  var v2: Addresses
}
object GeocodeResponse {
  
  inline def apply(result: Items, v2: Addresses): GeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocodeResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: Items): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setV2(value: Addresses): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
  }
}
