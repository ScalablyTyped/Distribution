package typings.openui5.anon

import typings.openui5.sapMLibraryMod.SwipeDirection
import typings.openui5.sapMListItemBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeContent extends StObject {
  
  /**
    * The item which fired the swipe.
    */
  var listItem: js.UndefOr[default] = js.undefined
  
  /**
    * Holds which control caused the swipe event within the item.
    */
  var srcControl: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  
  /**
    * Aggregated `swipeContent` control that is shown on the right hand side of the item.
    */
  var swipeContent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  
  /**
    * Shows in which direction the user swipes and can have the value `BeginToEnd` (left to right in LTR languages
    * and right to left in RTL languages) or `EndToBegin` (right to left in LTR languages and left to right
    * in RTL languages)
    */
  var swipeDirection: js.UndefOr[
    SwipeDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwipeDirection * / any */ String)
  ] = js.undefined
}
object SwipeContent {
  
  inline def apply(): SwipeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwipeContent] (val x: Self) extends AnyVal {
    
    inline def setListItem(value: default): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    inline def setSrcControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "srcControl", value.asInstanceOf[js.Any])
    
    inline def setSrcControlUndefined: Self = StObject.set(x, "srcControl", js.undefined)
    
    inline def setSwipeContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "swipeContent", value.asInstanceOf[js.Any])
    
    inline def setSwipeContentUndefined: Self = StObject.set(x, "swipeContent", js.undefined)
    
    inline def setSwipeDirection(
      value: SwipeDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwipeDirection * / any */ String)
    ): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
    
    inline def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
  }
}
