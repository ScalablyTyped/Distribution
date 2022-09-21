package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  domain :std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>}>,   ticks :std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>,   text :std.Partial<std.Partial<react.react.CSSProperties>>}>,   legend :std.Partial<{  text :std.Partial<std.Partial<react.react.CSSProperties>>}>}> */
trait PartialdomainPartiallineP extends StObject {
  
  var domain: js.UndefOr[PartiallinePartialPartial] = js.undefined
  
  var legend: js.UndefOr[PartialtextPartialPartial] = js.undefined
  
  var ticks: js.UndefOr[PartiallinePartialPartialLine] = js.undefined
}
object PartialdomainPartiallineP {
  
  inline def apply(): PartialdomainPartiallineP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialdomainPartiallineP]
  }
  
  extension [Self <: PartialdomainPartiallineP](x: Self) {
    
    inline def setDomain(value: PartiallinePartialPartial): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setLegend(value: PartialtextPartialPartial): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setTicks(value: PartiallinePartialPartialLine): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
