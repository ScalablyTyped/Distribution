package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelCountWithTotal
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojtimeBaseMod {
  
  @js.native
  trait dvtTimeComponent[SP /* <: dvtTimeComponentSettableProperties */]
    extends StObject
       with dvtBaseComponent[SP] {
    
    def setProperties(properties: dvtTimeComponentSettablePropertiesLenient): Unit = js.native
  }
  
  type dvtTimeComponentEventMap[SP /* <: dvtTimeComponentSettableProperties */] = dvtBaseComponentEventMap[SP]
  
  type dvtTimeComponentSettableProperties = dvtBaseComponentSettableProperties
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtime-base.dvtTimeComponentSettableProperties> */
  trait dvtTimeComponentSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var trackResize: js.UndefOr[on | off] = js.undefined
    
    var translations: js.UndefOr[LabelCountWithTotal] = js.undefined
  }
  object dvtTimeComponentSettablePropertiesLenient {
    
    inline def apply(): dvtTimeComponentSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[dvtTimeComponentSettablePropertiesLenient]
    }
    
    extension [Self <: dvtTimeComponentSettablePropertiesLenient](x: Self) {
      
      inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
      
      inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
      
      inline def setTranslations(value: LabelCountWithTotal): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
