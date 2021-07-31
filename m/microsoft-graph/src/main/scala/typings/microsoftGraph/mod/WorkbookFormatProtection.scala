package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookFormatProtection
  extends StObject
     with Entity {
  
  /**
    * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't
    * have uniform formula hidden setting.
    */
  var formulaHidden: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform
    * lock setting.
    */
  var locked: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object WorkbookFormatProtection {
  
  @scala.inline
  def apply(): WorkbookFormatProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFormatProtection]
  }
  
  @scala.inline
  implicit class WorkbookFormatProtectionMutableBuilder[Self <: WorkbookFormatProtection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormulaHidden(value: NullableOption[Boolean]): Self = StObject.set(x, "formulaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaHiddenNull: Self = StObject.set(x, "formulaHidden", null)
    
    @scala.inline
    def setFormulaHiddenUndefined: Self = StObject.set(x, "formulaHidden", js.undefined)
    
    @scala.inline
    def setLocked(value: NullableOption[Boolean]): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedNull: Self = StObject.set(x, "locked", null)
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}
