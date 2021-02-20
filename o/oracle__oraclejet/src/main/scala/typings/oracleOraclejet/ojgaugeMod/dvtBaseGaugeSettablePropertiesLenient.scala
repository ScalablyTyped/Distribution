package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.dvtBaseGaugeSettableProperties> */
@js.native
trait dvtBaseGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var trackResize: js.UndefOr[on | off] = js.native
  
  var translations: js.UndefOr[LabelAndValue] = js.native
}
object dvtBaseGaugeSettablePropertiesLenient {
  
  @scala.inline
  def apply(): dvtBaseGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dvtBaseGaugeSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class dvtBaseGaugeSettablePropertiesLenientMutableBuilder[Self <: dvtBaseGaugeSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
  }
}
