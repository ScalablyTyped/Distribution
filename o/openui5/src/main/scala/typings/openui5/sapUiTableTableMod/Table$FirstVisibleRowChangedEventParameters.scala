package typings.openui5.sapUiTableTableMod

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table$FirstVisibleRowChangedEventParameters extends StObject {
  
  /**
    * First visible row
    */
  var firstVisibleRow: js.UndefOr[int] = js.undefined
}
object Table$FirstVisibleRowChangedEventParameters {
  
  inline def apply(): Table$FirstVisibleRowChangedEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table$FirstVisibleRowChangedEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Table$FirstVisibleRowChangedEventParameters] (val x: Self) extends AnyVal {
    
    inline def setFirstVisibleRow(value: int): Self = StObject.set(x, "firstVisibleRow", value.asInstanceOf[js.Any])
    
    inline def setFirstVisibleRowUndefined: Self = StObject.set(x, "firstVisibleRow", js.undefined)
  }
}
