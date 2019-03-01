package typings
package oraLib.oraMod.oraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Color of the spinner.
    * @default 'cyan'
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set to `false` to stop Ora from hiding the cursor.
    * @default true
    */
  var hideCursor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indent the spinner with the given number of spaces.
    * @default 0
    */
  var indent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Interval between each frame.
    *
    * Spinners provide their own recommended interval, so you don't really need to specify this.
    * @default Provided by the spinner or 100
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Force enable/disable the spinner. If not specified, the spinner will be enabled
    * if the `stream` is being run inside a TTY context (not spawned or piped) and/or not in a CI environment.
    *
    * Note that `{isEnabled: false}` doesn't mean it won't output anything. It just means it won't output the spinner,
    * colors, and other ansi escape codes. It will still log text.
    */
  var isEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Name of one of the provided spinners. See `example.js` in this repo if you want to test out different spinners.
    * On Windows, it will always use the line spinner as the Windows command-line doesn't have proper Unicode support.
    *
    * Or an object like:
    *
    * @example
    * {
    *     interval: 80, // optional
    *     frames: ['-', '+', '-']
    * }
    *
    * @default 'dots'
    */
  var spinner: js.UndefOr[SpinnerName | Spinner] = js.undefined
  /**
    * Stream to write the output.
    *
    * You could for example set this to `process.stdout` instead.
    * @default process.stderr
    */
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  /**
    * Text to display after the spinner.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: Color = null,
    hideCursor: js.UndefOr[scala.Boolean] = js.undefined,
    indent: scala.Int | scala.Double = null,
    interval: scala.Int | scala.Double = null,
    isEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    spinner: SpinnerName | Spinner = null,
    stream: nodeLib.NodeJSNs.WritableStream = null,
    text: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled)
    if (spinner != null) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Options]
  }
}

