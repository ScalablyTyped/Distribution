package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 菜单按钮的布局位置信息 */
trait Rect extends js.Object {
  /** 下边界坐标，单位：px */
  var bottom: Double
  /** 高度，单位：px */
  var height: Double
  /** 左边界坐标，单位：px */
  var left: Double
  /** 右边界坐标，单位：px */
  var right: Double
  /** 上边界坐标，单位：px */
  var top: Double
  /** 宽度，单位：px */
  var width: Double
}

object Rect {
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): Rect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Rect]
  }
}

