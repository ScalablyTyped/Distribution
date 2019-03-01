package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scale extends js.Object {
  var scale: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Scale {
  @scala.inline
  def apply(scale: scala.Int | scala.Double = null): Anon_Scale = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scale]
  }
}

