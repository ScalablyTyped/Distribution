package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUpnpSearchResultItem extends js.Object {
  var id: java.lang.String
  var ipaddress: java.lang.String
}

object IUpnpSearchResultItem {
  @scala.inline
  def apply(id: java.lang.String, ipaddress: java.lang.String): IUpnpSearchResultItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ipaddress")(ipaddress)
    __obj.asInstanceOf[IUpnpSearchResultItem]
  }
}

