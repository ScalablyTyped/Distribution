package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLocation extends js.Object {
  var id: js.UndefOr[js.Any] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_IdLocation {
  @scala.inline
  def apply(id: js.Any = null, location: String = null, x: Int | Double = null, y: Int | Double = null): Anon_IdLocation = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (location != null) __obj.updateDynamic("location")(location)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdLocation]
  }
}

