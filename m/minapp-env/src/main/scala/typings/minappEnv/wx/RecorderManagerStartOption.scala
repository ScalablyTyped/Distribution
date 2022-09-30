package typings.minappEnv.wx

import typings.minappEnv.minappEnvInts.`11025`
import typings.minappEnv.minappEnvInts.`12000`
import typings.minappEnv.minappEnvInts.`16000`
import typings.minappEnv.minappEnvInts.`1`
import typings.minappEnv.minappEnvInts.`22050`
import typings.minappEnv.minappEnvInts.`24000`
import typings.minappEnv.minappEnvInts.`2`
import typings.minappEnv.minappEnvInts.`32000`
import typings.minappEnv.minappEnvInts.`44100`
import typings.minappEnv.minappEnvInts.`48000`
import typings.minappEnv.minappEnvInts.`8000`
import typings.minappEnv.minappEnvStrings.aac
import typings.minappEnv.minappEnvStrings.auto
import typings.minappEnv.minappEnvStrings.buildInMic
import typings.minappEnv.minappEnvStrings.camcorder
import typings.minappEnv.minappEnvStrings.headsetMic
import typings.minappEnv.minappEnvStrings.mic
import typings.minappEnv.minappEnvStrings.mp3
import typings.minappEnv.minappEnvStrings.voice_communication
import typings.minappEnv.minappEnvStrings.voice_recognition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecorderManagerStartOption extends StObject {
  
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
  ] = js.undefined
  
  /** 录音的时长，单位 ms，最大值 600000（10 分钟） */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 编码码率，有效值见下表格 */
  var encodeBitRate: js.UndefOr[Double] = js.undefined
  
  /** 音频格式
    *
    * 可选值：
    * - 'mp3': mp3 格式;
    * - 'aac': aac 格式; */
  var format: js.UndefOr[mp3 | aac] = js.undefined
  
  /** 指定帧大小，单位 KB。传入 frameSize 后，每录制指定帧大小的内容后，会回调录制的文件内容，不指定则不会回调。暂仅支持 mp3 格式。 */
  var frameSize: js.UndefOr[Double] = js.undefined
  
  /** 录音通道数
    *
    * 可选值：
    * - 1: 1 个通道;
    * - 2: 2 个通道; */
  var numberOfChannels: js.UndefOr[`1` | `2`] = js.undefined
  
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
  ] = js.undefined
}
object RecorderManagerStartOption {
  
  inline def apply(): RecorderManagerStartOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderManagerStartOption]
  }
  
  extension [Self <: RecorderManagerStartOption](x: Self) {
    
    inline def setAudioSource(value: auto | buildInMic | headsetMic | mic | camcorder | voice_communication | voice_recognition): Self = StObject.set(x, "audioSource", value.asInstanceOf[js.Any])
    
    inline def setAudioSourceUndefined: Self = StObject.set(x, "audioSource", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEncodeBitRate(value: Double): Self = StObject.set(x, "encodeBitRate", value.asInstanceOf[js.Any])
    
    inline def setEncodeBitRateUndefined: Self = StObject.set(x, "encodeBitRate", js.undefined)
    
    inline def setFormat(value: mp3 | aac): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrameSize(value: Double): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
    
    inline def setFrameSizeUndefined: Self = StObject.set(x, "frameSize", js.undefined)
    
    inline def setNumberOfChannels(value: `1` | `2`): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChannelsUndefined: Self = StObject.set(x, "numberOfChannels", js.undefined)
    
    inline def setSampleRate(value: `8000` | `11025` | `12000` | `16000` | `22050` | `24000` | `32000` | `44100` | `48000`): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
