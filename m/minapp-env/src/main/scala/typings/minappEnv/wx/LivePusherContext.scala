package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LivePusherContext extends js.Object {
  /** [LivePusherContext.pause(Object object)](LivePusherContext.pause.md)
    *
    * 暂停推流 */
  def pause(): Unit = js.native
  def pause(option: LivePusherContextPauseOption): Unit = js.native
  /** [LivePusherContext.pauseBGM(Object object)](LivePusherContext.pauseBGM.md)
    *
    * 暂停背景音
    *
    * 最低基础库： `2.4.0` */
  def pauseBGM(): Unit = js.native
  def pauseBGM(option: PauseBGMOption): Unit = js.native
  /** [LivePusherContext.playBGM(Object object)](LivePusherContext.playBGM.md)
    *
    * 播放背景音
    *
    * 最低基础库： `2.4.0` */
  def playBGM(option: PlayBGMOption): Unit = js.native
  /** [LivePusherContext.resume(Object object)](LivePusherContext.resume.md)
    *
    * 恢复推流 */
  def resume(): Unit = js.native
  def resume(option: LivePusherContextResumeOption): Unit = js.native
  /** [LivePusherContext.resumeBGM(Object object)](LivePusherContext.resumeBGM.md)
    *
    * 恢复背景音
    *
    * 最低基础库： `2.4.0` */
  def resumeBGM(): Unit = js.native
  def resumeBGM(option: ResumeBGMOption): Unit = js.native
  /** [LivePusherContext.setBGMVolume(Object object)](LivePusherContext.setBGMVolume.md)
    *
    * 设置背景音音量
    *
    * 最低基础库： `2.4.0` */
  def setBGMVolume(option: SetBGMVolumeOption): Unit = js.native
  /** [LivePusherContext.snapshot(Object object)](LivePusherContext.snapshot.md)
    *
    * 快照
    *
    * 最低基础库： `1.9.90` */
  def snapshot(): Unit = js.native
  def snapshot(option: SnapshotOption): Unit = js.native
  /** [LivePusherContext.start(Object object)](LivePusherContext.start.md)
    *
    * 播放推流 */
  def start(): Unit = js.native
  def start(option: LivePusherContextStartOption): Unit = js.native
  /** [LivePusherContext.stop(Object object)](LivePusherContext.stop.md)
    *
    * 停止推流 */
  def stop(): Unit = js.native
  def stop(option: LivePusherContextStopOption): Unit = js.native
  /** [LivePusherContext.stopBGM(Object object)](LivePusherContext.stopBGM.md)
    *
    * 停止背景音
    *
    * 最低基础库： `2.4.0` */
  def stopBGM(): Unit = js.native
  def stopBGM(option: StopBGMOption): Unit = js.native
  /** [LivePusherContext.switchCamera(Object object)](LivePusherContext.switchCamera.md)
    *
    * 切换前后摄像头 */
  def switchCamera(): Unit = js.native
  def switchCamera(option: SwitchCameraOption): Unit = js.native
  /** [LivePusherContext.toggleTorch(Object object)](LivePusherContext.toggleTorch.md)
    *
    * 切换
    *
    * 最低基础库： `2.1.0` */
  def toggleTorch(): Unit = js.native
  def toggleTorch(option: ToggleTorchOption): Unit = js.native
}

