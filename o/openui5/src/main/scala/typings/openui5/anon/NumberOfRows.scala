package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberOfRows extends StObject {
  
  /**
    * The value of the numberOfRows property after the change.
    */
  var numberOfRows: js.UndefOr[int] = js.undefined
  
  /**
    * The value of the numberOfRows property before the change.
    */
  var previousNumberOfRows: js.UndefOr[int] = js.undefined
}
object NumberOfRows {
  
  inline def apply(): NumberOfRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOfRows]
  }
  
  extension [Self <: NumberOfRows](x: Self) {
    
    inline def setNumberOfRows(value: int): Self = StObject.set(x, "numberOfRows", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRowsUndefined: Self = StObject.set(x, "numberOfRows", js.undefined)
    
    inline def setPreviousNumberOfRows(value: int): Self = StObject.set(x, "previousNumberOfRows", value.asInstanceOf[js.Any])
    
    inline def setPreviousNumberOfRowsUndefined: Self = StObject.set(x, "previousNumberOfRows", js.undefined)
  }
}
