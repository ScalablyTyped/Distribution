package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeContentsJson
  extends StObject
     with _BagTypeJson {
  
  var safeBags: js.Array[SafeBagJson]
}
object SafeContentsJson {
  
  inline def apply(safeBags: js.Array[SafeBagJson]): SafeContentsJson = {
    val __obj = js.Dynamic.literal(safeBags = safeBags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeContentsJson]
  }
  
  extension [Self <: SafeContentsJson](x: Self) {
    
    inline def setSafeBags(value: js.Array[SafeBagJson]): Self = StObject.set(x, "safeBags", value.asInstanceOf[js.Any])
    
    inline def setSafeBagsVarargs(value: SafeBagJson*): Self = StObject.set(x, "safeBags", js.Array(value*))
  }
}
