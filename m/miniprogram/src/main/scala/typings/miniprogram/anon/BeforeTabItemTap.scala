package typings.miniprogram.anon

import typings.miniprogram.EmptyFn
import typings.miniprogram.OnPullDownRefresh
import typings.miniprogram.OnTabItemTap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeTabItemTap extends StObject {
  
  var beforeTabItemTap: js.UndefOr[EmptyFn] = js.undefined
  
  var onBack: js.UndefOr[EmptyFn] = js.undefined
  
  var onKeyboardHeight: js.UndefOr[EmptyFn] = js.undefined
  
  var onOptionMenuClick: js.UndefOr[EmptyFn] = js.undefined
  
  var onPopMenuClick: js.UndefOr[EmptyFn] = js.undefined
  
  var onPullDownRefresh: js.UndefOr[OnPullDownRefresh] = js.undefined
  
  var onPullIntercept: js.UndefOr[EmptyFn] = js.undefined
  
  var onResize: js.UndefOr[js.Function1[/* opts */ SizeWindowHeight, Unit]] = js.undefined
  
  var onTabItemTap: js.UndefOr[OnTabItemTap] = js.undefined
  
  var onTitleClick: js.UndefOr[EmptyFn] = js.undefined
}
object BeforeTabItemTap {
  
  inline def apply(): BeforeTabItemTap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeTabItemTap]
  }
  
  extension [Self <: BeforeTabItemTap](x: Self) {
    
    inline def setBeforeTabItemTap(value: () => Unit): Self = StObject.set(x, "beforeTabItemTap", js.Any.fromFunction0(value))
    
    inline def setBeforeTabItemTapUndefined: Self = StObject.set(x, "beforeTabItemTap", js.undefined)
    
    inline def setOnBack(value: () => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction0(value))
    
    inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
    
    inline def setOnKeyboardHeight(value: () => Unit): Self = StObject.set(x, "onKeyboardHeight", js.Any.fromFunction0(value))
    
    inline def setOnKeyboardHeightUndefined: Self = StObject.set(x, "onKeyboardHeight", js.undefined)
    
    inline def setOnOptionMenuClick(value: () => Unit): Self = StObject.set(x, "onOptionMenuClick", js.Any.fromFunction0(value))
    
    inline def setOnOptionMenuClickUndefined: Self = StObject.set(x, "onOptionMenuClick", js.undefined)
    
    inline def setOnPopMenuClick(value: () => Unit): Self = StObject.set(x, "onPopMenuClick", js.Any.fromFunction0(value))
    
    inline def setOnPopMenuClickUndefined: Self = StObject.set(x, "onPopMenuClick", js.undefined)
    
    inline def setOnPullDownRefresh(value: /* opts */ Form => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
    
    inline def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    inline def setOnPullIntercept(value: () => Unit): Self = StObject.set(x, "onPullIntercept", js.Any.fromFunction0(value))
    
    inline def setOnPullInterceptUndefined: Self = StObject.set(x, "onPullIntercept", js.undefined)
    
    inline def setOnResize(value: /* opts */ SizeWindowHeight => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnTabItemTap(value: /* obj */ From => Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    inline def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
    
    inline def setOnTitleClick(value: () => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction0(value))
    
    inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
  }
}
