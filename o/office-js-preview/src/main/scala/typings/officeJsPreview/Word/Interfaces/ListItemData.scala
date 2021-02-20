package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `listItem.toJSON()`. */
@js.native
trait ListItemData extends StObject {
  
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    *
    * Gets the list item bullet, number, or picture as a string. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listString: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the list item order number in relation to its siblings. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var siblingIndex: js.UndefOr[Double] = js.native
}
object ListItemData {
  
  @scala.inline
  def apply(): ListItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemData]
  }
  
  @scala.inline
  implicit class ListItemDataMutableBuilder[Self <: ListItemData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setListString(value: String): Self = StObject.set(x, "listString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStringUndefined: Self = StObject.set(x, "listString", js.undefined)
    
    @scala.inline
    def setSiblingIndex(value: Double): Self = StObject.set(x, "siblingIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingIndexUndefined: Self = StObject.set(x, "siblingIndex", js.undefined)
  }
}
