package typings.oracleOraclejet.ojconveyorbeltMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojconveyorbelt.ojConveyorBeltSettableProperties> */
@js.native
trait ojConveyorBeltSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var contentParent: js.UndefOr[String | Null] = js.native
  
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
  var translations: js.UndefOr[js.Object | Null] = js.native
}
object ojConveyorBeltSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojConveyorBeltSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojConveyorBeltSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojConveyorBeltSettablePropertiesLenientOps[Self <: ojConveyorBeltSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    def setContentParent(value: String): Self = this.set("contentParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentParent: Self = this.set("contentParent", js.undefined)
    
    @scala.inline
    def setContentParentNull: Self = this.set("contentParent", null)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    
    @scala.inline
    def setTranslationsNull: Self = this.set("translations", null)
  }
}
