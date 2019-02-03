package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "ProxyConfigList")
@js.native
class ProxyConfigList protected () extends PropertyList[ProxyConfig] {
  def this(parent: js.Any, populate: js.Array[ProxyConfig]) = this()
  def resolve(url: java.lang.String): ProxyConfig = js.native
  def resolve(url: Url): ProxyConfig = js.native
}

/* static members */
@JSImport("postman-collection", "ProxyConfigList")
@js.native
object ProxyConfigList extends js.Object {
  def isProxyConfigList(obj: js.Any): scala.Boolean = js.native
}

