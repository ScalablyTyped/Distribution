package typings.miniprogram.anon

import org.scalablytyped.runtime.StringDictionary
import typings.miniprogram.EmptyFn
import typings.miniprogram.OnPullDownRefresh
import typings.miniprogram.OnTabItemTap
import org.scalablytyped.runtime.StObject
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
  implicit class dataanyundefinedonLoadqueMutableBuilder[Self <: dataanyundefinedonLoadque] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEvents(value: BeforeTabItemTap): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* query */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnOptionMenuClick(value: () => Unit): Self = StObject.set(x, "onOptionMenuClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOptionMenuClickUndefined: Self = StObject.set(x, "onOptionMenuClick", js.undefined)
    
    @scala.inline
    def setOnPageScroll(value: /* opts */ ScrollTop => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
    
    @scala.inline
    def setOnPopMenuClick(value: () => Unit): Self = StObject.set(x, "onPopMenuClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPopMenuClickUndefined: Self = StObject.set(x, "onPopMenuClick", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: /* opts */ Form => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnPullIntercept(value: () => Unit): Self = StObject.set(x, "onPullIntercept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPullInterceptUndefined: Self = StObject.set(x, "onPullIntercept", js.undefined)
    
    @scala.inline
    def setOnReachBottom(value: () => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
    
    @scala.inline
    def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnShareAppMessage(value: /* opts */ js.Any => Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnTabItemTap(value: /* obj */ From => Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
    
    @scala.inline
    def setOnTitleClick(value: () => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
    
    @scala.inline
    def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
  }
}
