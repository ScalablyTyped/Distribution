package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestionItemProps[T] extends js.Object {
  /** Optional className for the root element of the suggestion item. */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the ISuggestionItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISuggestionsItem]] = js.undefined
  /** Unique id of the suggested item. */
  var id: js.UndefOr[String] = js.undefined
  /** An override for the 'selected' property of the SuggestionModel. */
  var isSelectedOverride: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARIA label for the button to remove the suggestion from the list.
    */
  var removeButtonAriaLabel: js.UndefOr[String] = js.undefined
  /** Whether the remove button should be rendered or not. */
  var showRemoveButton: js.UndefOr[Boolean] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]] = js.undefined
  /** Individual suggestion object containing its properties. */
  var suggestionModel: ISuggestionModel[T]
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.undefined
  /** Optional renderer to override the default one for each type of picker. */
  def RenderSuggestion(item: T, suggestionItemProps: ISuggestionItemProps[T]): Element
  /** Callback for when the user clicks on the suggestion. */
  def onClick(ev: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
  /** Callback for when the item is removed from the array of suggested items. */
  def onRemoveItem(ev: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit
}

object ISuggestionItemProps {
  @scala.inline
  def apply[T](
    RenderSuggestion: (T, ISuggestionItemProps[T]) => Element,
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    onRemoveItem: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    suggestionModel: ISuggestionModel[T],
    className: String = null,
    componentRef: IRefObject[ISuggestionsItem] = null,
    id: String = null,
    isSelectedOverride: js.UndefOr[Boolean] = js.undefined,
    removeButtonAriaLabel: String = null,
    showRemoveButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles] = null,
    theme: ITheme = null
  ): ISuggestionItemProps[T] = {
    val __obj = js.Dynamic.literal(RenderSuggestion = js.Any.fromFunction2(RenderSuggestion), onClick = js.Any.fromFunction1(onClick), onRemoveItem = js.Any.fromFunction1(onRemoveItem), suggestionModel = suggestionModel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelectedOverride)) __obj.updateDynamic("isSelectedOverride")(isSelectedOverride.asInstanceOf[js.Any])
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveButton)) __obj.updateDynamic("showRemoveButton")(showRemoveButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionItemProps[T]]
  }
}

