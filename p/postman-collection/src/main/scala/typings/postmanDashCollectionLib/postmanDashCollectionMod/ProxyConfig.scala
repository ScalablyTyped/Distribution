package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.ProxyConfigDefinition because var conflicts: description, disabled, id, name. Inlined `match`, host, port, tunnel */ @JSImport("postman-collection", "ProxyConfig")
@js.native
class ProxyConfig () extends Property[ProxyConfigDefinition] {
  def this(options: ProxyConfigDefinition) = this()
  var host: js.UndefOr[java.lang.String] = js.native
  var `match`: js.UndefOr[postmanDashCollectionLib.Anon_Pattern | java.lang.String | UrlMatchPattern] = js.native
  var port: js.UndefOr[scala.Double] = js.native
  var tunnel: js.UndefOr[scala.Boolean] = js.native
  def getProtocols(): js.Array[java.lang.String] = js.native
  def getProxyUrl(): java.lang.String = js.native
  def test(): scala.Boolean = js.native
  def test(urlStr: java.lang.String): scala.Boolean = js.native
  def update(options: ProxyConfigDefinition): scala.Unit = js.native
  def updateProtocols(protocols: js.Array[java.lang.String]): scala.Unit = js.native
}

/* static members */
@JSImport("postman-collection", "ProxyConfig")
@js.native
object ProxyConfig extends js.Object {
  def isProxyConfig(obj: js.Any): scala.Boolean = js.native
}

