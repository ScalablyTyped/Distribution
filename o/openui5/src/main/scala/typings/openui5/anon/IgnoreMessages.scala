package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreMessages extends StObject {
  
  /**
    * Whether this binding does not propagate model messages to the control; supported since 1.82.0. Some composite
    * types like {@link sap.ui.model.type.Currency} automatically ignore model messages for some of their parts
    * depending on their format options; setting this parameter to `true` or `false` overrules the automatism
    * of the type
    *
    * For example, a binding for a currency code is used in a composite binding for rendering the proper number
    * of decimals, but the currency code is not displayed in the attached control. In that case, messages for
    * the currency code shall not be displayed at that control, only messages for the amount
    */
  var ignoreMessages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the value of the created property binding is `undefined` if it is unresolved; if not set, its
    * value is `null`. Supported since 1.100.0
    */
  var useUndefinedIfUnresolved: js.UndefOr[Boolean] = js.undefined
}
object IgnoreMessages {
  
  inline def apply(): IgnoreMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreMessages]
  }
  
  extension [Self <: IgnoreMessages](x: Self) {
    
    inline def setIgnoreMessages(value: Boolean): Self = StObject.set(x, "ignoreMessages", value.asInstanceOf[js.Any])
    
    inline def setIgnoreMessagesUndefined: Self = StObject.set(x, "ignoreMessages", js.undefined)
    
    inline def setUseUndefinedIfUnresolved(value: Boolean): Self = StObject.set(x, "useUndefinedIfUnresolved", value.asInstanceOf[js.Any])
    
    inline def setUseUndefinedIfUnresolvedUndefined: Self = StObject.set(x, "useUndefinedIfUnresolved", js.undefined)
  }
}
