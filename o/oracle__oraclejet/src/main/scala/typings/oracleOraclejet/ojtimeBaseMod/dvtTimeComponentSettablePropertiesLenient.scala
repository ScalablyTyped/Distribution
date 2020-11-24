package typings.oracleOraclejet.ojtimeBaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelCountWithTotal
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtime-base.dvtTimeComponentSettableProperties> */
@js.native
trait dvtTimeComponentSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var trackResize: js.UndefOr[on | off] = js.native
  
  var translations: js.UndefOr[LabelCountWithTotal] = js.native
}
object dvtTimeComponentSettablePropertiesLenient {
  
  @scala.inline
  def apply(): dvtTimeComponentSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dvtTimeComponentSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class dvtTimeComponentSettablePropertiesLenientOps[Self <: dvtTimeComponentSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    
    @scala.inline
    def setTranslations(value: LabelCountWithTotal): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}
