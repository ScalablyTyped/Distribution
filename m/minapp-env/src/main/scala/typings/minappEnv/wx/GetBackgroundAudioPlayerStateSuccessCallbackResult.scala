package typings.minappEnv.wx

import typings.minappEnv.minappEnvInts.`0`
import typings.minappEnv.minappEnvInts.`1`
import typings.minappEnv.minappEnvInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackgroundAudioPlayerStateSuccessCallbackResult extends StObject {
  
  /** 选定音频的播放位置（单位：s），只有在音乐播放中时返回 */
  var currentPosition: Double
  
  /** 歌曲数据链接，只有在音乐播放中时返回 */
  var dataUrl: String
  
  /** 音频的下载进度百分比，只有在音乐播放中时返回 */
  var downloadPercent: Double
  
  /** 选定音频的长度（单位：s），只有在音乐播放中时返回 */
  var duration: Double
  
  /** 播放状态
    *
    * 可选值：
    * - 0: 暂停中;
    * - 1: 播放中;
    * - 2: 没有音乐播放; */
  var status: `0` | `1` | `2`
}
object GetBackgroundAudioPlayerStateSuccessCallbackResult {
  
  inline def apply(
    currentPosition: Double,
    dataUrl: String,
    downloadPercent: Double,
    duration: Double,
    status: `0` | `1` | `2`
  ): GetBackgroundAudioPlayerStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any], downloadPercent = downloadPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateSuccessCallbackResult]
  }
  
  extension [Self <: GetBackgroundAudioPlayerStateSuccessCallbackResult](x: Self) {
    
    inline def setCurrentPosition(value: Double): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
    
    inline def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadPercent(value: Double): Self = StObject.set(x, "downloadPercent", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `0` | `1` | `2`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
