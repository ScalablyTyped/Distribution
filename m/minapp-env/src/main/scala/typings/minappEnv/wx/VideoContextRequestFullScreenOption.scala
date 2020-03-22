package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`-90`
import typings.minappEnv.minappEnvNumbers.`0`
import typings.minappEnv.minappEnvNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContextRequestFullScreenOption extends js.Object {
  /** 设置全屏时视频的方向，不指定则根据宽高比自动判断。
    *
    * 可选值：
    * - 0: 正常竖向;
    * - 90: 屏幕逆时针90度;
    * - -90: 屏幕顺时针90度;
    *
    * 最低基础库： `1.7.0` */
  var direction: js.UndefOr[`0` | `90` | `-90`] = js.undefined
}

object VideoContextRequestFullScreenOption {
  @scala.inline
  def apply(direction: `0` | `90` | `-90` = null): VideoContextRequestFullScreenOption = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoContextRequestFullScreenOption]
  }
}

