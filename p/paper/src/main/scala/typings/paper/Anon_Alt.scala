package typings.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  var alt: Boolean
  var capsLock: Boolean
  var command: Boolean
  var control: Boolean
  var meta: Boolean
  var option: Boolean
  var shift: Boolean
  var space: Boolean
}

object Anon_Alt {
  @scala.inline
  def apply(
    alt: Boolean,
    capsLock: Boolean,
    command: Boolean,
    control: Boolean,
    meta: Boolean,
    option: Boolean,
    shift: Boolean,
    space: Boolean
  ): Anon_Alt = {
    val __obj = js.Dynamic.literal(alt = alt, capsLock = capsLock, command = command, control = control, meta = meta, option = option, shift = shift, space = space)
  
    __obj.asInstanceOf[Anon_Alt]
  }
}

