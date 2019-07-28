package typings.nodeDashPolyglot.nodeDashPolyglotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyglotOptions extends js.Object {
  var allowMissing: js.UndefOr[Boolean] = js.undefined
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
}

object PolyglotOptions {
  @scala.inline
  def apply(
    allowMissing: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    onMissingKey: (/* key */ String, /* options */ js.UndefOr[InterpolationOptions], /* locale */ js.UndefOr[String]) => String = null,
    phrases: js.Any = null
  ): PolyglotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMissing)) __obj.updateDynamic("allowMissing")(allowMissing)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onMissingKey != null) __obj.updateDynamic("onMissingKey")(js.Any.fromFunction3(onMissingKey))
    if (phrases != null) __obj.updateDynamic("phrases")(phrases)
    __obj.asInstanceOf[PolyglotOptions]
  }
}

