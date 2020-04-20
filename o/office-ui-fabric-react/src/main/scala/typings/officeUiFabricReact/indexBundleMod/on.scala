package typings.officeUiFabricReact.indexBundleMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "on")
@js.native
object on extends js.Object {
  def apply(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event_ | (SyntheticEvent[Element, Event_]), Unit]
  ): js.Function0[Unit] = js.native
  def apply(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event_ | (SyntheticEvent[Element, Event_]), Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(
    element: Window_,
    eventName: String,
    callback: js.Function1[/* ev */ Event_ | (SyntheticEvent[Element, Event_]), Unit]
  ): js.Function0[Unit] = js.native
  def apply(
    element: Window_,
    eventName: String,
    callback: js.Function1[/* ev */ Event_ | (SyntheticEvent[Element, Event_]), Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
}

