package typings.miniprogram.anon

import org.scalablytyped.runtime.StringDictionary
import typings.miniprogram.LaunchQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Global data can be configured in `App()`. Other pages can get and modify the global data directly.
    */
  var globalData: js.UndefOr[js.Any] = js.native
  
  /**
    * On js error of the Mini Program
    */
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  
  /**
    * On switching Mini Program from foreground to background
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * On completion of Mini Program initialization, invoked only once
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchQuery], Unit]] = js.native
  
  /**
    * On startup of Mini Program or swithing to foreground from background
    */
  var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchQuery], Unit]] = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
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
    def setGlobalData(value: js.Any): Self = this.set("globalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalData: Self = this.set("globalData", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: /* options */ js.UndefOr[LaunchQuery] => Unit): Self = this.set("onLaunch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLaunch: Self = this.set("onLaunch", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* options */ js.UndefOr[LaunchQuery] => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
  }
}
