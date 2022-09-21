package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  fill :string,   opacity :number}> */
trait Partialfillstringopacityn extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object Partialfillstringopacityn {
  
  inline def apply(): Partialfillstringopacityn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialfillstringopacityn]
  }
  
  extension [Self <: Partialfillstringopacityn](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
