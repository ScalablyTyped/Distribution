package typings.miniprogram.anon

import typings.miniprogram.EmptyFn
import typings.miniprogram.OnPullDownRefresh
import typings.miniprogram.OnTabItemTap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeTabItemTap extends js.Object {
  
  var beforeTabItemTap: js.UndefOr[EmptyFn] = js.native
  
  var onBack: js.UndefOr[EmptyFn] = js.native
  
  var onKeyboardHeight: js.UndefOr[EmptyFn] = js.native
  
  var onOptionMenuClick: js.UndefOr[EmptyFn] = js.native
  
  var onPopMenuClick: js.UndefOr[EmptyFn] = js.native
  
  var onPullDownRefresh: js.UndefOr[OnPullDownRefresh] = js.native
  
  var onPullIntercept: js.UndefOr[EmptyFn] = js.native
  
  var onResize: js.UndefOr[js.Function1[/* opts */ SizeWindowHeight, Unit]] = js.native
  
  var onTabItemTap: js.UndefOr[OnTabItemTap] = js.native
  
  var onTitleClick: js.UndefOr[EmptyFn] = js.native
}
object BeforeTabItemTap {
  
  @scala.inline
  def apply(): BeforeTabItemTap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeTabItemTap]
  }
  
  @scala.inline
  implicit class BeforeTabItemTapOps[Self <: BeforeTabItemTap] (val x: Self) extends AnyVal {
    
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
    def setBeforeTabItemTap(value: () => Unit): Self = this.set("beforeTabItemTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeTabItemTap: Self = this.set("beforeTabItemTap", js.undefined)
    
    @scala.inline
    def setOnBack(value: () => Unit): Self = this.set("onBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBack: Self = this.set("onBack", js.undefined)
    
    @scala.inline
    def setOnKeyboardHeight(value: () => Unit): Self = this.set("onKeyboardHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnKeyboardHeight: Self = this.set("onKeyboardHeight", js.undefined)
    
    @scala.inline
    def setOnOptionMenuClick(value: () => Unit): Self = this.set("onOptionMenuClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOptionMenuClick: Self = this.set("onOptionMenuClick", js.undefined)
    
    @scala.inline
    def setOnPopMenuClick(value: () => Unit): Self = this.set("onPopMenuClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPopMenuClick: Self = this.set("onPopMenuClick", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: /* opts */ Form => Unit): Self = this.set("onPullDownRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPullDownRefresh: Self = this.set("onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnPullIntercept(value: () => Unit): Self = this.set("onPullIntercept", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPullIntercept: Self = this.set("onPullIntercept", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* opts */ SizeWindowHeight => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnTabItemTap(value: /* obj */ From => Unit): Self = this.set("onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTabItemTap: Self = this.set("onTabItemTap", js.undefined)
    
    @scala.inline
    def setOnTitleClick(value: () => Unit): Self = this.set("onTitleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTitleClick: Self = this.set("onTitleClick", js.undefined)
  }
}
