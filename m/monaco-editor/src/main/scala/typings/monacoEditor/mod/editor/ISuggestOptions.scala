package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.insert
import typings.monacoEditor.monacoEditorStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestOptions extends js.Object {
  /**
    * Enable graceful matching. Defaults to true.
    */
  var filterGraceful: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the visibility of the status bar at the bottom of the suggest widget.
    */
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Show a highlight when suggestion replaces or keep text after the cursor. Defaults to false.
    */
  var insertHighlight: js.UndefOr[Boolean] = js.undefined
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
  @scala.inline
  def apply(
    filterGraceful: js.UndefOr[Boolean] = js.undefined,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    insertHighlight: js.UndefOr[Boolean] = js.undefined,
    insertMode: insert | replace = null,
    localityBonus: js.UndefOr[Boolean] = js.undefined,
    maxVisibleSuggestions: Int | Double = null,
    shareSuggestSelections: js.UndefOr[Boolean] = js.undefined,
    showClasses: js.UndefOr[Boolean] = js.undefined,
    showColors: js.UndefOr[Boolean] = js.undefined,
    showConstants: js.UndefOr[Boolean] = js.undefined,
    showConstructors: js.UndefOr[Boolean] = js.undefined,
    showEnumMembers: js.UndefOr[Boolean] = js.undefined,
    showEnums: js.UndefOr[Boolean] = js.undefined,
    showEvents: js.UndefOr[Boolean] = js.undefined,
    showFields: js.UndefOr[Boolean] = js.undefined,
    showFiles: js.UndefOr[Boolean] = js.undefined,
    showFolders: js.UndefOr[Boolean] = js.undefined,
    showFunctions: js.UndefOr[Boolean] = js.undefined,
    showIcons: js.UndefOr[Boolean] = js.undefined,
    showInterfaces: js.UndefOr[Boolean] = js.undefined,
    showKeywords: js.UndefOr[Boolean] = js.undefined,
    showMethods: js.UndefOr[Boolean] = js.undefined,
    showModules: js.UndefOr[Boolean] = js.undefined,
    showOperators: js.UndefOr[Boolean] = js.undefined,
    showProperties: js.UndefOr[Boolean] = js.undefined,
    showReferences: js.UndefOr[Boolean] = js.undefined,
    showSnippets: js.UndefOr[Boolean] = js.undefined,
    showStructs: js.UndefOr[Boolean] = js.undefined,
    showTypeParameters: js.UndefOr[Boolean] = js.undefined,
    showUnits: js.UndefOr[Boolean] = js.undefined,
    showValues: js.UndefOr[Boolean] = js.undefined,
    showVariables: js.UndefOr[Boolean] = js.undefined,
    showWords: js.UndefOr[Boolean] = js.undefined,
    snippetsPreventQuickSuggestions: js.UndefOr[Boolean] = js.undefined
  ): ISuggestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterGraceful)) __obj.updateDynamic("filterGraceful")(filterGraceful.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar.asInstanceOf[js.Any])
    if (!js.isUndefined(insertHighlight)) __obj.updateDynamic("insertHighlight")(insertHighlight.asInstanceOf[js.Any])
    if (insertMode != null) __obj.updateDynamic("insertMode")(insertMode.asInstanceOf[js.Any])
    if (!js.isUndefined(localityBonus)) __obj.updateDynamic("localityBonus")(localityBonus.asInstanceOf[js.Any])
    if (maxVisibleSuggestions != null) __obj.updateDynamic("maxVisibleSuggestions")(maxVisibleSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(shareSuggestSelections)) __obj.updateDynamic("shareSuggestSelections")(shareSuggestSelections.asInstanceOf[js.Any])
    if (!js.isUndefined(showClasses)) __obj.updateDynamic("showClasses")(showClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(showColors)) __obj.updateDynamic("showColors")(showColors.asInstanceOf[js.Any])
    if (!js.isUndefined(showConstants)) __obj.updateDynamic("showConstants")(showConstants.asInstanceOf[js.Any])
    if (!js.isUndefined(showConstructors)) __obj.updateDynamic("showConstructors")(showConstructors.asInstanceOf[js.Any])
    if (!js.isUndefined(showEnumMembers)) __obj.updateDynamic("showEnumMembers")(showEnumMembers.asInstanceOf[js.Any])
    if (!js.isUndefined(showEnums)) __obj.updateDynamic("showEnums")(showEnums.asInstanceOf[js.Any])
    if (!js.isUndefined(showEvents)) __obj.updateDynamic("showEvents")(showEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(showFields)) __obj.updateDynamic("showFields")(showFields.asInstanceOf[js.Any])
    if (!js.isUndefined(showFiles)) __obj.updateDynamic("showFiles")(showFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(showFolders)) __obj.updateDynamic("showFolders")(showFolders.asInstanceOf[js.Any])
    if (!js.isUndefined(showFunctions)) __obj.updateDynamic("showFunctions")(showFunctions.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcons)) __obj.updateDynamic("showIcons")(showIcons.asInstanceOf[js.Any])
    if (!js.isUndefined(showInterfaces)) __obj.updateDynamic("showInterfaces")(showInterfaces.asInstanceOf[js.Any])
    if (!js.isUndefined(showKeywords)) __obj.updateDynamic("showKeywords")(showKeywords.asInstanceOf[js.Any])
    if (!js.isUndefined(showMethods)) __obj.updateDynamic("showMethods")(showMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(showModules)) __obj.updateDynamic("showModules")(showModules.asInstanceOf[js.Any])
    if (!js.isUndefined(showOperators)) __obj.updateDynamic("showOperators")(showOperators.asInstanceOf[js.Any])
    if (!js.isUndefined(showProperties)) __obj.updateDynamic("showProperties")(showProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(showReferences)) __obj.updateDynamic("showReferences")(showReferences.asInstanceOf[js.Any])
    if (!js.isUndefined(showSnippets)) __obj.updateDynamic("showSnippets")(showSnippets.asInstanceOf[js.Any])
    if (!js.isUndefined(showStructs)) __obj.updateDynamic("showStructs")(showStructs.asInstanceOf[js.Any])
    if (!js.isUndefined(showTypeParameters)) __obj.updateDynamic("showTypeParameters")(showTypeParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnits)) __obj.updateDynamic("showUnits")(showUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(showValues)) __obj.updateDynamic("showValues")(showValues.asInstanceOf[js.Any])
    if (!js.isUndefined(showVariables)) __obj.updateDynamic("showVariables")(showVariables.asInstanceOf[js.Any])
    if (!js.isUndefined(showWords)) __obj.updateDynamic("showWords")(showWords.asInstanceOf[js.Any])
    if (!js.isUndefined(snippetsPreventQuickSuggestions)) __obj.updateDynamic("snippetsPreventQuickSuggestions")(snippetsPreventQuickSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestOptions]
  }
}

