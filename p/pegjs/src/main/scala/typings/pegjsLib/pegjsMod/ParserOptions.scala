package typings
package pegjsLib.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var startRule: js.UndefOr[java.lang.String] = js.undefined
  var tracer: js.UndefOr[js.Any] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    startRule: java.lang.String = null,
    tracer: js.Any = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (startRule != null) __obj.updateDynamic("startRule")(startRule)
    if (tracer != null) __obj.updateDynamic("tracer")(tracer)
    __obj.asInstanceOf[ParserOptions]
  }
}

