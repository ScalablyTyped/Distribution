package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorStrings.`inline`
import typings.monacoDashEditor.monacoDashEditorStrings.bottom
import typings.monacoDashEditor.monacoDashEditorStrings.none
import typings.monacoDashEditor.monacoDashEditorStrings.top
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalSuggestOptions extends js.Object {
  val filterGraceful: Boolean
  val filteredTypes: Record[String, Boolean]
  val localityBonus: Boolean
  val maxVisibleSuggestions: Double
  val shareSuggestSelections: Boolean
  val showIcons: Boolean
  val snippets: top | bottom | `inline` | none
  val snippetsPreventQuickSuggestions: Boolean
}

object InternalSuggestOptions {
  @scala.inline
  def apply(
    filterGraceful: Boolean,
    filteredTypes: Record[String, Boolean],
    localityBonus: Boolean,
    maxVisibleSuggestions: Double,
    shareSuggestSelections: Boolean,
    showIcons: Boolean,
    snippets: top | bottom | `inline` | none,
    snippetsPreventQuickSuggestions: Boolean
  ): InternalSuggestOptions = {
    val __obj = js.Dynamic.literal(filterGraceful = filterGraceful, filteredTypes = filteredTypes, localityBonus = localityBonus, maxVisibleSuggestions = maxVisibleSuggestions, shareSuggestSelections = shareSuggestSelections, showIcons = showIcons, snippets = snippets.asInstanceOf[js.Any], snippetsPreventQuickSuggestions = snippetsPreventQuickSuggestions)
  
    __obj.asInstanceOf[InternalSuggestOptions]
  }
}

