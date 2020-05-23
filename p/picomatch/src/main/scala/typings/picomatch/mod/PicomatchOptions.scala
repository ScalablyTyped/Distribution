package typings.picomatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PicomatchOptions extends js.Object {
  var contains: js.UndefOr[Boolean] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
  var ignore: js.UndefOr[String] = js.undefined
  var onIgnore: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
  var onMatch: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
  var onResult: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
  var windows: js.UndefOr[Boolean] = js.undefined
}

object PicomatchOptions {
  @scala.inline
  def apply(
    contains: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    format: /* input */ String => String = null,
    ignore: String = null,
    onIgnore: /* result */ Result => Unit = null,
    onMatch: /* result */ Result => Unit = null,
    onResult: /* result */ Result => Unit = null,
    windows: js.UndefOr[Boolean] = js.undefined
  ): PicomatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contains)) __obj.updateDynamic("contains")(contains.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (onIgnore != null) __obj.updateDynamic("onIgnore")(js.Any.fromFunction1(onIgnore))
    if (onMatch != null) __obj.updateDynamic("onMatch")(js.Any.fromFunction1(onMatch))
    if (onResult != null) __obj.updateDynamic("onResult")(js.Any.fromFunction1(onResult))
    if (!js.isUndefined(windows)) __obj.updateDynamic("windows")(windows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicomatchOptions]
  }
}

