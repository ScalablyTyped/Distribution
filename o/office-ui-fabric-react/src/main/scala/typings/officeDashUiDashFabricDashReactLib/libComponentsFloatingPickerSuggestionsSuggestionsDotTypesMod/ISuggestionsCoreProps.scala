package typings
package officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsCoreProps[T]
  extends reactLib.reactMod.ReactNs.ClassAttributes[js.Any] {
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.native
  /**
    * How the suggestion should look in the suggestion list.
    */
  var onRenderSuggestion: js.UndefOr[
    js.Function2[/* props */ T, /* suggestionItemProps */ T, reactLib.reactMod.Global.JSXNs.Element]
  ] = js.native
  /**
    * Function to fire when one of the optional remove buttons on a suggestion is clicked.
    */
  var onSuggestionRemove: js.UndefOr[
    js.Function3[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      /* item */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
      ], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Maximum number of suggestions to show in the full suggestion list.
    */
  var resultsMaximumNumber: js.UndefOr[scala.Double] = js.native
  /**
    * Indicates whether to loop around to the top or bottom of the the suggestions
    * on calling nextSuggestion and previousSuggestion, respectively
    */
  var shouldLoopSelection: scala.Boolean = js.native
  /**
    * Indicates whether to show a button with each suggestion to remove that suggestion.
    */
  var showRemoveButtons: js.UndefOr[scala.Boolean] = js.native
  /**
    * The list of Suggestions that will be displayed
    */
  var suggestions: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel[T]
  ] = js.native
  /**
    * Screen reader message to read when there are suggestions available.
    */
  var suggestionsAvailableAlertText: js.UndefOr[java.lang.String] = js.native
  /**
    * An ARIA label for the container that is the parent of the suggestions.
    */
  var suggestionsContainerAriaLabel: js.UndefOr[java.lang.String] = js.native
  /**
    * the classname of the suggestionitem.
    */
  var suggestionsItemClassName: js.UndefOr[java.lang.String] = js.native
  /**
    * What should occur when a suggestion is clicked
    */
  def onSuggestionClick(): scala.Unit = js.native
  def onSuggestionClick(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
  def onSuggestionClick(
    ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent],
    item: js.Any
  ): scala.Unit = js.native
  def onSuggestionClick(
    ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent],
    item: js.Any,
    index: scala.Double
  ): scala.Unit = js.native
}

