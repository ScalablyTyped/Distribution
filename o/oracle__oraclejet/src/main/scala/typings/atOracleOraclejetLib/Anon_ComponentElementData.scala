package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentElementData extends js.Object {
  var componentElement: stdLib.Element
  var data: js.Object
}

object Anon_ComponentElementData {
  @scala.inline
  def apply(componentElement: stdLib.Element, data: js.Object): Anon_ComponentElementData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_ComponentElementData]
  }
}

