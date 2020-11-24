package typings.oracleOraclejet.ojtoolbarMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.half
import typings.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtoolbar.ojToolbarSettableProperties> */
@js.native
trait ojToolbarSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var chroming: js.UndefOr[full | half | outlined] = js.native
  
  var translations: js.UndefOr[js.Object | Null] = js.native
}
object ojToolbarSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojToolbarSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojToolbarSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojToolbarSettablePropertiesLenientOps[Self <: ojToolbarSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setChroming(value: full | half | outlined): Self = this.set("chroming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChroming: Self = this.set("chroming", js.undefined)
    
    @scala.inline
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setTranslationsNull: Self = this.set("translations", null)
  }
}
