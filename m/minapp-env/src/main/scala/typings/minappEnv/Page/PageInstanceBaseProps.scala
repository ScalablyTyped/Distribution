package typings.minappEnv.Page

import typings.minappEnv.IAnyObject
import typings.minappEnv.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInstanceBaseProps[D /* <: IAnyObject */] extends js.Object {
  /** 页面的初始数据
    * 
    * `data` 是页面第一次渲染使用的**初始数据**。
    * 
    * 页面加载时，`data` 将会以`JSON`字符串的形式由逻辑层传至渲染层，因此`data`中的数据必须是可以转成`JSON`的类型：字符串，数字，布尔值，对象，数组。
    * 
    * 渲染层可以通过 `WXML` 对数据进行绑定。
    */
  var data: js.UndefOr[D] = js.undefined
  /** 到当前页面的路径，类型为`String`。最低基础库： `1.2.0` */
  var route: js.UndefOr[String] = js.undefined
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
  ] = js.undefined
}

object PageInstanceBaseProps {
  @scala.inline
  def apply[D](
    data: D = null,
    route: String = null,
    setData: (/* data */ D | (Pick[D, /* keyof D */ String]) | IAnyObject, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit = null
  ): PageInstanceBaseProps[D] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction2(setData))
    __obj.asInstanceOf[PageInstanceBaseProps[D]]
  }
}

