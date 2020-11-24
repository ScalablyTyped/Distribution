package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.Visible
import typings.monacoEditor.monacoEditorStrings.insert
import typings.monacoEditor.monacoEditorStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.ISuggestOptions>> */
@js.native
trait InternalSuggestOptions extends js.Object {
  
  val filterGraceful: Boolean = js.native
  
  val insertMode: insert | replace = js.native
  
  val localityBonus: Boolean = js.native
  
  val maxVisibleSuggestions: Double = js.native
  
  val shareSuggestSelections: Boolean = js.native
  
  val showClasses: Boolean = js.native
  
  val showColors: Boolean = js.native
  
  val showConstants: Boolean = js.native
  
  val showConstructors: Boolean = js.native
  
  val showEnumMembers: Boolean = js.native
  
  val showEnums: Boolean = js.native
  
  val showEvents: Boolean = js.native
  
  val showFields: Boolean = js.native
  
  val showFiles: Boolean = js.native
  
  val showFolders: Boolean = js.native
  
  val showFunctions: Boolean = js.native
  
  val showIcons: Boolean = js.native
  
  val showInterfaces: Boolean = js.native
  
  val showIssues: Boolean = js.native
  
  val showKeywords: Boolean = js.native
  
  val showMethods: Boolean = js.native
  
  val showModules: Boolean = js.native
  
  val showOperators: Boolean = js.native
  
  val showProperties: Boolean = js.native
  
  val showReferences: Boolean = js.native
  
  val showSnippets: Boolean = js.native
  
  val showStructs: Boolean = js.native
  
  val showTypeParameters: Boolean = js.native
  
  val showUnits: Boolean = js.native
  
  val showUsers: Boolean = js.native
  
  val showValues: Boolean = js.native
  
  val showVariables: Boolean = js.native
  
  val showWords: Boolean = js.native
  
  val snippetsPreventQuickSuggestions: Boolean = js.native
  
  val statusBar: Visible = js.native
}
object InternalSuggestOptions {
  
  @scala.inline
  def apply(
    filterGraceful: Boolean,
    insertMode: insert | replace,
    localityBonus: Boolean,
    maxVisibleSuggestions: Double,
    shareSuggestSelections: Boolean,
    showClasses: Boolean,
    showColors: Boolean,
    showConstants: Boolean,
    showConstructors: Boolean,
    showEnumMembers: Boolean,
    showEnums: Boolean,
    showEvents: Boolean,
    showFields: Boolean,
    showFiles: Boolean,
    showFolders: Boolean,
    showFunctions: Boolean,
    showIcons: Boolean,
    showInterfaces: Boolean,
    showIssues: Boolean,
    showKeywords: Boolean,
    showMethods: Boolean,
    showModules: Boolean,
    showOperators: Boolean,
    showProperties: Boolean,
    showReferences: Boolean,
    showSnippets: Boolean,
    showStructs: Boolean,
    showTypeParameters: Boolean,
    showUnits: Boolean,
    showUsers: Boolean,
    showValues: Boolean,
    showVariables: Boolean,
    showWords: Boolean,
    snippetsPreventQuickSuggestions: Boolean,
    statusBar: Visible
  ): InternalSuggestOptions = {
    val __obj = js.Dynamic.literal(filterGraceful = filterGraceful.asInstanceOf[js.Any], insertMode = insertMode.asInstanceOf[js.Any], localityBonus = localityBonus.asInstanceOf[js.Any], maxVisibleSuggestions = maxVisibleSuggestions.asInstanceOf[js.Any], shareSuggestSelections = shareSuggestSelections.asInstanceOf[js.Any], showClasses = showClasses.asInstanceOf[js.Any], showColors = showColors.asInstanceOf[js.Any], showConstants = showConstants.asInstanceOf[js.Any], showConstructors = showConstructors.asInstanceOf[js.Any], showEnumMembers = showEnumMembers.asInstanceOf[js.Any], showEnums = showEnums.asInstanceOf[js.Any], showEvents = showEvents.asInstanceOf[js.Any], showFields = showFields.asInstanceOf[js.Any], showFiles = showFiles.asInstanceOf[js.Any], showFolders = showFolders.asInstanceOf[js.Any], showFunctions = showFunctions.asInstanceOf[js.Any], showIcons = showIcons.asInstanceOf[js.Any], showInterfaces = showInterfaces.asInstanceOf[js.Any], showIssues = showIssues.asInstanceOf[js.Any], showKeywords = showKeywords.asInstanceOf[js.Any], showMethods = showMethods.asInstanceOf[js.Any], showModules = showModules.asInstanceOf[js.Any], showOperators = showOperators.asInstanceOf[js.Any], showProperties = showProperties.asInstanceOf[js.Any], showReferences = showReferences.asInstanceOf[js.Any], showSnippets = showSnippets.asInstanceOf[js.Any], showStructs = showStructs.asInstanceOf[js.Any], showTypeParameters = showTypeParameters.asInstanceOf[js.Any], showUnits = showUnits.asInstanceOf[js.Any], showUsers = showUsers.asInstanceOf[js.Any], showValues = showValues.asInstanceOf[js.Any], showVariables = showVariables.asInstanceOf[js.Any], showWords = showWords.asInstanceOf[js.Any], snippetsPreventQuickSuggestions = snippetsPreventQuickSuggestions.asInstanceOf[js.Any], statusBar = statusBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalSuggestOptions]
  }
  
  @scala.inline
  implicit class InternalSuggestOptionsOps[Self <: InternalSuggestOptions] (val x: Self) extends AnyVal {
    
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
    def setInsertMode(value: insert | replace): Self = this.set("insertMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityBonus(value: Boolean): Self = this.set("localityBonus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVisibleSuggestions(value: Double): Self = this.set("maxVisibleSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareSuggestSelections(value: Boolean): Self = this.set("shareSuggestSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClasses(value: Boolean): Self = this.set("showClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColors(value: Boolean): Self = this.set("showColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConstants(value: Boolean): Self = this.set("showConstants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConstructors(value: Boolean): Self = this.set("showConstructors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEnumMembers(value: Boolean): Self = this.set("showEnumMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEnums(value: Boolean): Self = this.set("showEnums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEvents(value: Boolean): Self = this.set("showEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFields(value: Boolean): Self = this.set("showFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFiles(value: Boolean): Self = this.set("showFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFolders(value: Boolean): Self = this.set("showFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFunctions(value: Boolean): Self = this.set("showFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIcons(value: Boolean): Self = this.set("showIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInterfaces(value: Boolean): Self = this.set("showInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIssues(value: Boolean): Self = this.set("showIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowKeywords(value: Boolean): Self = this.set("showKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMethods(value: Boolean): Self = this.set("showMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowModules(value: Boolean): Self = this.set("showModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOperators(value: Boolean): Self = this.set("showOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowProperties(value: Boolean): Self = this.set("showProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowReferences(value: Boolean): Self = this.set("showReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSnippets(value: Boolean): Self = this.set("showSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStructs(value: Boolean): Self = this.set("showStructs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTypeParameters(value: Boolean): Self = this.set("showTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUnits(value: Boolean): Self = this.set("showUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUsers(value: Boolean): Self = this.set("showUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValues(value: Boolean): Self = this.set("showValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowVariables(value: Boolean): Self = this.set("showVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWords(value: Boolean): Self = this.set("showWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetsPreventQuickSuggestions(value: Boolean): Self = this.set("snippetsPreventQuickSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBar(value: Visible): Self = this.set("statusBar", value.asInstanceOf[js.Any])
  }
}
