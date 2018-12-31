package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.ProxyConfigDefinition because Would inherit conflicting mutable fields List(description, disabled, id, name))*/
@JSImport("postman-collection", "ProxyConfig")
@js.native
class ProxyConfig () extends Property[ProxyConfigDefinition] {
  def this(options: ProxyConfigDefinition) = this()
  var host: java.lang.String = js.native
  var `match`: UrlMatchPattern = js.native
  var port: scala.Double = js.native
  var tunnel: scala.Boolean = js.native
  def getProtocols(): js.Array[java.lang.String] = js.native
  def getProxyUrl(): java.lang.String = js.native
  def test(): scala.Boolean = js.native
  def test(urlStr: java.lang.String): scala.Boolean = js.native
  def update(options: ProxyConfigDefinition): scala.Unit = js.native
  def updateProtocols(protocols: js.Array[java.lang.String]): scala.Unit = js.native
}

@JSImport("postman-collection", "ProxyConfig")
@js.native
object ProxyConfig extends js.Object {
  def isProxyConfig(obj: js.Any): scala.Boolean = js.native
}

