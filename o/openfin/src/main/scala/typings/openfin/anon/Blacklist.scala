package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blacklist extends StObject {
  
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}
object Blacklist {
  
  inline def apply(): Blacklist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blacklist]
  }
  
  extension [Self <: Blacklist](x: Self) {
    
    inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
    
    inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
  }
}
