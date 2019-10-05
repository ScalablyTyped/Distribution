package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod.IScrollablePaneContext
import typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.IStickyProps
import typings.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Sticky", JSImport.Namespace)
@js.native
object libStickyMod extends js.Object {
  @js.native
  class Sticky protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsStickyMod.Sticky {
    def this(props: IStickyProps) = this()
  }
  
  /* static members */
  @js.native
  object Sticky extends js.Object {
    var contextType: Context[IScrollablePaneContext] = js.native
    var defaultProps: IStickyProps = js.native
  }
  
  @js.native
  object StickyPositionType extends js.Object {
    /* 0 */ val Both: typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Both with Double = js.native
    /* 2 */ val Footer: typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Footer with Double = js.native
    /* 1 */ val Header: typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType.Header with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyDotTypesMod.StickyPositionType with Double
      ] = js.native
  }
  
}

