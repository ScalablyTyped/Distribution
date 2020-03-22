package typings.minappEnv.Page

import typings.minappEnv.minappEnvStrings.button
import typings.minappEnv.minappEnvStrings.menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShareAppMessageOption extends js.Object {
  /** 转发事件来源。
    *
    * 可选值：
    * - `button`：页面内转发按钮；
    * - `menu`：右上角转发菜单。
    *
    * 最低基础库： `1.2.4`
    */
  var from: button | menu | String
  /** 如果 `from` 值是 `button`，则 `target` 是触发这次转发事件的 `button`，否则为 `undefined`
    *
    * 最低基础库： `1.2.4` */
  var target: js.Any
  /** 页面中包含`<web-view>`组件时，返回当前`<web-view>`的url
    *
    * 最低基础库： `1.6.4`
    */
  var webViewUrl: js.UndefOr[String] = js.undefined
}

object IShareAppMessageOption {
  @scala.inline
  def apply(from: button | menu | String, target: js.Any, webViewUrl: String = null): IShareAppMessageOption = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (webViewUrl != null) __obj.updateDynamic("webViewUrl")(webViewUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShareAppMessageOption]
  }
}

