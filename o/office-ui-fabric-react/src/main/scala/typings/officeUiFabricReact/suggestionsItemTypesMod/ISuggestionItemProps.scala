package typings.officeUiFabricReact.suggestionsItemTypesMod

import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionItemProps[T] extends js.Object {
  /** Optional className for the root element of the suggestion item. */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the ISuggestionItem interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISuggestionsItem]] = js.native
  /** Unique id of the suggested item. */
  var id: js.UndefOr[String] = js.native
  /** An override for the 'selected' property of the SuggestionModel. */
  var isSelectedOverride: js.UndefOr[Boolean] = js.native
  /**
    * The ARIA label for the button to remove the suggestion from the list.
    */
  var removeButtonAriaLabel: js.UndefOr[String] = js.native
  /** Whether the remove button should be rendered or not. */
  var showRemoveButton: js.UndefOr[Boolean] = js.native
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]] = js.native
  /** Individual suggestion object containing its properties. */
  var suggestionModel: ISuggestionModel[T] = js.native
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.native
  /** Optional renderer to override the default one for each type of picker. */
  def RenderSuggestion(item: T, suggestionItemProps: ISuggestionItemProps[T]): Element = js.native
  /** Callback for when the user clicks on the suggestion. */
  def onClick(ev: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
  /** Callback for when the item is removed from the array of suggested items. */
  def onRemoveItem(ev: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
}

object ISuggestionItemProps {
  @scala.inline
  def apply[T](
    RenderSuggestion: (T, ISuggestionItemProps[T]) => Element,
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    onRemoveItem: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    suggestionModel: ISuggestionModel[T]
  ): ISuggestionItemProps[T] = {
    val __obj = js.Dynamic.literal(RenderSuggestion = js.Any.fromFunction2(RenderSuggestion), onClick = js.Any.fromFunction1(onClick), onRemoveItem = js.Any.fromFunction1(onRemoveItem), suggestionModel = suggestionModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionItemProps[T]]
  }
  @scala.inline
  implicit class ISuggestionItemPropsOps[Self <: ISuggestionItemProps[_], T] (val x: Self with ISuggestionItemProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRenderSuggestion(value: (T, ISuggestionItemProps[T]) => Element): Self = this.set("RenderSuggestion", js.Any.fromFunction2(value))
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRemoveItem(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onRemoveItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSuggestionModel(value: ISuggestionModel[T]): Self = this.set("suggestionModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ISuggestionsItem | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ISuggestionsItem]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsSelectedOverride(value: Boolean): Self = this.set("isSelectedOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelectedOverride: Self = this.set("isSelectedOverride", js.undefined)
    @scala.inline
    def setRemoveButtonAriaLabel(value: String): Self = this.set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveButtonAriaLabel: Self = this.set("removeButtonAriaLabel", js.undefined)
    @scala.inline
    def setShowRemoveButton(value: Boolean): Self = this.set("showRemoveButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRemoveButton: Self = this.set("showRemoveButton", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ISuggestionsItemStyleProps => DeepPartial[ISuggestionsItemStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

