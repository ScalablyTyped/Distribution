package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionItemProps
import typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.ISpinnerStyleProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.libKeyCodesMod.KeyCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPickersSuggestionsSuggestionsDottypesMod {
  
  @js.native
  sealed trait SuggestionActionType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types", "SuggestionActionType")
  @js.native
  object SuggestionActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SuggestionActionType & Double] = js.native
    
    /** ForceResolve action is selected. */
    @js.native
    sealed trait forceResolve
      extends StObject
         with SuggestionActionType
    /* 1 */ val forceResolve: typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.SuggestionActionType.forceResolve & Double = js.native
    
    /** None of the actions is selected. */
    @js.native
    sealed trait none
      extends StObject
         with SuggestionActionType
    /* 0 */ val none: typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.SuggestionActionType.none & Double = js.native
    
    /** SearchMore action is selected. */
    @js.native
    sealed trait searchMore
      extends StObject
         with SuggestionActionType
    /* 2 */ val searchMore: typings.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.SuggestionActionType.searchMore & Double = js.native
  }
  
  trait ISuggestionModel[T] extends StObject {
    
    /** Aria-label string for each suggested item. */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /** The suggested item of the type T */
    var item: T
    
    /** Whether the suggested item is selected or not. */
    var selected: Boolean
  }
  object ISuggestionModel {
    
    inline def apply[T](item: T, selected: Boolean): ISuggestionModel[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionModel[T]]
    }
    
    extension [Self <: ISuggestionModel[?], T](x: Self & ISuggestionModel[T]) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISuggestions[T] extends StObject {
    
    /** Execute the action selected. Can be SearchMore or ForceResolve actions. */
    def executeSelectedAction(): Unit
    
    /** Focus on the ForceResolve action above the suggestions. If not available then focus on SearchMore action. */
    def focusAboveSuggestions(): Unit
    
    /** Focus on the SearchMore action below the suggestions. If not available then focus on ForceResolve action. */
    def focusBelowSuggestions(): Unit
    
    /** Focus the SearchMore action button. */
    def focusSearchForMoreButton(): Unit
    
    /** Whether it has any suggested actions like ForceResolve or SearchMore. */
    def hasSuggestedAction(): Boolean
    
    /** Whether any of the suggested actions (ForceResolve or SearchMore) is selected. */
    def hasSuggestedActionSelected(): Boolean
    
    /** Returns true if the event was handled, false otherwise. */
    def tryHandleKeyDown(keyCode: Double, currentSuggestionIndex: Double): Boolean
  }
  object ISuggestions {
    
    inline def apply[T](
      executeSelectedAction: () => Unit,
      focusAboveSuggestions: () => Unit,
      focusBelowSuggestions: () => Unit,
      focusSearchForMoreButton: () => Unit,
      hasSuggestedAction: () => Boolean,
      hasSuggestedActionSelected: () => Boolean,
      tryHandleKeyDown: (Double, Double) => Boolean
    ): ISuggestions[T] = {
      val __obj = js.Dynamic.literal(executeSelectedAction = js.Any.fromFunction0(executeSelectedAction), focusAboveSuggestions = js.Any.fromFunction0(focusAboveSuggestions), focusBelowSuggestions = js.Any.fromFunction0(focusBelowSuggestions), focusSearchForMoreButton = js.Any.fromFunction0(focusSearchForMoreButton), hasSuggestedAction = js.Any.fromFunction0(hasSuggestedAction), hasSuggestedActionSelected = js.Any.fromFunction0(hasSuggestedActionSelected), tryHandleKeyDown = js.Any.fromFunction2(tryHandleKeyDown))
      __obj.asInstanceOf[ISuggestions[T]]
    }
    
    extension [Self <: ISuggestions[?], T](x: Self & ISuggestions[T]) {
      
      inline def setExecuteSelectedAction(value: () => Unit): Self = StObject.set(x, "executeSelectedAction", js.Any.fromFunction0(value))
      
      inline def setFocusAboveSuggestions(value: () => Unit): Self = StObject.set(x, "focusAboveSuggestions", js.Any.fromFunction0(value))
      
      inline def setFocusBelowSuggestions(value: () => Unit): Self = StObject.set(x, "focusBelowSuggestions", js.Any.fromFunction0(value))
      
      inline def setFocusSearchForMoreButton(value: () => Unit): Self = StObject.set(x, "focusSearchForMoreButton", js.Any.fromFunction0(value))
      
      inline def setHasSuggestedAction(value: () => Boolean): Self = StObject.set(x, "hasSuggestedAction", js.Any.fromFunction0(value))
      
      inline def setHasSuggestedActionSelected(value: () => Boolean): Self = StObject.set(x, "hasSuggestedActionSelected", js.Any.fromFunction0(value))
      
      inline def setTryHandleKeyDown(value: (Double, Double) => Boolean): Self = StObject.set(x, "tryHandleKeyDown", js.Any.fromFunction2(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.Props<any> * / any */ @js.native
  trait ISuggestionsProps[T] extends StObject {
    
    /**
      * The CSS className of the suggestions root.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the ISuggestions interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ISuggestions[T]]] = js.native
    
    /**
      * The callback that should be called when the user attempts to use the input text as as item
      */
    var createGenericItem: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * The text that appears indicating to the use to force resolve the input
      */
    var forceResolveText: js.UndefOr[String] = js.native
    
    /**
      * Used to indicate whether or not the suggestions are loading.
      */
    var isLoading: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if a short list of recent suggestions should be shown.
      */
    var isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates if the text in resultsFooter or resultsFooterFull should be shown at the end of the suggestion list.
      * @defaultvalue true
      */
    var isResultsFooterVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Used to indicate whether or not the component is searching for more results.
      */
    var isSearching: js.UndefOr[Boolean] = js.native
    
    /**
      * The text to display while the results are loading.
      */
    var loadingText: js.UndefOr[String] = js.native
    
    /**
      * Used to indicate whether or not the user can request more suggestions.
      * Dictates whether or not the searchForMore button is displayed.
      */
    var moreSuggestionsAvailable: js.UndefOr[Boolean] = js.native
    
    /**
      * The text that should appear at the top of the most recently used box.
      */
    var mostRecentlyUsedHeaderText: js.UndefOr[String] = js.native
    
    /**
      * The text that should appear if no results are found when searching.
      */
    var noResultsFoundText: js.UndefOr[String] = js.native
    
    /**
      * The callback that should be called when the user attempts to get more results
      */
    var onGetMoreResults: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * How the "no result found" should look in the suggestion list.
      */
    var onRenderNoResultFound: js.UndefOr[IRenderFunction[Unit]] = js.native
    
    /**
      * How the suggestion should look in the suggestion list.
      */
    def onRenderSuggestion(props: T, suggestionItemProps: ISuggestionItemProps[T]): Element = js.native
    
    /**
      * What should occur when a suggestion is clicked
      */
    def onSuggestionClick(): Unit = js.native
    def onSuggestionClick(ev: Unit, item: Any): Unit = js.native
    def onSuggestionClick(ev: Unit, item: Any, index: Double): Unit = js.native
    def onSuggestionClick(ev: Unit, item: Unit, index: Double): Unit = js.native
    def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: Any): Unit = js.native
    def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: Any, index: Double): Unit = js.native
    def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: Unit, index: Double): Unit = js.native
    
    /**
      * Function to fire when one of the optional remove buttons on a suggestion is clicked.
      *
      * TODO (adjective-object) remove IPersonaprops before the next major version bump
      */
    var onSuggestionRemove: js.UndefOr[
        js.Function3[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* item */ js.UndefOr[T | IPersonaProps], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /**
      * A function that resets focus to the expected item in the suggestion list
      */
    var refocusSuggestions: js.UndefOr[js.Function1[/* keyCode */ KeyCodes, Unit]] = js.native
    
    /**
      * An ARIA label to use for the buttons to remove individual suggestions.
      */
    var removeSuggestionAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * A renderer that adds an element at the end of the suggestions list it has fewer items than resultsMaximumNumber.
      */
    var resultsFooter: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], Element]] = js.native
    
    /**
      * A renderer that adds an element at the end of the suggestions list it has more items than resultsMaximumNumber.
      */
    var resultsFooterFull: js.UndefOr[js.Function1[/* props */ ISuggestionsProps[T], Element]] = js.native
    
    /**
      * Maximum number of suggestions to show in the full suggestion list.
      */
    var resultsMaximumNumber: js.UndefOr[Double] = js.native
    
    /**
      * The text that should appear if there is a search error.
      *
      * @deprecated Use noResultsFoundText instead.
      */
    var searchErrorText: js.UndefOr[String] = js.native
    
    /**
      * The icon that appears indicating to the user that they can search for more results.
      */
    var searchForMoreIcon: js.UndefOr[IIconProps] = js.native
    
    /**
      * The text that appears indicating to the user that they can search for more results.
      */
    var searchForMoreText: js.UndefOr[String] = js.native
    
    /**
      * The text to display while searching for more results in a limited suggestions list.
      */
    var searchingText: js.UndefOr[String] = js.native
    
    /**
      * The callback that should be called to see if the force resolve command should be shown
      */
    var showForceResolve: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /**
      * Indicates whether to show a button with each suggestion to remove that suggestion.
      */
    var showRemoveButtons: js.UndefOr[Boolean] = js.native
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[IStyleFunctionOrObject[Any, Any]] = js.native
    
    /**
      * The list of Suggestions that will be displayed
      */
    var suggestions: js.Array[ISuggestionModel[T]] = js.native
    
    /**
      * Screen reader message to read when there are suggestions available.
      */
    var suggestionsAvailableAlertText: js.UndefOr[String] = js.native
    
    /**
      * The CSS className of the suggestions list
      */
    var suggestionsClassName: js.UndefOr[String] = js.native
    
    /**
      * An ARIA label for the container that is the parent of the suggestions.
      */
    var suggestionsContainerAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * The text that appears at the top of the suggestions list.
      */
    var suggestionsHeaderText: js.UndefOr[String] = js.native
    
    /**
      * The className of the suggestion item.
      */
    var suggestionsItemClassName: js.UndefOr[String] = js.native
    
    /**
      * The string that will be used as the suggestionsListId.
      * Will be used by the BasePicker to keep track of the list for aria.
      */
    var suggestionsListId: js.UndefOr[String] = js.native
    
    /** Theme provided by High-Order Component. */
    var theme: js.UndefOr[ITheme] = js.native
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.types.ISuggestionsProps<any>, 'className' | 'suggestionsClassName'> & {  forceResolveButtonSelected :boolean | undefined,   searchForMoreButtonSelected :boolean | undefined} */
  trait ISuggestionsStyleProps extends StObject {
    
    var className: js.UndefOr[Any] = js.undefined
    
    /** Whether the forceResolve actionButton is selected. */
    var forceResolveButtonSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the searchForMore actionButton is selected. */
    var searchForMoreButtonSelected: js.UndefOr[Boolean] = js.undefined
    
    var suggestionsClassName: js.UndefOr[Any] = js.undefined
    
    var theme: Any
  }
  object ISuggestionsStyleProps {
    
    inline def apply(theme: Any): ISuggestionsStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionsStyleProps]
    }
    
    extension [Self <: ISuggestionsStyleProps](x: Self) {
      
      inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setForceResolveButtonSelected(value: Boolean): Self = StObject.set(x, "forceResolveButtonSelected", value.asInstanceOf[js.Any])
      
      inline def setForceResolveButtonSelectedUndefined: Self = StObject.set(x, "forceResolveButtonSelected", js.undefined)
      
      inline def setSearchForMoreButtonSelected(value: Boolean): Self = StObject.set(x, "searchForMoreButtonSelected", value.asInstanceOf[js.Any])
      
      inline def setSearchForMoreButtonSelectedUndefined: Self = StObject.set(x, "searchForMoreButtonSelected", js.undefined)
      
      inline def setSuggestionsClassName(value: Any): Self = StObject.set(x, "suggestionsClassName", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsClassNameUndefined: Self = StObject.set(x, "suggestionsClassName", js.undefined)
      
      inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISuggestionsStyles extends StObject {
    
    /** Refers to the 'Force resolve' actionButton. */
    var forceResolveButton: IStyle
    
    /** Refers to the text rendered when no suggestions are found. */
    var noSuggestions: IStyle
    
    /** Root element of the suggestions outer wrapper. */
    var root: IStyle
    
    /** Refers to the 'Search for more' actionButton. */
    var searchForMoreButton: IStyle
    
    /** SubComponents (Spinner) styles. */
    var subComponentStyles: ISuggestionsSubComponentStyles
    
    /** Refers to the text displaying if more suggestions available. */
    var suggestionsAvailable: IStyle
    
    /** Refers to the suggestions container. */
    var suggestionsContainer: IStyle
    
    /** Refers to the title rendered for suggestions container header and/or footer (if provided). */
    var title: IStyle
  }
  object ISuggestionsStyles {
    
    inline def apply(subComponentStyles: ISuggestionsSubComponentStyles): ISuggestionsStyles = {
      val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionsStyles]
    }
    
    extension [Self <: ISuggestionsStyles](x: Self) {
      
      inline def setForceResolveButton(value: IStyle): Self = StObject.set(x, "forceResolveButton", value.asInstanceOf[js.Any])
      
      inline def setForceResolveButtonNull: Self = StObject.set(x, "forceResolveButton", null)
      
      inline def setForceResolveButtonUndefined: Self = StObject.set(x, "forceResolveButton", js.undefined)
      
      inline def setNoSuggestions(value: IStyle): Self = StObject.set(x, "noSuggestions", value.asInstanceOf[js.Any])
      
      inline def setNoSuggestionsNull: Self = StObject.set(x, "noSuggestions", null)
      
      inline def setNoSuggestionsUndefined: Self = StObject.set(x, "noSuggestions", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSearchForMoreButton(value: IStyle): Self = StObject.set(x, "searchForMoreButton", value.asInstanceOf[js.Any])
      
      inline def setSearchForMoreButtonNull: Self = StObject.set(x, "searchForMoreButton", null)
      
      inline def setSearchForMoreButtonUndefined: Self = StObject.set(x, "searchForMoreButton", js.undefined)
      
      inline def setSubComponentStyles(value: ISuggestionsSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsAvailable(value: IStyle): Self = StObject.set(x, "suggestionsAvailable", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsAvailableNull: Self = StObject.set(x, "suggestionsAvailable", null)
      
      inline def setSuggestionsAvailableUndefined: Self = StObject.set(x, "suggestionsAvailable", js.undefined)
      
      inline def setSuggestionsContainer(value: IStyle): Self = StObject.set(x, "suggestionsContainer", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsContainerNull: Self = StObject.set(x, "suggestionsContainer", null)
      
      inline def setSuggestionsContainerUndefined: Self = StObject.set(x, "suggestionsContainer", js.undefined)
      
      inline def setTitle(value: IStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ISuggestionsSubComponentStyles extends StObject {
    
    /** Refers to the Spinner rendered within the Suggestions when searching or loading suggestions. */
    var spinner: IStyleFunctionOrObject[ISpinnerStyleProps, Any]
  }
  object ISuggestionsSubComponentStyles {
    
    inline def apply(spinner: IStyleFunctionOrObject[ISpinnerStyleProps, Any]): ISuggestionsSubComponentStyles = {
      val __obj = js.Dynamic.literal(spinner = spinner.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionsSubComponentStyles]
    }
    
    extension [Self <: ISuggestionsSubComponentStyles](x: Self) {
      
      inline def setSpinner(value: IStyleFunctionOrObject[ISpinnerStyleProps, Any]): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerFunction1(value: ISpinnerStyleProps => DeepPartial[Any]): Self = StObject.set(x, "spinner", js.Any.fromFunction1(value))
    }
  }
}
