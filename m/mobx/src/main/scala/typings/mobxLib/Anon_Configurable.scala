package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable extends js.Object {
  var configurable: scala.Boolean
  var enumerable: scala.Boolean
  var value: js.Function with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_mobx/lib/internal.IAction */ js.Any)
  var writable: scala.Boolean
}

object Anon_Configurable {
  @scala.inline
  def apply(
    configurable: scala.Boolean,
    enumerable: scala.Boolean,
    value: js.Function with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_mobx/lib/internal.IAction */ js.Any),
    writable: scala.Boolean
  ): Anon_Configurable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configurable")(configurable)
    __obj.updateDynamic("enumerable")(enumerable)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[Anon_Configurable]
  }
}

