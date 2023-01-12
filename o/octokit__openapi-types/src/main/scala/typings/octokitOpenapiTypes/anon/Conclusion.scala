package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conclusion
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var conclusion: Any
  
  /** @enum {undefined} */
  var status: completed
}
object Conclusion {
  
  inline def apply(conclusion: Any): Conclusion = {
    val __obj = js.Dynamic.literal(conclusion = conclusion.asInstanceOf[js.Any], status = "completed")
    __obj.asInstanceOf[Conclusion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conclusion] (val x: Self) extends AnyVal {
    
    inline def setConclusion(value: Any): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
