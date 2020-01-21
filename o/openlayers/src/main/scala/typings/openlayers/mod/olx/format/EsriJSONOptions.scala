package typings.openlayers.mod.olx.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EsriJSONOptions extends js.Object {
  var geometryName: js.UndefOr[String] = js.undefined
}

object EsriJSONOptions {
  @scala.inline
  def apply(geometryName: String = null): EsriJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsriJSONOptions]
  }
}

