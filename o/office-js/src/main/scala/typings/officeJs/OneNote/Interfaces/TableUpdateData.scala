package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Table object, for use in "table.set({ ... })". */
trait TableUpdateData extends StObject {
  
  /**
    *
    * Gets or sets whether the borders are visible or not. True if they are visible, false if they are hidden.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var borderVisible: js.UndefOr[Boolean] = js.undefined
}
object TableUpdateData {
  
  inline def apply(): TableUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableUpdateData]
  }
  
  extension [Self <: TableUpdateData](x: Self) {
    
    inline def setBorderVisible(value: Boolean): Self = StObject.set(x, "borderVisible", value.asInstanceOf[js.Any])
    
    inline def setBorderVisibleUndefined: Self = StObject.set(x, "borderVisible", js.undefined)
  }
}
