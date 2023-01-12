package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom extends StObject {
  
  /**
    * Optional map of custom query parameters, names of custom parameters must not start with `$`.
    */
  var custom: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Value for the OData `$expand` query parameter which should be included in the request
    */
  var expand: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a preliminary context will be created. When set to `true`, the model can bundle the OData calls
    * for dependent bindings into fewer $batch requests. For more information, see {@link topic:6c47b2b39db9404582994070ec3d57a2#loio62149734b5c24507868e722fe87a75db
    * Optimizing Dependent Bindings}
    */
  var preliminaryContext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value for the OData `$select` query parameter which should be included in the request
    */
  var select: js.UndefOr[String] = js.undefined
}
object Custom {
  
  inline def apply(): Custom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Custom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Record[String, String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setPreliminaryContext(value: Boolean): Self = StObject.set(x, "preliminaryContext", value.asInstanceOf[js.Any])
    
    inline def setPreliminaryContextUndefined: Self = StObject.set(x, "preliminaryContext", js.undefined)
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
