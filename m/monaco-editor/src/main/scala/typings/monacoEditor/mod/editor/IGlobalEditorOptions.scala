package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalEditorOptions extends js.Object {
  /**
    * Controls whether `tabSize` and `insertSpaces` will be automatically detected when a file is opened based on the file contents.
    * Defaults to true.
    */
  var detectIndentation: js.UndefOr[Boolean] = js.undefined
  /**
    * Insert spaces when pressing `Tab`.
    * This setting is overridden based on the file contents when `detectIndentation` is on.
    * Defaults to true.
    */
  var insertSpaces: js.UndefOr[Boolean] = js.undefined
  /**
    * Special handling for large files to disable certain memory intensive features.
    * Defaults to true.
    */
  var largeFileOptimizations: js.UndefOr[Boolean] = js.undefined
  /**
    * Lines above this length will not be tokenized for performance reasons.
    * Defaults to 20000.
    */
  var maxTokenizationLineLength: js.UndefOr[Double] = js.undefined
  /**
    * Keep peek editors open even when double clicking their content or when hitting `Escape`.
    * Defaults to false.
    */
  var stablePeek: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of spaces a tab is equal to.
    * This setting is overridden based on the file contents when `detectIndentation` is on.
    * Defaults to 4.
    */
  var tabSize: js.UndefOr[Double] = js.undefined
  /**
    * Remove trailing auto inserted whitespace.
    * Defaults to true.
    */
  var trimAutoWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether completions should be computed based on words in the document.
    * Defaults to true.
    */
  var wordBasedSuggestions: js.UndefOr[Boolean] = js.undefined
}

object IGlobalEditorOptions {
  @scala.inline
  def apply(
    detectIndentation: js.UndefOr[Boolean] = js.undefined,
    insertSpaces: js.UndefOr[Boolean] = js.undefined,
    largeFileOptimizations: js.UndefOr[Boolean] = js.undefined,
    maxTokenizationLineLength: js.UndefOr[Double] = js.undefined,
    stablePeek: js.UndefOr[Boolean] = js.undefined,
    tabSize: js.UndefOr[Double] = js.undefined,
    trimAutoWhitespace: js.UndefOr[Boolean] = js.undefined,
    wordBasedSuggestions: js.UndefOr[Boolean] = js.undefined
  ): IGlobalEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectIndentation)) __obj.updateDynamic("detectIndentation")(detectIndentation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertSpaces)) __obj.updateDynamic("insertSpaces")(insertSpaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(largeFileOptimizations)) __obj.updateDynamic("largeFileOptimizations")(largeFileOptimizations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTokenizationLineLength)) __obj.updateDynamic("maxTokenizationLineLength")(maxTokenizationLineLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stablePeek)) __obj.updateDynamic("stablePeek")(stablePeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trimAutoWhitespace)) __obj.updateDynamic("trimAutoWhitespace")(trimAutoWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wordBasedSuggestions)) __obj.updateDynamic("wordBasedSuggestions")(wordBasedSuggestions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobalEditorOptions]
  }
}

