package typings.places.placesMod

import typings.places.Anon_Prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutompleteOptions extends js.Object {
  var autoselect: Boolean
  var cssClasses: Anon_Prefix
  var debug: Boolean
  var hint: Boolean
}

object AutompleteOptions {
  @scala.inline
  def apply(autoselect: Boolean, cssClasses: Anon_Prefix, debug: Boolean, hint: Boolean): AutompleteOptions = {
    val __obj = js.Dynamic.literal(autoselect = autoselect, cssClasses = cssClasses, debug = debug, hint = hint)
  
    __obj.asInstanceOf[AutompleteOptions]
  }
}

