package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononDeviceObject extends js.Object {
  var ANDROID: String
  var IOS: String
  var os: String
  var osVersion: String
}

object PhononDeviceObject {
  @scala.inline
  def apply(ANDROID: String, IOS: String, os: String, osVersion: String): PhononDeviceObject = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], IOS = IOS.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononDeviceObject]
  }
}

