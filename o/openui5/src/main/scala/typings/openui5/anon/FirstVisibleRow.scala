package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstVisibleRow extends StObject {
  
  /**
    * First visible row
    */
  var firstVisibleRow: js.UndefOr[int] = js.undefined
}
object FirstVisibleRow {
  
  inline def apply(): FirstVisibleRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstVisibleRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstVisibleRow] (val x: Self) extends AnyVal {
    
    inline def setFirstVisibleRow(value: int): Self = StObject.set(x, "firstVisibleRow", value.asInstanceOf[js.Any])
    
    inline def setFirstVisibleRowUndefined: Self = StObject.set(x, "firstVisibleRow", js.undefined)
  }
}
