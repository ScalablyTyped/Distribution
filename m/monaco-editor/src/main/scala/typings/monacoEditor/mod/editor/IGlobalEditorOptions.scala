package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobalEditorOptions extends js.Object {
  /**
    * Controls whether `tabSize` and `insertSpaces` will be automatically detected when a file is opened based on the file contents.
    * Defaults to true.
    */
  var detectIndentation: js.UndefOr[Boolean] = js.native
  /**
    * Insert spaces when pressing `Tab`.
    * This setting is overridden based on the file contents when `detectIndentation` is on.
    * Defaults to true.
    */
  var insertSpaces: js.UndefOr[Boolean] = js.native
  /**
    * Special handling for large files to disable certain memory intensive features.
    * Defaults to true.
    */
  var largeFileOptimizations: js.UndefOr[Boolean] = js.native
  /**
    * Lines above this length will not be tokenized for performance reasons.
    * Defaults to 20000.
    */
  var maxTokenizationLineLength: js.UndefOr[Double] = js.native
  /**
    * Keep peek editors open even when double clicking their content or when hitting `Escape`.
    * Defaults to false.
    */
  var stablePeek: js.UndefOr[Boolean] = js.native
  /**
    * The number of spaces a tab is equal to.
    * This setting is overridden based on the file contents when `detectIndentation` is on.
    * Defaults to 4.
    */
  var tabSize: js.UndefOr[Double] = js.native
  /**
    * Remove trailing auto inserted whitespace.
    * Defaults to true.
    */
  var trimAutoWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * Controls whether completions should be computed based on words in the document.
    * Defaults to true.
    */
  var wordBasedSuggestions: js.UndefOr[Boolean] = js.native
}

object IGlobalEditorOptions {
  @scala.inline
  def apply(): IGlobalEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlobalEditorOptions]
  }
  @scala.inline
  implicit class IGlobalEditorOptionsOps[Self <: IGlobalEditorOptions] (val x: Self) extends AnyVal {
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
    def setDetectIndentation(value: Boolean): Self = this.set("detectIndentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectIndentation: Self = this.set("detectIndentation", js.undefined)
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = this.set("insertSpaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertSpaces: Self = this.set("insertSpaces", js.undefined)
    @scala.inline
    def setLargeFileOptimizations(value: Boolean): Self = this.set("largeFileOptimizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeFileOptimizations: Self = this.set("largeFileOptimizations", js.undefined)
    @scala.inline
    def setMaxTokenizationLineLength(value: Double): Self = this.set("maxTokenizationLineLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTokenizationLineLength: Self = this.set("maxTokenizationLineLength", js.undefined)
    @scala.inline
    def setStablePeek(value: Boolean): Self = this.set("stablePeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStablePeek: Self = this.set("stablePeek", js.undefined)
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    @scala.inline
    def setTrimAutoWhitespace(value: Boolean): Self = this.set("trimAutoWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimAutoWhitespace: Self = this.set("trimAutoWhitespace", js.undefined)
    @scala.inline
    def setWordBasedSuggestions(value: Boolean): Self = this.set("wordBasedSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordBasedSuggestions: Self = this.set("wordBasedSuggestions", js.undefined)
  }
  
}

