package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.insert
import typings.monacoEditor.monacoEditorStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.ISuggestOptions>> */
trait InternalSuggestOptions extends js.Object {
  val filterGraceful: Boolean
  val hideStatusBar: Boolean
  val insertHighlight: Boolean
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
  val showValues: Boolean
  val showVariables: Boolean
  val showWords: Boolean
  val snippetsPreventQuickSuggestions: Boolean
}

object InternalSuggestOptions {
  @scala.inline
  def apply(
    filterGraceful: Boolean,
    hideStatusBar: Boolean,
    insertHighlight: Boolean,
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
    showValues: Boolean,
    showVariables: Boolean,
    showWords: Boolean,
    snippetsPreventQuickSuggestions: Boolean
  ): InternalSuggestOptions = {
    val __obj = js.Dynamic.literal(filterGraceful = filterGraceful.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], insertHighlight = insertHighlight.asInstanceOf[js.Any], insertMode = insertMode.asInstanceOf[js.Any], localityBonus = localityBonus.asInstanceOf[js.Any], maxVisibleSuggestions = maxVisibleSuggestions.asInstanceOf[js.Any], shareSuggestSelections = shareSuggestSelections.asInstanceOf[js.Any], showClasses = showClasses.asInstanceOf[js.Any], showColors = showColors.asInstanceOf[js.Any], showConstants = showConstants.asInstanceOf[js.Any], showConstructors = showConstructors.asInstanceOf[js.Any], showEnumMembers = showEnumMembers.asInstanceOf[js.Any], showEnums = showEnums.asInstanceOf[js.Any], showEvents = showEvents.asInstanceOf[js.Any], showFields = showFields.asInstanceOf[js.Any], showFiles = showFiles.asInstanceOf[js.Any], showFolders = showFolders.asInstanceOf[js.Any], showFunctions = showFunctions.asInstanceOf[js.Any], showIcons = showIcons.asInstanceOf[js.Any], showInterfaces = showInterfaces.asInstanceOf[js.Any], showKeywords = showKeywords.asInstanceOf[js.Any], showMethods = showMethods.asInstanceOf[js.Any], showModules = showModules.asInstanceOf[js.Any], showOperators = showOperators.asInstanceOf[js.Any], showProperties = showProperties.asInstanceOf[js.Any], showReferences = showReferences.asInstanceOf[js.Any], showSnippets = showSnippets.asInstanceOf[js.Any], showStructs = showStructs.asInstanceOf[js.Any], showTypeParameters = showTypeParameters.asInstanceOf[js.Any], showUnits = showUnits.asInstanceOf[js.Any], showValues = showValues.asInstanceOf[js.Any], showVariables = showVariables.asInstanceOf[js.Any], showWords = showWords.asInstanceOf[js.Any], snippetsPreventQuickSuggestions = snippetsPreventQuickSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalSuggestOptions]
  }
}

