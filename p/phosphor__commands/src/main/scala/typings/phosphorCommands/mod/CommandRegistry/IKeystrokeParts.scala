package typings.phosphorCommands.mod.CommandRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the results of parsing a keystroke.
  */
trait IKeystrokeParts extends js.Object {
  /**
    * Whether `'Alt'` appears in the keystroke.
    */
  var alt: Boolean
  /**
    * Whether `'Cmd'` appears in the keystroke.
    */
  var cmd: Boolean
  /**
    * Whether `'Ctrl'` appears in the keystroke.
    */
  var ctrl: Boolean
  /**
    * The primary key for the keystroke.
    */
  var key: String
  /**
    * Whether `'Shift'` appears in the keystroke.
    */
  var shift: Boolean
}

object IKeystrokeParts {
  @scala.inline
  def apply(alt: Boolean, cmd: Boolean, ctrl: Boolean, key: String, shift: Boolean): IKeystrokeParts = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeystrokeParts]
  }
}

