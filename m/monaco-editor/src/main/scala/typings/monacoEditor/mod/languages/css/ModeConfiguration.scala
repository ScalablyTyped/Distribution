package typings.monacoEditor.mod.languages.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeConfiguration extends js.Object {
  /**
    * Defines whether the built-in color provider is enabled.
    */
  val colors: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in completionItemProvider is enabled.
    */
  val completionItems: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in definitions provider is enabled.
    */
  val definitions: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in diagnostic provider is enabled.
    */
  val diagnostics: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in references provider is enabled.
    */
  val documentHighlights: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in documentSymbolProvider is enabled.
    */
  val documentSymbols: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in foldingRange provider is enabled.
    */
  val foldingRanges: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in hoverProvider is enabled.
    */
  val hovers: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in references provider is enabled.
    */
  val references: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in rename provider is enabled.
    */
  val rename: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in selection range provider is enabled.
    */
  val selectionRanges: js.UndefOr[Boolean] = js.undefined
}

object ModeConfiguration {
  @scala.inline
  def apply(
    colors: js.UndefOr[Boolean] = js.undefined,
    completionItems: js.UndefOr[Boolean] = js.undefined,
    definitions: js.UndefOr[Boolean] = js.undefined,
    diagnostics: js.UndefOr[Boolean] = js.undefined,
    documentHighlights: js.UndefOr[Boolean] = js.undefined,
    documentSymbols: js.UndefOr[Boolean] = js.undefined,
    foldingRanges: js.UndefOr[Boolean] = js.undefined,
    hovers: js.UndefOr[Boolean] = js.undefined,
    references: js.UndefOr[Boolean] = js.undefined,
    rename: js.UndefOr[Boolean] = js.undefined,
    selectionRanges: js.UndefOr[Boolean] = js.undefined
  ): ModeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(completionItems)) __obj.updateDynamic("completionItems")(completionItems.asInstanceOf[js.Any])
    if (!js.isUndefined(definitions)) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnostics)) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (!js.isUndefined(documentHighlights)) __obj.updateDynamic("documentHighlights")(documentHighlights.asInstanceOf[js.Any])
    if (!js.isUndefined(documentSymbols)) __obj.updateDynamic("documentSymbols")(documentSymbols.asInstanceOf[js.Any])
    if (!js.isUndefined(foldingRanges)) __obj.updateDynamic("foldingRanges")(foldingRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(hovers)) __obj.updateDynamic("hovers")(hovers.asInstanceOf[js.Any])
    if (!js.isUndefined(references)) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (!js.isUndefined(rename)) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionRanges)) __obj.updateDynamic("selectionRanges")(selectionRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeConfiguration]
  }
}

