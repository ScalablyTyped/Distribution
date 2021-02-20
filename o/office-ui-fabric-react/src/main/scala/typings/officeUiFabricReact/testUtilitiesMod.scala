package typings.officeUiFabricReact

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilitiesMod {
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "delay")
  @js.native
  def delay(millisecond: Double): js.Promise[Unit] = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "expectMissing")
  @js.native
  def expectMissing(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object, _]], className: String): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "expectNodes")
  @js.native
  def expectNodes(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object, _]], className: String, n: Double): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "expectOne")
  @js.native
  def expectOne(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object, _]], className: String): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "findNodes")
  @js.native
  def findNodes(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object, _]], className: String): ReactWrapper[_, _, Component[js.Object, js.Object, _]] = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "flushPromises")
  @js.native
  def flushPromises(): js.Promise[Unit] = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "mockEvent")
  @js.native
  def mockEvent(): SyntheticEventData = js.native
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "mockEvent")
  @js.native
  def mockEvent(targetValue: String): SyntheticEventData = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "mountAttached")
  @js.native
  def mountAttached[C /* <: Component[js.Object, js.Object, _] */, P, S](element: ReactElement): ReactWrapper[P, S, C] = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "renderIntoDocument")
  @js.native
  def renderIntoDocument(element: ReactElement): HTMLElement = js.native
}
