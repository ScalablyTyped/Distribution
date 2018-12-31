package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionItemProps[T] extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.native
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.native
  var id: js.UndefOr[java.lang.String] = js.native
  var isSelectedOverride: js.UndefOr[scala.Boolean] = js.native
  /**
    * The ARIA label for the button to remove the suggestion from the list.
    */
  var removeButtonAriaLabel: js.UndefOr[java.lang.String] = js.native
  var showRemoveButton: js.UndefOr[scala.Boolean] = js.native
  var suggestionModel: officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T] = js.native
  def RenderSuggestion(item: T): reactLib.reactMod.Global.JSXNs.Element = js.native
  def RenderSuggestion(item: T, suggestionItemProps: ISuggestionItemProps[T]): reactLib.reactMod.Global.JSXNs.Element = js.native
  def onClick(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
  def onRemoveItem(ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

