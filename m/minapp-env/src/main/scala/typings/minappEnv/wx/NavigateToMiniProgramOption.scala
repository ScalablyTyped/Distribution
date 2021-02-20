package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.develop
import typings.minappEnv.minappEnvStrings.release
import typings.minappEnv.minappEnvStrings.trial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateToMiniProgramOption extends StObject {
  
  /** 要打开的小程序 appId */
  var appId: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NavigateToMiniProgramCompleteCallback] = js.native
  
  /** 要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。
    *
    * 可选值：
    * - 'develop': 开发版;
    * - 'trial': 体验版;
    * - 'release': 正式版; */
  var envVersion: js.UndefOr[develop | trial | release] = js.native
  
  /** 需要传递给目标小程序的数据，目标小程序可在 `App.onLaunch`，`App.onShow` 中获取到这份数据。 */
  var extraData: js.UndefOr[js.Object] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NavigateToMiniProgramFailCallback] = js.native
  
  /** 打开的页面路径，如果为空则打开首页 */
  var path: js.UndefOr[String] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NavigateToMiniProgramSuccessCallback] = js.native
}
object NavigateToMiniProgramOption {
  
  @scala.inline
  def apply(appId: String): NavigateToMiniProgramOption = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToMiniProgramOption]
  }
  
  @scala.inline
  implicit class NavigateToMiniProgramOptionMutableBuilder[Self <: NavigateToMiniProgramOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEnvVersion(value: develop | trial | release): Self = StObject.set(x, "envVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVersionUndefined: Self = StObject.set(x, "envVersion", js.undefined)
    
    @scala.inline
    def setExtraData(value: js.Object): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
