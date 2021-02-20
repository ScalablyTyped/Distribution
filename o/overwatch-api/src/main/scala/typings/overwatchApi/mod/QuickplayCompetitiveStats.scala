package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickplayCompetitiveStats extends StObject {
  
  var competitive: js.Array[Stat] = js.native
  
  var quickplay: js.Array[Stat] = js.native
}
object QuickplayCompetitiveStats {
  
  @scala.inline
  def apply(competitive: js.Array[Stat], quickplay: js.Array[Stat]): QuickplayCompetitiveStats = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickplayCompetitiveStats]
  }
  
  @scala.inline
  implicit class QuickplayCompetitiveStatsMutableBuilder[Self <: QuickplayCompetitiveStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompetitive(value: js.Array[Stat]): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompetitiveVarargs(value: Stat*): Self = StObject.set(x, "competitive", js.Array(value :_*))
    
    @scala.inline
    def setQuickplay(value: js.Array[Stat]): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickplayVarargs(value: Stat*): Self = StObject.set(x, "quickplay", js.Array(value :_*))
  }
}
