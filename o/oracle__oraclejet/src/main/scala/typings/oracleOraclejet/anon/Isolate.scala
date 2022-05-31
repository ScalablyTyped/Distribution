package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Isolate extends StObject {
  
  var isolate: js.UndefOr[off | on] = js.undefined
  
  var labelHalign: js.UndefOr[center | end | start] = js.undefined
  
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  
  var useNodeColor: js.UndefOr[on | off] = js.undefined
}
object Isolate {
  
  inline def apply(): Isolate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Isolate]
  }
  
  extension [Self <: Isolate](x: Self) {
    
    inline def setIsolate(value: off | on): Self = StObject.set(x, "isolate", value.asInstanceOf[js.Any])
    
    inline def setIsolateUndefined: Self = StObject.set(x, "isolate", js.undefined)
    
    inline def setLabelHalign(value: center | end | start): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    inline def setLabelHalignUndefined: Self = StObject.set(x, "labelHalign", js.undefined)
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setUseNodeColor(value: on | off): Self = StObject.set(x, "useNodeColor", value.asInstanceOf[js.Any])
    
    inline def setUseNodeColorUndefined: Self = StObject.set(x, "useNodeColor", js.undefined)
  }
}
