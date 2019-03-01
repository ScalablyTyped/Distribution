package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraDestinationTypeObject extends js.Object {
  var DATA_URL: scala.Double
  var FILE_URI: scala.Double
}

object CameraDestinationTypeObject {
  @scala.inline
  def apply(DATA_URL: scala.Double, FILE_URI: scala.Double): CameraDestinationTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DATA_URL")(DATA_URL)
    __obj.updateDynamic("FILE_URI")(FILE_URI)
    __obj.asInstanceOf[CameraDestinationTypeObject]
  }
}

