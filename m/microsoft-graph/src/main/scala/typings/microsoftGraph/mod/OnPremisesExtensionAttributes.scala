package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPremisesExtensionAttributes extends js.Object {
  
  // First customizable extension attribute.
  var extensionAttribute1: js.UndefOr[NullableOption[String]] = js.native
  
  // Tenth customizable extension attribute.
  var extensionAttribute10: js.UndefOr[NullableOption[String]] = js.native
  
  // Eleventh customizable extension attribute.
  var extensionAttribute11: js.UndefOr[NullableOption[String]] = js.native
  
  // Twelfth customizable extension attribute.
  var extensionAttribute12: js.UndefOr[NullableOption[String]] = js.native
  
  // Thirteenth customizable extension attribute.
  var extensionAttribute13: js.UndefOr[NullableOption[String]] = js.native
  
  // Fourteenth customizable extension attribute.
  var extensionAttribute14: js.UndefOr[NullableOption[String]] = js.native
  
  // Fifteenth customizable extension attribute.
  var extensionAttribute15: js.UndefOr[NullableOption[String]] = js.native
  
  // Second customizable extension attribute.
  var extensionAttribute2: js.UndefOr[NullableOption[String]] = js.native
  
  // Third customizable extension attribute.
  var extensionAttribute3: js.UndefOr[NullableOption[String]] = js.native
  
  // Fourth customizable extension attribute.
  var extensionAttribute4: js.UndefOr[NullableOption[String]] = js.native
  
  // Fifth customizable extension attribute.
  var extensionAttribute5: js.UndefOr[NullableOption[String]] = js.native
  
  // Sixth customizable extension attribute.
  var extensionAttribute6: js.UndefOr[NullableOption[String]] = js.native
  
  // Seventh customizable extension attribute.
  var extensionAttribute7: js.UndefOr[NullableOption[String]] = js.native
  
  // Eighth customizable extension attribute.
  var extensionAttribute8: js.UndefOr[NullableOption[String]] = js.native
  
  // Ninth customizable extension attribute.
  var extensionAttribute9: js.UndefOr[NullableOption[String]] = js.native
}
object OnPremisesExtensionAttributes {
  
  @scala.inline
  def apply(): OnPremisesExtensionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesExtensionAttributes]
  }
  
  @scala.inline
  implicit class OnPremisesExtensionAttributesOps[Self <: OnPremisesExtensionAttributes] (val x: Self) extends AnyVal {
    
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
    def setExtensionAttribute1(value: NullableOption[String]): Self = this.set("extensionAttribute1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute1: Self = this.set("extensionAttribute1", js.undefined)
    
    @scala.inline
    def setExtensionAttribute1Null: Self = this.set("extensionAttribute1", null)
    
    @scala.inline
    def setExtensionAttribute10(value: NullableOption[String]): Self = this.set("extensionAttribute10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute10: Self = this.set("extensionAttribute10", js.undefined)
    
    @scala.inline
    def setExtensionAttribute10Null: Self = this.set("extensionAttribute10", null)
    
    @scala.inline
    def setExtensionAttribute11(value: NullableOption[String]): Self = this.set("extensionAttribute11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute11: Self = this.set("extensionAttribute11", js.undefined)
    
    @scala.inline
    def setExtensionAttribute11Null: Self = this.set("extensionAttribute11", null)
    
    @scala.inline
    def setExtensionAttribute12(value: NullableOption[String]): Self = this.set("extensionAttribute12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute12: Self = this.set("extensionAttribute12", js.undefined)
    
    @scala.inline
    def setExtensionAttribute12Null: Self = this.set("extensionAttribute12", null)
    
    @scala.inline
    def setExtensionAttribute13(value: NullableOption[String]): Self = this.set("extensionAttribute13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute13: Self = this.set("extensionAttribute13", js.undefined)
    
    @scala.inline
    def setExtensionAttribute13Null: Self = this.set("extensionAttribute13", null)
    
    @scala.inline
    def setExtensionAttribute14(value: NullableOption[String]): Self = this.set("extensionAttribute14", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute14: Self = this.set("extensionAttribute14", js.undefined)
    
    @scala.inline
    def setExtensionAttribute14Null: Self = this.set("extensionAttribute14", null)
    
    @scala.inline
    def setExtensionAttribute15(value: NullableOption[String]): Self = this.set("extensionAttribute15", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute15: Self = this.set("extensionAttribute15", js.undefined)
    
    @scala.inline
    def setExtensionAttribute15Null: Self = this.set("extensionAttribute15", null)
    
    @scala.inline
    def setExtensionAttribute2(value: NullableOption[String]): Self = this.set("extensionAttribute2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute2: Self = this.set("extensionAttribute2", js.undefined)
    
    @scala.inline
    def setExtensionAttribute2Null: Self = this.set("extensionAttribute2", null)
    
    @scala.inline
    def setExtensionAttribute3(value: NullableOption[String]): Self = this.set("extensionAttribute3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute3: Self = this.set("extensionAttribute3", js.undefined)
    
    @scala.inline
    def setExtensionAttribute3Null: Self = this.set("extensionAttribute3", null)
    
    @scala.inline
    def setExtensionAttribute4(value: NullableOption[String]): Self = this.set("extensionAttribute4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute4: Self = this.set("extensionAttribute4", js.undefined)
    
    @scala.inline
    def setExtensionAttribute4Null: Self = this.set("extensionAttribute4", null)
    
    @scala.inline
    def setExtensionAttribute5(value: NullableOption[String]): Self = this.set("extensionAttribute5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute5: Self = this.set("extensionAttribute5", js.undefined)
    
    @scala.inline
    def setExtensionAttribute5Null: Self = this.set("extensionAttribute5", null)
    
    @scala.inline
    def setExtensionAttribute6(value: NullableOption[String]): Self = this.set("extensionAttribute6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute6: Self = this.set("extensionAttribute6", js.undefined)
    
    @scala.inline
    def setExtensionAttribute6Null: Self = this.set("extensionAttribute6", null)
    
    @scala.inline
    def setExtensionAttribute7(value: NullableOption[String]): Self = this.set("extensionAttribute7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute7: Self = this.set("extensionAttribute7", js.undefined)
    
    @scala.inline
    def setExtensionAttribute7Null: Self = this.set("extensionAttribute7", null)
    
    @scala.inline
    def setExtensionAttribute8(value: NullableOption[String]): Self = this.set("extensionAttribute8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute8: Self = this.set("extensionAttribute8", js.undefined)
    
    @scala.inline
    def setExtensionAttribute8Null: Self = this.set("extensionAttribute8", null)
    
    @scala.inline
    def setExtensionAttribute9(value: NullableOption[String]): Self = this.set("extensionAttribute9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionAttribute9: Self = this.set("extensionAttribute9", js.undefined)
    
    @scala.inline
    def setExtensionAttribute9Null: Self = this.set("extensionAttribute9", null)
  }
}
