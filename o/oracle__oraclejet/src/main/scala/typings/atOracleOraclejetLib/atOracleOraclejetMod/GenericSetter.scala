package typings
package atOracleOraclejetLib.atOracleOraclejetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericSetter[SP] extends js.Object {
  def set[K /* <: java.lang.String */](
    propertyName: K,
    propertyValue: /* import warning: ImportType.apply Failed type conversion: SP[K] */ js.Any
  ): scala.Unit
  def unset(propertyName: java.lang.String): scala.Unit
}

object GenericSetter {
  @scala.inline
  def apply[SP](
    set: (js.Any, /* import warning: ImportType.apply Failed type conversion: SP[K] */ js.Any) => scala.Unit,
    unset: java.lang.String => scala.Unit
  ): GenericSetter[SP] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
  
    __obj.asInstanceOf[GenericSetter[SP]]
  }
}

