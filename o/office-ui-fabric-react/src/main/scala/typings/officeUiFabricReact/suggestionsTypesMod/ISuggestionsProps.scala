package typings.officeUiFabricReact.suggestionsTypesMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Props
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsProps[T]
  extends Props[js.Any] {
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
  var styles: js.UndefOr[IStyleFunctionOrObject[_, _]] = js.native
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
  /**
    * How the suggestion should look in the suggestion list.
    */
  def onRenderSuggestion(props: T, suggestionItemProps: ISuggestionItemProps[T]): Element = js.native
  /**
    * What should occur when a suggestion is clicked
    */
  def onSuggestionClick(): Unit = js.native
  def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: js.Any): Unit = js.native
  def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: js.Any, index: Double): Unit = js.native
}

