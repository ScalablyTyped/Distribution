package typings
package meteorDashTypingsLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocalStorage extends js.Object {
  var _data: js.Any
  def getItem(key: js.Any): js.Any
  def removeItem(key: js.Any): scala.Unit
  def setItem(key: js.Any, value: js.Any): js.Any
}

