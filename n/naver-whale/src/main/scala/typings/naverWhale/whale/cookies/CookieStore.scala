package typings.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieStore extends js.Object {
  /** The unique identifier for the cookie store. */
  var id: String
  /** Identifiers of all the browser tabs that share this cookie store. */
  var tabIds: js.Array[Double]
}

object CookieStore {
  @scala.inline
  def apply(id: String, tabIds: js.Array[Double]): CookieStore = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tabIds = tabIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CookieStore]
  }
}

