package typings.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.get() details argument object
  */
@js.native
trait CookiesGetDetails extends js.Object {
  /**
    * The name of the cookie to retrieve.
    */
  var name: String = js.native
  /**
    * The ID of the cookie store in which to look for the cookie.
    */
  var storeId: String = js.native
  /**
    * The URL with which the cookie to retrieve is associated.
    */
  var url: String = js.native
}

object CookiesGetDetails {
  @scala.inline
  def apply(name: String, storeId: String, url: String): CookiesGetDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesGetDetails]
  }
  @scala.inline
  implicit class CookiesGetDetailsOps[Self <: CookiesGetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

