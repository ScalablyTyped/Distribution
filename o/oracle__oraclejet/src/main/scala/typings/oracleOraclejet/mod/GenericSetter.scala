package typings.oracleOraclejet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericSetter[SP] extends js.Object {
  def set[K /* <: String */](
    propertyName: K,
    propertyValue: /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any
  ): Unit
  def unset(propertyName: String): Unit
}

object GenericSetter {
  @scala.inline
  def apply[SP](
    set: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any) => Unit,
    unset: String => Unit
  ): GenericSetter[SP] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
  
    __obj.asInstanceOf[GenericSetter[SP]]
  }
}

