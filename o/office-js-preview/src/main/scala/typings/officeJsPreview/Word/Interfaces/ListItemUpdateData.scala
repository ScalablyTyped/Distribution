package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ListItem object, for use in `listItem.set({ ... })`. */
trait ListItemUpdateData extends StObject {
  
  /**
    * Gets or sets the level of the item in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Double] = js.undefined
}
object ListItemUpdateData {
  
  inline def apply(): ListItemUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemUpdateData]
  }
  
  extension [Self <: ListItemUpdateData](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
