package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameDeferred
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var deferred: js.UndefOr[Boolean] = js.undefined
}
object DictpropNameDeferred {
  
  inline def apply(): DictpropNameDeferred = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropNameDeferred]
  }
  
  extension [Self <: DictpropNameDeferred](x: Self) {
    
    inline def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
  }
}
