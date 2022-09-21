package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.dvtBaseGaugeSettableProperties> */
trait dvtBaseGaugeSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var translations: js.UndefOr[LabelAndValue] = js.undefined
}
object dvtBaseGaugeSettablePropertiesLenient {
  
  inline def apply(): dvtBaseGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dvtBaseGaugeSettablePropertiesLenient]
  }
  
  extension [Self <: dvtBaseGaugeSettablePropertiesLenient](x: Self) {
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
