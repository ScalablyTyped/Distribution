package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coockies.remove() details argument object
  */
trait CookiesRemoveDetails extends js.Object {
  /**
    * The name of the cookie to remove.
    */
  var name: java.lang.String
  /**
    * The ID of the cookie store to look in for the cookie.
    */
  var storeId: java.lang.String
  /**
    * The URL associated with the cookie.
    */
  var url: java.lang.String
}

object CookiesRemoveDetails {
  @scala.inline
  def apply(name: java.lang.String, storeId: java.lang.String, url: java.lang.String): CookiesRemoveDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("storeId")(storeId)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CookiesRemoveDetails]
  }
}

