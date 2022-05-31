package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deferred
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var deferred: js.UndefOr[Boolean] = js.undefined
  
  var fetchSize: js.UndefOr[Double] = js.undefined
}
object Deferred {
  
  inline def apply(): Deferred = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deferred]
  }
  
  extension [Self <: Deferred](x: Self) {
    
    inline def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    inline def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    inline def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
  }
}
