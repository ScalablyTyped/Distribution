package typings
package objectDashKeysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Shim extends js.Object {
  def shim(): /* import warning: ImportType.apply Failed type conversion: typeof objectKeys */ js.Any
}

object Anon_Shim {
  @scala.inline
  def apply(
    shim: () => /* import warning: ImportType.apply Failed type conversion: typeof objectKeys */ js.Any
  ): Anon_Shim = {
    val __obj = js.Dynamic.literal(shim = js.Any.fromFunction0(shim))
  
    __obj.asInstanceOf[Anon_Shim]
  }
}

