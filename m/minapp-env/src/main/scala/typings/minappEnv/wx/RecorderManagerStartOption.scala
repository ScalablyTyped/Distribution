package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`11025`
import typings.minappEnv.minappEnvNumbers.`12000`
import typings.minappEnv.minappEnvNumbers.`16000`
import typings.minappEnv.minappEnvNumbers.`1`
import typings.minappEnv.minappEnvNumbers.`22050`
import typings.minappEnv.minappEnvNumbers.`24000`
import typings.minappEnv.minappEnvNumbers.`2`
import typings.minappEnv.minappEnvNumbers.`32000`
import typings.minappEnv.minappEnvNumbers.`44100`
import typings.minappEnv.minappEnvNumbers.`48000`
import typings.minappEnv.minappEnvNumbers.`8000`
import typings.minappEnv.minappEnvStrings.aac
import typings.minappEnv.minappEnvStrings.auto
import typings.minappEnv.minappEnvStrings.buildInMic
import typings.minappEnv.minappEnvStrings.camcorder
import typings.minappEnv.minappEnvStrings.headsetMic
import typings.minappEnv.minappEnvStrings.mic
import typings.minappEnv.minappEnvStrings.mp3
import typings.minappEnv.minappEnvStrings.voice_communication
import typings.minappEnv.minappEnvStrings.voice_recognition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecorderManagerStartOption extends js.Object {
  
  /** 指定录音的音频输入源，可通过 [wx.getAvailableAudioSources()](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.getAvailableAudioSources.html) 获取当前可用的音频源
    *
    * 可选值：
    * - 'auto': 自动设置，默认使用手机麦克风，插上耳麦后自动切换使用耳机麦克风，所有平台适用;
    * - 'buildInMic': 手机麦克风，仅限 iOS;
    * - 'headsetMic': 耳机麦克风，仅限 iOS;
    * - 'mic': 麦克风（没插耳麦时是手机麦克风，插耳麦时是耳机麦克风），仅限 Android;
    * - 'camcorder': 同 mic，适用于录制音视频内容，仅限 Android;
    * - 'voice_communication': 同 mic，适用于实时沟通，仅限 Android;
    * - 'voice_recognition': 同 mic，适用于语音识别，仅限 Android;
    *
    * 最低基础库： `2.1.0` */
  var audioSource: js.UndefOr[
    auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition
  ] = js.native
  
  /** 录音的时长，单位 ms，最大值 600000（10 分钟） */
  var duration: js.UndefOr[Double] = js.native
  
  /** 编码码率，有效值见下表格 */
  var encodeBitRate: js.UndefOr[Double] = js.native
  
  /** 音频格式
    *
    * 可选值：
    * - 'mp3': mp3 格式;
    * - 'aac': aac 格式; */
  var format: js.UndefOr[mp3 | aac] = js.native
  
  /** 指定帧大小，单位 KB。传入 frameSize 后，每录制指定帧大小的内容后，会回调录制的文件内容，不指定则不会回调。暂仅支持 mp3 格式。 */
  var frameSize: js.UndefOr[Double] = js.native
  
  /** 录音通道数
    *
    * 可选值：
    * - 1: 1 个通道;
    * - 2: 2 个通道; */
  var numberOfChannels: js.UndefOr[`1` | `2`] = js.native
  
  /** 采样率
    *
    * 可选值：
    * - 8000: 8000 采样率;
    * - 11025: 11025 采样率;
    * - 12000: 12000 采样率;
    * - 16000: 16000 采样率;
    * - 22050: 22050 采样率;
    * - 24000: 24000 采样率;
    * - 32000: 32000 采样率;
    * - 44100: 44100 采样率;
    * - 48000: 48000 采样率; */
  var sampleRate: js.UndefOr[
    `8000` | `11025` | `12000` | `16000` | `22050` | `24000` | `32000` | `44100` | `48000`
  ] = js.native
}
object RecorderManagerStartOption {
  
  @scala.inline
  def apply(): RecorderManagerStartOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderManagerStartOption]
  }
  
  @scala.inline
  implicit class RecorderManagerStartOptionOps[Self <: RecorderManagerStartOption] (val x: Self) extends AnyVal {
    
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
    def setAudioSource(value: auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition): Self = this.set("audioSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioSource: Self = this.set("audioSource", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEncodeBitRate(value: Double): Self = this.set("encodeBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeBitRate: Self = this.set("encodeBitRate", js.undefined)
    
    @scala.inline
    def setFormat(value: mp3 | aac): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFrameSize(value: Double): Self = this.set("frameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameSize: Self = this.set("frameSize", js.undefined)
    
    @scala.inline
    def setNumberOfChannels(value: `1` | `2`): Self = this.set("numberOfChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfChannels: Self = this.set("numberOfChannels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: `8000` | `11025` | `12000` | `16000` | `22050` | `24000` | `32000` | `44100` | `48000`): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
  }
}
