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
  var mermaidAPI: mermaidLib.Anon_BindFunctions = js.native
  @JSName("parse")
  var parse_Original: js.Function1[/* text */ java.lang.String, _] = js.native
  @JSName("render")
  var render_Original: js.Function4[
    /* id */ java.lang.String, 
    /* txt */ java.lang.String, 
    /* cb */ js.Function2[
      /* svgCode */ java.lang.String, 
      /* bindFunctions */ js.Function1[/* element */ stdLib.Element, scala.Unit], 
      scala.Unit
    ], 
    /* container */ js.UndefOr[java.lang.String], 
    java.lang.String
  ] = js.native
  var startOnLoad: scala.Boolean = js.native
  def contentLoaded(): scala.Unit = js.native
  def init(nodes: java.lang.String): scala.Unit = js.native
  def init(nodes: stdLib.Node): scala.Unit = js.native
  def init(nodes: stdLib.NodeList): scala.Unit = js.native
  def initialize(config: mermaidLib.mermaidAPIMod.mermaidAPINs.Config): scala.Unit = js.native
  def parse(text: java.lang.String): js.Any = js.native
  def render(
    id: java.lang.String,
    txt: java.lang.String,
    cb: js.Function2[
      /* svgCode */ java.lang.String, 
      /* bindFunctions */ js.Function1[/* element */ stdLib.Element, scala.Unit], 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def render(
    id: java.lang.String,
    txt: java.lang.String,
    cb: js.Function2[
      /* svgCode */ java.lang.String, 
      /* bindFunctions */ js.Function1[/* element */ stdLib.Element, scala.Unit], 
      scala.Unit
    ],
    container: java.lang.String
  ): java.lang.String = js.native
}

