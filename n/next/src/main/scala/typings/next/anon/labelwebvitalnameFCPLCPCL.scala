package typings.next.anon

import typings.next.distSharedLibUtilsMod.NextWebVitalsMetric
import typings.next.nextStrings.CLS
import typings.next.nextStrings.FCP
import typings.next.nextStrings.FID
import typings.next.nextStrings.INP
import typings.next.nextStrings.LCP
import typings.next.nextStrings.TTFB
import typings.next.nextStrings.`web-vital`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  label :'web-vital',   name :'FCP' | 'LCP' | 'CLS' | 'FID' | 'TTFB' | 'INP'} & {  id :string,   startTime :number,   value :number} */
trait labelwebvitalnameFCPLCPCL
  extends StObject
     with NextWebVitalsMetric {
  
  var id: String
  
  var label: `web-vital`
  
  var name: FCP | LCP | CLS | FID | TTFB | INP
  
  var startTime: Double
  
  var value: Double
}
object labelwebvitalnameFCPLCPCL {
  
  inline def apply(id: String, name: FCP | LCP | CLS | FID | TTFB | INP, startTime: Double, value: Double): labelwebvitalnameFCPLCPCL = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = "web-vital", name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[labelwebvitalnameFCPLCPCL]
  }
  
  extension [Self <: labelwebvitalnameFCPLCPCL](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `web-vital`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: FCP | LCP | CLS | FID | TTFB | INP): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
