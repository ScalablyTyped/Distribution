package typings.ol.esriJSONMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var geometryName: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(geometryName: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

