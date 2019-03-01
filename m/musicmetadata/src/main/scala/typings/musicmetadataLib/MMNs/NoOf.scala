package typings
package musicmetadataLib.MMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoOf extends js.Object {
  var no: scala.Double
  var of: scala.Double
}

object NoOf {
  @scala.inline
  def apply(no: scala.Double, of: scala.Double): NoOf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("no")(no)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[NoOf]
  }
}

