package typings.officeUiFabricReact

import typings.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbData
import typings.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Breadcrumb/Breadcrumb.base", "BreadcrumbBase")
  @js.native
  class BreadcrumbBase protected ()
    extends Component[IBreadcrumbProps, js.Any, js.Any] {
    def this(props: IBreadcrumbProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _focusZone: js.Any = js.native
    
    var _onBreadcrumbClicked: js.Any = js.native
    
    /**
      * Remove the last item of the overflow set and insert the item as the start of the rendered set past the overflow
      * point.
      */
    var _onGrowData: js.Any = js.native
    
    /**
      * Remove the first rendered item past the overlow point and put it and the end the overflow set.
      */
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
  object BreadcrumbBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Breadcrumb/Breadcrumb.base", "BreadcrumbBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Breadcrumb/Breadcrumb.base", "BreadcrumbBase.defaultProps")
    @js.native
    def defaultProps: IBreadcrumbProps = js.native
    @scala.inline
    def defaultProps_=(x: IBreadcrumbProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type IBreadCrumbData = IBreadcrumbData
}
