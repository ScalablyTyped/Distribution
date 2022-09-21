package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchIdx extends StObject {
  
  var matchIdx: Double
  
  var pageIdx: Double
}
object MatchIdx {
  
  inline def apply(matchIdx: Double, pageIdx: Double): MatchIdx = {
    val __obj = js.Dynamic.literal(matchIdx = matchIdx.asInstanceOf[js.Any], pageIdx = pageIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchIdx]
  }
  
  extension [Self <: MatchIdx](x: Self) {
    
    inline def setMatchIdx(value: Double): Self = StObject.set(x, "matchIdx", value.asInstanceOf[js.Any])
    
    inline def setPageIdx(value: Double): Self = StObject.set(x, "pageIdx", value.asInstanceOf[js.Any])
  }
}
