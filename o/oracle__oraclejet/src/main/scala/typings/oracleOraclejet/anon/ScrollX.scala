package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollX
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var scrollX: Double
  
  var scrollY: Double
}
object ScrollX {
  
  inline def apply(scrollX: Double, scrollY: Double): ScrollX = {
    val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollX] (val x: Self) extends AnyVal {
    
    inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
  }
}
