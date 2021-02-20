package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddButton extends StObject {
  
  var addButton: js.UndefOr[String | js.Function0[Unit]] = js.native
  
  var addButtonCaption: js.UndefOr[String] = js.native
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var element: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  var menu: js.UndefOr[Boolean] = js.native
  
  var minimumActiveTabWidth: js.UndefOr[Double] = js.native
  
  var onchange: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.native
  
  var onclick: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.native
  
  var ondblclick: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.native
  
  var onremove: js.UndefOr[js.Function1[/* item */ js.Object, Unit]] = js.native
  
  var onselect: js.UndefOr[js.Function1[/* selection */ js.Array[String], Unit]] = js.native
  
  var scrollable: js.UndefOr[Boolean] = js.native
  
  var searchButton: js.UndefOr[String | js.Function0[Unit]] = js.native
  
  var searchButtonCaption: js.UndefOr[String] = js.native
  
  var vertical: js.UndefOr[Boolean] = js.native
}
object AddButton {
  
  @scala.inline
  def apply(): AddButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddButton]
  }
  
  @scala.inline
  implicit class AddButtonMutableBuilder[Self <: AddButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddButton(value: String | js.Function0[Unit]): Self = StObject.set(x, "addButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddButtonCaption(value: String): Self = StObject.set(x, "addButtonCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddButtonCaptionUndefined: Self = StObject.set(x, "addButtonCaption", js.undefined)
    
    @scala.inline
    def setAddButtonFunction0(value: () => Unit): Self = StObject.set(x, "addButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddButtonUndefined: Self = StObject.set(x, "addButton", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setMinimumActiveTabWidth(value: Double): Self = StObject.set(x, "minimumActiveTabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumActiveTabWidthUndefined: Self = StObject.set(x, "minimumActiveTabWidth", js.undefined)
    
    @scala.inline
    def setOnchange(value: /* item */ String => Unit): Self = StObject.set(x, "onchange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* item */ String => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setOndblclick(value: /* item */ String => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    @scala.inline
    def setOnremove(value: /* item */ js.Object => Unit): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
    
    @scala.inline
    def setOnselect(value: /* selection */ js.Array[String] => Unit): Self = StObject.set(x, "onselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSearchButton(value: String | js.Function0[Unit]): Self = StObject.set(x, "searchButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchButtonCaption(value: String): Self = StObject.set(x, "searchButtonCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchButtonCaptionUndefined: Self = StObject.set(x, "searchButtonCaption", js.undefined)
    
    @scala.inline
    def setSearchButtonFunction0(value: () => Unit): Self = StObject.set(x, "searchButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearchButtonUndefined: Self = StObject.set(x, "searchButton", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
