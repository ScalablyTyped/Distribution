package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class Win32LobAppProductCodeRuleMutableBuilder[Self <: Win32LobAppProductCodeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductCode(value: NullableOption[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeNull: Self = StObject.set(x, "productCode", null)
    
    @scala.inline
    def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    @scala.inline
    def setProductVersion(value: NullableOption[String]): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVersionNull: Self = StObject.set(x, "productVersion", null)
    
    @scala.inline
    def setProductVersionOperator(value: Win32LobAppRuleOperator): Self = StObject.set(x, "productVersionOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVersionOperatorUndefined: Self = StObject.set(x, "productVersionOperator", js.undefined)
    
    @scala.inline
    def setProductVersionUndefined: Self = StObject.set(x, "productVersion", js.undefined)
  }
}
