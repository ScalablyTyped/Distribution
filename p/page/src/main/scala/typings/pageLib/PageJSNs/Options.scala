package typings
package pageLib.PageJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * bind to click events (default = true)
    */
  var click: scala.Boolean
  /**
    * remove URL encoding frfrom path components
    */
  var decodeURLComponents: scala.Boolean
  /**
    * perform initial dispatch (default = true)
    */
  var dispatch: scala.Boolean
  /**
    * add #!before urls (default = false)
    */
  var hashbang: scala.Boolean
  /**
    * bind to popstate (default = true)
    */
  var popstate: scala.Boolean
}

