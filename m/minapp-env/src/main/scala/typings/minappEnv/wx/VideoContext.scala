package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoContext extends StObject {
  
  /** [VideoContext.exitFullScreen()](VideoContext.exitFullScreen.md)
    *
    * 退出全屏
    *
    * 最低基础库： `1.4.0` */
  def exitFullScreen(): Unit = js.native
  
  /** [VideoContext.hideStatusBar()](VideoContext.hideStatusBar.md)
    *
    * 隐藏状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def hideStatusBar(): Unit = js.native
  
  /** [VideoContext.pause()](VideoContext.pause.md)
    *
    * 暂停视频 */
  def pause(): Unit = js.native
  
  /** [VideoContext.play()](VideoContext.play.md)
    *
    * 播放视频 */
  def play(): Unit = js.native
  
  /** [VideoContext.playbackRate(number rate)](VideoContext.playbackRate.md)
    *
    * 设置倍速播放
    *
    * 最低基础库： `1.4.0` */
  def playbackRate(/** 倍率，支持 0.5/0.8/1.0/1.25/1.5 */
  rate: Double): Unit = js.native
  
  /** [VideoContext.requestFullScreen(Object object)](VideoContext.requestFullScreen.md)
    *
    * 进入全屏
    *
    * 最低基础库： `1.4.0` */
  def requestFullScreen(option: VideoContextRequestFullScreenOption): Unit = js.native
  
  /** [VideoContext.seek(number position)](VideoContext.seek.md)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转到的位置，单位 s */
  position: Double): Unit = js.native
  
  /** [VideoContext.sendDanmu(Object data)](VideoContext.sendDanmu.md)
    *
    * 发送弹幕 */
  def sendDanmu(/** 弹幕内容 */
  data: Danmu): Unit = js.native
  
  /** [VideoContext.showStatusBar()](VideoContext.showStatusBar.md)
    *
    * 显示状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def showStatusBar(): Unit = js.native
  
  /** [VideoContext.stop()](VideoContext.stop.md)
    *
    * 停止视频
    *
    * 最低基础库： `1.7.0` */
  def stop(): Unit = js.native
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
  
  @scala.inline
  implicit class VideoContextMutableBuilder[Self <: VideoContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitFullScreen(value: () => Unit): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideStatusBar(value: () => Unit): Self = StObject.set(x, "hideStatusBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaybackRate(value: Double => Unit): Self = StObject.set(x, "playbackRate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestFullScreen(value: VideoContextRequestFullScreenOption => Unit): Self = StObject.set(x, "requestFullScreen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendDanmu(value: Danmu => Unit): Self = StObject.set(x, "sendDanmu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowStatusBar(value: () => Unit): Self = StObject.set(x, "showStatusBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
