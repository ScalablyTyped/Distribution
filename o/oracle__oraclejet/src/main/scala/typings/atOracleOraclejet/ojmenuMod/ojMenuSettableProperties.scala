package typings.atOracleOraclejet.ojmenuMod

import typings.atOracleOraclejet.Anon_AriaFocusSkipLink
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMenuSettableProperties extends baseComponentSettableProperties {
  var disabled: Boolean
  var openOptions: OpenOptions
  @JSName("translations")
  var translations_ojMenuSettableProperties: Anon_AriaFocusSkipLink
}

object ojMenuSettableProperties {
  @scala.inline
  def apply(disabled: Boolean, openOptions: OpenOptions, translations: Anon_AriaFocusSkipLink): ojMenuSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], openOptions = openOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojMenuSettableProperties]
  }
}

