package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Input
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterProps
import typings.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typings.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseFloatingPickerTypesMod {
  
  @js.native
  trait IBaseFloatingPicker extends StObject {
    
    /** Hides the picker */
    def hidePicker(): Unit = js.native
    
    /** Gets the input text */
    var inputText: String = js.native
    
    /** Whether the suggestions are shown */
    var isSuggestionsShown: Boolean = js.native
    
    /** On queryString changed */
    def onQueryStringChanged(input: String): Unit = js.native
    
    /** Shows the picker
      * @param updateValue - Optional param to indicate whether to update the query string
      */
    def showPicker(): Unit = js.native
    def showPicker(updateValue: Boolean): Unit = js.native
    
    /** Gets the suggestions */
    var suggestions: js.Array[_] = js.native
  }
  
  @js.native
  trait IBaseFloatingPickerProps[T]
    extends ClassAttributes[js.Any] {
    
    /**
      * Width for the suggestions callout
      */
    var calloutWidth: js.UndefOr[Double] = js.native
    
    /**
      * ClassName for the picker.
      */
    var className: js.UndefOr[String] = js.native
    
    var componentRef: js.UndefOr[IRefObject[IBaseFloatingPicker]] = js.native
    
    /**
      * Function that specifies how arbitrary text entered into the well is handled.
      */
    var createGenericItem: js.UndefOr[js.Function2[/* input */ String, /* isValid */ Boolean, ISuggestionModel[T]]] = js.native
    
    /**
      * A callback to get text from an item. Used to autofill text in the pickers.
      */
    var getTextFromItem: js.UndefOr[js.Function2[/* item */ T, /* currentValue */ js.UndefOr[String], String]] = js.native
    
    /**
      * The input element to listen on events
      */
    var inputElement: js.UndefOr[HTMLInputElement | Null] = js.native
    
    /**
      * A callback for when a suggestion is clicked
      */
    var onChange: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
    
    /**
      * A callback for when the input has been changed
      */
    var onInputChanged: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.native
    
    /**
      * A callback for when an item is removed from the suggestion list
      */
    var onRemoveSuggestion: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
    
    /**
      * Function that specifies how an individual suggestion item will appear.
      */
    var onRenderSuggestionsItem: js.UndefOr[js.Function2[/* props */ T, /* itemProps */ ISuggestionItemProps[T], Element]] = js.native
    
    /**
      * A callback for what should happen when a person types text into the input.
      * Returns the already selected items so the resolver can filter them out.
      * If used in conjunction with resolveDelay this will only kick off after the delay throttle.
      * Return null if using as a controlled component
      */
    def onResolveSuggestions(filter: String): js.Array[T] | js.Thenable[js.Array[T]] | Null = js.native
    def onResolveSuggestions(filter: String, selectedItems: js.Array[T]): js.Array[T] | js.Thenable[js.Array[T]] | Null = js.native
    
    /**
      * The callback that should be called when the suggestions are hiden
      */
    var onSuggestionsHidden: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * The callback that should be called when the suggestions are shown
      */
    var onSuggestionsShown: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A function used to validate if raw text entered into the well can be added
      */
    var onValidateInput: js.UndefOr[js.Function1[/* input */ String, Boolean]] = js.native
    
    /**
      * The suggestions to show on zero query, return null if using as a controlled component
      */
    var onZeroQuerySuggestion: js.UndefOr[
        js.Function1[
          /* selectedItems */ js.UndefOr[js.Array[T]], 
          js.Array[T] | js.Thenable[js.Array[T]] | Null
        ]
      ] = js.native
    
    /**
      * The properties that will get passed to the Callout component.
      */
    var pickerCalloutProps: js.UndefOr[ICalloutProps] = js.native
    
    /**
      * The properties that will get passed to the Suggestions component.
      */
    var pickerSuggestionsProps: js.UndefOr[IBaseFloatingPickerSuggestionProps] = js.native
    
    /**
      * The delay time in ms before resolving suggestions, which is kicked off when input has been changed.
      * e.g. If a second input change happens within the resolveDelay time, the timer will start over.
      * Only until after the timer completes will onResolveSuggestions be called.
      */
    var resolveDelay: js.UndefOr[Double] = js.native
    
    /**
      * The text to display while searching for more results in a limited suggestions list
      */
    var searchingText: js.UndefOr[(js.Function1[/* props */ Input, String]) | String] = js.native
    
    /**
      * The items that the base picker should currently display as selected.
      * If this is provided then the picker will act as a controlled component.
      */
    var selectedItems: js.UndefOr[js.Array[T]] = js.native
    
    /**
      * The callback that should be called to see if the force resolve command should be shown
      */
    var showForceResolve: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /**
      * If using as a controlled component, the items to show in the suggestion list
      */
    var suggestionItems: js.UndefOr[js.Array[T]] = js.native
    
    /**
      * The suggestions store
      */
    var suggestionsStore: SuggestionsStore[T] = js.native
  }
  
  /* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/Suggestions.types.ISuggestionsControlProps<any>, 'shouldSelectFirstItem' | 'headerItemsProps' | 'footerItemsProps' | 'showRemoveButtons'> */
  @js.native
  trait IBaseFloatingPickerSuggestionProps extends StObject {
    
    var footerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
    
    var headerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
    
    var shouldSelectFirstItem: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var showRemoveButtons: js.UndefOr[Boolean] = js.native
  }
  object IBaseFloatingPickerSuggestionProps {
    
    @scala.inline
    def apply(): IBaseFloatingPickerSuggestionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseFloatingPickerSuggestionProps]
    }
    
    @scala.inline
    implicit class IBaseFloatingPickerSuggestionPropsMutableBuilder[Self <: IBaseFloatingPickerSuggestionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFooterItemsProps(value: js.Array[ISuggestionsHeaderFooterProps]): Self = StObject.set(x, "footerItemsProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterItemsPropsUndefined: Self = StObject.set(x, "footerItemsProps", js.undefined)
      
      @scala.inline
      def setFooterItemsPropsVarargs(value: ISuggestionsHeaderFooterProps*): Self = StObject.set(x, "footerItemsProps", js.Array(value :_*))
      
      @scala.inline
      def setHeaderItemsProps(value: js.Array[ISuggestionsHeaderFooterProps]): Self = StObject.set(x, "headerItemsProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderItemsPropsUndefined: Self = StObject.set(x, "headerItemsProps", js.undefined)
      
      @scala.inline
      def setHeaderItemsPropsVarargs(value: ISuggestionsHeaderFooterProps*): Self = StObject.set(x, "headerItemsProps", js.Array(value :_*))
      
      @scala.inline
      def setShouldSelectFirstItem(value: () => Boolean): Self = StObject.set(x, "shouldSelectFirstItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldSelectFirstItemUndefined: Self = StObject.set(x, "shouldSelectFirstItem", js.undefined)
      
      @scala.inline
      def setShowRemoveButtons(value: Boolean): Self = StObject.set(x, "showRemoveButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveButtonsUndefined: Self = StObject.set(x, "showRemoveButtons", js.undefined)
    }
  }
}
