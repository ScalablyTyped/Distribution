package typings
package nodeDashXlsxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Array[js.Array[js.Any]]
  var name: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Array[js.Array[js.Any]], name: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Data]
  }
}

