package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.navTypesMod.INav
import typings.officeUiFabricReact.navTypesMod.INavProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase")
  @js.native
  class NavBase protected ()
    extends Component[INavProps, INavState, js.Any]
       with INav {
    def this(props: INavProps) = this()
    
    /* private */ var _focusZone: js.Any = js.native
    
    /* private */ var _isGroupExpanded: js.Any = js.native
    
    /* private */ var _isLinkSelected: js.Any = js.native
    
    /* private */ var _onGroupHeaderClicked: js.Any = js.native
    
    /* private */ var _onLinkExpandClicked: js.Any = js.native
    
    /* private */ var _onNavAnchorLinkClicked: js.Any = js.native
    
    /* private */ var _onNavButtonLinkClicked: js.Any = js.native
    
    /* private */ var _onRenderLink: js.Any = js.native
    
    /* private */ var _preventBounce: js.Any = js.native
    
    /* private */ var _renderCompositeLink: js.Any = js.native
    
    /* private */ var _renderGroup: js.Any = js.native
    
    /* private */ var _renderGroupHeader: js.Any = js.native
    
    /* private */ var _renderLink: js.Any = js.native
    
    /* private */ var _renderLinks: js.Any = js.native
    
    /* private */ var _renderNavLink: js.Any = js.native
    
    /* private */ var _toggleCollapsed: js.Any = js.native
  }
  /* static members */
  object NavBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase.defaultProps")
    @js.native
    def defaultProps: INavProps = js.native
    inline def defaultProps_=(x: INavProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def isRelativeUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait INavState extends StObject {
    
    var isGroupCollapsed: StringDictionary[Boolean]
    
    var isLinkExpandStateChanged: js.UndefOr[Boolean] = js.undefined
    
    var selectedKey: js.UndefOr[String] = js.undefined
  }
  object INavState {
    
    inline def apply(isGroupCollapsed: StringDictionary[Boolean]): INavState = {
      val __obj = js.Dynamic.literal(isGroupCollapsed = isGroupCollapsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavState]
    }
    
    extension [Self <: INavState](x: Self) {
      
      inline def setIsGroupCollapsed(value: StringDictionary[Boolean]): Self = StObject.set(x, "isGroupCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsLinkExpandStateChanged(value: Boolean): Self = StObject.set(x, "isLinkExpandStateChanged", value.asInstanceOf[js.Any])
      
      inline def setIsLinkExpandStateChangedUndefined: Self = StObject.set(x, "isLinkExpandStateChanged", js.undefined)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
}
