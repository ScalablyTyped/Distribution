package typings.nodePolyglot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyglotOptions extends js.Object {
  var allowMissing: js.UndefOr[Boolean] = js.undefined
  var interpolation: js.UndefOr[InterpolationTokenOptions] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var onMissingKey: js.UndefOr[
    js.Function3[
      /* key */ String, 
      /* options */ js.UndefOr[InterpolationOptions], 
      /* locale */ js.UndefOr[String], 
      String
    ]
  ] = js.undefined
  var phrases: js.UndefOr[js.Any] = js.undefined
  var warn: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
}

object PolyglotOptions {
  @scala.inline
  def apply(
    allowMissing: js.UndefOr[Boolean] = js.undefined,
    interpolation: InterpolationTokenOptions = null,
    locale: String = null,
    onMissingKey: (/* key */ String, /* options */ js.UndefOr[InterpolationOptions], /* locale */ js.UndefOr[String]) => String = null,
    phrases: js.Any = null,
    warn: /* message */ String => Unit = null
  ): PolyglotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMissing)) __obj.updateDynamic("allowMissing")(allowMissing.get.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onMissingKey != null) __obj.updateDynamic("onMissingKey")(js.Any.fromFunction3(onMissingKey))
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1(warn))
    __obj.asInstanceOf[PolyglotOptions]
  }
}

