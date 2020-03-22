package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioContext extends js.Object {
  /** [AudioContext.pause()](AudioContext.pause.md)
    *
    * 暂停音频。 */
  def pause(): Unit
  /** [AudioContext.play()](AudioContext.play.md)
    *
    * 播放音频。 */
  def play(): Unit
  /** [AudioContext.seek(number position)](AudioContext.seek.md)
    *
    * 跳转到指定位置。 */
  def seek(/** 跳转位置，单位 s */
  position: Double): Unit
  /** [AudioContext.setSrc(string src)](AudioContext.setSrc.md)
    *
    * 设置音频地址 */
  def setSrc(/** 音频地址 */
  src: String): Unit
}

object AudioContext {
  @scala.inline
  def apply(pause: () => Unit, play: () => Unit, seek: Double => Unit, setSrc: String => Unit): AudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), setSrc = js.Any.fromFunction1(setSrc))
  
    __obj.asInstanceOf[AudioContext]
  }
}

