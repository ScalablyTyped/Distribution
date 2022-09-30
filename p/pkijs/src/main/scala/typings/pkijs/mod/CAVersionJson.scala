package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAVersionJson extends StObject {
  
  var certificateIndex: Double
  
  var keyIndex: Double
}
object CAVersionJson {
  
  inline def apply(certificateIndex: Double, keyIndex: Double): CAVersionJson = {
    val __obj = js.Dynamic.literal(certificateIndex = certificateIndex.asInstanceOf[js.Any], keyIndex = keyIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAVersionJson]
  }
  
  extension [Self <: CAVersionJson](x: Self) {
    
    inline def setCertificateIndex(value: Double): Self = StObject.set(x, "certificateIndex", value.asInstanceOf[js.Any])
    
    inline def setKeyIndex(value: Double): Self = StObject.set(x, "keyIndex", value.asInstanceOf[js.Any])
  }
}
