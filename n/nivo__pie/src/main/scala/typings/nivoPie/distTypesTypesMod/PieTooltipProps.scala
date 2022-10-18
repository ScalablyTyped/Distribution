package typings.nivoPie.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieTooltipProps[RawDatum] extends StObject {
  
  var datum: ComputedDatum[RawDatum]
}
object PieTooltipProps {
  
  inline def apply[RawDatum](datum: ComputedDatum[RawDatum]): PieTooltipProps[RawDatum] = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieTooltipProps[RawDatum]]
  }
  
  extension [Self <: PieTooltipProps[?], RawDatum](x: Self & PieTooltipProps[RawDatum]) {
    
    inline def setDatum(value: ComputedDatum[RawDatum]): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
  }
}
