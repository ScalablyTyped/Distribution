package typings
package atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dock layout configuration object.
  */
trait ILayoutConfig extends js.Object {
  /**
    * The layout config for the main dock area.
    */
  var main: AreaConfig | scala.Null
}

object ILayoutConfig {
  @scala.inline
  def apply(main: AreaConfig = null): ILayoutConfig = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    __obj.asInstanceOf[ILayoutConfig]
  }
}

