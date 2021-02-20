package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionsDottypesMod {
  
  @js.native
  trait ISuggestionsControlProps[T] extends ISuggestionsCoreProps[T] {
    
    /**
      * The CSS classname of the suggestions list.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Completes the suggestion
      */
    def completeSuggestion(): Unit = js.native
    
    /**
      * The footer items props
      */
    var footerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
    
    /**
      * The header items props
      */
    var headerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
    
    /**
      * Whether or not the first selectable item in the suggestions list should be selected
      */
    var shouldSelectFirstItem: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /**
      * An ARIA label for the container that is the parent of the suggestions footer items.
      */
    var suggestionsFooterContainerAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * An ARIA label for the container that is the parent of the suggestions header items.
      */
    var suggestionsHeaderContainerAriaLabel: js.UndefOr[String] = js.native
  }
  
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
      * What should occur when a suggestion is clicked
      */
    def onSuggestionClick(): Unit = js.native
    def onSuggestionClick(ev: js.UndefOr[scala.Nothing], item: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def onSuggestionClick(ev: js.UndefOr[scala.Nothing], item: js.Any): Unit = js.native
    def onSuggestionClick(ev: js.UndefOr[scala.Nothing], item: js.Any, index: Double): Unit = js.native
    def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: js.Any): Unit = js.native
    def onSuggestionClick(ev: MouseEvent[HTMLElement, NativeMouseEvent], item: js.Any, index: Double): Unit = js.native
    
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
      * Indicates whether to loop around to the top or bottom of the suggestions
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
  }
  
  @js.native
  trait ISuggestionsHeaderFooterItemProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
    
    var id: String = js.native
    
    var isSelected: Boolean = js.native
    
    var onExecute: js.UndefOr[js.Function0[Unit]] = js.native
    
    def renderItem(): Element = js.native
  }
  object ISuggestionsHeaderFooterItemProps {
    
    @scala.inline
    def apply(id: String, isSelected: Boolean, renderItem: () => Element): ISuggestionsHeaderFooterItemProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], renderItem = js.Any.fromFunction0(renderItem))
      __obj.asInstanceOf[ISuggestionsHeaderFooterItemProps]
    }
    
    @scala.inline
    implicit class ISuggestionsHeaderFooterItemPropsMutableBuilder[Self <: ISuggestionsHeaderFooterItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExecute(value: () => Unit): Self = StObject.set(x, "onExecute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
      
      @scala.inline
      def setRenderItem(value: () => Element): Self = StObject.set(x, "renderItem", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ISuggestionsHeaderFooterProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var onExecute: js.UndefOr[js.Function0[Unit]] = js.native
    
    def renderItem(): Element = js.native
    
    def shouldShow(): Boolean = js.native
  }
  object ISuggestionsHeaderFooterProps {
    
    @scala.inline
    def apply(renderItem: () => Element, shouldShow: () => Boolean): ISuggestionsHeaderFooterProps = {
      val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction0(renderItem), shouldShow = js.Any.fromFunction0(shouldShow))
      __obj.asInstanceOf[ISuggestionsHeaderFooterProps]
    }
    
    @scala.inline
    implicit class ISuggestionsHeaderFooterPropsMutableBuilder[Self <: ISuggestionsHeaderFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnExecute(value: () => Unit): Self = StObject.set(x, "onExecute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
      
      @scala.inline
      def setRenderItem(value: () => Element): Self = StObject.set(x, "renderItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldShow(value: () => Boolean): Self = StObject.set(x, "shouldShow", js.Any.fromFunction0(value))
    }
  }
}
