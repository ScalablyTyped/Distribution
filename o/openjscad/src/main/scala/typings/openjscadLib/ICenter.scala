package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICenter extends js.Object {
  def center(cAxes: js.Array[java.lang.String]): CxG
}

object ICenter {
  @scala.inline
  def apply(center: js.Function1[js.Array[java.lang.String], CxG]): ICenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.asInstanceOf[ICenter]
  }
}

