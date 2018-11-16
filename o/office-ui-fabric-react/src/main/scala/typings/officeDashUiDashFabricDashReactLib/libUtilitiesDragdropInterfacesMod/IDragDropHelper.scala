package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesDragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDragDropHelper extends js.Object {
  def dispose(): scala.Unit
  def subscribe(
    root: reactLib.HTMLElement,
    events: officeDashUiDashFabricDashReactLib.libUtilitiesMod.EventGroup,
    options: IDragDropOptions
  ): officeDashUiDashFabricDashReactLib.Anon_KeyDisposeString
  def unsubscribe(root: reactLib.HTMLElement, key: java.lang.String): scala.Unit
}

