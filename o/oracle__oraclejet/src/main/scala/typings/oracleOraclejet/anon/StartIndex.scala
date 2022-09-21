package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartIndex
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
}
object StartIndex {
  
  inline def apply(): StartIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartIndex]
  }
  
  extension [Self <: StartIndex](x: Self) {
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
