package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsBreadcrumbBreadcrumbDottypesMod.IBreadcrumbData
import typings.officeUiFabricReact.libComponentsBreadcrumbBreadcrumbDottypesMod.IBreadcrumbProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBreadcrumbBreadcrumbDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Breadcrumb/Breadcrumb.base", "BreadcrumbBase")
  @js.native
  open class BreadcrumbBase protected () extends Component[IBreadcrumbProps, Any, Any] {
    def this(props: IBreadcrumbProps) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _focusZone: Any = js.native
    
    /* private */ var _onBreadcrumbClicked: Any = js.native
    
    /**
      * Remove the last item of the overflow set and insert the item as the start of the rendered set past the overflow
      * point.
      */
    /* private */ var _onGrowData: Any = js.native
    
    /**
      * Remove the first rendered item past the overlow point and put it and the end the overflow set.
      */
    /* private */ var _onReduceData: Any = js.native
    
    /* private */ var _onRenderBreadcrumb: Any = js.native
    
    /* private */ var _onRenderItem: Any = js.native
    
    /**
      * Validate incoming props
      * @param props - Props to validate
      */
    /* private */ var _validateProps: Any = js.native
    
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
    inline def defaultProps_=(x: IBreadcrumbProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type IBreadCrumbData = IBreadcrumbData
}
