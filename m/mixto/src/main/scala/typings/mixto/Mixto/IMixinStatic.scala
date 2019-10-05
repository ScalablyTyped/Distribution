package typings.mixto.Mixto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMixinStatic extends js.Object {
  def extend(`object`: js.Any): Unit
  def includeInto(constructor: js.Any): Unit
}

object IMixinStatic {
  @scala.inline
  def apply(extend: js.Any => Unit, includeInto: js.Any => Unit): IMixinStatic = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), includeInto = js.Any.fromFunction1(includeInto))
  
    __obj.asInstanceOf[IMixinStatic]
  }
}

