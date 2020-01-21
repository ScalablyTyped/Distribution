package typings.officeUiFabricReact.dragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropContext extends js.Object {
  /**
    * Data associated with drag & drop action.
    */
  var data: js.Any
  /**
    * Index of drag & drop action.
    */
  var index: Double
  /**
    * Whether or not drag & drop region is indivual or group of content.
    */
  var isGroup: js.UndefOr[Boolean] = js.undefined
}

object IDragDropContext {
  @scala.inline
  def apply(data: js.Any, index: Double, isGroup: js.UndefOr[Boolean] = js.undefined): IDragDropContext = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(isGroup)) __obj.updateDynamic("isGroup")(isGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropContext]
  }
}

