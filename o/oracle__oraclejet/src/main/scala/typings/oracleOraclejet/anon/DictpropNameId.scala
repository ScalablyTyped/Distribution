package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameId
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var id: Any
}
object DictpropNameId {
  
  inline def apply(id: Any): DictpropNameId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameId]
  }
  
  extension [Self <: DictpropNameId](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
