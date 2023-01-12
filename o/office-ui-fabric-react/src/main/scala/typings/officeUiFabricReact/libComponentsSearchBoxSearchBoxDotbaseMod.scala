package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PickISearchBoxPropsdisabl
import typings.officeUiFabricReact.libComponentsSearchBoxSearchBoxDottypesMod.ISearchBoxProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSearchBoxSearchBoxDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
  @js.native
  open class SearchBoxBase protected () extends Component[ISearchBoxProps, ISearchBoxState, Any] {
    def this(props: ISearchBoxProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSearchBoxBase(newProps: ISearchBoxProps): Unit = js.native
    
    /* private */ var _callOnChange: Any = js.native
    
    /* private */ var _fallbackId: Any = js.native
    
    /* private */ var _inputElement: Any = js.native
    
    /* private */ var _latestValue: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onClear: Any = js.native
    
    /* private */ var _onClearClick: Any = js.native
    
    /* private */ var _onClickFocus: Any = js.native
    
    /* private */ var _onFocusCapture: Any = js.native
    
    /* private */ var _onInputChange: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _rootElement: Any = js.native
    
    /**
      * Sets focus to the search box input field
      */
    def focus(): Unit = js.native
    
    /**
      * Returns whether or not the SearchBox has focus
      */
    def hasFocus(): Boolean = js.native
  }
  /* static members */
  object SearchBoxBase {
    
    @JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase.defaultProps")
    @js.native
    def defaultProps: PickISearchBoxPropsdisabl = js.native
    inline def defaultProps_=(x: PickISearchBoxPropsdisabl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ISearchBoxState extends StObject {
    
    var hasFocus: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ISearchBoxState {
    
    inline def apply(): ISearchBoxState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISearchBoxState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISearchBoxState] (val x: Self) extends AnyVal {
      
      inline def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      inline def setHasFocusUndefined: Self = StObject.set(x, "hasFocus", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
