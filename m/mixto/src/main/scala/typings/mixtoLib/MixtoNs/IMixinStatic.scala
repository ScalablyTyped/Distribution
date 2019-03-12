package typings
package mixtoLib.MixtoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMixinStatic extends js.Object {
  def extend(`object`: js.Any): scala.Unit
  def includeInto(constructor: js.Any): scala.Unit
}

object IMixinStatic {
  @scala.inline
  def apply(extend: js.Any => scala.Unit, includeInto: js.Any => scala.Unit): IMixinStatic = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), includeInto = js.Any.fromFunction1(includeInto))
  
    __obj.asInstanceOf[IMixinStatic]
  }
}

