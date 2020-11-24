package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddButton extends js.Object {
  
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
  implicit class AddButtonOps[Self <: AddButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddButtonFunction0(value: () => Unit): Self = this.set("addButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddButton(value: String | js.Function0[Unit]): Self = this.set("addButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddButton: Self = this.set("addButton", js.undefined)
    
    @scala.inline
    def setAddButtonCaption(value: String): Self = this.set("addButtonCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddButtonCaption: Self = this.set("addButtonCaption", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setElement(value: JQuery[HTMLElement]): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setMenu(value: Boolean): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMinimumActiveTabWidth(value: Double): Self = this.set("minimumActiveTabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumActiveTabWidth: Self = this.set("minimumActiveTabWidth", js.undefined)
    
    @scala.inline
    def setOnchange(value: /* item */ String => Unit): Self = this.set("onchange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* item */ String => Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setOndblclick(value: /* item */ String => Unit): Self = this.set("ondblclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    
    @scala.inline
    def setOnremove(value: /* item */ js.Object => Unit): Self = this.set("onremove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnremove: Self = this.set("onremove", js.undefined)
    
    @scala.inline
    def setOnselect(value: /* selection */ js.Array[String] => Unit): Self = this.set("onselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSearchButtonFunction0(value: () => Unit): Self = this.set("searchButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSearchButton(value: String | js.Function0[Unit]): Self = this.set("searchButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchButton: Self = this.set("searchButton", js.undefined)
    
    @scala.inline
    def setSearchButtonCaption(value: String): Self = this.set("searchButtonCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchButtonCaption: Self = this.set("searchButtonCaption", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
