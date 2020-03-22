package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContext extends js.Object {
  /** [VideoContext.exitFullScreen()](VideoContext.exitFullScreen.md)
    *
    * 退出全屏
    *
    * 最低基础库： `1.4.0` */
  def exitFullScreen(): Unit
  /** [VideoContext.hideStatusBar()](VideoContext.hideStatusBar.md)
    *
    * 隐藏状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def hideStatusBar(): Unit
  /** [VideoContext.pause()](VideoContext.pause.md)
    *
    * 暂停视频 */
  def pause(): Unit
  /** [VideoContext.play()](VideoContext.play.md)
    *
    * 播放视频 */
  def play(): Unit
  /** [VideoContext.playbackRate(number rate)](VideoContext.playbackRate.md)
    *
    * 设置倍速播放
    *
    * 最低基础库： `1.4.0` */
  def playbackRate(/** 倍率，支持 0.5/0.8/1.0/1.25/1.5 */
  rate: Double): Unit
  /** [VideoContext.requestFullScreen(Object object)](VideoContext.requestFullScreen.md)
    *
    * 进入全屏
    *
    * 最低基础库： `1.4.0` */
  def requestFullScreen(option: VideoContextRequestFullScreenOption): Unit
  /** [VideoContext.seek(number position)](VideoContext.seek.md)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转到的位置，单位 s */
  position: Double): Unit
  /** [VideoContext.sendDanmu(Object data)](VideoContext.sendDanmu.md)
    *
    * 发送弹幕 */
  def sendDanmu(/** 弹幕内容 */
  data: Danmu): Unit
  /** [VideoContext.showStatusBar()](VideoContext.showStatusBar.md)
    *
    * 显示状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def showStatusBar(): Unit
  /** [VideoContext.stop()](VideoContext.stop.md)
    *
    * 停止视频
    *
    * 最低基础库： `1.7.0` */
  def stop(): Unit
}

object VideoContext {
  @scala.inline
  def apply(
    exitFullScreen: () => Unit,
    hideStatusBar: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    playbackRate: Double => Unit,
    requestFullScreen: VideoContextRequestFullScreenOption => Unit,
    seek: Double => Unit,
    sendDanmu: Danmu => Unit,
    showStatusBar: () => Unit,
    stop: () => Unit
  ): VideoContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction0(exitFullScreen), hideStatusBar = js.Any.fromFunction0(hideStatusBar), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), playbackRate = js.Any.fromFunction1(playbackRate), requestFullScreen = js.Any.fromFunction1(requestFullScreen), seek = js.Any.fromFunction1(seek), sendDanmu = js.Any.fromFunction1(sendDanmu), showStatusBar = js.Any.fromFunction0(showStatusBar), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[VideoContext]
  }
}

