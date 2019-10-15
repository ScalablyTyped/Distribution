package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsBreadcrumbBreadcrumbDotTypesMod.IBreadcrumbData
import typings.officeDashUiDashFabricDashReact.libComponentsBreadcrumbBreadcrumbDotTypesMod.IBreadcrumbProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Breadcrumb/Breadcrumb.base", JSImport.Namespace)
@js.native
object libComponentsBreadcrumbBreadcrumbDotBaseMod extends js.Object {
  @js.native
  class BreadcrumbBase protected ()
    extends Component[IBreadcrumbProps, js.Any, js.Any] {
    def this(props: IBreadcrumbProps) = this()
    var _classNames: js.Any = js.native
    var _focusZone: js.Any = js.native
    var _onBreadcrumbClicked: js.Any = js.native
    var _onReduceData: js.Any = js.native
    var _onRenderBreadcrumb: js.Any = js.native
    var _onRenderItem: js.Any = js.native
    /**
      * Validate incoming props
      * @param props - Props to validate
      */
    var _validateProps: js.Any = js.native
    /**
      * Sets focus to the first breadcrumb link.
      */
    def focus(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BreadcrumbBase extends js.Object {
    var defaultProps: IBreadcrumbProps = js.native
  }
  
  type IBreadCrumbData = IBreadcrumbData
}

