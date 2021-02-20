package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.navTypesMod.INav
import typings.officeUiFabricReact.navTypesMod.INavProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase")
  @js.native
  class NavBase protected ()
    extends Component[INavProps, INavState, js.Any]
       with INav {
    def this(props: INavProps) = this()
    
    var _focusZone: js.Any = js.native
    
    var _isGroupExpanded: js.Any = js.native
    
    var _isLinkSelected: js.Any = js.native
    
    var _onGroupHeaderClicked: js.Any = js.native
    
    var _onLinkExpandClicked: js.Any = js.native
    
    var _onNavAnchorLinkClicked: js.Any = js.native
    
    var _onNavButtonLinkClicked: js.Any = js.native
    
    var _onRenderLink: js.Any = js.native
    
    var _preventBounce: js.Any = js.native
    
    var _renderCompositeLink: js.Any = js.native
    
    var _renderGroup: js.Any = js.native
    
    var _renderGroupHeader: js.Any = js.native
    
    var _renderLink: js.Any = js.native
    
    var _renderLinks: js.Any = js.native
    
    var _renderNavLink: js.Any = js.native
    
    var _toggleCollapsed: js.Any = js.native
  }
  /* static members */
  object NavBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "NavBase.defaultProps")
    @js.native
    def defaultProps: INavProps = js.native
    @scala.inline
    def defaultProps_=(x: INavProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Nav/Nav.base", "isRelativeUrl")
  @js.native
  def isRelativeUrl(url: String): Boolean = js.native
  
  @js.native
  trait INavState extends StObject {
    
    var isGroupCollapsed: StringDictionary[Boolean] = js.native
    
    var isLinkExpandStateChanged: js.UndefOr[Boolean] = js.native
    
    var selectedKey: js.UndefOr[String] = js.native
  }
  object INavState {
    
    @scala.inline
    def apply(isGroupCollapsed: StringDictionary[Boolean]): INavState = {
      val __obj = js.Dynamic.literal(isGroupCollapsed = isGroupCollapsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavState]
    }
    
    @scala.inline
    implicit class INavStateMutableBuilder[Self <: INavState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsGroupCollapsed(value: StringDictionary[Boolean]): Self = StObject.set(x, "isGroupCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLinkExpandStateChanged(value: Boolean): Self = StObject.set(x, "isLinkExpandStateChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLinkExpandStateChangedUndefined: Self = StObject.set(x, "isLinkExpandStateChanged", js.undefined)
      
      @scala.inline
      def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
}
