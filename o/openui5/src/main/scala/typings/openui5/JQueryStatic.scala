package typings.openui5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var sap: JquerySap
}

object JQueryStatic {
  @scala.inline
  def apply(sap: JquerySap): JQueryStatic = {
    val __obj = js.Dynamic.literal(sap = sap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

