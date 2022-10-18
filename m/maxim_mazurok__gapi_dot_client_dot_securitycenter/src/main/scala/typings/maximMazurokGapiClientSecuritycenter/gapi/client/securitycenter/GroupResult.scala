package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupResult extends StObject {
  
  /** Total count of resources for the given properties. */
  var count: js.UndefOr[String] = js.undefined
  
  /** Properties matching the groupBy fields in the request. */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object GroupResult {
  
  inline def apply(): GroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupResult]
  }
  
  extension [Self <: GroupResult](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
