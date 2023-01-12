package typings.miniprogram.anon

import org.scalablytyped.runtime.StringDictionary
import typings.miniprogram.EmptyFn
import typings.miniprogram.OnPullDownRefresh
import typings.miniprogram.OnTabItemTap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  data :any | undefined,   onLoad :(query : any | undefined): void | undefined,   onShow :miniprogram.EmptyFn | undefined,   onReady :miniprogram.EmptyFn | undefined,   onHide :miniprogram.EmptyFn | undefined,   onUnload :miniprogram.EmptyFn | undefined,   onTitleClick :miniprogram.EmptyFn | undefined,   onPullDownRefresh :miniprogram.OnPullDownRefresh | undefined,   onPullIntercept :miniprogram.EmptyFn | undefined,   onReachBottom :miniprogram.EmptyFn | undefined,   onShareAppMessage :(opts : any): void | undefined,   onOptionMenuClick :miniprogram.EmptyFn | undefined,   onPopMenuClick :miniprogram.EmptyFn | undefined,   onTabItemTap :miniprogram.OnTabItemTap | undefined,   onPageScroll :(opts : {  scrollTop :number}): void | undefined,   events :{  onBack :miniprogram.EmptyFn | undefined,   onKeyboardHeight :miniprogram.EmptyFn | undefined,   onOptionMenuClick :miniprogram.EmptyFn | undefined,   onPopMenuClick :miniprogram.EmptyFn | undefined,   onPullIntercept :miniprogram.EmptyFn | undefined,   onPullDownRefresh :miniprogram.OnPullDownRefresh | undefined,   onTitleClick :miniprogram.EmptyFn | undefined,   onTabItemTap :miniprogram.OnTabItemTap | undefined,   beforeTabItemTap :miniprogram.EmptyFn | undefined,   onResize :(opts : {  size :{  windowWidth :number,   windowHeight :number}}): void | undefined} | undefined, [key: string] : any} & std.ThisType<{ readonly data :any,  readonly route :string, setData (data : any, cb : miniprogram.EmptyFn | undefined): void, $spliceData (data : any, cb : miniprogram.EmptyFn | undefined): void, $batchedUpdates (cb : miniprogram.EmptyFn): void, [key: string] : any}> */
trait dataanyundefinedonLoadque
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var events: js.UndefOr[BeforeTabItemTap] = js.undefined
  
  var onHide: js.UndefOr[EmptyFn] = js.undefined
  
  /**
    * Page loading
    */
  var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[Any], Unit]] = js.undefined
  
  var onOptionMenuClick: js.UndefOr[EmptyFn] = js.undefined
  
  var onPageScroll: js.UndefOr[js.Function1[/* opts */ ScrollTop, Unit]] = js.undefined
  
  var onPopMenuClick: js.UndefOr[EmptyFn] = js.undefined
  
  var onPullDownRefresh: js.UndefOr[OnPullDownRefresh] = js.undefined
  
  var onPullIntercept: js.UndefOr[EmptyFn] = js.undefined
  
  var onReachBottom: js.UndefOr[EmptyFn] = js.undefined
  
  /**
    * Page loading complete
    */
  var onReady: js.UndefOr[EmptyFn] = js.undefined
  
  var onShareAppMessage: js.UndefOr[js.Function1[/* opts */ Any, Unit]] = js.undefined
  
  var onShow: js.UndefOr[EmptyFn] = js.undefined
  
  var onTabItemTap: js.UndefOr[OnTabItemTap] = js.undefined
  
  var onTitleClick: js.UndefOr[EmptyFn] = js.undefined
  
  var onUnload: js.UndefOr[EmptyFn] = js.undefined
}
object dataanyundefinedonLoadque {
  
  inline def apply(): dataanyundefinedonLoadque = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dataanyundefinedonLoadque]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dataanyundefinedonLoadque] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEvents(value: BeforeTabItemTap): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLoad(value: /* query */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnOptionMenuClick(value: () => Unit): Self = StObject.set(x, "onOptionMenuClick", js.Any.fromFunction0(value))
    
    inline def setOnOptionMenuClickUndefined: Self = StObject.set(x, "onOptionMenuClick", js.undefined)
    
    inline def setOnPageScroll(value: /* opts */ ScrollTop => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
    
    inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
    
    inline def setOnPopMenuClick(value: () => Unit): Self = StObject.set(x, "onPopMenuClick", js.Any.fromFunction0(value))
    
    inline def setOnPopMenuClickUndefined: Self = StObject.set(x, "onPopMenuClick", js.undefined)
    
    inline def setOnPullDownRefresh(value: /* opts */ Form => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
    
    inline def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    inline def setOnPullIntercept(value: () => Unit): Self = StObject.set(x, "onPullIntercept", js.Any.fromFunction0(value))
    
    inline def setOnPullInterceptUndefined: Self = StObject.set(x, "onPullIntercept", js.undefined)
    
    inline def setOnReachBottom(value: () => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
    
    inline def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
    
    inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnShareAppMessage(value: /* opts */ Any => Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    
    inline def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnTabItemTap(value: /* obj */ From => Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    inline def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
    
    inline def setOnTitleClick(value: () => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction0(value))
    
    inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
    
    inline def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
    
    inline def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
  }
}
