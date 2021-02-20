package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the paragraph list item format.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait ListItemLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the list item bullet, number, or picture as a string. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listString: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the list item order number in relation to its siblings. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var siblingIndex: js.UndefOr[Boolean] = js.native
}
object ListItemLoadOptions {
  
  @scala.inline
  def apply(): ListItemLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemLoadOptions]
  }
  
  @scala.inline
  implicit class ListItemLoadOptionsMutableBuilder[Self <: ListItemLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setListString(value: Boolean): Self = StObject.set(x, "listString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStringUndefined: Self = StObject.set(x, "listString", js.undefined)
    
    @scala.inline
    def setSiblingIndex(value: Boolean): Self = StObject.set(x, "siblingIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiblingIndexUndefined: Self = StObject.set(x, "siblingIndex", js.undefined)
  }
}
