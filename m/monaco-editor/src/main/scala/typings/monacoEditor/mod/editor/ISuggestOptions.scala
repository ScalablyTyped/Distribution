package typings.monacoEditor.mod.editor

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuggestOptions extends js.Object {
  /**
    * Enable graceful matching. Defaults to true.
    */
  var filterGraceful: js.UndefOr[Boolean] = js.undefined
  /**
    * Names of suggestion types to filter.
    */
  var filteredTypes: js.UndefOr[Record[String, Boolean]] = js.undefined
  /**
    * Favours words that appear close to the cursor.
    */
  var localityBonus: js.UndefOr[Boolean] = js.undefined
  /**
    * Max suggestions to show in suggestions. Defaults to 12.
    */
  var maxVisibleSuggestions: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable using global storage for remembering suggestions.
    */
  var shareSuggestSelections: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable icons in suggestions. Defaults to true.
    */
  var showIcons: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent quick suggestions when a snippet is active. Defaults to true.
    */
  var snippetsPreventQuickSuggestions: js.UndefOr[Boolean] = js.undefined
}

object ISuggestOptions {
  @scala.inline
  def apply(
    filterGraceful: js.UndefOr[Boolean] = js.undefined,
    filteredTypes: Record[String, Boolean] = null,
    localityBonus: js.UndefOr[Boolean] = js.undefined,
    maxVisibleSuggestions: js.UndefOr[Boolean] = js.undefined,
    shareSuggestSelections: js.UndefOr[Boolean] = js.undefined,
    showIcons: js.UndefOr[Boolean] = js.undefined,
    snippetsPreventQuickSuggestions: js.UndefOr[Boolean] = js.undefined
  ): ISuggestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterGraceful)) __obj.updateDynamic("filterGraceful")(filterGraceful.asInstanceOf[js.Any])
    if (filteredTypes != null) __obj.updateDynamic("filteredTypes")(filteredTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(localityBonus)) __obj.updateDynamic("localityBonus")(localityBonus.asInstanceOf[js.Any])
    if (!js.isUndefined(maxVisibleSuggestions)) __obj.updateDynamic("maxVisibleSuggestions")(maxVisibleSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(shareSuggestSelections)) __obj.updateDynamic("shareSuggestSelections")(shareSuggestSelections.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcons)) __obj.updateDynamic("showIcons")(showIcons.asInstanceOf[js.Any])
    if (!js.isUndefined(snippetsPreventQuickSuggestions)) __obj.updateDynamic("snippetsPreventQuickSuggestions")(snippetsPreventQuickSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestOptions]
  }
}

