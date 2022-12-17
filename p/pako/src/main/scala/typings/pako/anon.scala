package typings.pako

import typings.pako.pakoStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined pako.pako.InflateFunctionOptions & {  to :'string'} */
  trait InflateFunctionOptionstos extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[string] = js.undefined
    
    var windowBits: js.UndefOr[Double] = js.undefined
  }
  object InflateFunctionOptionstos {
    
    inline def apply(): InflateFunctionOptionstos = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InflateFunctionOptionstos]
    }
    
    extension [Self <: InflateFunctionOptionstos](x: Self) {
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setTo(value: string): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      
      inline def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
    }
  }
}
