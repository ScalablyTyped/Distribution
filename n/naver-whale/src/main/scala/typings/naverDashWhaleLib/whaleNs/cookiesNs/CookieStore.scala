package typings
package naverDashWhaleLib.whaleNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieStore extends js.Object {
  /** The unique identifier for the cookie store. */
  var id: java.lang.String
  /** Identifiers of all the browser tabs that share this cookie store. */
  var tabIds: js.Array[scala.Double]
}

object CookieStore {
  @scala.inline
  def apply(id: java.lang.String, tabIds: js.Array[scala.Double]): CookieStore = {
    val __obj = js.Dynamic.literal(id = id, tabIds = tabIds)
  
    __obj.asInstanceOf[CookieStore]
  }
}

