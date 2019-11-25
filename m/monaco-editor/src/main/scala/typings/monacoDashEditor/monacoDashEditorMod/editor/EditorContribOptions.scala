package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.Anon_Comments
import typings.monacoDashEditor.monacoDashEditorStrings.always
import typings.monacoDashEditor.monacoDashEditorStrings.auto
import typings.monacoDashEditor.monacoDashEditorStrings.first
import typings.monacoDashEditor.monacoDashEditorStrings.indentation
import typings.monacoDashEditor.monacoDashEditorStrings.mouseover
import typings.monacoDashEditor.monacoDashEditorStrings.off
import typings.monacoDashEditor.monacoDashEditorStrings.on
import typings.monacoDashEditor.monacoDashEditorStrings.onlySnippets
import typings.monacoDashEditor.monacoDashEditorStrings.recentlyUsed
import typings.monacoDashEditor.monacoDashEditorStrings.recentlyUsedByPrefix
import typings.monacoDashEditor.monacoDashEditorStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorContribOptions extends js.Object {
  val acceptSuggestionOnCommitCharacter: Boolean
  val acceptSuggestionOnEnter: on | smart | off
  val codeActionsOnSave: ICodeActionsOnSaveOptions
  val codeActionsOnSaveTimeout: Double
  val codeLens: Boolean
  val colorDecorators: Boolean
  val contextmenu: Boolean
  val find: InternalEditorFindOptions
  val folding: Boolean
  val foldingStrategy: auto | indentation
  val formatOnPaste: Boolean
  val formatOnType: Boolean
  val gotoLocation: InternalGoToLocationOptions
  val hover: InternalEditorHoverOptions
  val lightbulbEnabled: Boolean
  val links: Boolean
  val matchBrackets: Boolean
  val occurrencesHighlight: Boolean
  val parameterHints: InternalParameterHintOptions
  val quickSuggestions: Boolean | Anon_Comments
  val quickSuggestionsDelay: Double
  val selectionClipboard: Boolean
  val selectionHighlight: Boolean
  val showFoldingControls: always | mouseover
  val suggest: InternalSuggestOptions
  val suggestFontSize: Double
  val suggestLineHeight: Double
  val suggestOnTriggerCharacters: Boolean
  val suggestSelection: first | recentlyUsed | recentlyUsedByPrefix
  val tabCompletion: on | off | onlySnippets
  val wordBasedSuggestions: Boolean
}

object EditorContribOptions {
  @scala.inline
  def apply(
    acceptSuggestionOnCommitCharacter: Boolean,
    acceptSuggestionOnEnter: on | smart | off,
    codeActionsOnSave: ICodeActionsOnSaveOptions,
    codeActionsOnSaveTimeout: Double,
    codeLens: Boolean,
    colorDecorators: Boolean,
    contextmenu: Boolean,
    find: InternalEditorFindOptions,
    folding: Boolean,
    foldingStrategy: auto | indentation,
    formatOnPaste: Boolean,
    formatOnType: Boolean,
    gotoLocation: InternalGoToLocationOptions,
    hover: InternalEditorHoverOptions,
    lightbulbEnabled: Boolean,
    links: Boolean,
    matchBrackets: Boolean,
    occurrencesHighlight: Boolean,
    parameterHints: InternalParameterHintOptions,
    quickSuggestions: Boolean | Anon_Comments,
    quickSuggestionsDelay: Double,
    selectionClipboard: Boolean,
    selectionHighlight: Boolean,
    showFoldingControls: always | mouseover,
    suggest: InternalSuggestOptions,
    suggestFontSize: Double,
    suggestLineHeight: Double,
    suggestOnTriggerCharacters: Boolean,
    suggestSelection: first | recentlyUsed | recentlyUsedByPrefix,
    tabCompletion: on | off | onlySnippets,
    wordBasedSuggestions: Boolean
  ): EditorContribOptions = {
    val __obj = js.Dynamic.literal(acceptSuggestionOnCommitCharacter = acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any], acceptSuggestionOnEnter = acceptSuggestionOnEnter.asInstanceOf[js.Any], codeActionsOnSave = codeActionsOnSave.asInstanceOf[js.Any], codeActionsOnSaveTimeout = codeActionsOnSaveTimeout.asInstanceOf[js.Any], codeLens = codeLens.asInstanceOf[js.Any], colorDecorators = colorDecorators.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], folding = folding.asInstanceOf[js.Any], foldingStrategy = foldingStrategy.asInstanceOf[js.Any], formatOnPaste = formatOnPaste.asInstanceOf[js.Any], formatOnType = formatOnType.asInstanceOf[js.Any], gotoLocation = gotoLocation.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], lightbulbEnabled = lightbulbEnabled.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], occurrencesHighlight = occurrencesHighlight.asInstanceOf[js.Any], parameterHints = parameterHints.asInstanceOf[js.Any], quickSuggestions = quickSuggestions.asInstanceOf[js.Any], quickSuggestionsDelay = quickSuggestionsDelay.asInstanceOf[js.Any], selectionClipboard = selectionClipboard.asInstanceOf[js.Any], selectionHighlight = selectionHighlight.asInstanceOf[js.Any], showFoldingControls = showFoldingControls.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any], suggestFontSize = suggestFontSize.asInstanceOf[js.Any], suggestLineHeight = suggestLineHeight.asInstanceOf[js.Any], suggestOnTriggerCharacters = suggestOnTriggerCharacters.asInstanceOf[js.Any], suggestSelection = suggestSelection.asInstanceOf[js.Any], tabCompletion = tabCompletion.asInstanceOf[js.Any], wordBasedSuggestions = wordBasedSuggestions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorContribOptions]
  }
}

