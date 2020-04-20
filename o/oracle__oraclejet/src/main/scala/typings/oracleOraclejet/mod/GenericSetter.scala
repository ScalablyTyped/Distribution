package typings.oracleOraclejet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericSetter[SP] extends js.Object {
  def set[K /* <: /* keyof SP */ String */](
    propertyName: K,
    propertyValue: /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any
  ): Unit
  def unset(propertyName: /* keyof SP */ String): Unit
}

object GenericSetter {
  @scala.inline
  def apply[SP](
    set: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any) => Unit,
    unset: /* keyof SP */ String => Unit
  ): GenericSetter[SP] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[GenericSetter[SP]]
  }
}

