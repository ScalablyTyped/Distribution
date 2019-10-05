package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerCircleShimmerCircleDotTypesMod.IShimmerCircleProps
import typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.IShimmerProps
import typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerElementsGroupShimmerElementsGroupDotTypesMod.IShimmerElementsGroupProps
import typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerGapShimmerGapDotTypesMod.IShimmerGapProps
import typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerLineShimmerLineDotTypesMod.IShimmerLineProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Shimmer", JSImport.Namespace)
@js.native
object libShimmerMod extends js.Object {
  @js.native
  class ShimmerBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsShimmerMod.ShimmerBase {
    def this(props: IShimmerProps) = this()
  }
  
  val Shimmer: StatelessComponent[IShimmerProps] = js.native
  val ShimmerCircle: StatelessComponent[IShimmerCircleProps] = js.native
  val ShimmerCircleBase: FunctionComponent[IShimmerCircleProps] = js.native
  val ShimmerElementsGroup: StatelessComponent[IShimmerElementsGroupProps] = js.native
  val ShimmerElementsGroupBase: FunctionComponent[IShimmerElementsGroupProps] = js.native
  val ShimmerGap: StatelessComponent[IShimmerGapProps] = js.native
  val ShimmerGapBase: FunctionComponent[IShimmerGapProps] = js.native
  val ShimmerLine: StatelessComponent[IShimmerLineProps] = js.native
  val ShimmerLineBase: FunctionComponent[IShimmerLineProps] = js.native
  /* static members */
  @js.native
  object ShimmerBase extends js.Object {
    var defaultProps: IShimmerProps = js.native
  }
  
  @js.native
  object ShimmerElementType extends js.Object {
    /* 2 */ val circle: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.circle with Double = js.native
    /* 3 */ val gap: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.gap with Double = js.native
    /* 1 */ val line: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType.line with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementType with Double
      ] = js.native
  }
  
  @js.native
  object ShimmerElementsDefaultHeights extends js.Object {
    /* 24 */ val circle: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights.circle with Double = js.native
    /* 16 */ val gap: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights.gap with Double = js.native
    /* 16 */ val line: typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights.line with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsShimmerShimmerDotTypesMod.ShimmerElementsDefaultHeights with Double
      ] = js.native
  }
  
}

