package typings.officeUiFabricReact

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilitiesMod {
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(millisecond: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(millisecond.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def expectMissing(wrapper: ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]], className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectMissing")(wrapper.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectNodes(
    wrapper: ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]],
    className: String,
    n: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNodes")(wrapper.asInstanceOf[js.Any], className.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectOne(wrapper: ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]], className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectOne")(wrapper.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findNodes(wrapper: ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]], className: String): ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(wrapper.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[js.Any, js.Any, Component[js.Object, js.Object, js.Any]]]
  
  inline def flushPromises(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("flushPromises")().asInstanceOf[js.Promise[Unit]]
  
  inline def mockEvent(): SyntheticEventData = ^.asInstanceOf[js.Dynamic].applyDynamic("mockEvent")().asInstanceOf[SyntheticEventData]
  inline def mockEvent(targetValue: String): SyntheticEventData = ^.asInstanceOf[js.Dynamic].applyDynamic("mockEvent")(targetValue.asInstanceOf[js.Any]).asInstanceOf[SyntheticEventData]
  
  inline def mountAttached[C /* <: Component[js.Object, js.Object, js.Any] */, P, S](element: ReactElement): ReactWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("mountAttached")(element.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, C]]
  
  inline def renderIntoDocument(element: ReactElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
