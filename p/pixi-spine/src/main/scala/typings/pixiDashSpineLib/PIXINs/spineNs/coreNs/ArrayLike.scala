package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayLike[T]
  extends /* n */ org.scalablytyped.runtime.NumberDictionary[T] {
  var length: scala.Double
}

object ArrayLike {
  @scala.inline
  def apply[T](
    length: scala.Double,
    NumberDictionary: /* n */ org.scalablytyped.runtime.NumberDictionary[T] = null
  ): ArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ArrayLike[T]]
  }
}

