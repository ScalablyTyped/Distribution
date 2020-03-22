package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 弹幕内容 */
trait Danmu extends js.Object {
  /** 弹幕颜色 */
  var color: js.UndefOr[String] = js.undefined
  /** 弹幕文字 */
  var text: String
}

object Danmu {
  @scala.inline
  def apply(text: String, color: String = null): Danmu = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Danmu]
  }
}

