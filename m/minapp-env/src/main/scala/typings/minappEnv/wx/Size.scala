package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /** 变化后的窗口高度，单位 px */
  var windowHeight: Double
  /** 变化后的窗口宽度，单位 px */
  var windowWidth: Double
}

object Size {
  @scala.inline
  def apply(windowHeight: Double, windowWidth: Double): Size = {
    val __obj = js.Dynamic.literal(windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

