package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
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

/* Inlined {  label :'web-vital',   name :['CLS', 'FCP', 'FID', 'INP', 'LCP', 'TTFB'][number]} & {  id :string,   startTime :number,   value :number,   attribution :{[key: string] : unknown} | undefined} */
trait labelwebvitalnameCLSFCPFI
  extends StObject
     with NextWebVitalsMetric {
  
  var attribution: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var id: String
  
  var label: `web-vital`
  
  var name: CLS | FCP | FID | INP | LCP | TTFB
  
  var startTime: Double
  
  var value: Double
}
object labelwebvitalnameCLSFCPFI {
  
  inline def apply(id: String, name: CLS | FCP | FID | INP | LCP | TTFB, startTime: Double, value: Double): labelwebvitalnameCLSFCPFI = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = "web-vital", name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[labelwebvitalnameCLSFCPFI]
  }
  
  extension [Self <: labelwebvitalnameCLSFCPFI](x: Self) {
    
    inline def setAttribution(value: StringDictionary[Any]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `web-vital`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: CLS | FCP | FID | INP | LCP | TTFB): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
