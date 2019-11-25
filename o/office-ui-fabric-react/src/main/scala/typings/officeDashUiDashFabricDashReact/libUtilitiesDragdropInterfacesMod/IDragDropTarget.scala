package typings.officeDashUiDashFabricDashReact.libUtilitiesDragdropInterfacesMod

import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropTarget extends js.Object {
  var key: String
  var options: IDragDropOptions
  var root: ReactInstance
}

object IDragDropTarget {
  @scala.inline
  def apply(key: String, options: IDragDropOptions, root: ReactInstance): IDragDropTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDragDropTarget]
  }
}

