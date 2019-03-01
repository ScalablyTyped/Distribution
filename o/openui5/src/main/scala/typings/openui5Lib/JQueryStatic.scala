package typings
package openui5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var sap: JquerySap
}

object JQueryStatic {
  @scala.inline
  def apply(sap: JquerySap): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sap")(sap)
    __obj.asInstanceOf[JQueryStatic]
  }
}

