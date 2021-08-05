package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlScore extends StObject {
  
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Control unique name.
  var controlName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Description of the control.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
  var score: js.UndefOr[NullableOption[Double]] = js.undefined
}
object ControlScore {
  
  inline def apply(): ControlScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlScore]
  }
  
  extension [Self <: ControlScore](x: Self) {
    
    inline def setControlCategory(value: NullableOption[String]): Self = StObject.set(x, "controlCategory", value.asInstanceOf[js.Any])
    
    inline def setControlCategoryNull: Self = StObject.set(x, "controlCategory", null)
    
    inline def setControlCategoryUndefined: Self = StObject.set(x, "controlCategory", js.undefined)
    
    inline def setControlName(value: NullableOption[String]): Self = StObject.set(x, "controlName", value.asInstanceOf[js.Any])
    
    inline def setControlNameNull: Self = StObject.set(x, "controlName", null)
    
    inline def setControlNameUndefined: Self = StObject.set(x, "controlName", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setScore(value: NullableOption[Double]): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
