package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LivePlayerContext extends StObject {
  
  /** [LivePlayerContext.exitFullScreen(Object object)](LivePlayerContext.exitFullScreen.md)
    *
    * 退出全屏 */
  def exitFullScreen(): Unit = js.native
  def exitFullScreen(option: ExitFullScreenOption): Unit = js.native
  
  /** [LivePlayerContext.mute(Object object)](LivePlayerContext.mute.md)
    *
    * 静音 */
  def mute(): Unit = js.native
  def mute(option: MuteOption): Unit = js.native
  
  /** [LivePlayerContext.pause(Object object)](LivePlayerContext.pause.md)
    *
    * 暂停
    *
    * 最低基础库： `1.9.90` */
  def pause(): Unit = js.native
  def pause(option: LivePlayerContextPauseOption): Unit = js.native
  
  /** [LivePlayerContext.play(Object object)](LivePlayerContext.play.md)
    *
    * 播放 */
  def play(): Unit = js.native
  def play(option: PlayOption): Unit = js.native
  
  /** [LivePlayerContext.requestFullScreen(Object object)](LivePlayerContext.requestFullScreen.md)
    *
    * 进入全屏 */
  def requestFullScreen(option: LivePlayerContextRequestFullScreenOption): Unit = js.native
  
  /** [LivePlayerContext.resume(Object object)](LivePlayerContext.resume.md)
    *
    * 恢复
    *
    * 最低基础库： `1.9.90` */
  def resume(): Unit = js.native
  def resume(option: LivePlayerContextResumeOption): Unit = js.native
  
  /** [LivePlayerContext.stop(Object object)](LivePlayerContext.stop.md)
    *
    * 停止 */
  def stop(): Unit = js.native
  def stop(option: LivePlayerContextStopOption): Unit = js.native
}
