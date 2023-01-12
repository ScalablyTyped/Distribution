package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyConclusion
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var conclusion: Any
  
  /** @enum {undefined} */
  var status: js.UndefOr[completed] = js.undefined
}
object DictkeyConclusion {
  
  inline def apply(conclusion: Any): DictkeyConclusion = {
    val __obj = js.Dynamic.literal(conclusion = conclusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkeyConclusion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkeyConclusion] (val x: Self) extends AnyVal {
    
    inline def setConclusion(value: Any): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
