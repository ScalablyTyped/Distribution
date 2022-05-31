package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameSilent
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var silent: js.UndefOr[Boolean] = js.undefined
}
object DictpropNameSilent {
  
  inline def apply(): DictpropNameSilent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropNameSilent]
  }
  
  extension [Self <: DictpropNameSilent](x: Self) {
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
