package typings.monacoEditor.mod.languages.json

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
    * Defines whether the built-in diagnostic provider is enabled.
    */
  val diagnostics: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in documentFormattingEdit provider is enabled.
    */
  val documentFormattingEdits: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether the built-in documentRangeFormattingEdit provider is enabled.
    */
  val documentRangeFormattingEdits: js.UndefOr[Boolean] = js.undefined
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
    * Defines whether the built-in tokens provider is enabled.
    */
  val tokens: js.UndefOr[Boolean] = js.undefined
}

object ModeConfiguration {
  @scala.inline
  def apply(
    colors: js.UndefOr[Boolean] = js.undefined,
    completionItems: js.UndefOr[Boolean] = js.undefined,
    diagnostics: js.UndefOr[Boolean] = js.undefined,
    documentFormattingEdits: js.UndefOr[Boolean] = js.undefined,
    documentRangeFormattingEdits: js.UndefOr[Boolean] = js.undefined,
    documentSymbols: js.UndefOr[Boolean] = js.undefined,
    foldingRanges: js.UndefOr[Boolean] = js.undefined,
    hovers: js.UndefOr[Boolean] = js.undefined,
    tokens: js.UndefOr[Boolean] = js.undefined
  ): ModeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(completionItems)) __obj.updateDynamic("completionItems")(completionItems.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnostics)) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (!js.isUndefined(documentFormattingEdits)) __obj.updateDynamic("documentFormattingEdits")(documentFormattingEdits.asInstanceOf[js.Any])
    if (!js.isUndefined(documentRangeFormattingEdits)) __obj.updateDynamic("documentRangeFormattingEdits")(documentRangeFormattingEdits.asInstanceOf[js.Any])
    if (!js.isUndefined(documentSymbols)) __obj.updateDynamic("documentSymbols")(documentSymbols.asInstanceOf[js.Any])
    if (!js.isUndefined(foldingRanges)) __obj.updateDynamic("foldingRanges")(foldingRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(hovers)) __obj.updateDynamic("hovers")(hovers.asInstanceOf[js.Any])
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeConfiguration]
  }
}

