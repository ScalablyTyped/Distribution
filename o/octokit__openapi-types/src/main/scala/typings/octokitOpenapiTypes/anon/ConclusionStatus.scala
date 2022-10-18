package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConclusionStatus
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var conclusion: Any
  
  /** @enum {undefined} */
  var status: js.UndefOr[completed] = js.undefined
}
object ConclusionStatus {
  
  inline def apply(conclusion: Any): ConclusionStatus = {
    val __obj = js.Dynamic.literal(conclusion = conclusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConclusionStatus]
  }
  
  extension [Self <: ConclusionStatus](x: Self) {
    
    inline def setConclusion(value: Any): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
