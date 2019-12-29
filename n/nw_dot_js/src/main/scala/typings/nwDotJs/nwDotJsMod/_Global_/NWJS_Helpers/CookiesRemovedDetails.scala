package typings.nwDotJs.nwDotJsMod._Global_.NWJS_Helpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.remove() callback details argument object
  */
trait CookiesRemovedDetails extends js.Object {
  /**
    * The name of the cookie that's been removed.
    */
  var name: String
  /**
    * The ID of the cookie store from which the cookie was removed.
    */
  var storeId: String
  /**
    * The URL associated with the cookie that's been removed.
    */
  var url: String
}

object CookiesRemovedDetails {
  @scala.inline
  def apply(name: String, storeId: String, url: String): CookiesRemovedDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CookiesRemovedDetails]
  }
}

