package typings.places.mod

import typings.places.anon.Prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutompleteOptions extends js.Object {
  var autoselect: Boolean
  var cssClasses: Prefix
  var debug: Boolean
  var hint: Boolean
}

object AutompleteOptions {
  @scala.inline
  def apply(autoselect: Boolean, cssClasses: Prefix, debug: Boolean, hint: Boolean): AutompleteOptions = {
    val __obj = js.Dynamic.literal(autoselect = autoselect.asInstanceOf[js.Any], cssClasses = cssClasses.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutompleteOptions]
  }
}

