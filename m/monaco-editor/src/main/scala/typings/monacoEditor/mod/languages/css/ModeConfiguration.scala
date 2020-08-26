package typings.monacoEditor.mod.languages.css

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
    * Defines whether the built-in definitions provider is enabled.
    */
  val definitions: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in diagnostic provider is enabled.
    */
  val diagnostics: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in references provider is enabled.
    */
  val documentHighlights: js.UndefOr[Boolean] = js.native
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
    * Defines whether the built-in references provider is enabled.
    */
  val references: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in rename provider is enabled.
    */
  val rename: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the built-in selection range provider is enabled.
    */
  val selectionRanges: js.UndefOr[Boolean] = js.native
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
    def setDefinitions(value: Boolean): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    @scala.inline
    def setDiagnostics(value: Boolean): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    @scala.inline
    def setDocumentHighlights(value: Boolean): Self = this.set("documentHighlights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentHighlights: Self = this.set("documentHighlights", js.undefined)
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
    def setReferences(value: Boolean): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    @scala.inline
    def setRename(value: Boolean): Self = this.set("rename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    @scala.inline
    def setSelectionRanges(value: Boolean): Self = this.set("selectionRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionRanges: Self = this.set("selectionRanges", js.undefined)
  }
  
}

