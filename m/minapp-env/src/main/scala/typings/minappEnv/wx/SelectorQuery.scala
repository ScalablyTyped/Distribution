package typings.minappEnv.wx

import typings.minappEnv.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorQuery extends js.Object {
  
  /** [[NodesRef](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.html) SelectorQuery.exec(function callback)](SelectorQuery.exec.md)
    *
    * 执行所有的请求。请求结果按请求次序构成数组，在callback的第一个参数中返回。 */
  def exec(): NodesRef = js.native
  def exec(/** 回调函数 */
  callback: Function): NodesRef = js.native
  
  /** [[SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) SelectorQuery.in(Component component)](SelectorQuery.in.md)
  *
  * 将选择器的选取范围更改为自定义组件 `component` 内。（初始时，选择器仅选取页面范围的节点，不会选取任何自定义组件中的节点）。
  *
  * **示例代码**
  *
  *
  * ```js
  Component({
    queryMultipleNodes (){
    const query = wx.createSelectorQuery().in(this)
    query.select('#the-id').boundingClientRect(function(res){
    res.top // 这个组件内 #the-id 节点的上边界坐标
    }).exec()
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def in(/** 自定义组件实例 */
  component: js.Any): SelectorQuery = js.native
  
  /** [[NodesRef](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.html) SelectorQuery.select(string selector)](SelectorQuery.select.md)
    *
    * 在当前页面下选择第一个匹配选择器 `selector` 的节点。返回一个 `NodesRef` 对象实例，可以用于获取节点信息。
    *
    * **selector 语法**
    *
    *
    * selector类似于 CSS 的选择器，但仅支持下列语法。
    *
    * - ID选择器：#the-id
    * - class选择器（可以连续指定多个）：.a-class.another-class
    * - 子元素选择器：.the-parent > .the-child
    * - 后代选择器：.the-ancestor .the-descendant
    * - 跨自定义组件的后代选择器：.the-ancestor >>> .the-descendant
    * - 多选择器的并集：#a-node, .some-other-nodes */
  def select(/** 选择器 */
  selector: String): NodesRef = js.native
  
  /** [[NodesRef](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.html) SelectorQuery.selectAll(string selector)](SelectorQuery.selectAll.md)
    *
    * 在当前页面下选择匹配选择器 selector 的所有节点。
    *
    * **selector 语法**
    *
    *
    * selector类似于 CSS 的选择器，但仅支持下列语法。
    *
    * - ID选择器：#the-id
    * - class选择器（可以连续指定多个）：.a-class.another-class
    * - 子元素选择器：.the-parent > .the-child
    * - 后代选择器：.the-ancestor .the-descendant
    * - 跨自定义组件的后代选择器：.the-ancestor >>> .the-descendant
    * - 多选择器的并集：#a-node, .some-other-nodes */
  def selectAll(/** 选择器 */
  selector: String): NodesRef = js.native
  
  /** [[NodesRef](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/NodesRef.html) SelectorQuery.selectViewport()](SelectorQuery.selectViewport.md)
    *
    * 选择显示区域。可用于获取显示区域的尺寸、滚动位置等信息。 */
  def selectViewport(): NodesRef = js.native
}
