package typings.ora.mod

import typings.cliSpinners.mod.SpinnerName
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Color of the spinner.
  		@default 'cyan'
  		*/
  val color: js.UndefOr[Color] = js.undefined
  /**
  		Discard stdin input (except Ctrl+C) while running if it's TTY. This prevents the spinner from twitching on input, outputting broken lines on `Enter` key presses, and prevents buffering of input while the spinner is running.
  		This has no effect on Windows as there's no good way to implement discarding stdin properly there.
  		@default true
  		*/
  val discardStdin: js.UndefOr[Boolean] = js.undefined
  /**
  		Set to `false` to stop Ora from hiding the cursor.
  		@default true
  		*/
  val hideCursor: js.UndefOr[Boolean] = js.undefined
  /**
  		Indent the spinner with the given number of spaces.
  		@default 0
  		*/
  val indent: js.UndefOr[Double] = js.undefined
  /**
  		Interval between each frame.
  		Spinners provide their own recommended interval, so you don't really need to specify this.
  		Default: Provided by the spinner or `100`.
  		*/
  val interval: js.UndefOr[Double] = js.undefined
  /**
  		Force enable/disable the spinner. If not specified, the spinner will be enabled if the `stream` is being run inside a TTY context (not spawned or piped) and/or not in a CI environment.
  		Note that `{isEnabled: false}` doesn't mean it won't output anything. It just means it won't output the spinner, colors, and other ansi escape codes. It will still log text.
  		*/
  val isEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  		Text to display before the spinner. No prefix text will be displayed if set to an empty string.
  		*/
  val prefixText: js.UndefOr[String] = js.undefined
  /**
  		Name of one of the provided spinners. See [`example.js`](https://github.com/BendingBender/ora/blob/master/example.js) in this repo if you want to test out different spinners. On Windows, it will always use the line spinner as the Windows command-line doesn't have proper Unicode support.
  		@default 'dots'
  		Or an object like:
  		@example
  		```
  		{
  			interval: 80, // Optional
  			frames: ['-', '+', '-']
  		}
  		```
  		*/
  val spinner: js.UndefOr[SpinnerName | Spinner] = js.undefined
  /**
  		Stream to write the output.
  		You could for example set this to `process.stdout` instead.
  		@default process.stderr
  		*/
  val stream: js.UndefOr[WritableStream] = js.undefined
  /**
  		Text to display after the spinner.
  		*/
  val text: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    color: Color = null,
    discardStdin: js.UndefOr[Boolean] = js.undefined,
    hideCursor: js.UndefOr[Boolean] = js.undefined,
    indent: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    prefixText: String = null,
    spinner: SpinnerName | Spinner = null,
    stream: WritableStream = null,
    text: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(discardStdin)) __obj.updateDynamic("discardStdin")(discardStdin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.get.asInstanceOf[js.Any])
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText.asInstanceOf[js.Any])
    if (spinner != null) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

