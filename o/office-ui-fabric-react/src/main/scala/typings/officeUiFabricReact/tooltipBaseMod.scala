package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialITooltipProps
import typings.officeUiFabricReact.tooltipTypesMod.ITooltipProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.base", "TooltipBase")
  @js.native
  class TooltipBase protected ()
    extends Component[ITooltipProps, js.Any, js.Any] {
    def this(props: ITooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ITooltipProps, context: js.Any) = this()
    
    var _classNames: js.Any = js.native
    
    var _onRenderContent: js.Any = js.native
  }
  /* static members */
  object TooltipBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.base", "TooltipBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.base", "TooltipBase.defaultProps")
    @js.native
    def defaultProps: PartialITooltipProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialITooltipProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
