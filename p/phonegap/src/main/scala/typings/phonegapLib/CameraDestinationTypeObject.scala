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
    val __obj = js.Dynamic.literal(DATA_URL = DATA_URL, FILE_URI = FILE_URI)
  
    __obj.asInstanceOf[CameraDestinationTypeObject]
  }
}

