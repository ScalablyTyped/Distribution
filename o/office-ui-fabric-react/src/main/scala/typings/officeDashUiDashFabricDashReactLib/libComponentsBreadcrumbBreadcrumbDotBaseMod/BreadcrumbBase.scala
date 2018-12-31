package typings
package officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Breadcrumb/Breadcrumb.base", "BreadcrumbBase")
@js.native
class BreadcrumbBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotTypesMod.IBreadcrumbProps, 
      js.Any
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotTypesMod.IBreadcrumbProps) = this()
  var _classNames: js.Any = js.native
  var _focusZone: js.Any = js.native
  var _onBreadcrumbClicked: js.Any = js.native
  var _onReduceData: js.Any = js.native
  var _onRenderBreadcrumb: js.Any = js.native
  var _onRenderItem: js.Any = js.native
  /**
    * Validate incoming props
    * @param props Props to validate
    */
  /* private */ def _validateProps(props: js.Any): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MBreadcrumbBase(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotTypesMod.IBreadcrumbProps
  ): scala.Unit = js.native
  /**
    * Sets focus to the first breadcrumb link.
    */
  def focus(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Breadcrumb/Breadcrumb.base", "BreadcrumbBase")
@js.native
object BreadcrumbBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotTypesMod.IBreadcrumbProps = js.native
}

