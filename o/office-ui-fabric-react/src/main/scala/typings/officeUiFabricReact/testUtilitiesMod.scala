package typings.officeUiFabricReact

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/common/testUtilities", JSImport.Namespace)
@js.native
object testUtilitiesMod extends js.Object {
  def delay(millisecond: Double): js.Promise[Unit] = js.native
  def expectMissing(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object, _]], className: String): Unit = js.native
  def expectNodes(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object, _]], className: String, n: Double): Unit = js.native
  def expectOne(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object, _]], className: String): Unit = js.native
  def findNodes(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object, _]], className: String): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  def flushPromises(): js.Promise[Unit] = js.native
  def mockEvent(): SyntheticEventData = js.native
  def mockEvent(targetValue: String): SyntheticEventData = js.native
  def mountAttached[C /* <: Component[js.Object, js.Object, _] */, P, S](element: ReactElement): ReactWrapper[P, S, C] = js.native
  def renderIntoDocument(element: ReactElement): HTMLElement = js.native
}

