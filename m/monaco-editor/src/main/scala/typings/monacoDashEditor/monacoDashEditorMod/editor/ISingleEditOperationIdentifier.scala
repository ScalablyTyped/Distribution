package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISingleEditOperationIdentifier extends js.Object {
  /**
    * Identifier major
    */
  var major: Double
  /**
    * Identifier minor
    */
  var minor: Double
}

object ISingleEditOperationIdentifier {
  @scala.inline
  def apply(major: Double, minor: Double): ISingleEditOperationIdentifier = {
    val __obj = js.Dynamic.literal(major = major, minor = minor)
  
    __obj.asInstanceOf[ISingleEditOperationIdentifier]
  }
}

