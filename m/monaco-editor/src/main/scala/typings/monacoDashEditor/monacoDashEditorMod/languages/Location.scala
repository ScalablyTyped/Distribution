package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IRange
import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * The document range of this locations.
    */
  var range: IRange
  /**
    * The resource identifier of this location.
    */
  var uri: Uri
}

object Location {
  @scala.inline
  def apply(range: IRange, uri: Uri): Location = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

