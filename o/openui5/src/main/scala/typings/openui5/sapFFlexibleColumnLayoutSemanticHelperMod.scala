package typings.openui5

import typings.openui5.anon.DefaultThreeColumnLayoutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFFlexibleColumnLayoutSemanticHelperMod {
  
  @JSImport("sap/f/FlexibleColumnLayoutSemanticHelper", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FlexibleColumnLayoutSemanticHelper {
    /**
      * Constructor for an sap.f.FlexibleColumnLayoutSemanticHelper.
      */
    def this(
      /**
      * The `sap.f.FlexibleColumnLayout` object whose state will be manipulated.
      */
    oFlexibleColumnLayout: typings.openui5.sapFFlexibleColumnLayoutMod.default,
      /**
      * Determines the rules that will be used by the helper.
      */
    oSettings: DefaultThreeColumnLayoutType
    ) = this()
    
    /**
      * Returns an object describing the current state of the control and the expected action buttons for each
      * column.
      *
      * **Note:** This method relies on the internal `FlexibleColumnLayout` reference to be rendered in the DOM
      * tree. For convenience, use methods {@link sap.f.FlexibleColumnLayoutSemanticHelper#isDOMReady} and {@link
      * sap.f.FlexibleColumnLayoutSemanticHelper#whenDOMReady}.
      *
      * @returns The object describing the current UI state
      */
    /* CompleteClass */
    override def getCurrentUIState(): UIState = js.native
    
    /**
      * Returns the default layout types for the different numbers of columns.
      *
      * The returned object has the following fields:
      * 	 - defaultLayoutType - the layout that will be suggested by default when only 1 column needs to be shown
      *
      * 	 - defaultTwoColumnLayoutType - the layout that will be suggested by default when 2 columns have to
      * 			be shown side by side
      * 	 - defaultThreeColumnLayoutType - the layout that will be suggested by default when 3 columns have to
      * 			be shown side by side
      *
      * @returns The object describing the default layout types for the different numbers of columns
      */
    /* CompleteClass */
    override def getDefaultLayouts(): js.Object = js.native
    
    /**
      * Returns an object, describing the state that the control will have after navigating to a different view
      * level.
      *
      * @returns The object describing the next UI state
      */
    /* CompleteClass */
    override def getNextUIState(
      /**
      * the view level that should be represented. 0 means initial (master only), 1 - master-detail, 2 - master-detail-detail,
      * 3 and above - subsequent views
      */
    iNextLevel: int
    ): UIState = js.native
    
    /**
      * @SINCE 1.72
      *
      * Returns `true` if internal `FlexibleColumnLayout` reference is rendered in the DOM tree.
      *
      * @returns true if the associated `FlexibleColumnLayout` is rendered
      */
    /* CompleteClass */
    override def isDOMReady(): Boolean = js.native
    
    /**
      * @SINCE 1.72
      *
      * Abstract wrapper for {@link sap.f.FlexibleColumnLayoutSemanticHelper#isDOMReady}. Returns `true` if criteria
      * are met for the APIs in this helper to be used.
      *
      * @returns true if this helper's API reliability criteria are met
      */
    /* CompleteClass */
    override def isReady(): Boolean = js.native
    
    /**
      * @SINCE 1.72
      *
      * Returns promise which can be used to find out when the internal `FlexibleColumnLayout` is rendered. This
      * is needed because methods in `FlexibleColumnLayout` rely on the control being rendered.
      *
      * @returns A promise that resolves after `FlexibleColumnLayout` is rendered
      */
    /* CompleteClass */
    override def whenDOMReady(): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.72
      *
      * Returns promise which can be used to find out when internal criteria for this helper's API reliability
      * are met.
      *
      * @returns A promise that resolves after internal criteria are met
      */
    /* CompleteClass */
    override def whenReady(): js.Promise[Any] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/FlexibleColumnLayoutSemanticHelper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an instance of the `sap.f.FlexibleColumnLayoutSemanticHelper` class for a given `sap.f.FlexibleColumnLayout`
      * object.
      *
      * @returns The `sap.f.FlexibleColumnLayoutSemanticHelper` instance
      */
    inline def getInstanceFor(
      /**
      * The `sap.f.FlexibleColumnLayout` object to get a semantic helper instance for
      */
    oFlexibleColumnLayout: typings.openui5.sapFFlexibleColumnLayoutMod.default
    ): FlexibleColumnLayoutSemanticHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceFor")(oFlexibleColumnLayout.asInstanceOf[js.Any]).asInstanceOf[FlexibleColumnLayoutSemanticHelper]
    inline def getInstanceFor(
      /**
      * The `sap.f.FlexibleColumnLayout` object to get a semantic helper instance for
      */
    oFlexibleColumnLayout: typings.openui5.sapFFlexibleColumnLayoutMod.default,
      /**
      * An optional settings object to be used when creating the instance. **Note:** will be considered only
      * for the first `getInstanceFor` call for the given `sap.f.FlexibleColumnLayout` object.
      */
    oSettings: js.Object
    ): FlexibleColumnLayoutSemanticHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceFor")(oFlexibleColumnLayout.asInstanceOf[js.Any], oSettings.asInstanceOf[js.Any])).asInstanceOf[FlexibleColumnLayoutSemanticHelper]
  }
  
  trait ColumnsNavigationActions extends StObject {
    
    /**
      * Configuration of the navigation actions of the end column.
      */
    var endColumn: js.UndefOr[NavigationActionsTargets] = js.undefined
    
    /**
      * Configuration of the navigation actions of the mid column.
      */
    var midColumn: js.UndefOr[NavigationActionsTargets] = js.undefined
  }
  object ColumnsNavigationActions {
    
    inline def apply(): ColumnsNavigationActions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsNavigationActions]
    }
    
    extension [Self <: ColumnsNavigationActions](x: Self) {
      
      inline def setEndColumn(value: NavigationActionsTargets): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setMidColumn(value: NavigationActionsTargets): Self = StObject.set(x, "midColumn", value.asInstanceOf[js.Any])
      
      inline def setMidColumnUndefined: Self = StObject.set(x, "midColumn", js.undefined)
    }
  }
  
  trait ColumnsSizes extends StObject {
    
    /**
      * The relative percentage width of the begin column as integer.
      */
    var beginColumn: js.UndefOr[Double] = js.undefined
    
    /**
      * The relative percentage width of the end column as integer.
      */
    var endColumn: js.UndefOr[Double] = js.undefined
    
    /**
      * The relative percentage width of the mid column as integer.
      */
    var midColumn: js.UndefOr[Double] = js.undefined
  }
  object ColumnsSizes {
    
    inline def apply(): ColumnsSizes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsSizes]
    }
    
    extension [Self <: ColumnsSizes](x: Self) {
      
      inline def setBeginColumn(value: Double): Self = StObject.set(x, "beginColumn", value.asInstanceOf[js.Any])
      
      inline def setBeginColumnUndefined: Self = StObject.set(x, "beginColumn", js.undefined)
      
      inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setMidColumn(value: Double): Self = StObject.set(x, "midColumn", value.asInstanceOf[js.Any])
      
      inline def setMidColumnUndefined: Self = StObject.set(x, "midColumn", js.undefined)
    }
  }
  
  trait ColumnsVisibility extends StObject {
    
    /**
      * The visibility of the begin column.
      */
    var beginColumn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The visibility of the end column.
      */
    var endColumn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The visibility of the mid column.
      */
    var midColumn: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnsVisibility {
    
    inline def apply(): ColumnsVisibility = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsVisibility]
    }
    
    extension [Self <: ColumnsVisibility](x: Self) {
      
      inline def setBeginColumn(value: Boolean): Self = StObject.set(x, "beginColumn", value.asInstanceOf[js.Any])
      
      inline def setBeginColumnUndefined: Self = StObject.set(x, "beginColumn", js.undefined)
      
      inline def setEndColumn(value: Boolean): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setMidColumn(value: Boolean): Self = StObject.set(x, "midColumn", value.asInstanceOf[js.Any])
      
      inline def setMidColumnUndefined: Self = StObject.set(x, "midColumn", js.undefined)
    }
  }
  
  trait FlexibleColumnLayoutSemanticHelper extends StObject {
    
    /**
      * Returns an object describing the current state of the control and the expected action buttons for each
      * column.
      *
      * **Note:** This method relies on the internal `FlexibleColumnLayout` reference to be rendered in the DOM
      * tree. For convenience, use methods {@link sap.f.FlexibleColumnLayoutSemanticHelper#isDOMReady} and {@link
      * sap.f.FlexibleColumnLayoutSemanticHelper#whenDOMReady}.
      *
      * @returns The object describing the current UI state
      */
    def getCurrentUIState(): UIState
    
    /**
      * Returns the default layout types for the different numbers of columns.
      *
      * The returned object has the following fields:
      * 	 - defaultLayoutType - the layout that will be suggested by default when only 1 column needs to be shown
      *
      * 	 - defaultTwoColumnLayoutType - the layout that will be suggested by default when 2 columns have to
      * 			be shown side by side
      * 	 - defaultThreeColumnLayoutType - the layout that will be suggested by default when 3 columns have to
      * 			be shown side by side
      *
      * @returns The object describing the default layout types for the different numbers of columns
      */
    def getDefaultLayouts(): js.Object
    
    /**
      * Returns an object, describing the state that the control will have after navigating to a different view
      * level.
      *
      * @returns The object describing the next UI state
      */
    def getNextUIState(
      /**
      * the view level that should be represented. 0 means initial (master only), 1 - master-detail, 2 - master-detail-detail,
      * 3 and above - subsequent views
      */
    iNextLevel: int
    ): UIState
    
    /**
      * @SINCE 1.72
      *
      * Returns `true` if internal `FlexibleColumnLayout` reference is rendered in the DOM tree.
      *
      * @returns true if the associated `FlexibleColumnLayout` is rendered
      */
    def isDOMReady(): Boolean
    
    /**
      * @SINCE 1.72
      *
      * Abstract wrapper for {@link sap.f.FlexibleColumnLayoutSemanticHelper#isDOMReady}. Returns `true` if criteria
      * are met for the APIs in this helper to be used.
      *
      * @returns true if this helper's API reliability criteria are met
      */
    def isReady(): Boolean
    
    /**
      * @SINCE 1.72
      *
      * Returns promise which can be used to find out when the internal `FlexibleColumnLayout` is rendered. This
      * is needed because methods in `FlexibleColumnLayout` rely on the control being rendered.
      *
      * @returns A promise that resolves after `FlexibleColumnLayout` is rendered
      */
    def whenDOMReady(): js.Promise[Any]
    
    /**
      * @SINCE 1.72
      *
      * Returns promise which can be used to find out when internal criteria for this helper's API reliability
      * are met.
      *
      * @returns A promise that resolves after internal criteria are met
      */
    def whenReady(): js.Promise[Any]
  }
  object FlexibleColumnLayoutSemanticHelper {
    
    inline def apply(
      getCurrentUIState: () => UIState,
      getDefaultLayouts: () => js.Object,
      getNextUIState: int => UIState,
      isDOMReady: () => Boolean,
      isReady: () => Boolean,
      whenDOMReady: () => js.Promise[Any],
      whenReady: () => js.Promise[Any]
    ): FlexibleColumnLayoutSemanticHelper = {
      val __obj = js.Dynamic.literal(getCurrentUIState = js.Any.fromFunction0(getCurrentUIState), getDefaultLayouts = js.Any.fromFunction0(getDefaultLayouts), getNextUIState = js.Any.fromFunction1(getNextUIState), isDOMReady = js.Any.fromFunction0(isDOMReady), isReady = js.Any.fromFunction0(isReady), whenDOMReady = js.Any.fromFunction0(whenDOMReady), whenReady = js.Any.fromFunction0(whenReady))
      __obj.asInstanceOf[FlexibleColumnLayoutSemanticHelper]
    }
    
    extension [Self <: FlexibleColumnLayoutSemanticHelper](x: Self) {
      
      inline def setGetCurrentUIState(value: () => UIState): Self = StObject.set(x, "getCurrentUIState", js.Any.fromFunction0(value))
      
      inline def setGetDefaultLayouts(value: () => js.Object): Self = StObject.set(x, "getDefaultLayouts", js.Any.fromFunction0(value))
      
      inline def setGetNextUIState(value: int => UIState): Self = StObject.set(x, "getNextUIState", js.Any.fromFunction1(value))
      
      inline def setIsDOMReady(value: () => Boolean): Self = StObject.set(x, "isDOMReady", js.Any.fromFunction0(value))
      
      inline def setIsReady(value: () => Boolean): Self = StObject.set(x, "isReady", js.Any.fromFunction0(value))
      
      inline def setWhenDOMReady(value: () => js.Promise[Any]): Self = StObject.set(x, "whenDOMReady", js.Any.fromFunction0(value))
      
      inline def setWhenReady(value: () => js.Promise[Any]): Self = StObject.set(x, "whenReady", js.Any.fromFunction0(value))
    }
  }
  
  trait NavigationActionsTargets extends StObject {
    
    /**
      * The target {@link sap.f.FlexibleColumnLayout#getLayout layout} when the `closeColumn` navigation action
      * button is pressed. If null, then the respective action button should not be shown.
      */
    var closeColumn: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The target {@link sap.f.FlexibleColumnLayout#getLayout layout} when the `exitFullScreen` navigation action
      * button is pressed. If null, then the respective action button should not be shown.
      */
    var exitFullScreen: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The target {@link sap.f.FlexibleColumnLayout#getLayout layout} when the `fullscreen` navigation action
      * button is pressed. If null, then the respective action button should not be shown.
      */
    var fullScreen: js.UndefOr[String | Null] = js.undefined
  }
  object NavigationActionsTargets {
    
    inline def apply(): NavigationActionsTargets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationActionsTargets]
    }
    
    extension [Self <: NavigationActionsTargets](x: Self) {
      
      inline def setCloseColumn(value: String): Self = StObject.set(x, "closeColumn", value.asInstanceOf[js.Any])
      
      inline def setCloseColumnNull: Self = StObject.set(x, "closeColumn", null)
      
      inline def setCloseColumnUndefined: Self = StObject.set(x, "closeColumn", js.undefined)
      
      inline def setExitFullScreen(value: String): Self = StObject.set(x, "exitFullScreen", value.asInstanceOf[js.Any])
      
      inline def setExitFullScreenNull: Self = StObject.set(x, "exitFullScreen", null)
      
      inline def setExitFullScreenUndefined: Self = StObject.set(x, "exitFullScreen", js.undefined)
      
      inline def setFullScreen(value: String): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenNull: Self = StObject.set(x, "fullScreen", null)
      
      inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    }
  }
  
  trait UIState extends StObject {
    
    /**
      * The configuration of the navigation actions in the columns.
      */
    var actionButtonsInfo: js.UndefOr[ColumnsNavigationActions] = js.undefined
    
    /**
      * Represents the relative percentage sizes of all columns as integers.
      */
    var columnsSizes: js.UndefOr[ColumnsSizes] = js.undefined
    
    /**
      * Represents the visibility of the columns.
      */
    var columnsVisibility: js.UndefOr[ColumnsVisibility] = js.undefined
    
    /**
      * The value is `true` if only one column is visible at the moment, `false` otherwise.
      *
      * **Note:** This may be due to small screen size (phone) or due to a layout, for which a single column
      * takes up the whole width.
      */
    var isFullScreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value is `true` if the current `layout` is one of the following: `sap.f.LayoutType.OneColumn, sap.f.LayoutType.MidColumnFullScreen,
      * sap.f.LayoutType.EndColumnFullScreen`, `false` otherwise.
      *
      * **Note:** While `isFullScreen` can be `true` for any layout, due to small screen size, `isLogicallyFullScreen`
      * will only be `true` for the layout values, listed above.
      */
    var isLogicallyFullScreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the {@link sap.f.FlexibleColumnLayout#getLayout layout} property.
      */
    var layout: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum number of columns that can be displayed at once based on the control width. See {@link sap.f.FlexibleColumnLayout#getMaxColumnsCount}
      */
    var maxColumnsCount: js.UndefOr[Double] = js.undefined
  }
  object UIState {
    
    inline def apply(): UIState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIState]
    }
    
    extension [Self <: UIState](x: Self) {
      
      inline def setActionButtonsInfo(value: ColumnsNavigationActions): Self = StObject.set(x, "actionButtonsInfo", value.asInstanceOf[js.Any])
      
      inline def setActionButtonsInfoUndefined: Self = StObject.set(x, "actionButtonsInfo", js.undefined)
      
      inline def setColumnsSizes(value: ColumnsSizes): Self = StObject.set(x, "columnsSizes", value.asInstanceOf[js.Any])
      
      inline def setColumnsSizesUndefined: Self = StObject.set(x, "columnsSizes", js.undefined)
      
      inline def setColumnsVisibility(value: ColumnsVisibility): Self = StObject.set(x, "columnsVisibility", value.asInstanceOf[js.Any])
      
      inline def setColumnsVisibilityUndefined: Self = StObject.set(x, "columnsVisibility", js.undefined)
      
      inline def setIsFullScreen(value: Boolean): Self = StObject.set(x, "isFullScreen", value.asInstanceOf[js.Any])
      
      inline def setIsFullScreenUndefined: Self = StObject.set(x, "isFullScreen", js.undefined)
      
      inline def setIsLogicallyFullScreen(value: Boolean): Self = StObject.set(x, "isLogicallyFullScreen", value.asInstanceOf[js.Any])
      
      inline def setIsLogicallyFullScreenUndefined: Self = StObject.set(x, "isLogicallyFullScreen", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMaxColumnsCount(value: Double): Self = StObject.set(x, "maxColumnsCount", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnsCountUndefined: Self = StObject.set(x, "maxColumnsCount", js.undefined)
    }
  }
}
