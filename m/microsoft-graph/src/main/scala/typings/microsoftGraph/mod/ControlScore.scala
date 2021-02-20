package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlScore extends StObject {
  
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[NullableOption[String]] = js.native
  
  // Control unique name.
  var controlName: js.UndefOr[NullableOption[String]] = js.native
  
  // Description of the control.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
  var score: js.UndefOr[NullableOption[Double]] = js.native
}
object ControlScore {
  
  @scala.inline
  def apply(): ControlScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlScore]
  }
  
  @scala.inline
  implicit class ControlScoreMutableBuilder[Self <: ControlScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlCategory(value: NullableOption[String]): Self = StObject.set(x, "controlCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlCategoryNull: Self = StObject.set(x, "controlCategory", null)
    
    @scala.inline
    def setControlCategoryUndefined: Self = StObject.set(x, "controlCategory", js.undefined)
    
    @scala.inline
    def setControlName(value: NullableOption[String]): Self = StObject.set(x, "controlName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlNameNull: Self = StObject.set(x, "controlName", null)
    
    @scala.inline
    def setControlNameUndefined: Self = StObject.set(x, "controlName", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setScore(value: NullableOption[Double]): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreNull: Self = StObject.set(x, "score", null)
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
