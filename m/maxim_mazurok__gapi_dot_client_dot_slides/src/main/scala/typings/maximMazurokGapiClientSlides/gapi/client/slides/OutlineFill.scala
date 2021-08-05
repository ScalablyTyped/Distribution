package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineFill extends StObject {
  
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}
object OutlineFill {
  
  inline def apply(): OutlineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineFill]
  }
  
  extension [Self <: OutlineFill](x: Self) {
    
    inline def setSolidFill(value: SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
