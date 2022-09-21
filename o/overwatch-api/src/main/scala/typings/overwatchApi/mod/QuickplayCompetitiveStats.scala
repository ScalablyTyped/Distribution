package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickplayCompetitiveStats extends StObject {
  
  var competitive: js.Array[Stat]
  
  var quickplay: js.Array[Stat]
}
object QuickplayCompetitiveStats {
  
  inline def apply(competitive: js.Array[Stat], quickplay: js.Array[Stat]): QuickplayCompetitiveStats = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickplayCompetitiveStats]
  }
  
  extension [Self <: QuickplayCompetitiveStats](x: Self) {
    
    inline def setCompetitive(value: js.Array[Stat]): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
    
    inline def setCompetitiveVarargs(value: Stat*): Self = StObject.set(x, "competitive", js.Array(value*))
    
    inline def setQuickplay(value: js.Array[Stat]): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    
    inline def setQuickplayVarargs(value: Stat*): Self = StObject.set(x, "quickplay", js.Array(value*))
  }
}
