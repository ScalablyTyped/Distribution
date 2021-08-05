package typings.openfin.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LEI
  extends StObject
     with /* key */ StringDictionary[String] {
  
  var LEI: js.UndefOr[String] = js.undefined
  
  var PERMID: js.UndefOr[String] = js.undefined
}
object LEI {
  
  inline def apply(): LEI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LEI]
  }
  
  extension [Self <: LEI](x: Self) {
    
    inline def setLEI(value: String): Self = StObject.set(x, "LEI", value.asInstanceOf[js.Any])
    
    inline def setLEIUndefined: Self = StObject.set(x, "LEI", js.undefined)
    
    inline def setPERMID(value: String): Self = StObject.set(x, "PERMID", value.asInstanceOf[js.Any])
    
    inline def setPERMIDUndefined: Self = StObject.set(x, "PERMID", js.undefined)
  }
}
