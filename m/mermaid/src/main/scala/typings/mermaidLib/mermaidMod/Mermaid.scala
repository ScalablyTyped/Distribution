package typings
package mermaidLib.mermaidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mermaid extends js.Object {
  @JSName("contentLoaded")
  var contentLoaded_Original: js.Function0[scala.Unit] = js.native
  var htmlLabels: scala.Boolean = js.native
  @JSName("init")
  var init_Original: js.Function1[/* nodes */ java.lang.String | stdLib.Node | stdLib.NodeList, scala.Unit] = js.native
  @JSName("initialize")
  var initialize_Original: js.Function1[/* config */ mermaidLib.mermaidAPIMod.mermaidAPINs.Config, scala.Unit] = js.native
  var mermaidAPI: mermaidLib.Anon_GetConfig = js.native
  var parse: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof mermaid.mermaid/mermaidAPI.default.parse */ js.Any = js.native
  var render: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof mermaid.mermaid/mermaidAPI.default.render */ js.Any = js.native
  var startOnLoad: scala.Boolean = js.native
  def contentLoaded(): scala.Unit = js.native
  def init(nodes: java.lang.String): scala.Unit = js.native
  def init(nodes: stdLib.Node): scala.Unit = js.native
  def init(nodes: stdLib.NodeList): scala.Unit = js.native
  def initialize(config: mermaidLib.mermaidAPIMod.mermaidAPINs.Config): scala.Unit = js.native
}

