package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICAVersion extends StObject {
  
  var certificateIndex: Double
  
  var keyIndex: Double
}
object ICAVersion {
  
  inline def apply(certificateIndex: Double, keyIndex: Double): ICAVersion = {
    val __obj = js.Dynamic.literal(certificateIndex = certificateIndex.asInstanceOf[js.Any], keyIndex = keyIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICAVersion]
  }
  
  extension [Self <: ICAVersion](x: Self) {
    
    inline def setCertificateIndex(value: Double): Self = StObject.set(x, "certificateIndex", value.asInstanceOf[js.Any])
    
    inline def setKeyIndex(value: Double): Self = StObject.set(x, "keyIndex", value.asInstanceOf[js.Any])
  }
}
