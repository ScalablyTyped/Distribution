package typings.nwDotJs.NWJS_Helpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.get() details argument object
  */
trait CookiesGetDetails extends js.Object {
  /**
    * The name of the cookie to retrieve.
    */
  var name: String
  /**
    * The ID of the cookie store in which to look for the cookie.
    */
  var storeId: String
  /**
    * The URL with which the cookie to retrieve is associated.
    */
  var url: String
}

object CookiesGetDetails {
  @scala.inline
  def apply(name: String, storeId: String, url: String): CookiesGetDetails = {
    val __obj = js.Dynamic.literal(name = name, storeId = storeId, url = url)
  
    __obj.asInstanceOf[CookiesGetDetails]
  }
}

