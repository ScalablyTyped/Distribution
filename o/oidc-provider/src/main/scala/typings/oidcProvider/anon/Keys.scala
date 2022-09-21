package typings.oidcProvider.anon

import typings.node.bufferMod.global.Buffer
import typings.oidcProvider.mod.CookiesSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keys extends StObject {
  
  var keys: js.UndefOr[js.Array[String | Buffer]] = js.undefined
  
  var long: js.UndefOr[CookiesSetOptions] = js.undefined
  
  var names: js.UndefOr[Interaction] = js.undefined
  
  var short: js.UndefOr[CookiesSetOptions] = js.undefined
}
object Keys {
  
  inline def apply(): Keys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Keys]
  }
  
  extension [Self <: Keys](x: Self) {
    
    inline def setKeys(value: js.Array[String | Buffer]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: (String | Buffer)*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLong(value: CookiesSetOptions): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    inline def setNames(value: Interaction): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setShort(value: CookiesSetOptions): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
  }
}
