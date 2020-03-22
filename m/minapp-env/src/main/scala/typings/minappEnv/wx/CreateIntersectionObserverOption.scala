package typings.minappEnv.wx

import typings.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 选项 */
trait CreateIntersectionObserverOption extends js.Object {
  /** 初始的相交比例，如果调用时检测到的相交比例与这个值不相等且达到阈值，则会触发一次监听器的回调函数。 */
  var initialRatio: js.UndefOr[Double] = js.undefined
  /** 是否同时观测多个目标节点（而非一个），如果设为 true ，observe 的 targetSelector 将选中多个节点（注意：同时选中过多节点将影响渲染性能）
    *
    * 最低基础库： `2.0.0` */
  var observeAll: js.UndefOr[Boolean] = js.undefined
  /** 一个数值数组，包含所有阈值。 */
  var thresholds: js.UndefOr[Array[Double]] = js.undefined
}

object CreateIntersectionObserverOption {
  @scala.inline
  def apply(
    initialRatio: Int | Double = null,
    observeAll: js.UndefOr[Boolean] = js.undefined,
    thresholds: Array[Double] = null
  ): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    if (initialRatio != null) __obj.updateDynamic("initialRatio")(initialRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(observeAll)) __obj.updateDynamic("observeAll")(observeAll.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
}

