package typings.officeUiFabricReact

import typings.officeUiFabricReact.popupTypesMod.IPopupProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupPopupMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Popup/Popup", "Popup")
  @js.native
  class Popup protected ()
    extends Component[IPopupProps, IPopupState, js.Any] {
    def this(props: IPopupProps) = this()
    
    @JSName("UNSAFE_componentWillMount")
    def UNSAFE_componentWillMount_MPopup(): Unit = js.native
    
    /* private */ var _async: js.Any = js.native
    
    /* private */ var _containsFocus: js.Any = js.native
    
    /* private */ var _disposables: js.Any = js.native
    
    /* private */ var _getScrollBar: js.Any = js.native
    
    /* private */ var _onBlur: js.Any = js.native
    
    /* private */ var _onFocus: js.Any = js.native
    
    /* private */ var _onKeyDown: js.Any = js.native
    
    /* private */ var _originalFocusedElement: js.Any = js.native
    
    var _root: RefObject[HTMLDivElement] = js.native
    
    /* private */ var _updateScrollBarAsync: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPopup(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPopup(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopup(): Unit = js.native
  }
  /* static members */
  object Popup {
    
    @JSImport("office-ui-fabric-react/lib/components/Popup/Popup", "Popup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Popup/Popup", "Popup.defaultProps")
    @js.native
    def defaultProps: IPopupProps = js.native
    inline def defaultProps_=(x: IPopupProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IPopupState extends StObject {
    
    var needsVerticalScrollBar: js.UndefOr[Boolean] = js.undefined
  }
  object IPopupState {
    
    inline def apply(): IPopupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupState]
    }
    
    extension [Self <: IPopupState](x: Self) {
      
      inline def setNeedsVerticalScrollBar(value: Boolean): Self = StObject.set(x, "needsVerticalScrollBar", value.asInstanceOf[js.Any])
      
      inline def setNeedsVerticalScrollBarUndefined: Self = StObject.set(x, "needsVerticalScrollBar", js.undefined)
    }
  }
}
