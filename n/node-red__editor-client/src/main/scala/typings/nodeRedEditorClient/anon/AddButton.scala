package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddButton extends StObject {
  
  var addButton: js.UndefOr[String | js.Function0[Unit]] = js.undefined
  
  var addButtonCaption: js.UndefOr[String] = js.undefined
  
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  var element: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  
  var menu: js.UndefOr[Boolean] = js.undefined
  
  var minimumActiveTabWidth: js.UndefOr[Double] = js.undefined
  
  var onchange: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.undefined
  
  var onclick: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.undefined
  
  var ondblclick: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.undefined
  
  var onremove: js.UndefOr[js.Function1[/* item */ js.Object, Unit]] = js.undefined
  
  var onselect: js.UndefOr[js.Function1[/* selection */ js.Array[String], Unit]] = js.undefined
  
  var scrollable: js.UndefOr[Boolean] = js.undefined
  
  var searchButton: js.UndefOr[String | js.Function0[Unit]] = js.undefined
  
  var searchButtonCaption: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object AddButton {
  
  inline def apply(): AddButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddButton] (val x: Self) extends AnyVal {
    
    inline def setAddButton(value: String | js.Function0[Unit]): Self = StObject.set(x, "addButton", value.asInstanceOf[js.Any])
    
    inline def setAddButtonCaption(value: String): Self = StObject.set(x, "addButtonCaption", value.asInstanceOf[js.Any])
    
    inline def setAddButtonCaptionUndefined: Self = StObject.set(x, "addButtonCaption", js.undefined)
    
    inline def setAddButtonFunction0(value: () => Unit): Self = StObject.set(x, "addButton", js.Any.fromFunction0(value))
    
    inline def setAddButtonUndefined: Self = StObject.set(x, "addButton", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setMinimumActiveTabWidth(value: Double): Self = StObject.set(x, "minimumActiveTabWidth", value.asInstanceOf[js.Any])
    
    inline def setMinimumActiveTabWidthUndefined: Self = StObject.set(x, "minimumActiveTabWidth", js.undefined)
    
    inline def setOnchange(value: /* item */ String => Unit): Self = StObject.set(x, "onchange", js.Any.fromFunction1(value))
    
    inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
    
    inline def setOnclick(value: /* item */ String => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setOndblclick(value: /* item */ String => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    inline def setOnremove(value: /* item */ js.Object => Unit): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    inline def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
    
    inline def setOnselect(value: /* selection */ js.Array[String] => Unit): Self = StObject.set(x, "onselect", js.Any.fromFunction1(value))
    
    inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
    
    inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setSearchButton(value: String | js.Function0[Unit]): Self = StObject.set(x, "searchButton", value.asInstanceOf[js.Any])
    
    inline def setSearchButtonCaption(value: String): Self = StObject.set(x, "searchButtonCaption", value.asInstanceOf[js.Any])
    
    inline def setSearchButtonCaptionUndefined: Self = StObject.set(x, "searchButtonCaption", js.undefined)
    
    inline def setSearchButtonFunction0(value: () => Unit): Self = StObject.set(x, "searchButton", js.Any.fromFunction0(value))
    
    inline def setSearchButtonUndefined: Self = StObject.set(x, "searchButton", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
