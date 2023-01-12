package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomUUIDOptions extends StObject {
  
  /**
    * By default, to improve performance,
    * Node.js will pre-emptively generate and persistently cache enough
    * random data to generate up to 128 random UUIDs. To generate a UUID
    * without using the cache, set `disableEntropyCache` to `true`.
    *
    * @default `false`
    */
  var disableEntropyCache: js.UndefOr[Boolean] = js.undefined
}
object RandomUUIDOptions {
  
  inline def apply(): RandomUUIDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomUUIDOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RandomUUIDOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableEntropyCache(value: Boolean): Self = StObject.set(x, "disableEntropyCache", value.asInstanceOf[js.Any])
    
    inline def setDisableEntropyCacheUndefined: Self = StObject.set(x, "disableEntropyCache", js.undefined)
  }
}
