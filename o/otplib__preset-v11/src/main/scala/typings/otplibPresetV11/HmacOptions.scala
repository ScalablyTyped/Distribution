package typings.otplibPresetV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacOptions extends StObject {
  
  var algorithm: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
}
object HmacOptions {
  
  inline def apply(): HmacOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacOptions]
  }
  
  extension [Self <: HmacOptions](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
