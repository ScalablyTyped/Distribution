package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apply extends StObject {
  
  /**
    * The value for the "3 System Query Option $apply" (see also OData
    * Extension for Data Aggregation Version 4.0), if the path ends with a "$count" segment
    */
  @JSName("$apply")
  var $apply: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the "5.1.1 System Query Option $filter", if the path ends with a "$count" segment
    */
  @JSName("$filter")
  var $filter: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the "5.1.7 System Query Option $search", if the path ends with a "$count" segment
    */
  @JSName("$search")
  var $search: js.UndefOr[String] = js.undefined
  
  /**
    * The group ID to be used for **read** requests triggered by this binding; if not specified, either the
    * parent binding's group ID (if the binding is relative) or the model's group ID is used, see {@link sap.ui.model.odata.v4.ODataModel#constructor}.
    * Valid values are `undefined`, '$auto', '$auto.*', '$direct' or application group IDs as specified in
    * {@link sap.ui.model.odata.v4.ODataModel}.
    */
  @JSName("$$groupId")
  var DollarDollargroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this binding does not propagate model messages to the control; supported since 1.82.0. Some composite
    * types like {@link sap.ui.model.odata.type.Currency} or {@link sap.ui.model.odata.type.Unit} automatically
    * ignore messages for some of their parts depending on their format options; setting this parameter to
    * `true` or `false` overrules the automatism of the type.
    *
    * For example, a binding for a currency code is used in a composite binding for rendering the proper number
    * of decimals, but the currency code is not displayed in the attached control. In that case, messages for
    * the currency code shall not be displayed at that control, only messages for the amount.
    */
  @JSName("$$ignoreMessages")
  var DollarDollarignoreMessages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether changing the value of this property binding is not causing a PATCH request; only the value `true`
    * is allowed.
    */
  @JSName("$$noPatch")
  var DollarDollarnoPatch: js.UndefOr[Boolean] = js.undefined
}
object Apply {
  
  inline def apply(): Apply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Apply] (val x: Self) extends AnyVal {
    
    inline def set$apply(value: String): Self = StObject.set(x, "$apply", value.asInstanceOf[js.Any])
    
    inline def set$applyUndefined: Self = StObject.set(x, "$apply", js.undefined)
    
    inline def set$filter(value: String): Self = StObject.set(x, "$filter", value.asInstanceOf[js.Any])
    
    inline def set$filterUndefined: Self = StObject.set(x, "$filter", js.undefined)
    
    inline def set$search(value: String): Self = StObject.set(x, "$search", value.asInstanceOf[js.Any])
    
    inline def set$searchUndefined: Self = StObject.set(x, "$search", js.undefined)
    
    inline def setDollarDollargroupId(value: String): Self = StObject.set(x, "$$groupId", value.asInstanceOf[js.Any])
    
    inline def setDollarDollargroupIdUndefined: Self = StObject.set(x, "$$groupId", js.undefined)
    
    inline def setDollarDollarignoreMessages(value: Boolean): Self = StObject.set(x, "$$ignoreMessages", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarignoreMessagesUndefined: Self = StObject.set(x, "$$ignoreMessages", js.undefined)
    
    inline def setDollarDollarnoPatch(value: Boolean): Self = StObject.set(x, "$$noPatch", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarnoPatchUndefined: Self = StObject.set(x, "$$noPatch", js.undefined)
  }
}
