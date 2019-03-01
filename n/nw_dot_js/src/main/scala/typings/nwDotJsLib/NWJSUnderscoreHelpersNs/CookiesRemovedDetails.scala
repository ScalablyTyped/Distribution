package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

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
  var name: java.lang.String
  /**
    * The ID of the cookie store from which the cookie was removed.
    */
  var storeId: java.lang.String
  /**
    * The URL associated with the cookie that's been removed.
    */
  var url: java.lang.String
}

object CookiesRemovedDetails {
  @scala.inline
  def apply(name: java.lang.String, storeId: java.lang.String, url: java.lang.String): CookiesRemovedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("storeId")(storeId)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CookiesRemovedDetails]
  }
}

