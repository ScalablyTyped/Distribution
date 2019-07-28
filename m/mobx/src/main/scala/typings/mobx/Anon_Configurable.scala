package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configurable extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  var value: js.Function with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_mobx/lib/internal.IAction */ js.Any)
  var writable: Boolean
}

object Anon_Configurable {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    value: js.Function with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_mobx/lib/internal.IAction */ js.Any),
    writable: Boolean
  ): Anon_Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable, enumerable = enumerable, value = value, writable = writable)
  
    __obj.asInstanceOf[Anon_Configurable]
  }
}

