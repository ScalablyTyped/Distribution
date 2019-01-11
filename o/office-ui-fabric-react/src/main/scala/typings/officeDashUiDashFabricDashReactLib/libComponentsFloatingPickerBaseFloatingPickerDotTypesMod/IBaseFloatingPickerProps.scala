package typings
package officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerBaseFloatingPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseFloatingPickerProps[T]
  extends reactLib.reactMod.ReactNs.ClassAttributes[js.Any] {
  /**
    * Width for the suggestions callout
    */
  var calloutWidth: js.UndefOr[scala.Double] = js.native
  /**
    * ClassName for the picker.
    */
  var className: js.UndefOr[java.lang.String] = js.native
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IBaseFloatingPicker]] = js.native
  /**
    * Function that specifies how arbitrary text entered into the well is handled.
    */
  var createGenericItem: js.UndefOr[
    js.Function2[
      /* input */ java.lang.String, 
      /* isValid */ scala.Boolean, 
      officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel[T]
    ]
  ] = js.native
  /**
    * A callback to get text from an item. Used to autofill text in the pickers.
    */
  var getTextFromItem: js.UndefOr[
    js.Function2[/* item */ T, /* currentValue */ js.UndefOr[java.lang.String], java.lang.String]
  ] = js.native
  /**
    * The input element to listen on events
    */
  var inputElement: js.UndefOr[reactLib.HTMLInputElement | scala.Null] = js.native
  /**
    * A callback for when a suggestion is clicked
    */
  var onChange: js.UndefOr[js.Function1[/* item */ T, scala.Unit]] = js.native
  /**
    * A callback for when the input has been changed
    */
  var onInputChanged: js.UndefOr[js.Function1[/* filter */ java.lang.String, scala.Unit]] = js.native
  /**
    * A callback for when a persona is removed from the suggestion list
    */
  var onRemoveSuggestion: js.UndefOr[
    js.Function1[
      /* item */ officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Function that specifies how an individual suggestion item will appear.
    */
  var onRenderSuggestionsItem: js.UndefOr[
    js.Function2[/* props */ T, /* itemProps */ js.Any, reactLib.reactMod.Global.JSXNs.Element]
  ] = js.native
  /**
    * The callback that should be called when the suggestions are hiden
    */
  var onSuggestionsHidden: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * The callback that should be called when the suggestions are shown
    */
  var onSuggestionsShown: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * A function used to validate if raw text entered into the well can be added
    */
  var onValidateInput: js.UndefOr[js.Function1[/* input */ java.lang.String, scala.Boolean]] = js.native
  /**
    * The suggestions to show on zero query, return null if using as a controlled component
    */
  var onZeroQuerySuggestion: js.UndefOr[
    js.Function1[
      /* selectedItems */ js.UndefOr[js.Array[T]], 
      js.Array[T] | js.Thenable[js.Array[T]] | scala.Null
    ]
  ] = js.native
  /**
    * The properties that will get passed to the Suggestions component.
    */
  var pickerSuggestionsProps: js.UndefOr[IBaseFloatingPickerSuggestionProps] = js.native
  /**
    * The delay time in ms before resolving suggestions, which is kicked off when input has been changed.
    * e.g. If a second input change happens within the resolveDelay time, the timer will start over.
    * Only until after the timer completes will onResolveSuggestions be called.
    */
  var resolveDelay: js.UndefOr[scala.Double] = js.native
  /**
    * The text to display while searching for more results in a limited suggestions list
    */
  var searchingText: js.UndefOr[
    (js.Function1[/* props */ officeDashUiDashFabricDashReactLib.Anon_Input, java.lang.String]) | java.lang.String
  ] = js.native
  /**
    * The items that the base picker should currently display as selected. If this is provided then the picker will act as a controlled
    * component.
    */
  var selectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * The callback that should be called to see if the force resolve command should be shown
    */
  var showForceResolve: js.UndefOr[js.Function0[scala.Boolean]] = js.native
  /**
    * If using as a controlled component, the items to show in the suggestion list
    */
  var suggestionItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * The suggestions store
    */
  var suggestionsStore: officeDashUiDashFabricDashReactLib.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStore[T] = js.native
  /**
    * A callback for what should happen when a person types text into the input.
    * Returns the already selected items so the resolver can filter them out.
    * If used in conjunction with resolveDelay this will ony kick off after the delay throttle.
    * Return null if using as a controlled component
    */
  def onResolveSuggestions(filter: java.lang.String): js.Array[T] | js.Thenable[js.Array[T]] | scala.Null = js.native
  def onResolveSuggestions(filter: java.lang.String, selectedItems: js.Array[T]): js.Array[T] | js.Thenable[js.Array[T]] | scala.Null = js.native
}

