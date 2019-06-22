package typings
package placesLib.placesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutompleteOptions extends js.Object {
  var autoselect: scala.Boolean
  var cssClasses: placesLib.Anon_Prefix
  var debug: scala.Boolean
  var hint: scala.Boolean
}

object AutompleteOptions {
  @scala.inline
  def apply(
    autoselect: scala.Boolean,
    cssClasses: placesLib.Anon_Prefix,
    debug: scala.Boolean,
    hint: scala.Boolean
  ): AutompleteOptions = {
    val __obj = js.Dynamic.literal(autoselect = autoselect, cssClasses = cssClasses, debug = debug, hint = hint)
  
    __obj.asInstanceOf[AutompleteOptions]
  }
}

