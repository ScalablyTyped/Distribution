package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includeenterpriseslug extends StObject {
  
  /**
    * @description Whether the enterprise customer requested a custom issuer URL.
    * @example true
    */
  var include_enterprise_slug: js.UndefOr[Boolean] = js.undefined
}
object Includeenterpriseslug {
  
  inline def apply(): Includeenterpriseslug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Includeenterpriseslug]
  }
  
  extension [Self <: Includeenterpriseslug](x: Self) {
    
    inline def setInclude_enterprise_slug(value: Boolean): Self = StObject.set(x, "include_enterprise_slug", value.asInstanceOf[js.Any])
    
    inline def setInclude_enterprise_slugUndefined: Self = StObject.set(x, "include_enterprise_slug", js.undefined)
  }
}
