package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseObject extends js.Object {
  def toJSON(): js.Any
}

object IBaseObject {
  @scala.inline
  def apply(toJSON: js.Function0[js.Any]): IBaseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[IBaseObject]
  }
}

