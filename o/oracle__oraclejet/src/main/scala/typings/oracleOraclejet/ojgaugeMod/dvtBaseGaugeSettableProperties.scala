package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dvtBaseGaugeSettableProperties extends dvtBaseComponentSettableProperties {
  
  @JSName("translations")
  var translations_dvtBaseGaugeSettableProperties: LabelAndValue = js.native
}
object dvtBaseGaugeSettableProperties {
  
  @scala.inline
  def apply(trackResize: on | off, translations: LabelAndValue): dvtBaseGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseGaugeSettableProperties]
  }
  
  @scala.inline
  implicit class dvtBaseGaugeSettablePropertiesMutableBuilder[Self <: dvtBaseGaugeSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
  }
}
