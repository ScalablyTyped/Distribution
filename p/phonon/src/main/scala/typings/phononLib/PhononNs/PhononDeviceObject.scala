package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononDeviceObject extends js.Object {
  var ANDROID: java.lang.String
  var IOS: java.lang.String
  var os: java.lang.String
  var osVersion: java.lang.String
}

object PhononDeviceObject {
  @scala.inline
  def apply(
    ANDROID: java.lang.String,
    IOS: java.lang.String,
    os: java.lang.String,
    osVersion: java.lang.String
  ): PhononDeviceObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ANDROID")(ANDROID)
    __obj.updateDynamic("IOS")(IOS)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("osVersion")(osVersion)
    __obj.asInstanceOf[PhononDeviceObject]
  }
}

