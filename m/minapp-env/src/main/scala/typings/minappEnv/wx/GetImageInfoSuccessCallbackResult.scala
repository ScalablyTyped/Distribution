package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.`down-mirrored`
import typings.minappEnv.minappEnvStrings.`left-mirrored`
import typings.minappEnv.minappEnvStrings.`right-mirrored`
import typings.minappEnv.minappEnvStrings.`up-mirrored`
import typings.minappEnv.minappEnvStrings.down
import typings.minappEnv.minappEnvStrings.left
import typings.minappEnv.minappEnvStrings.right
import typings.minappEnv.minappEnvStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageInfoSuccessCallbackResult extends js.Object {
  /** 图片原始高度，单位px。不考虑旋转。 */
  var height: Double = js.native
  /** [拍照时设备方向](http://sylvana.net/jpegcrop/exif_orientation.html)
    *
    * 可选值：
    * - 'up': 默认方向（手机横持拍照），对应 Exif 中的 1。或无 orientation 信息。;
    * - 'up-mirrored': 同 up，但镜像翻转，对应 Exif 中的 2;
    * - 'down': 旋转180度，对应 Exif 中的 3;
    * - 'down-mirrored': 同 down，但镜像翻转，对应 Exif 中的 4;
    * - 'left-mirrored': 同 left，但镜像翻转，对应 Exif 中的 5;
    * - 'right': 顺时针旋转90度，对应 Exif 中的 6;
    * - 'right-mirrored': 同 right，但镜像翻转，对应 Exif 中的 7;
    * - 'left': 逆时针旋转90度，对应 Exif 中的 8;
    *
    * 最低基础库： `1.9.90` */
  var orientation: up | `up-mirrored` | down | `down-mirrored` | `left-mirrored` | right | `right-mirrored` | left = js.native
  /** 图片的本地路径 */
  var path: String = js.native
  /** 图片格式
    *
    * 最低基础库： `1.9.90` */
  var `type`: String = js.native
  /** 图片原始宽度，单位px。不考虑旋转。 */
  var width: Double = js.native
}

object GetImageInfoSuccessCallbackResult {
  @scala.inline
  def apply(
    height: Double,
    orientation: up | `up-mirrored` | down | `down-mirrored` | `left-mirrored` | right | `right-mirrored` | left,
    path: String,
    `type`: String,
    width: Double
  ): GetImageInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfoSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetImageInfoSuccessCallbackResultOps[Self <: GetImageInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(
      value: up | `up-mirrored` | down | `down-mirrored` | `left-mirrored` | right | `right-mirrored` | left
    ): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

