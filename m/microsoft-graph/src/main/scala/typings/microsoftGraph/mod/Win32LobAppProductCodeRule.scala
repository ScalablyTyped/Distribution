package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppProductCodeRule extends Win32LobAppRule {
  
  // The product code of the app.
  var productCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The product version comparison value.
  var productVersion: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The product version comparison operator. Possible values are: notConfigured, equal, notEqual, greaterThan,
    * greaterThanOrEqual, lessThan, lessThanOrEqual.
    */
  var productVersionOperator: js.UndefOr[Win32LobAppRuleOperator] = js.native
}
object Win32LobAppProductCodeRule {
  
  @scala.inline
  def apply(): Win32LobAppProductCodeRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppProductCodeRule]
  }
  
  @scala.inline
  implicit class Win32LobAppProductCodeRuleOps[Self <: Win32LobAppProductCodeRule] (val x: Self) extends AnyVal {
    
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
    def setProductCode(value: NullableOption[String]): Self = this.set("productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCode: Self = this.set("productCode", js.undefined)
    
    @scala.inline
    def setProductCodeNull: Self = this.set("productCode", null)
    
    @scala.inline
    def setProductVersion(value: NullableOption[String]): Self = this.set("productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductVersion: Self = this.set("productVersion", js.undefined)
    
    @scala.inline
    def setProductVersionNull: Self = this.set("productVersion", null)
    
    @scala.inline
    def setProductVersionOperator(value: Win32LobAppRuleOperator): Self = this.set("productVersionOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductVersionOperator: Self = this.set("productVersionOperator", js.undefined)
  }
}
