package typings.minappEnv.Page

import typings.minappEnv.IAnyObject
import typings.minappEnv.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageInstanceBaseProps[D /* <: IAnyObject */] extends js.Object {
  /** 页面的初始数据
    * 
    * `data` 是页面第一次渲染使用的**初始数据**。
    * 
    * 页面加载时，`data` 将会以`JSON`字符串的形式由逻辑层传至渲染层，因此`data`中的数据必须是可以转成`JSON`的类型：字符串，数字，布尔值，对象，数组。
    * 
    * 渲染层可以通过 `WXML` 对数据进行绑定。
    */
  var data: js.UndefOr[D] = js.native
  /** 到当前页面的路径，类型为`String`。最低基础库： `1.2.0` */
  var route: js.UndefOr[String] = js.native
  /** `setData` 函数用于将数据从逻辑层发送到视图层（异步），同时改变对应的 `this.data` 的值（同步）。
    *
    * **注意：**
    *
    * 1. **直接修改 this.data 而不调用 this.setData 是无法改变页面的状态的，还会造成数据不一致**。
    * 1. 仅支持设置可 JSON 化的数据。
    * 1. 单次设置的数据不能超过1024kB，请尽量避免一次设置过多的数据。
    * 1. 请不要把 data 中任何一项的 value 设为 `undefined` ，否则这一项将不被设置并可能遗留一些潜在问题。
    */
  var setData: js.UndefOr[
    js.Function2[
      /* data */ D | (Pick[D, /* keyof D */ String]) | IAnyObject, 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ] = js.native
}

object PageInstanceBaseProps {
  @scala.inline
  def apply[/* <: typings.minappEnv.IAnyObject */ D](): PageInstanceBaseProps[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInstanceBaseProps[D]]
  }
  @scala.inline
  implicit class PageInstanceBasePropsOps[Self <: PageInstanceBaseProps[_], /* <: typings.minappEnv.IAnyObject */ D] (val x: Self with PageInstanceBaseProps[D]) extends AnyVal {
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
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    @scala.inline
    def setSetData(
      value: (/* data */ D | (Pick[D, /* keyof D */ String]) | IAnyObject, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit
    ): Self = this.set("setData", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
  }
  
}

