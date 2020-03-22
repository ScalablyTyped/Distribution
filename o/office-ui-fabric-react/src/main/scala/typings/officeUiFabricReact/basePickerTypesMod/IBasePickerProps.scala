package typings.officeUiFabricReact.basePickerTypesMod

import typings.officeUiFabricReact.AnonInput
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.libAutofillMod.Autofill
import typings.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typings.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typings.react.mod.FocusEventHandler
import typings.react.mod.Props
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLInputElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasePickerProps[T]
  extends Props[js.Any] {
  /**
    * ClassName for the picker.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the IBasePicker interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IBasePicker[T]]] = js.native
  /**
    * Function that specifies how arbitrary text entered into the well is handled.
    */
  var createGenericItem: js.UndefOr[
    js.Function2[/* input */ String, /* ValidationState */ ValidationState, ISuggestionModel[T] | T]
  ] = js.native
  /**
    * Initial items that have already been selected and should appear in the people picker.
    */
  var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * Flag for disabling the picker.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Adds an additional alert for the currently selected suggestion. This prop should be set to true for IE11 and below,
    * as it enables proper screen reader behavior for each suggestion (since aria-activedescendant does not work
    * with IE11). It should not be set for modern browsers (Edge, Chrome).
    * @defaultvalue false
    */
  var enableSelectedSuggestionAlert: js.UndefOr[Boolean] = js.native
  /**
    * A callback to get text from an item. Used to autofill text in the pickers.
    */
  var getTextFromItem: js.UndefOr[js.Function2[/* item */ T, /* currentValue */ js.UndefOr[String], String]] = js.native
  /**
    * AutoFill input native props
    * @defaultvalue undefined
    */
  var inputProps: js.UndefOr[IInputProps] = js.native
  /**
    * Restrict the amount of selectable items.
    * @defaultvalue undefined
    */
  var itemLimit: js.UndefOr[Double] = js.native
  /**
    * A callback for when the user moves the focus away from the picker
    */
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.native
  /**
    * A callback for when the selected list of items changes.
    */
  var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.native
  /**
    * A callback to override the default behavior of adding the selected suggestion on dismiss.
    */
  var onDismiss: js.UndefOr[
    js.Function2[/* ev */ js.UndefOr[js.Any], /* selectedItem */ js.UndefOr[T], Unit]
  ] = js.native
  /**
    * A callback for what should happen when a user clicks within the input area.
    * @deprecated Please use onEmptyResolveSuggestions instead, as the suggestions aren't about
    * setting focus as they are about resolving suggestions when there is no input.
    */
  var onEmptyInputFocus: js.UndefOr[
    js.Function1[
      /* selectedItems */ js.UndefOr[js.Array[T]], 
      js.Array[T] | js.Thenable[js.Array[T]]
    ]
  ] = js.native
  /**
    * A callback for what should happen when suggestions are shown without
    * input provided.
    * Returns the already selected items so the resolver can filter them out.
    * If used in conjunction with resolveDelay this will only kick off after the delay throttle.
    */
  var onEmptyResolveSuggestions: js.UndefOr[
    js.Function1[
      /* selectedItems */ js.UndefOr[js.Array[T]], 
      js.Array[T] | js.Thenable[js.Array[T]]
    ]
  ] = js.native
  /**
    * A callback for when the user put focus on the picker
    * @deprecated Use `inputProps.onFocus` instead
    */
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.native
  /**
    * A callback that gets the rest of the results when a user clicks get more results.
    */
  var onGetMoreResults: js.UndefOr[
    js.Function2[
      /* filter */ String, 
      /* selectedItems */ js.UndefOr[js.Array[T]], 
      js.Array[T] | js.Thenable[js.Array[T]]
    ]
  ] = js.native
  /**
    * A callback used to modify the input string.
    */
  var onInputChange: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
  /**
    * A callback to process a selection after the user selects something from the picker. If the callback returns null,
    * the item will not be added to the picker.
    */
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T] | Null]] = js.native
  /**
    * A callback for when an item is removed from the suggestion list
    */
  var onRemoveSuggestion: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
  /**
    * Function that specifies how the selected item will appear.
    */
  var onRenderItem: js.UndefOr[js.Function1[/* props */ IPickerItemProps[T], Element]] = js.native
  /**
    * Function that specifies how an individual suggestion item will appear.
    */
  var onRenderSuggestionsItem: js.UndefOr[js.Function2[/* props */ T, /* itemProps */ ISuggestionItemProps[T], Element]] = js.native
  /**
    * A function used to validate if raw text entered into the well can be added into the selected items list
    */
  var onValidateInput: js.UndefOr[js.Function1[/* input */ String, ValidationState]] = js.native
  /**
    * The properties that will get passed to the Callout component.
    */
  var pickerCalloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * The properties that will get passed to the Suggestions component.
    */
  var pickerSuggestionsProps: js.UndefOr[IBasePickerSuggestionsProps[_]] = js.native
  /**
    * Aria label for the "X" button in the selected item component.
    * @defaultvalue ''
    */
  var removeButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * The delay time in ms before resolving suggestions, which is kicked off when input has been changed.
    * e.g. If a second input change happens within the resolveDelay time, the timer will start over.
    * Only until after the timer completes will onResolveSuggestions be called.
    */
  var resolveDelay: js.UndefOr[Double] = js.native
  /**
    * The text to display while searching for more results in a limited suggestions list
    */
  var searchingText: js.UndefOr[(js.Function1[/* props */ AnonInput, String]) | String] = js.native
  /**
    * The items that the base picker should currently display as selected.
    * If this is provided then the picker will act as a controlled component.
    */
  var selectedItems: js.UndefOr[js.Array[T]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IBasePickerStyleProps, IBasePickerStyles]] = js.native
  /**
    * Theme provided by styled() function.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * A callback for what should happen when a person types text into the input.
    * Returns the already selected items so the resolver can filter them out.
    * If used in conjunction with resolveDelay this will only kick off after the delay throttle.
    */
  def onResolveSuggestions(filter: String): js.Array[T] | js.Thenable[js.Array[T]] = js.native
  def onResolveSuggestions(filter: String, selectedItems: js.Array[T]): js.Array[T] | js.Thenable[js.Array[T]] = js.native
}

