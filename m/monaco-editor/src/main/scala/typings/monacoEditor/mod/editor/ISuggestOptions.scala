package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.insert
import typings.monacoEditor.monacoEditorStrings.never
import typings.monacoEditor.monacoEditorStrings.prefix
import typings.monacoEditor.monacoEditorStrings.replace
import typings.monacoEditor.monacoEditorStrings.subword
import typings.monacoEditor.monacoEditorStrings.subwordSmart
import typings.monacoEditor.monacoEditorStrings.whenQuickSuggestion
import typings.monacoEditor.monacoEditorStrings.whenTriggerCharacter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISuggestOptions extends StObject {
  
  /**
    * Enable graceful matching. Defaults to true.
    */
  var filterGraceful: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overwrite word ends on accept. Default to false.
    */
  var insertMode: js.UndefOr[insert | replace] = js.undefined
  
  /**
    * Favors words that appear close to the cursor.
    */
  var localityBonus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether suggestions allow matches in the middle of the word instead of only at the beginning
    */
  var matchOnWordStartOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable the rendering of the suggestion preview.
    */
  var preview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the mode of the preview.
    */
  var previewMode: js.UndefOr[prefix | subword | subwordSmart] = js.undefined
  
  /**
    * Select suggestions when triggered via quick suggest or trigger characters
    */
  var selectionMode: js.UndefOr[always | never | whenTriggerCharacter | whenQuickSuggestion] = js.undefined
  
  /**
    * Enable using global storage for remembering suggestions.
    */
  var shareSuggestSelections: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show class-suggestions.
    */
  var showClasses: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show color-suggestions.
    */
  var showColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show constant-suggestions.
    */
  var showConstants: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show constructor-suggestions.
    */
  var showConstructors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show deprecated-suggestions.
    */
  var showDeprecated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show enumMember-suggestions.
    */
  var showEnumMembers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show enum-suggestions.
    */
  var showEnums: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show event-suggestions.
    */
  var showEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show field-suggestions.
    */
  var showFields: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show file-suggestions.
    */
  var showFiles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show folder-suggestions.
    */
  var showFolders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show function-suggestions.
    */
  var showFunctions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable icons in suggestions. Defaults to true.
    */
  var showIcons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show details inline with the label. Defaults to true.
    */
  var showInlineDetails: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show interface-suggestions.
    */
  var showInterfaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show issue-suggestions.
    */
  var showIssues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show keyword-suggestions.
    */
  var showKeywords: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show method-suggestions.
    */
  var showMethods: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show module-suggestions.
    */
  var showModules: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show operator-suggestions.
    */
  var showOperators: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show property-suggestions.
    */
  var showProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show reference-suggestions.
    */
  var showReferences: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show snippet-suggestions.
    */
  var showSnippets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable or disable the suggest status bar.
    */
  var showStatusBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show struct-suggestions.
    */
  var showStructs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show typeParameter-suggestions.
    */
  var showTypeParameters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show unit-suggestions.
    */
  var showUnits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show user-suggestions.
    */
  var showUsers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show value-suggestions.
    */
  var showValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show variable-suggestions.
    */
  var showVariables: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show text-suggestions.
    */
  var showWords: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Prevent quick suggestions when a snippet is active. Defaults to true.
    */
  var snippetsPreventQuickSuggestions: js.UndefOr[Boolean] = js.undefined
}
object ISuggestOptions {
  
  inline def apply(): ISuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISuggestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISuggestOptions] (val x: Self) extends AnyVal {
    
    inline def setFilterGraceful(value: Boolean): Self = StObject.set(x, "filterGraceful", value.asInstanceOf[js.Any])
    
    inline def setFilterGracefulUndefined: Self = StObject.set(x, "filterGraceful", js.undefined)
    
    inline def setInsertMode(value: insert | replace): Self = StObject.set(x, "insertMode", value.asInstanceOf[js.Any])
    
    inline def setInsertModeUndefined: Self = StObject.set(x, "insertMode", js.undefined)
    
    inline def setLocalityBonus(value: Boolean): Self = StObject.set(x, "localityBonus", value.asInstanceOf[js.Any])
    
    inline def setLocalityBonusUndefined: Self = StObject.set(x, "localityBonus", js.undefined)
    
    inline def setMatchOnWordStartOnly(value: Boolean): Self = StObject.set(x, "matchOnWordStartOnly", value.asInstanceOf[js.Any])
    
    inline def setMatchOnWordStartOnlyUndefined: Self = StObject.set(x, "matchOnWordStartOnly", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewMode(value: prefix | subword | subwordSmart): Self = StObject.set(x, "previewMode", value.asInstanceOf[js.Any])
    
    inline def setPreviewModeUndefined: Self = StObject.set(x, "previewMode", js.undefined)
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setSelectionMode(value: always | never | whenTriggerCharacter | whenQuickSuggestion): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setShareSuggestSelections(value: Boolean): Self = StObject.set(x, "shareSuggestSelections", value.asInstanceOf[js.Any])
    
    inline def setShareSuggestSelectionsUndefined: Self = StObject.set(x, "shareSuggestSelections", js.undefined)
    
    inline def setShowClasses(value: Boolean): Self = StObject.set(x, "showClasses", value.asInstanceOf[js.Any])
    
    inline def setShowClassesUndefined: Self = StObject.set(x, "showClasses", js.undefined)
    
    inline def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
    
    inline def setShowColorsUndefined: Self = StObject.set(x, "showColors", js.undefined)
    
    inline def setShowConstants(value: Boolean): Self = StObject.set(x, "showConstants", value.asInstanceOf[js.Any])
    
    inline def setShowConstantsUndefined: Self = StObject.set(x, "showConstants", js.undefined)
    
    inline def setShowConstructors(value: Boolean): Self = StObject.set(x, "showConstructors", value.asInstanceOf[js.Any])
    
    inline def setShowConstructorsUndefined: Self = StObject.set(x, "showConstructors", js.undefined)
    
    inline def setShowDeprecated(value: Boolean): Self = StObject.set(x, "showDeprecated", value.asInstanceOf[js.Any])
    
    inline def setShowDeprecatedUndefined: Self = StObject.set(x, "showDeprecated", js.undefined)
    
    inline def setShowEnumMembers(value: Boolean): Self = StObject.set(x, "showEnumMembers", value.asInstanceOf[js.Any])
    
    inline def setShowEnumMembersUndefined: Self = StObject.set(x, "showEnumMembers", js.undefined)
    
    inline def setShowEnums(value: Boolean): Self = StObject.set(x, "showEnums", value.asInstanceOf[js.Any])
    
    inline def setShowEnumsUndefined: Self = StObject.set(x, "showEnums", js.undefined)
    
    inline def setShowEvents(value: Boolean): Self = StObject.set(x, "showEvents", value.asInstanceOf[js.Any])
    
    inline def setShowEventsUndefined: Self = StObject.set(x, "showEvents", js.undefined)
    
    inline def setShowFields(value: Boolean): Self = StObject.set(x, "showFields", value.asInstanceOf[js.Any])
    
    inline def setShowFieldsUndefined: Self = StObject.set(x, "showFields", js.undefined)
    
    inline def setShowFiles(value: Boolean): Self = StObject.set(x, "showFiles", value.asInstanceOf[js.Any])
    
    inline def setShowFilesUndefined: Self = StObject.set(x, "showFiles", js.undefined)
    
    inline def setShowFolders(value: Boolean): Self = StObject.set(x, "showFolders", value.asInstanceOf[js.Any])
    
    inline def setShowFoldersUndefined: Self = StObject.set(x, "showFolders", js.undefined)
    
    inline def setShowFunctions(value: Boolean): Self = StObject.set(x, "showFunctions", value.asInstanceOf[js.Any])
    
    inline def setShowFunctionsUndefined: Self = StObject.set(x, "showFunctions", js.undefined)
    
    inline def setShowIcons(value: Boolean): Self = StObject.set(x, "showIcons", value.asInstanceOf[js.Any])
    
    inline def setShowIconsUndefined: Self = StObject.set(x, "showIcons", js.undefined)
    
    inline def setShowInlineDetails(value: Boolean): Self = StObject.set(x, "showInlineDetails", value.asInstanceOf[js.Any])
    
    inline def setShowInlineDetailsUndefined: Self = StObject.set(x, "showInlineDetails", js.undefined)
    
    inline def setShowInterfaces(value: Boolean): Self = StObject.set(x, "showInterfaces", value.asInstanceOf[js.Any])
    
    inline def setShowInterfacesUndefined: Self = StObject.set(x, "showInterfaces", js.undefined)
    
    inline def setShowIssues(value: Boolean): Self = StObject.set(x, "showIssues", value.asInstanceOf[js.Any])
    
    inline def setShowIssuesUndefined: Self = StObject.set(x, "showIssues", js.undefined)
    
    inline def setShowKeywords(value: Boolean): Self = StObject.set(x, "showKeywords", value.asInstanceOf[js.Any])
    
    inline def setShowKeywordsUndefined: Self = StObject.set(x, "showKeywords", js.undefined)
    
    inline def setShowMethods(value: Boolean): Self = StObject.set(x, "showMethods", value.asInstanceOf[js.Any])
    
    inline def setShowMethodsUndefined: Self = StObject.set(x, "showMethods", js.undefined)
    
    inline def setShowModules(value: Boolean): Self = StObject.set(x, "showModules", value.asInstanceOf[js.Any])
    
    inline def setShowModulesUndefined: Self = StObject.set(x, "showModules", js.undefined)
    
    inline def setShowOperators(value: Boolean): Self = StObject.set(x, "showOperators", value.asInstanceOf[js.Any])
    
    inline def setShowOperatorsUndefined: Self = StObject.set(x, "showOperators", js.undefined)
    
    inline def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
    
    inline def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
    
    inline def setShowReferences(value: Boolean): Self = StObject.set(x, "showReferences", value.asInstanceOf[js.Any])
    
    inline def setShowReferencesUndefined: Self = StObject.set(x, "showReferences", js.undefined)
    
    inline def setShowSnippets(value: Boolean): Self = StObject.set(x, "showSnippets", value.asInstanceOf[js.Any])
    
    inline def setShowSnippetsUndefined: Self = StObject.set(x, "showSnippets", js.undefined)
    
    inline def setShowStatusBar(value: Boolean): Self = StObject.set(x, "showStatusBar", value.asInstanceOf[js.Any])
    
    inline def setShowStatusBarUndefined: Self = StObject.set(x, "showStatusBar", js.undefined)
    
    inline def setShowStructs(value: Boolean): Self = StObject.set(x, "showStructs", value.asInstanceOf[js.Any])
    
    inline def setShowStructsUndefined: Self = StObject.set(x, "showStructs", js.undefined)
    
    inline def setShowTypeParameters(value: Boolean): Self = StObject.set(x, "showTypeParameters", value.asInstanceOf[js.Any])
    
    inline def setShowTypeParametersUndefined: Self = StObject.set(x, "showTypeParameters", js.undefined)
    
    inline def setShowUnits(value: Boolean): Self = StObject.set(x, "showUnits", value.asInstanceOf[js.Any])
    
    inline def setShowUnitsUndefined: Self = StObject.set(x, "showUnits", js.undefined)
    
    inline def setShowUsers(value: Boolean): Self = StObject.set(x, "showUsers", value.asInstanceOf[js.Any])
    
    inline def setShowUsersUndefined: Self = StObject.set(x, "showUsers", js.undefined)
    
    inline def setShowValues(value: Boolean): Self = StObject.set(x, "showValues", value.asInstanceOf[js.Any])
    
    inline def setShowValuesUndefined: Self = StObject.set(x, "showValues", js.undefined)
    
    inline def setShowVariables(value: Boolean): Self = StObject.set(x, "showVariables", value.asInstanceOf[js.Any])
    
    inline def setShowVariablesUndefined: Self = StObject.set(x, "showVariables", js.undefined)
    
    inline def setShowWords(value: Boolean): Self = StObject.set(x, "showWords", value.asInstanceOf[js.Any])
    
    inline def setShowWordsUndefined: Self = StObject.set(x, "showWords", js.undefined)
    
    inline def setSnippetsPreventQuickSuggestions(value: Boolean): Self = StObject.set(x, "snippetsPreventQuickSuggestions", value.asInstanceOf[js.Any])
    
    inline def setSnippetsPreventQuickSuggestionsUndefined: Self = StObject.set(x, "snippetsPreventQuickSuggestions", js.undefined)
  }
}
