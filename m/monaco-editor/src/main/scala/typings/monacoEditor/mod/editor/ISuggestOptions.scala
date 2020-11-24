package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.Visible
import typings.monacoEditor.monacoEditorStrings.insert
import typings.monacoEditor.monacoEditorStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuggestOptions extends js.Object {
  
  /**
    * Enable graceful matching. Defaults to true.
    */
  var filterGraceful: js.UndefOr[Boolean] = js.native
  
  /**
    * Overwrite word ends on accept. Default to false.
    */
  var insertMode: js.UndefOr[insert | replace] = js.native
  
  /**
    * Favours words that appear close to the cursor.
    */
  var localityBonus: js.UndefOr[Boolean] = js.native
  
  /**
    * Max suggestions to show in suggestions. Defaults to 12.
    */
  var maxVisibleSuggestions: js.UndefOr[Double] = js.native
  
  /**
    * Enable using global storage for remembering suggestions.
    */
  var shareSuggestSelections: js.UndefOr[Boolean] = js.native
  
  /**
    * Show class-suggestions.
    */
  var showClasses: js.UndefOr[Boolean] = js.native
  
  /**
    * Show color-suggestions.
    */
  var showColors: js.UndefOr[Boolean] = js.native
  
  /**
    * Show constant-suggestions.
    */
  var showConstants: js.UndefOr[Boolean] = js.native
  
  /**
    * Show constructor-suggestions.
    */
  var showConstructors: js.UndefOr[Boolean] = js.native
  
  /**
    * Show enumMember-suggestions.
    */
  var showEnumMembers: js.UndefOr[Boolean] = js.native
  
  /**
    * Show enum-suggestions.
    */
  var showEnums: js.UndefOr[Boolean] = js.native
  
  /**
    * Show event-suggestions.
    */
  var showEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Show field-suggestions.
    */
  var showFields: js.UndefOr[Boolean] = js.native
  
  /**
    * Show file-suggestions.
    */
  var showFiles: js.UndefOr[Boolean] = js.native
  
  /**
    * Show folder-suggestions.
    */
  var showFolders: js.UndefOr[Boolean] = js.native
  
  /**
    * Show function-suggestions.
    */
  var showFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable icons in suggestions. Defaults to true.
    */
  var showIcons: js.UndefOr[Boolean] = js.native
  
  /**
    * Show interface-suggestions.
    */
  var showInterfaces: js.UndefOr[Boolean] = js.native
  
  /**
    * Show issue-suggestions.
    */
  var showIssues: js.UndefOr[Boolean] = js.native
  
  /**
    * Show keyword-suggestions.
    */
  var showKeywords: js.UndefOr[Boolean] = js.native
  
  /**
    * Show method-suggestions.
    */
  var showMethods: js.UndefOr[Boolean] = js.native
  
  /**
    * Show module-suggestions.
    */
  var showModules: js.UndefOr[Boolean] = js.native
  
  /**
    * Show operator-suggestions.
    */
  var showOperators: js.UndefOr[Boolean] = js.native
  
  /**
    * Show property-suggestions.
    */
  var showProperties: js.UndefOr[Boolean] = js.native
  
  /**
    * Show reference-suggestions.
    */
  var showReferences: js.UndefOr[Boolean] = js.native
  
  /**
    * Show snippet-suggestions.
    */
  var showSnippets: js.UndefOr[Boolean] = js.native
  
  /**
    * Show struct-suggestions.
    */
  var showStructs: js.UndefOr[Boolean] = js.native
  
  /**
    * Show typeParameter-suggestions.
    */
  var showTypeParameters: js.UndefOr[Boolean] = js.native
  
  /**
    * Show unit-suggestions.
    */
  var showUnits: js.UndefOr[Boolean] = js.native
  
  /**
    * Show user-suggestions.
    */
  var showUsers: js.UndefOr[Boolean] = js.native
  
  /**
    * Show value-suggestions.
    */
  var showValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Show variable-suggestions.
    */
  var showVariables: js.UndefOr[Boolean] = js.native
  
  /**
    * Show text-suggestions.
    */
  var showWords: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent quick suggestions when a snippet is active. Defaults to true.
    */
  var snippetsPreventQuickSuggestions: js.UndefOr[Boolean] = js.native
  
  /**
    * Status bar related settings.
    */
  var statusBar: js.UndefOr[Visible] = js.native
}
object ISuggestOptions {
  
  @scala.inline
  def apply(): ISuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISuggestOptions]
  }
  
  @scala.inline
  implicit class ISuggestOptionsOps[Self <: ISuggestOptions] (val x: Self) extends AnyVal {
    
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
    def setFilterGraceful(value: Boolean): Self = this.set("filterGraceful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterGraceful: Self = this.set("filterGraceful", js.undefined)
    
    @scala.inline
    def setInsertMode(value: insert | replace): Self = this.set("insertMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertMode: Self = this.set("insertMode", js.undefined)
    
    @scala.inline
    def setLocalityBonus(value: Boolean): Self = this.set("localityBonus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalityBonus: Self = this.set("localityBonus", js.undefined)
    
    @scala.inline
    def setMaxVisibleSuggestions(value: Double): Self = this.set("maxVisibleSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVisibleSuggestions: Self = this.set("maxVisibleSuggestions", js.undefined)
    
    @scala.inline
    def setShareSuggestSelections(value: Boolean): Self = this.set("shareSuggestSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareSuggestSelections: Self = this.set("shareSuggestSelections", js.undefined)
    
    @scala.inline
    def setShowClasses(value: Boolean): Self = this.set("showClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClasses: Self = this.set("showClasses", js.undefined)
    
    @scala.inline
    def setShowColors(value: Boolean): Self = this.set("showColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColors: Self = this.set("showColors", js.undefined)
    
    @scala.inline
    def setShowConstants(value: Boolean): Self = this.set("showConstants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowConstants: Self = this.set("showConstants", js.undefined)
    
    @scala.inline
    def setShowConstructors(value: Boolean): Self = this.set("showConstructors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowConstructors: Self = this.set("showConstructors", js.undefined)
    
    @scala.inline
    def setShowEnumMembers(value: Boolean): Self = this.set("showEnumMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEnumMembers: Self = this.set("showEnumMembers", js.undefined)
    
    @scala.inline
    def setShowEnums(value: Boolean): Self = this.set("showEnums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEnums: Self = this.set("showEnums", js.undefined)
    
    @scala.inline
    def setShowEvents(value: Boolean): Self = this.set("showEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEvents: Self = this.set("showEvents", js.undefined)
    
    @scala.inline
    def setShowFields(value: Boolean): Self = this.set("showFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFields: Self = this.set("showFields", js.undefined)
    
    @scala.inline
    def setShowFiles(value: Boolean): Self = this.set("showFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFiles: Self = this.set("showFiles", js.undefined)
    
    @scala.inline
    def setShowFolders(value: Boolean): Self = this.set("showFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFolders: Self = this.set("showFolders", js.undefined)
    
    @scala.inline
    def setShowFunctions(value: Boolean): Self = this.set("showFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFunctions: Self = this.set("showFunctions", js.undefined)
    
    @scala.inline
    def setShowIcons(value: Boolean): Self = this.set("showIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcons: Self = this.set("showIcons", js.undefined)
    
    @scala.inline
    def setShowInterfaces(value: Boolean): Self = this.set("showInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInterfaces: Self = this.set("showInterfaces", js.undefined)
    
    @scala.inline
    def setShowIssues(value: Boolean): Self = this.set("showIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIssues: Self = this.set("showIssues", js.undefined)
    
    @scala.inline
    def setShowKeywords(value: Boolean): Self = this.set("showKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowKeywords: Self = this.set("showKeywords", js.undefined)
    
    @scala.inline
    def setShowMethods(value: Boolean): Self = this.set("showMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMethods: Self = this.set("showMethods", js.undefined)
    
    @scala.inline
    def setShowModules(value: Boolean): Self = this.set("showModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowModules: Self = this.set("showModules", js.undefined)
    
    @scala.inline
    def setShowOperators(value: Boolean): Self = this.set("showOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOperators: Self = this.set("showOperators", js.undefined)
    
    @scala.inline
    def setShowProperties(value: Boolean): Self = this.set("showProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowProperties: Self = this.set("showProperties", js.undefined)
    
    @scala.inline
    def setShowReferences(value: Boolean): Self = this.set("showReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowReferences: Self = this.set("showReferences", js.undefined)
    
    @scala.inline
    def setShowSnippets(value: Boolean): Self = this.set("showSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSnippets: Self = this.set("showSnippets", js.undefined)
    
    @scala.inline
    def setShowStructs(value: Boolean): Self = this.set("showStructs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStructs: Self = this.set("showStructs", js.undefined)
    
    @scala.inline
    def setShowTypeParameters(value: Boolean): Self = this.set("showTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTypeParameters: Self = this.set("showTypeParameters", js.undefined)
    
    @scala.inline
    def setShowUnits(value: Boolean): Self = this.set("showUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUnits: Self = this.set("showUnits", js.undefined)
    
    @scala.inline
    def setShowUsers(value: Boolean): Self = this.set("showUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUsers: Self = this.set("showUsers", js.undefined)
    
    @scala.inline
    def setShowValues(value: Boolean): Self = this.set("showValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowValues: Self = this.set("showValues", js.undefined)
    
    @scala.inline
    def setShowVariables(value: Boolean): Self = this.set("showVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowVariables: Self = this.set("showVariables", js.undefined)
    
    @scala.inline
    def setShowWords(value: Boolean): Self = this.set("showWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWords: Self = this.set("showWords", js.undefined)
    
    @scala.inline
    def setSnippetsPreventQuickSuggestions(value: Boolean): Self = this.set("snippetsPreventQuickSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippetsPreventQuickSuggestions: Self = this.set("snippetsPreventQuickSuggestions", js.undefined)
    
    @scala.inline
    def setStatusBar(value: Visible): Self = this.set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBar: Self = this.set("statusBar", js.undefined)
  }
}
