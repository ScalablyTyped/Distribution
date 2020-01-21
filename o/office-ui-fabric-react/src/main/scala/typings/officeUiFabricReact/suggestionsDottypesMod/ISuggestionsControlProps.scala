package typings.officeUiFabricReact.suggestionsDottypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsControlProps[T] extends ISuggestionsCoreProps[T] {
  /**
    * The CSS classname of the suggestions list.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The footer items props
    */
  var footerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
  /**
    * The header items props
    */
  var headerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
  /**
    * Whether or not the first selectable item in the suggestions list should be selected
    */
  var shouldSelectFirstItem: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * An ARIA label for the container that is the parent of the suggestions footer items.
    */
  var suggestionsFooterContainerAriaLabel: js.UndefOr[String] = js.native
  /**
    * An ARIA label for the container that is the parent of the suggestions header items.
    */
  var suggestionsHeaderContainerAriaLabel: js.UndefOr[String] = js.native
  /**
    * Completes the suggestion
    */
  def completeSuggestion(): Unit = js.native
}

