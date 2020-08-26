package typings.monacoEditor.mod.languages.json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModeConfiguration extends js.Object {
  /**
    * Defines whether the built-in color provider is enabled.
    */
  val colors: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in completionItemProvider is enabled.
    */
  val completionItems: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in diagnostic provider is enabled.
    */
  val diagnostics: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in documentFormattingEdit provider is enabled.
    */
  val documentFormattingEdits: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in documentRangeFormattingEdit provider is enabled.
    */
  val documentRangeFormattingEdits: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in documentSymbolProvider is enabled.
    */
  val documentSymbols: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in foldingRange provider is enabled.
    */
  val foldingRanges: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in hoverProvider is enabled.
    */
  val hovers: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in selection range provider is enabled.
    */
  val selectionRanges: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in tokens provider is enabled.
    */
  val tokens: js.UndefOr[Boolean] = js.native
}

object ModeConfiguration {
  @scala.inline
  def apply(): ModeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeConfiguration]
  }
  @scala.inline
  implicit class ModeConfigurationOps[Self <: ModeConfiguration] (val x: Self) extends AnyVal {
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
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setCompletionItems(value: Boolean): Self = this.set("completionItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionItems: Self = this.set("completionItems", js.undefined)
    @scala.inline
    def setDiagnostics(value: Boolean): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    @scala.inline
    def setDocumentFormattingEdits(value: Boolean): Self = this.set("documentFormattingEdits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentFormattingEdits: Self = this.set("documentFormattingEdits", js.undefined)
    @scala.inline
    def setDocumentRangeFormattingEdits(value: Boolean): Self = this.set("documentRangeFormattingEdits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentRangeFormattingEdits: Self = this.set("documentRangeFormattingEdits", js.undefined)
    @scala.inline
    def setDocumentSymbols(value: Boolean): Self = this.set("documentSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentSymbols: Self = this.set("documentSymbols", js.undefined)
    @scala.inline
    def setFoldingRanges(value: Boolean): Self = this.set("foldingRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoldingRanges: Self = this.set("foldingRanges", js.undefined)
    @scala.inline
    def setHovers(value: Boolean): Self = this.set("hovers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHovers: Self = this.set("hovers", js.undefined)
    @scala.inline
    def setSelectionRanges(value: Boolean): Self = this.set("selectionRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionRanges: Self = this.set("selectionRanges", js.undefined)
    @scala.inline
    def setTokens(value: Boolean): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
  
}

