package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameSilent
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var silent: js.UndefOr[Boolean] = js.undefined
}
object DictpropNameSilent {
  
  inline def apply(): DictpropNameSilent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropNameSilent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictpropNameSilent] (val x: Self) extends AnyVal {
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
