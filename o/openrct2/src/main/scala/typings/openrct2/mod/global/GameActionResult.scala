package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameActionResult extends StObject {
  
  var cost: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[Double] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var errorTitle: js.UndefOr[String] = js.undefined
  
  var expenditureType: js.UndefOr[ExpenditureType] = js.undefined
  
  var position: js.UndefOr[CoordsXYZ] = js.undefined
}
object GameActionResult {
  
  inline def apply(): GameActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameActionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameActionResult] (val x: Self) extends AnyVal {
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorTitle(value: String): Self = StObject.set(x, "errorTitle", value.asInstanceOf[js.Any])
    
    inline def setErrorTitleUndefined: Self = StObject.set(x, "errorTitle", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpenditureType(value: ExpenditureType): Self = StObject.set(x, "expenditureType", value.asInstanceOf[js.Any])
    
    inline def setExpenditureTypeUndefined: Self = StObject.set(x, "expenditureType", js.undefined)
    
    inline def setPosition(value: CoordsXYZ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
