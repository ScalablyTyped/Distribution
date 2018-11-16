package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Coockies.getAll() details argument object
     */

trait CookiesGetAllDetails extends js.Object {
  /**
           * Restricts the retrieved cookies to those whose domains match or are subdomains of this one.
           */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Filters the cookies by name.
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Restricts the retrieved cookies to those whose path exactly matches this string.
           */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Filters the cookies by their Secure property.
           */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Filters out session vs. persistent cookies.
           */
  var session: scala.Boolean
  /**
           * The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.
           */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Restricts the retrieved cookies to those that would match the given URL.
           */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

