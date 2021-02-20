package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PickISearchBoxPropsdisabl
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBoxBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.base", "SearchBoxBase")
  @js.native
  class SearchBoxBase protected ()
    extends Component[ISearchBoxProps, ISearchBoxState, js.Any] {
    def this(props: ISearchBoxProps) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSearchBoxBase(newProps: ISearchBoxProps): Unit = js.native
    
    var _callOnChange: js.Any = js.native
    
    var _fallbackId: js.Any = js.native
    
    var _inputElement: js.Any = js.native
    
    var _latestValue: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onClear: js.Any = js.native
    
    var _onClearClick: js.Any = js.native
    
    var _onClickFocus: js.Any = js.native
    
    var _onFocusCapture: js.Any = js.native
    
    var _onInputChange: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _rootElement: js.Any = js.native
    
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
    @scala.inline
    def defaultProps_=(x: PickISearchBoxPropsdisabl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ISearchBoxState extends StObject {
    
    var hasFocus: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object ISearchBoxState {
    
    @scala.inline
    def apply(): ISearchBoxState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISearchBoxState]
    }
    
    @scala.inline
    implicit class ISearchBoxStateMutableBuilder[Self <: ISearchBoxState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFocusUndefined: Self = StObject.set(x, "hasFocus", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
