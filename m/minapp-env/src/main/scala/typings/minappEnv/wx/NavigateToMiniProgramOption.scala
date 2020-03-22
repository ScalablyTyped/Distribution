package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.develop
import typings.minappEnv.minappEnvStrings.release
import typings.minappEnv.minappEnvStrings.trial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToMiniProgramOption extends js.Object {
  /** 要打开的小程序 appId */
  var appId: String
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NavigateToMiniProgramCompleteCallback] = js.undefined
  /** 要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。
    *
    * 可选值：
    * - 'develop': 开发版;
    * - 'trial': 体验版;
    * - 'release': 正式版; */
  var envVersion: js.UndefOr[develop | trial | release] = js.undefined
  /** 需要传递给目标小程序的数据，目标小程序可在 `App.onLaunch`，`App.onShow` 中获取到这份数据。 */
  var extraData: js.UndefOr[js.Object] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NavigateToMiniProgramFailCallback] = js.undefined
  /** 打开的页面路径，如果为空则打开首页 */
  var path: js.UndefOr[String] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NavigateToMiniProgramSuccessCallback] = js.undefined
}

object NavigateToMiniProgramOption {
  @scala.inline
  def apply(
    appId: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    envVersion: develop | trial | release = null,
    extraData: js.Object = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    path: String = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): NavigateToMiniProgramOption = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateToMiniProgramOption]
  }
}

