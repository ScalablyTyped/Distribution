package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUpnpSearchResultItem extends js.Object {
  var id: String
  var ipaddress: String
}

object IUpnpSearchResultItem {
  @scala.inline
  def apply(id: String, ipaddress: String): IUpnpSearchResultItem = {
    val __obj = js.Dynamic.literal(id = id, ipaddress = ipaddress)
  
    __obj.asInstanceOf[IUpnpSearchResultItem]
  }
}

