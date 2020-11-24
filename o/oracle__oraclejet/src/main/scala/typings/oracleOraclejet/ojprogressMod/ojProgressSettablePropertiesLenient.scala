package typings.oracleOraclejet.ojprogressMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AriaIndeterminateProgressText
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojprogress.ojProgressSettableProperties> */
@js.native
trait ojProgressSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var max: js.UndefOr[Double] = js.native
  
  var translations: js.UndefOr[AriaIndeterminateProgressText] = js.native
  
  var `type`: js.UndefOr[bar | circle] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object ojProgressSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojProgressSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojProgressSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojProgressSettablePropertiesLenientOps[Self <: ojProgressSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setTranslations(value: AriaIndeterminateProgressText): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setType(value: bar | circle): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
