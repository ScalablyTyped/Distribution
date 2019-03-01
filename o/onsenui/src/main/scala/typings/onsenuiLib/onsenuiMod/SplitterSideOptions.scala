package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterSideOptions extends js.Object {
  /**
    * @description This function will be called after the menu has been opened.
    * @return {Function}
    */
  var callback: js.UndefOr[coreDashJsLib.Function] = js.undefined
}

object SplitterSideOptions {
  @scala.inline
  def apply(callback: coreDashJsLib.Function = null): SplitterSideOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[SplitterSideOptions]
  }
}

