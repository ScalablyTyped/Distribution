package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.distSharedLibUtilsMod.NextWebVitalsMetric
import typings.next.nextStrings.`NextDotjs-hydration`
import typings.next.nextStrings.`NextDotjs-render`
import typings.next.nextStrings.`NextDotjs-route-change-to-render`
import typings.next.nextStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  label :'custom',   name :'Next.js-hydration' | 'Next.js-route-change-to-render' | 'Next.js-render'} & {  id :string,   startTime :number,   value :number,   attribution :{[key: string] : unknown} | undefined} */
trait labelcustomnameNextjshydr
  extends StObject
     with NextWebVitalsMetric {
  
  var attribution: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var id: String
  
  var label: custom
  
  var name: `NextDotjs-hydration` | `NextDotjs-route-change-to-render` | `NextDotjs-render`
  
  var startTime: Double
  
  var value: Double
}
object labelcustomnameNextjshydr {
  
  inline def apply(
    id: String,
    name: `NextDotjs-hydration` | `NextDotjs-route-change-to-render` | `NextDotjs-render`,
    startTime: Double,
    value: Double
  ): labelcustomnameNextjshydr = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = "custom", name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[labelcustomnameNextjshydr]
  }
  
  extension [Self <: labelcustomnameNextjshydr](x: Self) {
    
    inline def setAttribution(value: StringDictionary[Any]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: custom): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: `NextDotjs-hydration` | `NextDotjs-route-change-to-render` | `NextDotjs-render`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
