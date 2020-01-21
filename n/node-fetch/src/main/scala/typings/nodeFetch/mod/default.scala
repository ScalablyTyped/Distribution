package typings.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(url: RequestInfo): js.Promise[Response] = js.native
  def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def isRedirect(code: Double): Boolean = js.native
}

