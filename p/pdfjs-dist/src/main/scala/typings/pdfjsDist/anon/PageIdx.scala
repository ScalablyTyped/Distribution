package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageIdx extends StObject {
  
  var matchIdx: Null
  
  var pageIdx: Null
  
  var wrapped: Boolean
}
object PageIdx {
  
  inline def apply(matchIdx: Null, pageIdx: Null, wrapped: Boolean): PageIdx = {
    val __obj = js.Dynamic.literal(matchIdx = matchIdx.asInstanceOf[js.Any], pageIdx = pageIdx.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageIdx]
  }
  
  extension [Self <: PageIdx](x: Self) {
    
    inline def setMatchIdx(value: Null): Self = StObject.set(x, "matchIdx", value.asInstanceOf[js.Any])
    
    inline def setPageIdx(value: Null): Self = StObject.set(x, "pageIdx", value.asInstanceOf[js.Any])
    
    inline def setWrapped(value: Boolean): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
  }
}
