package typings.officeDashUiDashFabricDashReact.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod.ISuggestionItemProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsCoreProps[T]
  extends ClassAttributes[js.Any] {
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
  /**
    * How the suggestion should look in the suggestion list.
    */
  var onRenderSuggestion: js.UndefOr[
    js.Function2[/* props */ T, /* suggestionItemProps */ ISuggestionItemProps[T], Element]
  ] = js.native
  /**
    * Function to fire when one of the optional remove buttons on a suggestion is clicked.
    */
  var onSuggestionRemove: js.UndefOr[
    js.Function3[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* item */ js.UndefOr[IPersonaProps], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * Maximum number of suggestions to show in the full suggestion list.
    */
  var resultsMaximumNumber: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to loop around to the top or bottom of the the suggestions
    * on calling nextSuggestion and previousSuggestion, respectively
    */
  var shouldLoopSelection: Boolean = js.native
  /**
    * Indicates whether to show a button with each suggestion to remove that suggestion.
    */
  var showRemoveButtons: js.UndefOr[Boolean] = js.native
  /**
    * The list of Suggestions that will be displayed
    */
  var suggestions: js.Array[ISuggestionModel[T]] = js.native
  /**
    * Screen reader message to read when there are suggestions available.
    */
  var suggestionsAvailableAlertText: js.UndefOr[String] = js.native
  /**
    * An ARIA label for the container that is the parent of the suggestions.
    */
  var suggestionsContainerAriaLabel: js.UndefOr[String] = js.native
  /**
    * the classname of the suggestionitem.
    */
  var suggestionsItemClassName: js.UndefOr[String] = js.native
  /**
    * What should occur when a suggestion is clicked
    */
  def onSuggestionClick(): Unit = js.native
  def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: js.Any): Unit = js.native
  def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: js.Any, index: Double): Unit = js.native
}

