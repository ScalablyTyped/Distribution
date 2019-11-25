package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IRange
import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationLink extends js.Object {
  /**
    * A range to select where this link originates from.
    */
  var originSelectionRange: js.UndefOr[IRange] = js.undefined
  /**
    * The full range this link points to.
    */
  var range: IRange
  /**
    * A range to select this link points to. Must be contained
    * in `LocationLink.range`.
    */
  var targetSelectionRange: js.UndefOr[IRange] = js.undefined
  /**
    * The target uri this link points to.
    */
  var uri: Uri
}

object LocationLink {
  @scala.inline
  def apply(range: IRange, uri: Uri, originSelectionRange: IRange = null, targetSelectionRange: IRange = null): LocationLink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (originSelectionRange != null) __obj.updateDynamic("originSelectionRange")(originSelectionRange.asInstanceOf[js.Any])
    if (targetSelectionRange != null) __obj.updateDynamic("targetSelectionRange")(targetSelectionRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLink]
  }
}

