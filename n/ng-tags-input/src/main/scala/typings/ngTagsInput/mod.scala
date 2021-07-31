package typings.ngTagsInput

import typings.angular.mod.IServiceProvider
import typings.ngTagsInput.mod.angularAugmentingMod.ngTagsInput.AutocompleteParams
import typings.ngTagsInput.mod.angularAugmentingMod.ngTagsInput.TagsInputConfigurationProvider
import typings.ngTagsInput.mod.angularAugmentingMod.ngTagsInput.TagsInputParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type IAutocompleteParams = AutocompleteParams
  
  type ITagsInputConfigurationProvider = TagsInputConfigurationProvider
  
  type ITagsInputParams = TagsInputParams
  
  /* augmented module */
  object angularAugmentingMod {
    
    object ngTagsInput {
      
      trait AutocompleteParams extends StObject {
        
        var debounceDelay: js.UndefOr[Double | Boolean] = js.undefined
        
        var displayProperty: js.UndefOr[String | Boolean] = js.undefined
        
        var highlightMatchedText: js.UndefOr[Boolean] = js.undefined
        
        var loadOnDownArrow: js.UndefOr[Boolean] = js.undefined
        
        var loadOnEmpty: js.UndefOr[Boolean] = js.undefined
        
        var loadOnFocus: js.UndefOr[Boolean] = js.undefined
        
        var matchClass: js.UndefOr[js.Any] = js.undefined
        
        var maxResultsToShow: js.UndefOr[Double | Boolean] = js.undefined
        
        var minLength: js.UndefOr[Double | Boolean] = js.undefined
        
        var selectFirstMatch: js.UndefOr[Boolean] = js.undefined
        
        var source: js.UndefOr[js.Any] = js.undefined
        
        var template: js.UndefOr[String | Boolean] = js.undefined
      }
      object AutocompleteParams {
        
        @scala.inline
        def apply(): AutocompleteParams = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AutocompleteParams]
        }
        
        @scala.inline
        implicit class AutocompleteParamsMutableBuilder[Self <: AutocompleteParams] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDebounceDelay(value: Double | Boolean): Self = StObject.set(x, "debounceDelay", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDebounceDelayUndefined: Self = StObject.set(x, "debounceDelay", js.undefined)
          
          @scala.inline
          def setDisplayProperty(value: String | Boolean): Self = StObject.set(x, "displayProperty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisplayPropertyUndefined: Self = StObject.set(x, "displayProperty", js.undefined)
          
          @scala.inline
          def setHighlightMatchedText(value: Boolean): Self = StObject.set(x, "highlightMatchedText", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHighlightMatchedTextUndefined: Self = StObject.set(x, "highlightMatchedText", js.undefined)
          
          @scala.inline
          def setLoadOnDownArrow(value: Boolean): Self = StObject.set(x, "loadOnDownArrow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoadOnDownArrowUndefined: Self = StObject.set(x, "loadOnDownArrow", js.undefined)
          
          @scala.inline
          def setLoadOnEmpty(value: Boolean): Self = StObject.set(x, "loadOnEmpty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoadOnEmptyUndefined: Self = StObject.set(x, "loadOnEmpty", js.undefined)
          
          @scala.inline
          def setLoadOnFocus(value: Boolean): Self = StObject.set(x, "loadOnFocus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoadOnFocusUndefined: Self = StObject.set(x, "loadOnFocus", js.undefined)
          
          @scala.inline
          def setMatchClass(value: js.Any): Self = StObject.set(x, "matchClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMatchClassUndefined: Self = StObject.set(x, "matchClass", js.undefined)
          
          @scala.inline
          def setMaxResultsToShow(value: Double | Boolean): Self = StObject.set(x, "maxResultsToShow", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxResultsToShowUndefined: Self = StObject.set(x, "maxResultsToShow", js.undefined)
          
          @scala.inline
          def setMinLength(value: Double | Boolean): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
          
          @scala.inline
          def setSelectFirstMatch(value: Boolean): Self = StObject.set(x, "selectFirstMatch", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSelectFirstMatchUndefined: Self = StObject.set(x, "selectFirstMatch", js.undefined)
          
          @scala.inline
          def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
          
          @scala.inline
          def setTemplate(value: String | Boolean): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        }
      }
      
      @js.native
      trait TagsInputConfigurationProvider
        extends StObject
           with IServiceProvider {
        
        def setActiveInterpolation(directive: String, options: IAutocompleteParams): js.Any = js.native
        /**
          * Sets active interpolation for a set of options.
          */
        def setActiveInterpolation(directive: String, options: ITagsInputParams): js.Any = js.native
        
        def setDefaults(directive: String, defaults: IAutocompleteParams): js.Any = js.native
        /**
          * Sets the default configuration option for a directive.
          */
        def setDefaults(directive: String, defaults: ITagsInputParams): js.Any = js.native
        
        /**
          * Sets the threshold used by the tagsInput directive to re-size the inner input field element based on its contents.
          */
        def setTextAutosizeThreshold(threshold: Double): js.Any = js.native
      }
      
      trait TagsInputParams extends StObject {
        
        var addFromAutocompleteOnly: js.UndefOr[Boolean] = js.undefined
        
        var addOnBlur: js.UndefOr[Boolean] = js.undefined
        
        var addOnComma: js.UndefOr[Boolean] = js.undefined
        
        var addOnEnter: js.UndefOr[Boolean] = js.undefined
        
        var addOnPaste: js.UndefOr[Boolean] = js.undefined
        
        var addOnSpace: js.UndefOr[Boolean] = js.undefined
        
        var allowLeftoverText: js.UndefOr[Boolean] = js.undefined
        
        var allowedTagsPattern: js.UndefOr[String | Boolean] = js.undefined
        
        var displayProperty: js.UndefOr[String | Boolean] = js.undefined
        
        var enableEditingLastTag: js.UndefOr[Boolean] = js.undefined
        
        var keyProperty: js.UndefOr[String | Boolean] = js.undefined
        
        var maxLength: js.UndefOr[Double | Boolean] = js.undefined
        
        var maxTags: js.UndefOr[Double | Boolean] = js.undefined
        
        var minLength: js.UndefOr[Double | Boolean] = js.undefined
        
        var minTags: js.UndefOr[Double | Boolean] = js.undefined
        
        var ngModel: js.UndefOr[String] = js.undefined
        
        var onInvalidTag: js.UndefOr[js.Any] = js.undefined
        
        var onTagAdded: js.UndefOr[js.Any] = js.undefined
        
        var onTagAdding: js.UndefOr[js.Any] = js.undefined
        
        var onTagClicked: js.UndefOr[js.Any] = js.undefined
        
        var onTagRemoved: js.UndefOr[js.Any] = js.undefined
        
        var onTagRemoving: js.UndefOr[js.Any] = js.undefined
        
        var pasteSplitPattern: js.UndefOr[String | Boolean] = js.undefined
        
        var placeholder: js.UndefOr[String | Boolean] = js.undefined
        
        var removeTagSymbol: js.UndefOr[String | Boolean] = js.undefined
        
        var replaceSpacesWithDashes: js.UndefOr[Boolean] = js.undefined
        
        var spellcheck: js.UndefOr[Boolean] = js.undefined
        
        var tabindex: js.UndefOr[Double | Boolean] = js.undefined
        
        var tagClass: js.UndefOr[js.Any] = js.undefined
        
        var template: js.UndefOr[String | Boolean] = js.undefined
        
        var templateScope: js.UndefOr[String | Boolean] = js.undefined
        
        var text: js.UndefOr[String | Boolean] = js.undefined
        
        var `type`: js.UndefOr[String | Boolean] = js.undefined
        
        var useStrings: js.UndefOr[Boolean] = js.undefined
      }
      object TagsInputParams {
        
        @scala.inline
        def apply(): TagsInputParams = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[TagsInputParams]
        }
        
        @scala.inline
        implicit class TagsInputParamsMutableBuilder[Self <: TagsInputParams] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAddFromAutocompleteOnly(value: Boolean): Self = StObject.set(x, "addFromAutocompleteOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddFromAutocompleteOnlyUndefined: Self = StObject.set(x, "addFromAutocompleteOnly", js.undefined)
          
          @scala.inline
          def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
          
          @scala.inline
          def setAddOnComma(value: Boolean): Self = StObject.set(x, "addOnComma", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddOnCommaUndefined: Self = StObject.set(x, "addOnComma", js.undefined)
          
          @scala.inline
          def setAddOnEnter(value: Boolean): Self = StObject.set(x, "addOnEnter", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddOnEnterUndefined: Self = StObject.set(x, "addOnEnter", js.undefined)
          
          @scala.inline
          def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
          
          @scala.inline
          def setAddOnSpace(value: Boolean): Self = StObject.set(x, "addOnSpace", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddOnSpaceUndefined: Self = StObject.set(x, "addOnSpace", js.undefined)
          
          @scala.inline
          def setAllowLeftoverText(value: Boolean): Self = StObject.set(x, "allowLeftoverText", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowLeftoverTextUndefined: Self = StObject.set(x, "allowLeftoverText", js.undefined)
          
          @scala.inline
          def setAllowedTagsPattern(value: String | Boolean): Self = StObject.set(x, "allowedTagsPattern", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowedTagsPatternUndefined: Self = StObject.set(x, "allowedTagsPattern", js.undefined)
          
          @scala.inline
          def setDisplayProperty(value: String | Boolean): Self = StObject.set(x, "displayProperty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisplayPropertyUndefined: Self = StObject.set(x, "displayProperty", js.undefined)
          
          @scala.inline
          def setEnableEditingLastTag(value: Boolean): Self = StObject.set(x, "enableEditingLastTag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnableEditingLastTagUndefined: Self = StObject.set(x, "enableEditingLastTag", js.undefined)
          
          @scala.inline
          def setKeyProperty(value: String | Boolean): Self = StObject.set(x, "keyProperty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeyPropertyUndefined: Self = StObject.set(x, "keyProperty", js.undefined)
          
          @scala.inline
          def setMaxLength(value: Double | Boolean): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
          
          @scala.inline
          def setMaxTags(value: Double | Boolean): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxTagsUndefined: Self = StObject.set(x, "maxTags", js.undefined)
          
          @scala.inline
          def setMinLength(value: Double | Boolean): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
          
          @scala.inline
          def setMinTags(value: Double | Boolean): Self = StObject.set(x, "minTags", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinTagsUndefined: Self = StObject.set(x, "minTags", js.undefined)
          
          @scala.inline
          def setNgModel(value: String): Self = StObject.set(x, "ngModel", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNgModelUndefined: Self = StObject.set(x, "ngModel", js.undefined)
          
          @scala.inline
          def setOnInvalidTag(value: js.Any): Self = StObject.set(x, "onInvalidTag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnInvalidTagUndefined: Self = StObject.set(x, "onInvalidTag", js.undefined)
          
          @scala.inline
          def setOnTagAdded(value: js.Any): Self = StObject.set(x, "onTagAdded", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnTagAddedUndefined: Self = StObject.set(x, "onTagAdded", js.undefined)
          
          @scala.inline
          def setOnTagAdding(value: js.Any): Self = StObject.set(x, "onTagAdding", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnTagAddingUndefined: Self = StObject.set(x, "onTagAdding", js.undefined)
          
          @scala.inline
          def setOnTagClicked(value: js.Any): Self = StObject.set(x, "onTagClicked", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnTagClickedUndefined: Self = StObject.set(x, "onTagClicked", js.undefined)
          
          @scala.inline
          def setOnTagRemoved(value: js.Any): Self = StObject.set(x, "onTagRemoved", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnTagRemovedUndefined: Self = StObject.set(x, "onTagRemoved", js.undefined)
          
          @scala.inline
          def setOnTagRemoving(value: js.Any): Self = StObject.set(x, "onTagRemoving", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnTagRemovingUndefined: Self = StObject.set(x, "onTagRemoving", js.undefined)
          
          @scala.inline
          def setPasteSplitPattern(value: String | Boolean): Self = StObject.set(x, "pasteSplitPattern", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPasteSplitPatternUndefined: Self = StObject.set(x, "pasteSplitPattern", js.undefined)
          
          @scala.inline
          def setPlaceholder(value: String | Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
          
          @scala.inline
          def setRemoveTagSymbol(value: String | Boolean): Self = StObject.set(x, "removeTagSymbol", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRemoveTagSymbolUndefined: Self = StObject.set(x, "removeTagSymbol", js.undefined)
          
          @scala.inline
          def setReplaceSpacesWithDashes(value: Boolean): Self = StObject.set(x, "replaceSpacesWithDashes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReplaceSpacesWithDashesUndefined: Self = StObject.set(x, "replaceSpacesWithDashes", js.undefined)
          
          @scala.inline
          def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
          
          @scala.inline
          def setTabindex(value: Double | Boolean): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
          
          @scala.inline
          def setTagClass(value: js.Any): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTagClassUndefined: Self = StObject.set(x, "tagClass", js.undefined)
          
          @scala.inline
          def setTemplate(value: String | Boolean): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTemplateScope(value: String | Boolean): Self = StObject.set(x, "templateScope", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTemplateScopeUndefined: Self = StObject.set(x, "templateScope", js.undefined)
          
          @scala.inline
          def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
          
          @scala.inline
          def setText(value: String | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
          
          @scala.inline
          def setType(value: String | Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
          
          @scala.inline
          def setUseStrings(value: Boolean): Self = StObject.set(x, "useStrings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUseStringsUndefined: Self = StObject.set(x, "useStrings", js.undefined)
        }
      }
    }
  }
}
