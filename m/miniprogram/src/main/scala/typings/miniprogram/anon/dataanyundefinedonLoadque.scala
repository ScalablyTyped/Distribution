package typings.miniprogram.anon

import org.scalablytyped.runtime.StringDictionary
import typings.miniprogram.EmptyFn
import typings.miniprogram.OnPullDownRefresh
import typings.miniprogram.OnTabItemTap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  data :any | undefined,   onLoad :(query : any | undefined): void | undefined,   onShow :miniprogram.EmptyFn | undefined,   onReady :miniprogram.EmptyFn | undefined,   onHide :miniprogram.EmptyFn | undefined,   onUnload :miniprogram.EmptyFn | undefined,   onTitleClick :miniprogram.EmptyFn | undefined,   onPullDownRefresh :miniprogram.OnPullDownRefresh | undefined,   onPullIntercept :miniprogram.EmptyFn | undefined,   onReachBottom :miniprogram.EmptyFn | undefined,   onShareAppMessage :(opts : any): void | undefined,   onOptionMenuClick :miniprogram.EmptyFn | undefined,   onPopMenuClick :miniprogram.EmptyFn | undefined,   onTabItemTap :miniprogram.OnTabItemTap | undefined,   onPageScroll :(opts : {  scrollTop :number}): void | undefined,   events :{  onBack :miniprogram.EmptyFn | undefined,   onKeyboardHeight :miniprogram.EmptyFn | undefined,   onOptionMenuClick :miniprogram.EmptyFn | undefined,   onPopMenuClick :miniprogram.EmptyFn | undefined,   onPullIntercept :miniprogram.EmptyFn | undefined,   onPullDownRefresh :miniprogram.OnPullDownRefresh | undefined,   onTitleClick :miniprogram.EmptyFn | undefined,   onTabItemTap :miniprogram.OnTabItemTap | undefined,   beforeTabItemTap :miniprogram.EmptyFn | undefined,   onResize :(opts : {  size :{  windowWidth :number,   windowHeight :number}}): void | undefined} | undefined, [key: string] : any} & std.ThisType<{ readonly data :any,  readonly route :string, setData (data : any, cb : miniprogram.EmptyFn | undefined): void, $spliceData (data : any, cb : miniprogram.EmptyFn | undefined): void, $batchedUpdates (cb : miniprogram.EmptyFn): void, [key: string] : any}> */
@js.native
trait dataanyundefinedonLoadque
  extends /* key */ StringDictionary[js.Any] {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var events: js.UndefOr[BeforeTabItemTap] = js.native
  
  var onHide: js.UndefOr[EmptyFn] = js.native
  
  /**
    * Page loading
    */
  var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[js.Any], Unit]] = js.native
  
  var onOptionMenuClick: js.UndefOr[EmptyFn] = js.native
  
  var onPageScroll: js.UndefOr[js.Function1[/* opts */ ScrollTop, Unit]] = js.native
  
  var onPopMenuClick: js.UndefOr[EmptyFn] = js.native
  
  var onPullDownRefresh: js.UndefOr[OnPullDownRefresh] = js.native
  
  var onPullIntercept: js.UndefOr[EmptyFn] = js.native
  
  var onReachBottom: js.UndefOr[EmptyFn] = js.native
  
  /**
    * Page loading complete
    */
  var onReady: js.UndefOr[EmptyFn] = js.native
  
  var onShareAppMessage: js.UndefOr[js.Function1[/* opts */ js.Any, Unit]] = js.native
  
  var onShow: js.UndefOr[EmptyFn] = js.native
  
  var onTabItemTap: js.UndefOr[OnTabItemTap] = js.native
  
  var onTitleClick: js.UndefOr[EmptyFn] = js.native
  
  var onUnload: js.UndefOr[EmptyFn] = js.native
}
object dataanyundefinedonLoadque {
  
  @scala.inline
  def apply(): dataanyundefinedonLoadque = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dataanyundefinedonLoadque]
  }
  
  @scala.inline
  implicit class dataanyundefinedonLoadqueOps[Self <: dataanyundefinedonLoadque] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEvents(value: BeforeTabItemTap): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* query */ js.UndefOr[js.Any] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnOptionMenuClick(value: () => Unit): Self = this.set("onOptionMenuClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOptionMenuClick: Self = this.set("onOptionMenuClick", js.undefined)
    
    @scala.inline
    def setOnPageScroll(value: /* opts */ ScrollTop => Unit): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageScroll: Self = this.set("onPageScroll", js.undefined)
    
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
    def setOnReachBottom(value: () => Unit): Self = this.set("onReachBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReachBottom: Self = this.set("onReachBottom", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = this.set("onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnShareAppMessage(value: /* opts */ js.Any => Unit): Self = this.set("onShareAppMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShareAppMessage: Self = this.set("onShareAppMessage", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnTabItemTap(value: /* obj */ From => Unit): Self = this.set("onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTabItemTap: Self = this.set("onTabItemTap", js.undefined)
    
    @scala.inline
    def setOnTitleClick(value: () => Unit): Self = this.set("onTitleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTitleClick: Self = this.set("onTitleClick", js.undefined)
    
    @scala.inline
    def setOnUnload(value: () => Unit): Self = this.set("onUnload", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnload: Self = this.set("onUnload", js.undefined)
  }
}
