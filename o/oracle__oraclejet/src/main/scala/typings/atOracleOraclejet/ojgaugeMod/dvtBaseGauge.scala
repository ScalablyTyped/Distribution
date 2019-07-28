package typings.atOracleOraclejet.ojgaugeMod

import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.atOracleOraclejetStrings.translations
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dvtBaseGauge[SP /* <: dvtBaseGaugeSettableProperties */] extends dvtBaseComponent[SP] {
  @JSName("translations")
  var translations_dvtBaseGauge: Anon_ComponentNameLabelAndValue = js.native
  def setProperties(properties: dvtBaseGaugeSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentNameLabelAndValue): Unit = js.native
}

