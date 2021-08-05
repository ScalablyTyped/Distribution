package typings.officeUiFabricReact

import typings.officeUiFabricReact.facepileTypesMod.IFacepileProps
import typings.officeUiFabricReact.officeUiFabricReactStrings._empty
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facepileBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.base", "FacepileBase")
  @js.native
  class FacepileBase protected ()
    extends Component[IFacepileProps, js.Object, js.Any] {
    def this(props: IFacepileProps) = this()
    
    /* private */ var _ariaDescriptionId: js.Any = js.native
    
    /* private */ var _classNames: js.Any = js.native
    
    /* private */ var _getAddNewElement: js.Any = js.native
    
    /* private */ var _getDescriptiveOverflowElement: js.Any = js.native
    
    /* private */ var _getElementProps: js.Any = js.native
    
    /* private */ var _getElementWithOnClickEvent: js.Any = js.native
    
    /* private */ var _getElementWithoutOnClickEvent: js.Any = js.native
    
    /* private */ var _getIconElement: js.Any = js.native
    
    /* private */ var _getOverflowElement: js.Any = js.native
    
    /* private */ var _getPersonaCoinControl: js.Any = js.native
    
    /* private */ var _getPersonaControl: js.Any = js.native
    
    /* private */ var _onPersonaClick: js.Any = js.native
    
    /* private */ var _onPersonaMouseMove: js.Any = js.native
    
    /* private */ var _onPersonaMouseOut: js.Any = js.native
    
    /* private */ var _onRenderVisiblePersonas: js.Any = js.native
    
    /* private */ var _renderInitials: js.Any = js.native
    
    /* private */ var _renderInitialsNotPictured: js.Any = js.native
    
    /* protected */ def onRenderAriaDescription(): js.UndefOr[_empty | Element] = js.native
  }
  /* static members */
  object FacepileBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.base", "FacepileBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.base", "FacepileBase.defaultProps")
    @js.native
    def defaultProps: IFacepileProps = js.native
    inline def defaultProps_=(x: IFacepileProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
