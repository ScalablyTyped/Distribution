package typings
package nodeDashXlsxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataName extends js.Object {
  var data: js.Array[js.Array[_]]
  var name: java.lang.String
}

object Anon_DataName {
  @scala.inline
  def apply(data: js.Array[js.Array[_]], name: java.lang.String): Anon_DataName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_DataName]
  }
}

