package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncCache extends js.Object {
  var async: scala.Boolean
  var responseType: java.lang.String
  var withCredentials: scala.Boolean
}

object Anon_AsyncCache {
  @scala.inline
  def apply(async: scala.Boolean, responseType: java.lang.String, withCredentials: scala.Boolean): Anon_AsyncCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("responseType")(responseType)
    __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Anon_AsyncCache]
  }
}

