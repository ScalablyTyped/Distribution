package typings.naverWhale.whale.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TtsVoice extends js.Object {
  /** All of the callback event types that this voice is capable of sending. */
  var eventTypes: js.UndefOr[js.Array[String]] = js.undefined
  /** The ID of the extension providing this voice. */
  var extensionsId: js.UndefOr[String] = js.undefined
  /**
    * Optional. This voice's gender.
    * One of: "male", or "female"
    */
  var gender: js.UndefOr[String] = js.undefined
  /** Optional. The language that this voice supports, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[String] = js.undefined
  /**
    * If true, the synthesis engine is a remote network resource. It may be higher latency and may incur bandwidth costs.
    * @since Chrome 33.
    */
  var remote: js.UndefOr[Boolean] = js.undefined
  /** Optional. The name of the voice. */
  var voiceName: js.UndefOr[String] = js.undefined
}

object TtsVoice {
  @scala.inline
  def apply(
    eventTypes: js.Array[String] = null,
    extensionsId: String = null,
    gender: String = null,
    lang: String = null,
    remote: js.UndefOr[Boolean] = js.undefined,
    voiceName: String = null
  ): TtsVoice = {
    val __obj = js.Dynamic.literal()
    if (eventTypes != null) __obj.updateDynamic("eventTypes")(eventTypes.asInstanceOf[js.Any])
    if (extensionsId != null) __obj.updateDynamic("extensionsId")(extensionsId.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(remote)) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    if (voiceName != null) __obj.updateDynamic("voiceName")(voiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TtsVoice]
  }
}

