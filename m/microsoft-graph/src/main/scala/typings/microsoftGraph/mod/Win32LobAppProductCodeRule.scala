package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppProductCodeRule
  extends StObject
     with Win32LobAppRule {
  
  // The product code of the app.
  var productCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The product version comparison value.
  var productVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The product version comparison operator. Possible values are: notConfigured, equal, notEqual, greaterThan,
    * greaterThanOrEqual, lessThan, lessThanOrEqual.
    */
  var productVersionOperator: js.UndefOr[Win32LobAppRuleOperator] = js.undefined
}
object Win32LobAppProductCodeRule {
  
  inline def apply(): Win32LobAppProductCodeRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppProductCodeRule]
  }
  
  extension [Self <: Win32LobAppProductCodeRule](x: Self) {
    
    inline def setProductCode(value: NullableOption[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeNull: Self = StObject.set(x, "productCode", null)
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setProductVersion(value: NullableOption[String]): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    inline def setProductVersionNull: Self = StObject.set(x, "productVersion", null)
    
    inline def setProductVersionOperator(value: Win32LobAppRuleOperator): Self = StObject.set(x, "productVersionOperator", value.asInstanceOf[js.Any])
    
    inline def setProductVersionOperatorUndefined: Self = StObject.set(x, "productVersionOperator", js.undefined)
    
    inline def setProductVersionUndefined: Self = StObject.set(x, "productVersion", js.undefined)
  }
}
