package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: scala.Double
  var detail: java.lang.String
  var name: java.lang.String
  var standardName: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(
    code: scala.Double,
    detail: java.lang.String,
    name: java.lang.String,
    standardName: java.lang.String
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("detail")(detail)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("standardName")(standardName)
    __obj.asInstanceOf[Anon_Code]
  }
}

