package typings.navigationReact

import typings.navigation.mod.FluentNavigator
import typings.navigation.mod.State
import typings.navigationReact.anon.StateNavigator
import typings.navigationReact.navigationReactStrings.add
import typings.navigationReact.navigationReactStrings.none
import typings.navigationReact.navigationReactStrings.replace
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("navigation-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("navigation-react", "FluentLink")
  @js.native
  class FluentLink protected ()
    extends Component[FluentLinkProps, js.Object, js.Any] {
    def this(props: FluentLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FluentLinkProps, context: js.Any) = this()
  }
  
  @JSImport("navigation-react", "NavigationBackLink")
  @js.native
  class NavigationBackLink protected ()
    extends Component[NavigationBackLinkProps, js.Object, js.Any] {
    def this(props: NavigationBackLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationBackLinkProps, context: js.Any) = this()
  }
  
  @JSImport("navigation-react", "NavigationContext")
  @js.native
  def NavigationContext: Context[NavigationEvent] = js.native
  inline def NavigationContext_=(x: Context[NavigationEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NavigationContext")(x.asInstanceOf[js.Any])
  
  @JSImport("navigation-react", "NavigationHandler")
  @js.native
  class NavigationHandler protected ()
    extends Component[StateNavigator, js.Object, js.Any] {
    def this(props: StateNavigator) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StateNavigator, context: js.Any) = this()
  }
  
  @JSImport("navigation-react", "NavigationLink")
  @js.native
  class NavigationLink protected ()
    extends Component[NavigationLinkProps, js.Object, js.Any] {
    def this(props: NavigationLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavigationLinkProps, context: js.Any) = this()
  }
  
  @JSImport("navigation-react", "RefreshLink")
  @js.native
  class RefreshLink protected ()
    extends Component[RefreshLinkProps, js.Object, js.Any] {
    def this(props: RefreshLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefreshLinkProps, context: js.Any) = this()
  }
  
  trait FluentLinkProps
    extends StObject
       with LinkProps {
    
    /**
      * The function that fluently navigates to a State
      */
    def navigate(fluentNavigator: FluentNavigator): FluentNavigator
    
    /**
      * Indicates whether to inherit the current context
      */
    var withContext: js.UndefOr[Boolean] = js.undefined
  }
  object FluentLinkProps {
    
    inline def apply(navigate: FluentNavigator => FluentNavigator): FluentLinkProps = {
      val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[FluentLinkProps]
    }
    
    extension [Self <: FluentLinkProps](x: Self) {
      
      inline def setNavigate(value: FluentNavigator => FluentNavigator): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setWithContext(value: Boolean): Self = StObject.set(x, "withContext", value.asInstanceOf[js.Any])
      
      inline def setWithContextUndefined: Self = StObject.set(x, "withContext", js.undefined)
    }
  }
  
  trait LinkProps
    extends StObject
       with ClassAttributes[HTMLAnchorElement]
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    /**
      * Determines the effect on browser history
      */
    var historyAction: js.UndefOr[add | replace | none] = js.undefined
    
    /**
      * Handles Link click events
      */
    var navigating: js.UndefOr[
        js.Function2[/* e */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* link */ String, Boolean]
      ] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setHistoryAction(value: add | replace | none): Self = StObject.set(x, "historyAction", value.asInstanceOf[js.Any])
      
      inline def setHistoryActionUndefined: Self = StObject.set(x, "historyAction", js.undefined)
      
      inline def setNavigating(value: (/* e */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* link */ String) => Boolean): Self = StObject.set(x, "navigating", js.Any.fromFunction2(value))
      
      inline def setNavigatingUndefined: Self = StObject.set(x, "navigating", js.undefined)
    }
  }
  
  trait NavigationBackLinkProps
    extends StObject
       with LinkProps {
    
    /**
      * Starting at 1, The number of Crumb steps to go back
      */
    var distance: Double
  }
  object NavigationBackLinkProps {
    
    inline def apply(distance: Double): NavigationBackLinkProps = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationBackLinkProps]
    }
    
    extension [Self <: NavigationBackLinkProps](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationEvent extends StObject {
    
    /**
      * The current asynchronous data
      */
    var asyncData: js.Any
    
    /**
      * The NavigationData for the current State
      */
    var data: js.Any
    
    /**
      * The last State displayed before the current State
      */
    var oldState: State
    
    /**
      * The current State
      */
    var state: State
    
    /**
      * State navigator for the current context
      */
    var stateNavigator: typings.navigation.mod.StateNavigator
  }
  object NavigationEvent {
    
    inline def apply(
      asyncData: js.Any,
      data: js.Any,
      oldState: State,
      state: State,
      stateNavigator: typings.navigation.mod.StateNavigator
    ): NavigationEvent = {
      val __obj = js.Dynamic.literal(asyncData = asyncData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateNavigator = stateNavigator.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationEvent]
    }
    
    extension [Self <: NavigationEvent](x: Self) {
      
      inline def setAsyncData(value: js.Any): Self = StObject.set(x, "asyncData", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOldState(value: State): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNavigator(value: typings.navigation.mod.StateNavigator): Self = StObject.set(x, "stateNavigator", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationLinkProps
    extends StObject
       with RefreshLinkProps {
    
    /**
      * The key of the State to navigate to
      */
    var stateKey: String
  }
  object NavigationLinkProps {
    
    inline def apply(stateKey: String): NavigationLinkProps = {
      val __obj = js.Dynamic.literal(stateKey = stateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationLinkProps]
    }
    
    extension [Self <: NavigationLinkProps](x: Self) {
      
      inline def setStateKey(value: String): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshLinkProps
    extends StObject
       with LinkProps {
    
    /**
      * The Css Class to display when the Link is active
      */
    var activeCssClass: js.UndefOr[String] = js.undefined
    
    /**
      * The style to display when the Link is active
      */
    var activeStyle: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The data to add from the current NavigationData
      */
    var currentDataKeys: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Indicates whether the Link is disabled when active
      */
    var disableActive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether to include all the current NavigationData
      */
    var includeCurrentData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The NavigationData to pass
      */
    var navigationData: js.UndefOr[js.Any] = js.undefined
  }
  object RefreshLinkProps {
    
    inline def apply(): RefreshLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshLinkProps]
    }
    
    extension [Self <: RefreshLinkProps](x: Self) {
      
      inline def setActiveCssClass(value: String): Self = StObject.set(x, "activeCssClass", value.asInstanceOf[js.Any])
      
      inline def setActiveCssClassUndefined: Self = StObject.set(x, "activeCssClass", js.undefined)
      
      inline def setActiveStyle(value: js.Any): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setCurrentDataKeys(value: String | js.Array[String]): Self = StObject.set(x, "currentDataKeys", value.asInstanceOf[js.Any])
      
      inline def setCurrentDataKeysUndefined: Self = StObject.set(x, "currentDataKeys", js.undefined)
      
      inline def setCurrentDataKeysVarargs(value: String*): Self = StObject.set(x, "currentDataKeys", js.Array(value :_*))
      
      inline def setDisableActive(value: Boolean): Self = StObject.set(x, "disableActive", value.asInstanceOf[js.Any])
      
      inline def setDisableActiveUndefined: Self = StObject.set(x, "disableActive", js.undefined)
      
      inline def setIncludeCurrentData(value: Boolean): Self = StObject.set(x, "includeCurrentData", value.asInstanceOf[js.Any])
      
      inline def setIncludeCurrentDataUndefined: Self = StObject.set(x, "includeCurrentData", js.undefined)
      
      inline def setNavigationData(value: js.Any): Self = StObject.set(x, "navigationData", value.asInstanceOf[js.Any])
      
      inline def setNavigationDataUndefined: Self = StObject.set(x, "navigationData", js.undefined)
    }
  }
}
