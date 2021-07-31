package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.Visible
import typings.monacoEditor.monacoEditorStrings.insert
import typings.monacoEditor.monacoEditorStrings.replace
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
    * Favours words that appear close to the cursor.
    */
  var localityBonus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Max suggestions to show in suggestions. Defaults to 12.
    */
  var maxVisibleSuggestions: js.UndefOr[Double] = js.undefined
  
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
  
  /**
    * Status bar related settings.
    */
  var statusBar: js.UndefOr[Visible] = js.undefined
}
object ISuggestOptions {
  
  @scala.inline
  def apply(): ISuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISuggestOptions]
  }
  
  @scala.inline
  implicit class ISuggestOptionsMutableBuilder[Self <: ISuggestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterGraceful(value: Boolean): Self = StObject.set(x, "filterGraceful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterGracefulUndefined: Self = StObject.set(x, "filterGraceful", js.undefined)
    
    @scala.inline
    def setInsertMode(value: insert | replace): Self = StObject.set(x, "insertMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertModeUndefined: Self = StObject.set(x, "insertMode", js.undefined)
    
    @scala.inline
    def setLocalityBonus(value: Boolean): Self = StObject.set(x, "localityBonus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityBonusUndefined: Self = StObject.set(x, "localityBonus", js.undefined)
    
    @scala.inline
    def setMaxVisibleSuggestions(value: Double): Self = StObject.set(x, "maxVisibleSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVisibleSuggestionsUndefined: Self = StObject.set(x, "maxVisibleSuggestions", js.undefined)
    
    @scala.inline
    def setShareSuggestSelections(value: Boolean): Self = StObject.set(x, "shareSuggestSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareSuggestSelectionsUndefined: Self = StObject.set(x, "shareSuggestSelections", js.undefined)
    
    @scala.inline
    def setShowClasses(value: Boolean): Self = StObject.set(x, "showClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClassesUndefined: Self = StObject.set(x, "showClasses", js.undefined)
    
    @scala.inline
    def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColorsUndefined: Self = StObject.set(x, "showColors", js.undefined)
    
    @scala.inline
    def setShowConstants(value: Boolean): Self = StObject.set(x, "showConstants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConstantsUndefined: Self = StObject.set(x, "showConstants", js.undefined)
    
    @scala.inline
    def setShowConstructors(value: Boolean): Self = StObject.set(x, "showConstructors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConstructorsUndefined: Self = StObject.set(x, "showConstructors", js.undefined)
    
    @scala.inline
    def setShowEnumMembers(value: Boolean): Self = StObject.set(x, "showEnumMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEnumMembersUndefined: Self = StObject.set(x, "showEnumMembers", js.undefined)
    
    @scala.inline
    def setShowEnums(value: Boolean): Self = StObject.set(x, "showEnums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEnumsUndefined: Self = StObject.set(x, "showEnums", js.undefined)
    
    @scala.inline
    def setShowEvents(value: Boolean): Self = StObject.set(x, "showEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEventsUndefined: Self = StObject.set(x, "showEvents", js.undefined)
    
    @scala.inline
    def setShowFields(value: Boolean): Self = StObject.set(x, "showFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFieldsUndefined: Self = StObject.set(x, "showFields", js.undefined)
    
    @scala.inline
    def setShowFiles(value: Boolean): Self = StObject.set(x, "showFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFilesUndefined: Self = StObject.set(x, "showFiles", js.undefined)
    
    @scala.inline
    def setShowFolders(value: Boolean): Self = StObject.set(x, "showFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFoldersUndefined: Self = StObject.set(x, "showFolders", js.undefined)
    
    @scala.inline
    def setShowFunctions(value: Boolean): Self = StObject.set(x, "showFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFunctionsUndefined: Self = StObject.set(x, "showFunctions", js.undefined)
    
    @scala.inline
    def setShowIcons(value: Boolean): Self = StObject.set(x, "showIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIconsUndefined: Self = StObject.set(x, "showIcons", js.undefined)
    
    @scala.inline
    def setShowInterfaces(value: Boolean): Self = StObject.set(x, "showInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInterfacesUndefined: Self = StObject.set(x, "showInterfaces", js.undefined)
    
    @scala.inline
    def setShowIssues(value: Boolean): Self = StObject.set(x, "showIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIssuesUndefined: Self = StObject.set(x, "showIssues", js.undefined)
    
    @scala.inline
    def setShowKeywords(value: Boolean): Self = StObject.set(x, "showKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowKeywordsUndefined: Self = StObject.set(x, "showKeywords", js.undefined)
    
    @scala.inline
    def setShowMethods(value: Boolean): Self = StObject.set(x, "showMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMethodsUndefined: Self = StObject.set(x, "showMethods", js.undefined)
    
    @scala.inline
    def setShowModules(value: Boolean): Self = StObject.set(x, "showModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowModulesUndefined: Self = StObject.set(x, "showModules", js.undefined)
    
    @scala.inline
    def setShowOperators(value: Boolean): Self = StObject.set(x, "showOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOperatorsUndefined: Self = StObject.set(x, "showOperators", js.undefined)
    
    @scala.inline
    def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
    
    @scala.inline
    def setShowReferences(value: Boolean): Self = StObject.set(x, "showReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowReferencesUndefined: Self = StObject.set(x, "showReferences", js.undefined)
    
    @scala.inline
    def setShowSnippets(value: Boolean): Self = StObject.set(x, "showSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSnippetsUndefined: Self = StObject.set(x, "showSnippets", js.undefined)
    
    @scala.inline
    def setShowStructs(value: Boolean): Self = StObject.set(x, "showStructs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStructsUndefined: Self = StObject.set(x, "showStructs", js.undefined)
    
    @scala.inline
    def setShowTypeParameters(value: Boolean): Self = StObject.set(x, "showTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTypeParametersUndefined: Self = StObject.set(x, "showTypeParameters", js.undefined)
    
    @scala.inline
    def setShowUnits(value: Boolean): Self = StObject.set(x, "showUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUnitsUndefined: Self = StObject.set(x, "showUnits", js.undefined)
    
    @scala.inline
    def setShowUsers(value: Boolean): Self = StObject.set(x, "showUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUsersUndefined: Self = StObject.set(x, "showUsers", js.undefined)
    
    @scala.inline
    def setShowValues(value: Boolean): Self = StObject.set(x, "showValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValuesUndefined: Self = StObject.set(x, "showValues", js.undefined)
    
    @scala.inline
    def setShowVariables(value: Boolean): Self = StObject.set(x, "showVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowVariablesUndefined: Self = StObject.set(x, "showVariables", js.undefined)
    
    @scala.inline
    def setShowWords(value: Boolean): Self = StObject.set(x, "showWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWordsUndefined: Self = StObject.set(x, "showWords", js.undefined)
    
    @scala.inline
    def setSnippetsPreventQuickSuggestions(value: Boolean): Self = StObject.set(x, "snippetsPreventQuickSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetsPreventQuickSuggestionsUndefined: Self = StObject.set(x, "snippetsPreventQuickSuggestions", js.undefined)
    
    @scala.inline
    def setStatusBar(value: Visible): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
  }
}
