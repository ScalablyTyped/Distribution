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
import scala.scalajs.js.`|`
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
  @scala.inline
  def NavigationContext_=(x: Context[NavigationEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NavigationContext")(x.asInstanceOf[js.Any])
  
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
  
  @js.native
  trait FluentLinkProps extends LinkProps {
    
    /**
      * The function that fluently navigates to a State
      */
    def navigate(fluentNavigator: FluentNavigator): FluentNavigator = js.native
    
    /**
      * Indicates whether to inherit the current context
      */
    var withContext: js.UndefOr[Boolean] = js.native
  }
  object FluentLinkProps {
    
    @scala.inline
    def apply(navigate: FluentNavigator => FluentNavigator): FluentLinkProps = {
      val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[FluentLinkProps]
    }
    
    @scala.inline
    implicit class FluentLinkPropsMutableBuilder[Self <: FluentLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNavigate(value: FluentNavigator => FluentNavigator): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWithContext(value: Boolean): Self = StObject.set(x, "withContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithContextUndefined: Self = StObject.set(x, "withContext", js.undefined)
    }
  }
  
  @js.native
  trait LinkProps
    extends AnchorHTMLAttributes[HTMLAnchorElement]
       with ClassAttributes[HTMLAnchorElement] {
    
    /**
      * Determines the effect on browser history
      */
    var historyAction: js.UndefOr[add | replace | none] = js.native
    
    /**
      * Handles Link click events
      */
    var navigating: js.UndefOr[
        js.Function2[/* e */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* link */ String, Boolean]
      ] = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistoryAction(value: add | replace | none): Self = StObject.set(x, "historyAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryActionUndefined: Self = StObject.set(x, "historyAction", js.undefined)
      
      @scala.inline
      def setNavigating(value: (/* e */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* link */ String) => Boolean): Self = StObject.set(x, "navigating", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNavigatingUndefined: Self = StObject.set(x, "navigating", js.undefined)
    }
  }
  
  @js.native
  trait NavigationBackLinkProps extends LinkProps {
    
    /**
      * Starting at 1, The number of Crumb steps to go back
      */
    var distance: Double = js.native
  }
  object NavigationBackLinkProps {
    
    @scala.inline
    def apply(distance: Double): NavigationBackLinkProps = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationBackLinkProps]
    }
    
    @scala.inline
    implicit class NavigationBackLinkPropsMutableBuilder[Self <: NavigationBackLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavigationEvent extends StObject {
    
    /**
      * The current asynchronous data
      */
    var asyncData: js.Any = js.native
    
    /**
      * The NavigationData for the current State
      */
    var data: js.Any = js.native
    
    /**
      * The last State displayed before the current State
      */
    var oldState: State = js.native
    
    /**
      * The current State
      */
    var state: State = js.native
    
    /**
      * State navigator for the current context
      */
    var stateNavigator: typings.navigation.mod.StateNavigator = js.native
  }
  object NavigationEvent {
    
    @scala.inline
    def apply(
      asyncData: js.Any,
      data: js.Any,
      oldState: State,
      state: State,
      stateNavigator: typings.navigation.mod.StateNavigator
    ): NavigationEvent = {
      val __obj = js.Dynamic.literal(asyncData = asyncData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateNavigator = stateNavigator.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationEvent]
    }
    
    @scala.inline
    implicit class NavigationEventMutableBuilder[Self <: NavigationEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncData(value: js.Any): Self = StObject.set(x, "asyncData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldState(value: State): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateNavigator(value: typings.navigation.mod.StateNavigator): Self = StObject.set(x, "stateNavigator", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavigationLinkProps extends RefreshLinkProps {
    
    /**
      * The key of the State to navigate to
      */
    var stateKey: String = js.native
  }
  object NavigationLinkProps {
    
    @scala.inline
    def apply(stateKey: String): NavigationLinkProps = {
      val __obj = js.Dynamic.literal(stateKey = stateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationLinkProps]
    }
    
    @scala.inline
    implicit class NavigationLinkPropsMutableBuilder[Self <: NavigationLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStateKey(value: String): Self = StObject.set(x, "stateKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RefreshLinkProps extends LinkProps {
    
    /**
      * The Css Class to display when the Link is active
      */
    var activeCssClass: js.UndefOr[String] = js.native
    
    /**
      * The style to display when the Link is active
      */
    var activeStyle: js.UndefOr[js.Any] = js.native
    
    /**
      * The data to add from the current NavigationData
      */
    var currentDataKeys: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Indicates whether the Link is disabled when active
      */
    var disableActive: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates whether to include all the current NavigationData
      */
    var includeCurrentData: js.UndefOr[Boolean] = js.native
    
    /**
      * The NavigationData to pass
      */
    var navigationData: js.UndefOr[js.Any] = js.native
  }
  object RefreshLinkProps {
    
    @scala.inline
    def apply(): RefreshLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshLinkProps]
    }
    
    @scala.inline
    implicit class RefreshLinkPropsMutableBuilder[Self <: RefreshLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveCssClass(value: String): Self = StObject.set(x, "activeCssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveCssClassUndefined: Self = StObject.set(x, "activeCssClass", js.undefined)
      
      @scala.inline
      def setActiveStyle(value: js.Any): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setCurrentDataKeys(value: String | js.Array[String]): Self = StObject.set(x, "currentDataKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentDataKeysUndefined: Self = StObject.set(x, "currentDataKeys", js.undefined)
      
      @scala.inline
      def setCurrentDataKeysVarargs(value: String*): Self = StObject.set(x, "currentDataKeys", js.Array(value :_*))
      
      @scala.inline
      def setDisableActive(value: Boolean): Self = StObject.set(x, "disableActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableActiveUndefined: Self = StObject.set(x, "disableActive", js.undefined)
      
      @scala.inline
      def setIncludeCurrentData(value: Boolean): Self = StObject.set(x, "includeCurrentData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeCurrentDataUndefined: Self = StObject.set(x, "includeCurrentData", js.undefined)
      
      @scala.inline
      def setNavigationData(value: js.Any): Self = StObject.set(x, "navigationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationDataUndefined: Self = StObject.set(x, "navigationData", js.undefined)
    }
  }
}
