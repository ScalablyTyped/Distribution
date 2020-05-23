package typings.nodeSass.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context
  extends /* key */ StringDictionary[js.Any] {
  var callback: js.UndefOr[SassRenderCallback] = js.undefined
  var options: Options
}

object Context {
  @scala.inline
  def apply(
    options: Options,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    callback: (/* err */ SassError, /* result */ Result) => js.Any = null
  ): Context = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    __obj.asInstanceOf[Context]
  }
}

