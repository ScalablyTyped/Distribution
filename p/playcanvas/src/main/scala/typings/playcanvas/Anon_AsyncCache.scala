package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncCache extends js.Object {
  var async: Boolean
  var responseType: String
  var withCredentials: Boolean
}

object Anon_AsyncCache {
  @scala.inline
  def apply(async: Boolean, responseType: String, withCredentials: Boolean): Anon_AsyncCache = {
    val __obj = js.Dynamic.literal(async = async, responseType = responseType, withCredentials = withCredentials)
  
    __obj.asInstanceOf[Anon_AsyncCache]
  }
}

