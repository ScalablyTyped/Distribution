package typings.miniprogram.anon

import org.scalablytyped.runtime.StringDictionary
import typings.miniprogram.LaunchQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Global data can be configured in `App()`. Other pages can get and modify the global data directly.
    */
  var globalData: js.UndefOr[Any] = js.undefined
  
  /**
    * On js error of the Mini Program
    */
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  
  /**
    * On switching Mini Program from foreground to background
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * On completion of Mini Program initialization, invoked only once
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchQuery], Unit]] = js.undefined
  
  /**
    * On startup of Mini Program or swithing to foreground from background
    */
  var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchQuery], Unit]] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setGlobalData(value: Any): Self = StObject.set(x, "globalData", value.asInstanceOf[js.Any])
    
    inline def setGlobalDataUndefined: Self = StObject.set(x, "globalData", js.undefined)
    
    inline def setOnError(value: /* error */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLaunch(value: /* options */ js.UndefOr[LaunchQuery] => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
    
    inline def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    inline def setOnShow(value: /* options */ js.UndefOr[LaunchQuery] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
  }
}
