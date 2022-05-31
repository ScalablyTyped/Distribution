package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dvtBaseGaugeSettableProperties
  extends StObject
     with dvtBaseComponentSettableProperties {
  
  @JSName("translations")
  var translations_dvtBaseGaugeSettableProperties: LabelAndValue
}
object dvtBaseGaugeSettableProperties {
  
  inline def apply(trackResize: on | off, translations: LabelAndValue): dvtBaseGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseGaugeSettableProperties]
  }
  
  extension [Self <: dvtBaseGaugeSettableProperties](x: Self) {
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
  }
}
