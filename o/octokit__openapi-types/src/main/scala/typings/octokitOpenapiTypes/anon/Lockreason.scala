package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`off-topic`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`too heated`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.spam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lockreason extends StObject {
  
  /**
    * @description The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:
    * \* `off-topic`
    * \* `too heated`
    * \* `resolved`
    * \* `spam`
    * @enum {string}
    */
  var lock_reason: js.UndefOr[`off-topic` | (`too heated`) | resolved | spam] = js.undefined
}
object Lockreason {
  
  inline def apply(): Lockreason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lockreason]
  }
  
  extension [Self <: Lockreason](x: Self) {
    
    inline def setLock_reason(value: `off-topic` | (`too heated`) | resolved | spam): Self = StObject.set(x, "lock_reason", value.asInstanceOf[js.Any])
    
    inline def setLock_reasonUndefined: Self = StObject.set(x, "lock_reason", js.undefined)
  }
}
