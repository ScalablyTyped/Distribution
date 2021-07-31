package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserver extends StObject {
  
  /** [IntersectionObserver.disconnect()](IntersectionObserver.disconnect.md)
    *
    * 停止监听。回调函数将不再触发
    *
    * **注意**
    *
    *
    * 与页面显示区域的相交区域并不准确代表用户可见的区域，因为参与计算的区域是“布局区域”，布局区域可能会在绘制时被其他节点裁剪隐藏（如遇祖先节点中 overflow 样式为 hidden 的节点）或遮盖（如遇 fixed 定位的节点）。 */
  def disconnect(): Unit = js.native
  
  /** [IntersectionObserver.observe(string targetSelector, function callback)](IntersectionObserver.observe.md)
    *
    * 指定目标节点并开始监听相交状态变化情况 */
  def observe(/** 选择器 */
  targetSelector: String, /** 监听相交状态变化的回调函数 */
  callback: ObserveCallback): Unit = js.native
  
  /** [IntersectionObserver.relativeTo(string selector, Object margins)](IntersectionObserver.relativeTo.md)
    *
    * 使用选择器指定一个节点，作为参照区域之一。 */
  def relativeTo(/** 选择器 */
  selector: String): Unit = js.native
  def relativeTo(/** 选择器 */
  selector: String, /** 用来扩展（或收缩）参照节点布局区域的边界 */
  margins: RelativeToMargins): Unit = js.native
  
  /** [IntersectionObserver.relativeToViewport(Object margins)](IntersectionObserver.relativeToViewport.md)
  *
  * 指定页面显示区域作为参照区域之一
  *
  * **示例代码**
  *
  *
  * 下面的示例代码中，如果目标节点（用选择器 .target-class 指定）进入显示区域以下 100px 时，就会触发回调函数。
  * ```javascript
  Page({
    onLoad: function(){
    wx.createIntersectionObserver().relativeToViewport({bottom: 100}).observe('.target-class', (res) => {
    res.intersectionRatio // 相交区域占目标节点的布局区域的比例
    res.intersectionRect // 相交区域
    res.intersectionRect.left // 相交区域的左边界坐标
    res.intersectionRect.top // 相交区域的上边界坐标
    res.intersectionRect.width // 相交区域的宽度
    res.intersectionRect.height // 相交区域的高度
    })
    }
  })
  ``` */
  def relativeToViewport(): Unit = js.native
  def relativeToViewport(/** 用来扩展（或收缩）参照节点布局区域的边界 */
  margins: RelativeToViewportMargins): Unit = js.native
}
