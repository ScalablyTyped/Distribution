package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionsItemTypesMod {
  
  @js.native
  trait ISuggestionItemProps[T] extends StObject {
    
    /** Optional renderer to override the default one for each type of picker. */
    def RenderSuggestion(item: T, suggestionItemProps: ISuggestionItemProps[T]): Element = js.native
    
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
    
    /** Callback for when the user clicks on the suggestion. */
    def onClick(ev: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
    
    /** Callback for when the item is removed from the array of suggested items. */
    def onRemoveItem(ev: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
    
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
    implicit class ISuggestionItemPropsMutableBuilder[Self <: ISuggestionItemProps[_], T] (val x: Self with ISuggestionItemProps[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ISuggestionsItem]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ISuggestionsItem | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsSelectedOverride(value: Boolean): Self = StObject.set(x, "isSelectedOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedOverrideUndefined: Self = StObject.set(x, "isSelectedOverride", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveItem(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onRemoveItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveButtonAriaLabel(value: String): Self = StObject.set(x, "removeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveButtonAriaLabelUndefined: Self = StObject.set(x, "removeButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setRenderSuggestion(value: (T, ISuggestionItemProps[T]) => Element): Self = StObject.set(x, "RenderSuggestion", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowRemoveButton(value: Boolean): Self = StObject.set(x, "showRemoveButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveButtonUndefined: Self = StObject.set(x, "showRemoveButton", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ISuggestionsItemStyleProps => DeepPartial[ISuggestionsItemStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSuggestionModel(value: ISuggestionModel[T]): Self = StObject.set(x, "suggestionModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait ISuggestionsItem extends StObject
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'className'> & {  suggested :boolean | undefined} */
  @js.native
  trait ISuggestionsItemStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    /** Whether the suggestion item is selected or not. */
    var suggested: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object ISuggestionsItemStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ISuggestionsItemStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionsItemStyleProps]
    }
    
    @scala.inline
    implicit class ISuggestionsItemStylePropsMutableBuilder[Self <: ISuggestionsItemStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setSuggested(value: Boolean): Self = StObject.set(x, "suggested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedUndefined: Self = StObject.set(x, "suggested", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISuggestionsItemStyles extends StObject {
    
    /** Refers to the remove button in case it's rendered. */
    var closeButton: IStyle = js.native
    
    /** Refers to the CommandButton holding the content of the suggested item. */
    var itemButton: IStyle = js.native
    
    /** Root element of the suggested item. */
    var root: IStyle = js.native
  }
  object ISuggestionsItemStyles {
    
    @scala.inline
    def apply(): ISuggestionsItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISuggestionsItemStyles]
    }
    
    @scala.inline
    implicit class ISuggestionsItemStylesMutableBuilder[Self <: ISuggestionsItemStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseButton(value: IStyle): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonNull: Self = StObject.set(x, "closeButton", null)
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setItemButton(value: IStyle): Self = StObject.set(x, "itemButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemButtonNull: Self = StObject.set(x, "itemButton", null)
      
      @scala.inline
      def setItemButtonUndefined: Self = StObject.set(x, "itemButton", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
