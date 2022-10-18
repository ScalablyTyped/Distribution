package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountMode extends StObject {
  
  /**
    * Defines the count mode of the new binding; if not specified, the default count mode of this model will
    * be applied
    */
  var countMode: js.UndefOr[
    typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String)
  ] = js.undefined
  
  /**
    * Optional map of custom query parameters (name/value pairs); names of custom parameters must not start
    * with `$`
    */
  var custom: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Value for the OData `$expand` query parameter which should be included in the request
    */
  var expand: js.UndefOr[String] = js.undefined
  
  /**
    * Value for the OData `$select` query parameter which should be included in the request
    */
  var select: js.UndefOr[String] = js.undefined
}
object CountMode {
  
  inline def apply(): CountMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountMode]
  }
  
  extension [Self <: CountMode](x: Self) {
    
    inline def setCountMode(
      value: typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String)
    ): Self = StObject.set(x, "countMode", value.asInstanceOf[js.Any])
    
    inline def setCountModeUndefined: Self = StObject.set(x, "countMode", js.undefined)
    
    inline def setCustom(value: Record[String, String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
