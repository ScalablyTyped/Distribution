package typings
package oraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  /**
  	 * Color of the spinner.
  	 *
  	 * @default 'cyan'
  	 */
  var color: js.UndefOr[oraLib.oraMod.Color] = js.undefined
  /**
  	 * Set to `false` to stop Ora from hiding the cursor.
  	 *
  	 * @default true
  	 */
  var hideCursor: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indent the spinner with the given number of spaces.
  	 *
  	 * @default 0
  	 */
  var indent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Interval between each frame.
  	 *
  	 * Spinners provide their own recommended interval, so you don't really need to specify this. Default value: Provided by the spinner or `100`.
  	 */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Force enable/disable the spinner. If not specified, the spinner will be enabled if the `stream` is being run inside a TTY context (not spawned or piped) and/or not in a CI environment.
  	 *
  	 * Note that `{isEnabled: false}` doesn't mean it won't output anything. It just means it won't output the spinner, colors, and other ansi escape codes. It will still log text.
  	 */
  var isEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Name of one of the provided spinners. See [`example.js`](https://github.com/BendingBender/ora/blob/master/example.js) in this repo if you want to test out different spinners. On Windows, it will always use the line spinner as the Windows command-line doesn't have proper Unicode support.
  	 *
  	 * @default 'dots'
  	 *
  	 * Or an object like:
  	 *
  	 * @example
  	 *
  	 * {
  	 * 	interval: 80, // Optional
  	 * 	frames: ['-', '+', '-']
  	 * }
  	 *
  	 */
  var spinner: js.UndefOr[
    cliDashSpinnersLib.cliDashSpinnersMod.cliSpinnersNs.SpinnerName | oraLib.oraMod.Spinner
  ] = js.undefined
  /**
  	 * Stream to write the output.
  	 *
  	 * You could for example set this to `process.stdout` instead.
  	 *
  	 * @default process.stderr
  	 */
  var stream: js.UndefOr[nodeLib.streamMod.Writable] = js.undefined
  /**
  	 * Text to display after the spinner.
  	 */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: oraLib.oraMod.Color = null,
    hideCursor: js.UndefOr[scala.Boolean] = js.undefined,
    indent: scala.Int | scala.Double = null,
    interval: scala.Int | scala.Double = null,
    isEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    spinner: cliDashSpinnersLib.cliDashSpinnersMod.cliSpinnersNs.SpinnerName | oraLib.oraMod.Spinner = null,
    stream: nodeLib.streamMod.Writable = null,
    text: java.lang.String = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled)
    if (spinner != null) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Color]
  }
}

