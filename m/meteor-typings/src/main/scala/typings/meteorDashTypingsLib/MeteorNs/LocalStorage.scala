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

object LocalStorage {
  @scala.inline
  def apply(
    _data: js.Any,
    getItem: js.Function1[js.Any, js.Any],
    removeItem: js.Function1[js.Any, scala.Unit],
    setItem: js.Function2[js.Any, js.Any, js.Any]
  ): LocalStorage = {
    val __obj = js.Dynamic.literal(_data = _data, getItem = getItem, removeItem = removeItem, setItem = setItem)
  
    __obj.asInstanceOf[LocalStorage]
  }
}

