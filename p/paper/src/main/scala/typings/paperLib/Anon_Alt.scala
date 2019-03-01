package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  var alt: scala.Boolean
  var capsLock: scala.Boolean
  var command: scala.Boolean
  var control: scala.Boolean
  var meta: scala.Boolean
  var option: scala.Boolean
  var shift: scala.Boolean
  var space: scala.Boolean
}

object Anon_Alt {
  @scala.inline
  def apply(
    alt: scala.Boolean,
    capsLock: scala.Boolean,
    command: scala.Boolean,
    control: scala.Boolean,
    meta: scala.Boolean,
    option: scala.Boolean,
    shift: scala.Boolean,
    space: scala.Boolean
  ): Anon_Alt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("capsLock")(capsLock)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("option")(option)
    __obj.updateDynamic("shift")(shift)
    __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[Anon_Alt]
  }
}

