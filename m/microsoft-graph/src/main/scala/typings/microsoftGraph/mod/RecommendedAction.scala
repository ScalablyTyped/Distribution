package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendedAction extends StObject {
  
  // Web URL to the recommended action.
  var actionWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Potential improvement in the tenant security score from the recommended action.
  var potentialScoreImpact: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Title of the recommended action.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
}
object RecommendedAction {
  
  inline def apply(): RecommendedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendedAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendedAction] (val x: Self) extends AnyVal {
    
    inline def setActionWebUrl(value: NullableOption[String]): Self = StObject.set(x, "actionWebUrl", value.asInstanceOf[js.Any])
    
    inline def setActionWebUrlNull: Self = StObject.set(x, "actionWebUrl", null)
    
    inline def setActionWebUrlUndefined: Self = StObject.set(x, "actionWebUrl", js.undefined)
    
    inline def setPotentialScoreImpact(value: NullableOption[Double]): Self = StObject.set(x, "potentialScoreImpact", value.asInstanceOf[js.Any])
    
    inline def setPotentialScoreImpactNull: Self = StObject.set(x, "potentialScoreImpact", null)
    
    inline def setPotentialScoreImpactUndefined: Self = StObject.set(x, "potentialScoreImpact", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
