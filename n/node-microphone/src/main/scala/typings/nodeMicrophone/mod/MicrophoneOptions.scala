package typings.nodeMicrophone.mod

import typings.nodeMicrophone.nodeMicrophoneNumbers.`16000`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`16`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`1`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`24`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`2`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`44100`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`8000`
import typings.nodeMicrophone.nodeMicrophoneNumbers.`8`
import typings.nodeMicrophone.nodeMicrophoneStrings.`signed-integer`
import typings.nodeMicrophone.nodeMicrophoneStrings.`unsigned-integer`
import typings.nodeMicrophone.nodeMicrophoneStrings.big
import typings.nodeMicrophone.nodeMicrophoneStrings.default
import typings.nodeMicrophone.nodeMicrophoneStrings.hwColon0Comma0
import typings.nodeMicrophone.nodeMicrophoneStrings.little
import typings.nodeMicrophone.nodeMicrophoneStrings.plughwColon1Comma0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrophoneOptions extends js.Object {
  var additionalParameters: js.UndefOr[js.Any] = js.undefined
  var bitwidth: js.UndefOr[`8` | `16` | `24`] = js.undefined
  var channels: js.UndefOr[`1` | `2`] = js.undefined
  var device: js.UndefOr[hwColon0Comma0 | plughwColon1Comma0 | default] = js.undefined
  var encoding: js.UndefOr[`signed-integer` | `unsigned-integer`] = js.undefined
  var endian: js.UndefOr[big | little] = js.undefined
  var rate: js.UndefOr[`8000` | `16000` | `44100`] = js.undefined
}

object MicrophoneOptions {
  @scala.inline
  def apply(
    additionalParameters: js.Any = null,
    bitwidth: `8` | `16` | `24` = null,
    channels: `1` | `2` = null,
    device: hwColon0Comma0 | plughwColon1Comma0 | default = null,
    encoding: `signed-integer` | `unsigned-integer` = null,
    endian: big | little = null,
    rate: `8000` | `16000` | `44100` = null
  ): MicrophoneOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalParameters != null) __obj.updateDynamic("additionalParameters")(additionalParameters.asInstanceOf[js.Any])
    if (bitwidth != null) __obj.updateDynamic("bitwidth")(bitwidth.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (endian != null) __obj.updateDynamic("endian")(endian.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrophoneOptions]
  }
}

