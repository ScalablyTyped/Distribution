package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterExpression[QM /* <: Model */]
  extends /* namedFilter */ org.scalablytyped.runtime.StringDictionary[FilterFunction[QM]]

object FilterExpression {
  @scala.inline
  def apply[QM /* <: Model */](
    StringDictionary: /* namedFilter */ org.scalablytyped.runtime.StringDictionary[FilterFunction[QM]] = null
  ): FilterExpression[QM] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FilterExpression[QM]]
  }
}

