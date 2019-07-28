package typings.ol.formatEsriJSONMod

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
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    __obj.asInstanceOf[Options]
  }
}

