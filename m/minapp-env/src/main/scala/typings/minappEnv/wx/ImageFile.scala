package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 图片的本地临时文件列表
  *
  * 最低基础库： `1.2.0` */
trait ImageFile extends js.Object {
  /** 本地临时文件路径 */
  var path: String
  /** 本地临时文件大小，单位 B */
  var size: Double
}

object ImageFile {
  @scala.inline
  def apply(path: String, size: Double): ImageFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageFile]
  }
}

