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
    set: js.Function2[
      js.Any, 
      /* import warning: ImportType.apply Failed type conversion: SP[K] */ js.Any, 
      scala.Unit
    ],
    unset: js.Function1[java.lang.String, scala.Unit]
  ): GenericSetter[SP] = {
    val __obj = js.Dynamic.literal(set = set, unset = unset)
  
    __obj.asInstanceOf[GenericSetter[SP]]
  }
}

