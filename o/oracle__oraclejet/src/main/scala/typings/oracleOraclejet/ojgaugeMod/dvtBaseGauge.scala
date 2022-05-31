package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dvtBaseGauge[SP /* <: dvtBaseGaugeSettableProperties */]
  extends StObject
     with dvtBaseComponent[SP] {
  
  def setProperties(properties: dvtBaseGaugeSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
  
  @JSName("translations")
  var translations_dvtBaseGauge: LabelAndValue = js.native
}
