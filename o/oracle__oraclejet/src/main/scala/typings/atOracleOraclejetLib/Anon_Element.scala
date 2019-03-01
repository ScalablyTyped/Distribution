package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: stdLib.Element
  var height: scala.Double
  var width: scala.Double
}

object Anon_Element {
  @scala.inline
  def apply(element: stdLib.Element, height: scala.Double, width: scala.Double): Anon_Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Element]
  }
}

