package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraDestinationTypeObject extends js.Object {
  var DATA_URL: Double
  var FILE_URI: Double
}

object CameraDestinationTypeObject {
  @scala.inline
  def apply(DATA_URL: Double, FILE_URI: Double): CameraDestinationTypeObject = {
    val __obj = js.Dynamic.literal(DATA_URL = DATA_URL.asInstanceOf[js.Any], FILE_URI = FILE_URI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CameraDestinationTypeObject]
  }
}

