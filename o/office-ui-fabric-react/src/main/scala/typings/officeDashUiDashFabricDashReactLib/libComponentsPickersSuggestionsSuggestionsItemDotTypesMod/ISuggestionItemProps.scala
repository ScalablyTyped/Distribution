package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsItemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionItemProps[T] extends js.Object {
  /** Optional className for the root element of the suggestion item. */
  var className: js.UndefOr[java.lang.String] = js.native
  /**
    * Optional callback to access the ISuggestionItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ISuggestionsItem]] = js.native
  /** Unique id of the suggested item. */
  var id: js.UndefOr[java.lang.String] = js.native
  /** An override for the 'selected' property of the SuggestionModel. */
  var isSelectedOverride: js.UndefOr[scala.Boolean] = js.native
  /**
    * The ARIA label for the button to remove the suggestion from the list.
    */
  var removeButtonAriaLabel: js.UndefOr[java.lang.String] = js.native
  /** Whether the remove button should be rendered or not. */
  var showRemoveButton: js.UndefOr[scala.Boolean] = js.native
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]
  ] = js.native
  /** Individual suggestion object containing its properties. */
  var suggestionModel: officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionModel[T] = js.native
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.native
  /** Optional renderer to override the default one for each type of picker. */
  def RenderSuggestion(item: T): reactLib.reactMod.Global.JSXNs.Element = js.native
  def RenderSuggestion(item: T, suggestionItemProps: ISuggestionItemProps[T]): reactLib.reactMod.Global.JSXNs.Element = js.native
  /** Callback for when the user clicks on the suggestion. */
  def onClick(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
  /** Callback for when the item is removed from the array of suggested items. */
  def onRemoveItem(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

