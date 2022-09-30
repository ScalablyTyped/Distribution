package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `listItem.toJSON()`. */
trait ListItemData extends StObject {
  
  /**
    * Gets or sets the level of the item in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the list item bullet, number, or picture as a string.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var listString: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the list item order number in relation to its siblings.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var siblingIndex: js.UndefOr[Double] = js.undefined
}
object ListItemData {
  
  inline def apply(): ListItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemData]
  }
  
  extension [Self <: ListItemData](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setListString(value: String): Self = StObject.set(x, "listString", value.asInstanceOf[js.Any])
    
    inline def setListStringUndefined: Self = StObject.set(x, "listString", js.undefined)
    
    inline def setSiblingIndex(value: Double): Self = StObject.set(x, "siblingIndex", value.asInstanceOf[js.Any])
    
    inline def setSiblingIndexUndefined: Self = StObject.set(x, "siblingIndex", js.undefined)
  }
}
