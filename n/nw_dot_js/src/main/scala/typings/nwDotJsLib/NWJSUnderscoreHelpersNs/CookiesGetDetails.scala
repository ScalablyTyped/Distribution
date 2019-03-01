package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

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
  var name: java.lang.String
  /**
    * The ID of the cookie store in which to look for the cookie.
    */
  var storeId: java.lang.String
  /**
    * The URL with which the cookie to retrieve is associated.
    */
  var url: java.lang.String
}

object CookiesGetDetails {
  @scala.inline
  def apply(name: java.lang.String, storeId: java.lang.String, url: java.lang.String): CookiesGetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("storeId")(storeId)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CookiesGetDetails]
  }
}

