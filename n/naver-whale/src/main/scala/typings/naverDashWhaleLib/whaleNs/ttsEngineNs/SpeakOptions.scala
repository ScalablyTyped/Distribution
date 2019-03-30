package typings
package naverDashWhaleLib.whaleNs.ttsEngineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeakOptions extends js.Object {
  /**
    * Optional. Gender of voice for synthesized speech.
    * One of: "male", or "female"
    */
  var gender: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The language to be used for synthesis, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0 corresponds to this voice's default pitch. */
  var pitch: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional.
    * Speaking rate relative to the default rate for this voice. 1.0 is the default rate, normally around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. This value is guaranteed to be between 0.1 and 10.0, inclusive. When a voice does not support this full range of rates, don't return an error. Instead, clip the rate to the range the voice supports.
    */
  var rate: js.UndefOr[scala.Double] = js.undefined
  /** Optional. The name of the voice to use for synthesis. */
  var voiceName: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a default of 1.0. */
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object SpeakOptions {
  @scala.inline
  def apply(
    gender: java.lang.String = null,
    lang: java.lang.String = null,
    pitch: scala.Int | scala.Double = null,
    rate: scala.Int | scala.Double = null,
    voiceName: java.lang.String = null,
    volume: scala.Int | scala.Double = null
  ): SpeakOptions = {
    val __obj = js.Dynamic.literal()
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (voiceName != null) __obj.updateDynamic("voiceName")(voiceName)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeakOptions]
  }
}

