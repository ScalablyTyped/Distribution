package typings
package parseLib.ParseNs.OpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set
  extends parseLib.ParseNs.IBaseObject {
  def value(): js.Any
}

object Set {
  @scala.inline
  def apply(toJSON: js.Function0[js.Any], value: js.Function0[js.Any]): Set = {
    val __obj = js.Dynamic.literal(toJSON = toJSON, value = value)
  
    __obj.asInstanceOf[Set]
  }
}

