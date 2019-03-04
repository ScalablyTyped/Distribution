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
    val __obj = js.Dynamic.literal(ANDROID = ANDROID, IOS = IOS, os = os, osVersion = osVersion)
  
    __obj.asInstanceOf[PhononDeviceObject]
  }
}

