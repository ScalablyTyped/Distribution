package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchIndex extends StObject {
  
  var element: js.UndefOr[Null] = js.undefined
  
  var matchIndex: js.UndefOr[Double] = js.undefined
  
  var pageIndex: js.UndefOr[Double] = js.undefined
  
  var selectedLeft: js.UndefOr[Double] = js.undefined
}
object MatchIndex {
  
  inline def apply(): MatchIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchIndex]
  }
  
  extension [Self <: MatchIndex](x: Self) {
    
    inline def setMatchIndex(value: Double): Self = StObject.set(x, "matchIndex", value.asInstanceOf[js.Any])
    
    inline def setMatchIndexUndefined: Self = StObject.set(x, "matchIndex", js.undefined)
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
    
    inline def setSelectedLeft(value: Double): Self = StObject.set(x, "selectedLeft", value.asInstanceOf[js.Any])
    
    inline def setSelectedLeftUndefined: Self = StObject.set(x, "selectedLeft", js.undefined)
  }
}
