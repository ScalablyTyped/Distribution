package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanonicalPath extends StObject {
  
  /**
    * The value for the "5.1.2 System Query Option $expand" or an object which determines that value. The object
    * is a map from expand path to expand options, where the options are again maps of system query options,
    * typically with string values. $count can also be given as a `boolean` value, $expand can recursively
    * be given as a map, $levels can also be given as a `number` value, and $select can also be given as an
    * array (but without navigation paths). An empty map can also be given as `null` or `true`. See also {@link
    * topic:1ab4f62de6ab467096a2a98b363a1373 Parameters}.
    */
  @JSName("$expand")
  var $expand: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * A comma separated list or an array of items which determine the value for the "5.1.3 System Query Option
    * $select". Since 1.75.0, when using the "autoExpandSelect" model parameter (see {@link sap.ui.model.odata.v4.ODataModel#constructor}),
    * paths with navigation properties can be included and will contribute to the "5.1.2 System Query Option
    * $expand".
    */
  @JSName("$select")
  var $select: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Whether a binding relative to a {@link sap.ui.model.odata.v4.Context} uses the canonical path computed
    * from its context's path for data service requests; only the value `true` is allowed.
    */
  @JSName("$$canonicalPath")
  var DollarDollarcanonicalPath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The group ID to be used for **read** requests triggered by this binding; if not specified, either the
    * parent binding's group ID (if the binding is relative) or the model's group ID is used, see {@link sap.ui.model.odata.v4.ODataModel#constructor}.
    * Valid values are `undefined`, '$auto', '$auto.*', '$direct' or application group IDs as specified in
    * {@link sap.ui.model.odata.v4.ODataModel}.
    */
  @JSName("$$groupId")
  var DollarDollargroupId: js.UndefOr[String] = js.undefined
  
  /**
    * For operation bindings only: Whether $expand and $select from the parent binding are used in the request
    * sent on {@link #execute}. If set to `true`, the binding must not set the $expand itself, the operation
    * must be bound, and the return value and the binding parameter must belong to the same entity set.
    */
  @JSName("$$inheritExpandSelect")
  var DollarDollarinheritExpandSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the binding always uses an own service request to read its data; only the value `true` is allowed.
    */
  @JSName("$$ownRequest")
  var DollarDollarownRequest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether implicit loading of side effects via PATCH requests is switched off; only the value `true` is
    * allowed. This sets the preference "return=minimal" and requires the service to return an ETag header
    * for "204 No Content" responses. If not specified, the value of the parent binding is used.
    */
  @JSName("$$patchWithoutSideEffects")
  var DollarDollarpatchWithoutSideEffects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The group ID to be used for **update** requests triggered by this binding; if not specified, either the
    * parent binding's update group ID (if the binding is relative) or the model's update group ID is used,
    * see {@link sap.ui.model.odata.v4.ODataModel#constructor}. For valid values, see parameter "$$groupId".
    */
  @JSName("$$updateGroupId")
  var DollarDollarupdateGroupId: js.UndefOr[String] = js.undefined
}
object CanonicalPath {
  
  inline def apply(): CanonicalPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanonicalPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanonicalPath] (val x: Self) extends AnyVal {
    
    inline def set$expand(value: String | js.Object): Self = StObject.set(x, "$expand", value.asInstanceOf[js.Any])
    
    inline def set$expandUndefined: Self = StObject.set(x, "$expand", js.undefined)
    
    inline def set$select(value: String | js.Array[String]): Self = StObject.set(x, "$select", value.asInstanceOf[js.Any])
    
    inline def set$selectUndefined: Self = StObject.set(x, "$select", js.undefined)
    
    inline def set$selectVarargs(value: String*): Self = StObject.set(x, "$select", js.Array(value*))
    
    inline def setDollarDollarcanonicalPath(value: Boolean): Self = StObject.set(x, "$$canonicalPath", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarcanonicalPathUndefined: Self = StObject.set(x, "$$canonicalPath", js.undefined)
    
    inline def setDollarDollargroupId(value: String): Self = StObject.set(x, "$$groupId", value.asInstanceOf[js.Any])
    
    inline def setDollarDollargroupIdUndefined: Self = StObject.set(x, "$$groupId", js.undefined)
    
    inline def setDollarDollarinheritExpandSelect(value: Boolean): Self = StObject.set(x, "$$inheritExpandSelect", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarinheritExpandSelectUndefined: Self = StObject.set(x, "$$inheritExpandSelect", js.undefined)
    
    inline def setDollarDollarownRequest(value: Boolean): Self = StObject.set(x, "$$ownRequest", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarownRequestUndefined: Self = StObject.set(x, "$$ownRequest", js.undefined)
    
    inline def setDollarDollarpatchWithoutSideEffects(value: Boolean): Self = StObject.set(x, "$$patchWithoutSideEffects", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarpatchWithoutSideEffectsUndefined: Self = StObject.set(x, "$$patchWithoutSideEffects", js.undefined)
    
    inline def setDollarDollarupdateGroupId(value: String): Self = StObject.set(x, "$$updateGroupId", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarupdateGroupIdUndefined: Self = StObject.set(x, "$$updateGroupId", js.undefined)
  }
}
