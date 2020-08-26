package typings.minappEnv.App

import typings.minappEnv.IAnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppInstance[T /* <: IAnyObject */] extends js.Object {
  /** 错误监听函数
    *
    * 小程序发生脚本错误，或者 api
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.UndefOr[String], Unit]] = js.native
  /** 生命周期回调—监听小程序隐藏
    *
    * 小程序从前台进入后台时
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  /** 生命周期回调—监听小程序初始化
    *
    * 小程序初始化完成时触发，全局只触发一次。
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[ILaunchShowOption], Unit]] = js.native
  /** 页面不存在监听函数
    *
    * 小程序要打开的页面不存在时触发，会带上页面信息回调该函数
    *
    * **注意：**
    * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
    *
    * 最低基础库： 1.9.90
    */
  var onPageNotFound: js.UndefOr[js.Function1[/* options */ js.UndefOr[IPageNotFoundOption], Unit]] = js.native
  /** 生命周期回调—监听小程序显示
    *
    * 小程序启动，或从后台进入前台显示时
    */
  var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[ILaunchShowOption], Unit]] = js.native
}

object AppInstance {
  @scala.inline
  def apply[/* <: typings.minappEnv.IAnyObject */ T](): AppInstance[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstance[T]]
  }
  @scala.inline
  implicit class AppInstanceOps[Self <: AppInstance[_], /* <: typings.minappEnv.IAnyObject */ T] (val x: Self with AppInstance[T]) extends AnyVal {
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
    def setOnError(value: /* error */ js.UndefOr[String] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnLaunch(value: /* options */ js.UndefOr[ILaunchShowOption] => Unit): Self = this.set("onLaunch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLaunch: Self = this.set("onLaunch", js.undefined)
    @scala.inline
    def setOnPageNotFound(value: /* options */ js.UndefOr[IPageNotFoundOption] => Unit): Self = this.set("onPageNotFound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageNotFound: Self = this.set("onPageNotFound", js.undefined)
    @scala.inline
    def setOnShow(value: /* options */ js.UndefOr[ILaunchShowOption] => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
  }
  
}

