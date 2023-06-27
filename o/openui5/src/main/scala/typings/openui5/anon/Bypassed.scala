package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bypassed extends StObject {
  
  /**
    * Since 1.34. Whether views are loaded asynchronously within this router instance. As of 1.90 synchronous
    * routing is deprecated. Therefore, you should explicitly set `oConfig.async` to `true`.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Since 1.28. Settings which are used when no route of the router is matched after a hash change.
    */
  var bypassed: js.UndefOr[Target] = js.undefined
}
object Bypassed {
  
  inline def apply(): Bypassed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bypassed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bypassed] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBypassed(value: Target): Self = StObject.set(x, "bypassed", value.asInstanceOf[js.Any])
    
    inline def setBypassedUndefined: Self = StObject.set(x, "bypassed", js.undefined)
  }
}
