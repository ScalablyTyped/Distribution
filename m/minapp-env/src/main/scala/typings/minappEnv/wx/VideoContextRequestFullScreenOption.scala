package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`-90`
import typings.minappEnv.minappEnvNumbers.`0`
import typings.minappEnv.minappEnvNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoContextRequestFullScreenOption extends js.Object {
  
  /** 设置全屏时视频的方向，不指定则根据宽高比自动判断。
    *
    * 可选值：
    * - 0: 正常竖向;
    * - 90: 屏幕逆时针90度;
    * - -90: 屏幕顺时针90度;
    *
    * 最低基础库： `1.7.0` */
  var direction: js.UndefOr[`0` | `90` | `-90`] = js.native
}
object VideoContextRequestFullScreenOption {
  
  @scala.inline
  def apply(): VideoContextRequestFullScreenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContextRequestFullScreenOption]
  }
  
  @scala.inline
  implicit class VideoContextRequestFullScreenOptionOps[Self <: VideoContextRequestFullScreenOption] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: `0` | `90` | `-90`): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
}
