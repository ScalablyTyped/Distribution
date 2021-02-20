package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoStream extends StObject {
  
  /** Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The default is `false`. */
  var allowOpenGop: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate
    * but smoother image. The default is 0.
    */
  var aqStrength: js.UndefOr[Double] = js.native
  
  /** The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than `VideoStream.gop_frame_count` if set. The default is 0. */
  var bFrameCount: js.UndefOr[Double] = js.native
  
  /** Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The default is `false`. */
  var bPyramid: js.UndefOr[Boolean] = js.native
  
  /** Required. The video bitrate in bits per second. Must be between 1 and 1,000,000,000. */
  var bitrateBps: js.UndefOr[Double] = js.native
  
  /** Codec type. The following codecs are supported: * `h264` (default) * `h265` * `vp9` */
  var codec: js.UndefOr[String] = js.native
  
  /** Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21. */
  var crfLevel: js.UndefOr[Double] = js.native
  
  /** Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode` must be `"vbr"`. The default is `false`. */
  var enableTwoPass: js.UndefOr[Boolean] = js.native
  
  /** The entropy coder to use. The default is `"cabac"`. Supported entropy coders: - 'cavlc' - 'cabac' */
  var entropyCoder: js.UndefOr[String] = js.native
  
  /**
    * Required. The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The
    * API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. The following table shows the computed video FPS given the target FPS (in
    * parenthesis) and input FPS (in the first column): | | (30) | (60) | (25) | (50) | |--------|--------|--------|------|------| | 240 | Fail | Fail | Fail | Fail | | 120 | 30 | 60 | 20
    * | 30 | | 100 | 25 | 50 | 20 | 30 | | 50 | 25 | 50 | 20 | 30 | | 60 | 30 | 60 | 20 | 30 | | 59.94 | 29.97 | 59.94 | 20 | 30 | | 48 | 24 | 48 | 20 | 30 | | 30 | 30 | 30 | 20 | 30 | |
    * 25 | 25 | 25 | 20 | 30 | | 24 | 24 | 24 | 20 | 30 | | 23.976 | 23.976 | 23.976 | 20 | 30 | | 15 | 15 | 15 | 20 | 30 | | 12 | 12 | 12 | 20 | 30 | | 10 | 10 | 10 | 20 | 30 |
    */
  var frameRate: js.UndefOr[Double] = js.native
  
  /** Select the GOP size based on the specified duration. The default is `"3s"`. */
  var gopDuration: js.UndefOr[String] = js.native
  
  /** Select the GOP size based on the specified frame count. Must be greater than zero. */
  var gopFrameCount: js.UndefOr[Double] = js.native
  
  /**
    * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the
    * input height is used.
    */
  var heightPixels: js.UndefOr[Double] = js.native
  
  /**
    * Pixel format to use. The default is `"yuv420p"`. Supported pixel formats: - 'yuv420p' pixel format. - 'yuv422p' pixel format. - 'yuv444p' pixel format. - 'yuv420p10' 10-bit HDR
    * pixel format. - 'yuv422p10' 10-bit HDR pixel format. - 'yuv444p10' 10-bit HDR pixel format. - 'yuv420p12' 12-bit HDR pixel format. - 'yuv422p12' 12-bit HDR pixel format. -
    * 'yuv444p12' 12-bit HDR pixel format.
    */
  var pixelFormat: js.UndefOr[String] = js.native
  
  /**
    * Enforces the specified codec preset. The default is `veryfast`. The available options are FFmpeg-compatible. Note that certain values for this field may cause the transcoder to
    * override other fields you set in the `VideoStream` message.
    */
  var preset: js.UndefOr[String] = js.native
  
  /**
    * Enforces the specified codec profile. The following profiles are supported: * `baseline` * `main` * `high` (default) The available options are FFmpeg-compatible. Note that certain
    * values for this field may cause the transcoder to override other fields you set in the `VideoStream` message.
    */
  var profile: js.UndefOr[String] = js.native
  
  /** Specify the `rate_control_mode`. The default is `"vbr"`. Supported rate control modes: - 'vbr' - variable bitrate - 'crf' - constant rate factor */
  var rateControlMode: js.UndefOr[String] = js.native
  
  /**
    * Enforces the specified codec tune. The available options are FFmpeg-compatible. Note that certain values for this field may cause the transcoder to override other fields you set in
    * the `VideoStream` message.
    */
  var tune: js.UndefOr[String] = js.native
  
  /** Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to 90% of `VideoStream.vbv_size_bits`. */
  var vbvFullnessBits: js.UndefOr[Double] = js.native
  
  /** Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to `VideoStream.bitrate_bps`. */
  var vbvSizeBits: js.UndefOr[Double] = js.native
  
  /**
    * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the
    * input width is used.
    */
  var widthPixels: js.UndefOr[Double] = js.native
}
object VideoStream {
  
  @scala.inline
  def apply(): VideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoStream]
  }
  
  @scala.inline
  implicit class VideoStreamMutableBuilder[Self <: VideoStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowOpenGop(value: Boolean): Self = StObject.set(x, "allowOpenGop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOpenGopUndefined: Self = StObject.set(x, "allowOpenGop", js.undefined)
    
    @scala.inline
    def setAqStrength(value: Double): Self = StObject.set(x, "aqStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAqStrengthUndefined: Self = StObject.set(x, "aqStrength", js.undefined)
    
    @scala.inline
    def setBFrameCount(value: Double): Self = StObject.set(x, "bFrameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBFrameCountUndefined: Self = StObject.set(x, "bFrameCount", js.undefined)
    
    @scala.inline
    def setBPyramid(value: Boolean): Self = StObject.set(x, "bPyramid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBPyramidUndefined: Self = StObject.set(x, "bPyramid", js.undefined)
    
    @scala.inline
    def setBitrateBps(value: Double): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    @scala.inline
    def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    @scala.inline
    def setCrfLevel(value: Double): Self = StObject.set(x, "crfLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrfLevelUndefined: Self = StObject.set(x, "crfLevel", js.undefined)
    
    @scala.inline
    def setEnableTwoPass(value: Boolean): Self = StObject.set(x, "enableTwoPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTwoPassUndefined: Self = StObject.set(x, "enableTwoPass", js.undefined)
    
    @scala.inline
    def setEntropyCoder(value: String): Self = StObject.set(x, "entropyCoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropyCoderUndefined: Self = StObject.set(x, "entropyCoder", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setGopDuration(value: String): Self = StObject.set(x, "gopDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopDurationUndefined: Self = StObject.set(x, "gopDuration", js.undefined)
    
    @scala.inline
    def setGopFrameCount(value: Double): Self = StObject.set(x, "gopFrameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopFrameCountUndefined: Self = StObject.set(x, "gopFrameCount", js.undefined)
    
    @scala.inline
    def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    @scala.inline
    def setPixelFormat(value: String): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelFormatUndefined: Self = StObject.set(x, "pixelFormat", js.undefined)
    
    @scala.inline
    def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: String): Self = StObject.set(x, "rateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateControlModeUndefined: Self = StObject.set(x, "rateControlMode", js.undefined)
    
    @scala.inline
    def setTune(value: String): Self = StObject.set(x, "tune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuneUndefined: Self = StObject.set(x, "tune", js.undefined)
    
    @scala.inline
    def setVbvFullnessBits(value: Double): Self = StObject.set(x, "vbvFullnessBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVbvFullnessBitsUndefined: Self = StObject.set(x, "vbvFullnessBits", js.undefined)
    
    @scala.inline
    def setVbvSizeBits(value: Double): Self = StObject.set(x, "vbvSizeBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVbvSizeBitsUndefined: Self = StObject.set(x, "vbvSizeBits", js.undefined)
    
    @scala.inline
    def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
