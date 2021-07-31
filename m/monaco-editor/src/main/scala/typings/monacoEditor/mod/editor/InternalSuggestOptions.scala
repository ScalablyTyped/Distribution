package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.Visible
import typings.monacoEditor.monacoEditorStrings.insert
import typings.monacoEditor.monacoEditorStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.ISuggestOptions>> */
trait InternalSuggestOptions extends StObject {
  
  val filterGraceful: Boolean
  
  val insertMode: insert | replace
  
  val localityBonus: Boolean
  
  val maxVisibleSuggestions: Double
  
  val shareSuggestSelections: Boolean
  
  val showClasses: Boolean
  
  val showColors: Boolean
  
  val showConstants: Boolean
  
  val showConstructors: Boolean
  
  val showEnumMembers: Boolean
  
  val showEnums: Boolean
  
  val showEvents: Boolean
  
  val showFields: Boolean
  
  val showFiles: Boolean
  
  val showFolders: Boolean
  
  val showFunctions: Boolean
  
  val showIcons: Boolean
  
  val showInterfaces: Boolean
  
  val showIssues: Boolean
  
  val showKeywords: Boolean
  
  val showMethods: Boolean
  
  val showModules: Boolean
  
  val showOperators: Boolean
  
  val showProperties: Boolean
  
  val showReferences: Boolean
  
  val showSnippets: Boolean
  
  val showStructs: Boolean
  
  val showTypeParameters: Boolean
  
  val showUnits: Boolean
  
  val showUsers: Boolean
  
  val showValues: Boolean
  
  val showVariables: Boolean
  
  val showWords: Boolean
  
  val snippetsPreventQuickSuggestions: Boolean
  
  val statusBar: Visible
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
  implicit class InternalSuggestOptionsMutableBuilder[Self <: InternalSuggestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterGraceful(value: Boolean): Self = StObject.set(x, "filterGraceful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertMode(value: insert | replace): Self = StObject.set(x, "insertMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityBonus(value: Boolean): Self = StObject.set(x, "localityBonus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVisibleSuggestions(value: Double): Self = StObject.set(x, "maxVisibleSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareSuggestSelections(value: Boolean): Self = StObject.set(x, "shareSuggestSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClasses(value: Boolean): Self = StObject.set(x, "showClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConstants(value: Boolean): Self = StObject.set(x, "showConstants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConstructors(value: Boolean): Self = StObject.set(x, "showConstructors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEnumMembers(value: Boolean): Self = StObject.set(x, "showEnumMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEnums(value: Boolean): Self = StObject.set(x, "showEnums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEvents(value: Boolean): Self = StObject.set(x, "showEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFields(value: Boolean): Self = StObject.set(x, "showFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFiles(value: Boolean): Self = StObject.set(x, "showFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFolders(value: Boolean): Self = StObject.set(x, "showFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFunctions(value: Boolean): Self = StObject.set(x, "showFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIcons(value: Boolean): Self = StObject.set(x, "showIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInterfaces(value: Boolean): Self = StObject.set(x, "showInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIssues(value: Boolean): Self = StObject.set(x, "showIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowKeywords(value: Boolean): Self = StObject.set(x, "showKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMethods(value: Boolean): Self = StObject.set(x, "showMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowModules(value: Boolean): Self = StObject.set(x, "showModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOperators(value: Boolean): Self = StObject.set(x, "showOperators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowReferences(value: Boolean): Self = StObject.set(x, "showReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSnippets(value: Boolean): Self = StObject.set(x, "showSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStructs(value: Boolean): Self = StObject.set(x, "showStructs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTypeParameters(value: Boolean): Self = StObject.set(x, "showTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUnits(value: Boolean): Self = StObject.set(x, "showUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUsers(value: Boolean): Self = StObject.set(x, "showUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValues(value: Boolean): Self = StObject.set(x, "showValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowVariables(value: Boolean): Self = StObject.set(x, "showVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWords(value: Boolean): Self = StObject.set(x, "showWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetsPreventQuickSuggestions(value: Boolean): Self = StObject.set(x, "snippetsPreventQuickSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBar(value: Visible): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
  }
}
