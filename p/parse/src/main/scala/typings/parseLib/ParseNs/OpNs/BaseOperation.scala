package typings
package parseLib.ParseNs.OpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperation
  extends parseLib.ParseNs.IBaseObject {
  def objects(): js.Array[_]
}

object BaseOperation {
  @scala.inline
  def apply(objects: js.Function0[js.Array[_]], toJSON: js.Function0[js.Any]): BaseOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[BaseOperation]
  }
}

