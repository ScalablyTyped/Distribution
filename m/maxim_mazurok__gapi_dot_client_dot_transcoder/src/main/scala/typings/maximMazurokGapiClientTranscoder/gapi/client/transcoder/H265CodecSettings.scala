package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H265CodecSettings extends StObject {
  
  /** Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The default is `false`. */
  var allowOpenGop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate
    * but smoother image. The default is 0.
    */
  var aqStrength: js.UndefOr[Double] = js.undefined
  
  /** The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than `VideoStream.gop_frame_count` if set. The default is 0. */
  var bFrameCount: js.UndefOr[Double] = js.undefined
  
  /** Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The default is `false`. */
  var bPyramid: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 800,000,000. */
  var bitrateBps: js.UndefOr[Double] = js.undefined
  
  /** Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21. */
  var crfLevel: js.UndefOr[Double] = js.undefined
  
  /** Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode` must be `vbr`. The default is `false`. */
  var enableTwoPass: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The
    * API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame
    * rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
    */
  var frameRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and
    * [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
    */
  var gopDuration: js.UndefOr[String] = js.undefined
  
  /** Select the GOP size based on the specified frame count. Must be greater than zero. */
  var gopFrameCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the
    * input height is used.
    */
  var heightPixels: js.UndefOr[Double] = js.undefined
  
  /**
    * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel
    * format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit
    * HDR pixel format
    */
  var pixelFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Enforces the specified codec preset. The default is `veryfast`. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values
    * for this field may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
    */
  var preset: js.UndefOr[String] = js.undefined
  
  /**
    * Enforces the specified codec profile. The following profiles are supported: * 8-bit profiles * `main` (default) * `main-intra` * `mainstillpicture` * 10-bit profiles * `main10`
    * (default) * `main10-intra` * `main422-10` * `main422-10-intra` * `main444-10` * `main444-10-intra` * 12-bit profiles * `main12` (default) * `main12-intra` * `main422-12` *
    * `main422-12-intra` * `main444-12` * `main444-12-intra` The available options are [FFmpeg-compatible](https://x265.readthedocs.io/). Note that certain values for this field may cause
    * the transcoder to override other fields you set in the `H265CodecSettings` message.
    */
  var profile: js.UndefOr[String] = js.undefined
  
  /** Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate - `crf` - constant rate factor */
  var rateControlMode: js.UndefOr[String] = js.undefined
  
  /**
    * Enforces the specified codec tune. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for this field may cause the
    * transcoder to override other fields you set in the `H265CodecSettings` message.
    */
  var tune: js.UndefOr[String] = js.undefined
  
  /** Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to 90% of `VideoStream.vbv_size_bits`. */
  var vbvFullnessBits: js.UndefOr[Double] = js.undefined
  
  /** Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to `VideoStream.bitrate_bps`. */
  var vbvSizeBits: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the
    * input width is used.
    */
  var widthPixels: js.UndefOr[Double] = js.undefined
}
object H265CodecSettings {
  
  inline def apply(): H265CodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H265CodecSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: H265CodecSettings] (val x: Self) extends AnyVal {
    
    inline def setAllowOpenGop(value: Boolean): Self = StObject.set(x, "allowOpenGop", value.asInstanceOf[js.Any])
    
    inline def setAllowOpenGopUndefined: Self = StObject.set(x, "allowOpenGop", js.undefined)
    
    inline def setAqStrength(value: Double): Self = StObject.set(x, "aqStrength", value.asInstanceOf[js.Any])
    
    inline def setAqStrengthUndefined: Self = StObject.set(x, "aqStrength", js.undefined)
    
    inline def setBFrameCount(value: Double): Self = StObject.set(x, "bFrameCount", value.asInstanceOf[js.Any])
    
    inline def setBFrameCountUndefined: Self = StObject.set(x, "bFrameCount", js.undefined)
    
    inline def setBPyramid(value: Boolean): Self = StObject.set(x, "bPyramid", value.asInstanceOf[js.Any])
    
    inline def setBPyramidUndefined: Self = StObject.set(x, "bPyramid", js.undefined)
    
    inline def setBitrateBps(value: Double): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    inline def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    inline def setCrfLevel(value: Double): Self = StObject.set(x, "crfLevel", value.asInstanceOf[js.Any])
    
    inline def setCrfLevelUndefined: Self = StObject.set(x, "crfLevel", js.undefined)
    
    inline def setEnableTwoPass(value: Boolean): Self = StObject.set(x, "enableTwoPass", value.asInstanceOf[js.Any])
    
    inline def setEnableTwoPassUndefined: Self = StObject.set(x, "enableTwoPass", js.undefined)
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGopDuration(value: String): Self = StObject.set(x, "gopDuration", value.asInstanceOf[js.Any])
    
    inline def setGopDurationUndefined: Self = StObject.set(x, "gopDuration", js.undefined)
    
    inline def setGopFrameCount(value: Double): Self = StObject.set(x, "gopFrameCount", value.asInstanceOf[js.Any])
    
    inline def setGopFrameCountUndefined: Self = StObject.set(x, "gopFrameCount", js.undefined)
    
    inline def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    inline def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    inline def setPixelFormat(value: String): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
    
    inline def setPixelFormatUndefined: Self = StObject.set(x, "pixelFormat", js.undefined)
    
    inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRateControlMode(value: String): Self = StObject.set(x, "rateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "rateControlMode", js.undefined)
    
    inline def setTune(value: String): Self = StObject.set(x, "tune", value.asInstanceOf[js.Any])
    
    inline def setTuneUndefined: Self = StObject.set(x, "tune", js.undefined)
    
    inline def setVbvFullnessBits(value: Double): Self = StObject.set(x, "vbvFullnessBits", value.asInstanceOf[js.Any])
    
    inline def setVbvFullnessBitsUndefined: Self = StObject.set(x, "vbvFullnessBits", js.undefined)
    
    inline def setVbvSizeBits(value: Double): Self = StObject.set(x, "vbvSizeBits", value.asInstanceOf[js.Any])
    
    inline def setVbvSizeBitsUndefined: Self = StObject.set(x, "vbvSizeBits", js.undefined)
    
    inline def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    inline def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
