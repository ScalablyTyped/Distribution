package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGroupId extends StObject {
  
  /**
    * **Deprecated**, use `groupId` instead. Sets the batch group id to be used for requests originating from
    * the binding.
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a preliminary context is created
    */
  var createPreliminaryContext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional map of custom query parameters. Custom parameters must not start with `$`.
    */
  var custom: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Value for the OData `$expand` query option parameter which is included in the request after URL encoding
    * of the given value.
    */
  var expand: js.UndefOr[String] = js.undefined
  
  /**
    * The group id to be used for requests originating from the binding
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * Value for the OData `$select` query option parameter which is included in the request after URL encoding
    * of the given value.
    */
  var select: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a preliminary context is used. When set to `true`, the model can bundle the OData calls for dependent
    * bindings into fewer $batch requests. For more information, see {@link topic:6c47b2b39db9404582994070ec3d57a2#loio62149734b5c24507868e722fe87a75db
    * Optimizing Dependent Bindings}.
    */
  var usePreliminaryContext: js.UndefOr[Boolean] = js.undefined
}
object BatchGroupId {
  
  inline def apply(): BatchGroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGroupId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGroupId] (val x: Self) extends AnyVal {
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setCreatePreliminaryContext(value: Boolean): Self = StObject.set(x, "createPreliminaryContext", value.asInstanceOf[js.Any])
    
    inline def setCreatePreliminaryContextUndefined: Self = StObject.set(x, "createPreliminaryContext", js.undefined)
    
    inline def setCustom(value: Record[String, String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setUsePreliminaryContext(value: Boolean): Self = StObject.set(x, "usePreliminaryContext", value.asInstanceOf[js.Any])
    
    inline def setUsePreliminaryContextUndefined: Self = StObject.set(x, "usePreliminaryContext", js.undefined)
  }
}
