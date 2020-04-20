package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFrameRecordedCallbackResult extends js.Object {
  /** 录音分片数据 */
  var frameBuffer: ArrayBuffer
  /** 当前帧是否正常录音结束前的最后一帧 */
  var isLastFrame: Boolean
}

object OnFrameRecordedCallbackResult {
  @scala.inline
  def apply(frameBuffer: ArrayBuffer, isLastFrame: Boolean): OnFrameRecordedCallbackResult = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFrameRecordedCallbackResult]
  }
}

