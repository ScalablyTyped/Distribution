package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnsOptions extends js.Object {
  var parentScope: js.UndefOr[js.Object] = js.undefined
}

object OnsOptions {
  @scala.inline
  def apply(parentScope: js.Object = null): OnsOptions = {
    val __obj = js.Dynamic.literal()
    if (parentScope != null) __obj.updateDynamic("parentScope")(parentScope)
    __obj.asInstanceOf[OnsOptions]
  }
}

