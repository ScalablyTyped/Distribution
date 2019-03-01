package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparseObject extends js.Object {
  var data: java.lang.String | js.Array[_]
  var fields: js.Array[_]
}

object UnparseObject {
  @scala.inline
  def apply(data: java.lang.String | js.Array[_], fields: js.Array[_]): UnparseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[UnparseObject]
  }
}

