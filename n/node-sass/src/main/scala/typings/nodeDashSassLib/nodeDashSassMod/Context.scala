package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context
  extends /* data */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var callback: js.UndefOr[SassRenderCallback]
  var options: Options
}

object Context {
  @scala.inline
  def apply(
    options: Options,
    StringDictionary: /* data */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    callback: SassRenderCallback = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[Context]
  }
}

