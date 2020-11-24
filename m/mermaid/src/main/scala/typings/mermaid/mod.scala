package typings.mermaid

import typings.mermaid.anon.TypeofmermaidAPI
import typings.mermaid.mermaidAPIMod.mermaidAPI.Config
import typings.std.Element
import typings.std.Node
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mermaid", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: Mermaid = js.native
  
  @js.native
  trait Mermaid extends js.Object {
    
    def contentLoaded(): Unit = js.native
    @JSName("contentLoaded")
    var contentLoaded_Original: js.Function0[Unit] = js.native
    
    var htmlLabels: Boolean = js.native
    
    def init(nodes: String): Unit = js.native
    def init(nodes: Node): Unit = js.native
    def init(nodes: NodeList): Unit = js.native
    @JSName("init")
    var init_Original: js.Function1[/* nodes */ String | Node | NodeList, Unit] = js.native
    
    def initialize(config: Config): Unit = js.native
    @JSName("initialize")
    var initialize_Original: js.Function1[/* config */ Config, Unit] = js.native
    
    var mermaidAPI: TypeofmermaidAPI = js.native
    
    def parse(text: String): js.Any = js.native
    @JSName("parse")
    var parse_Original: js.Function1[/* text */ String, _] = js.native
    
    def render(
      id: String,
      txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ]
    ): String = js.native
    def render(
      id: String,
      txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ],
      container: String
    ): String = js.native
    @JSName("render")
    var render_Original: js.Function4[
        /* id */ String, 
        /* txt */ String, 
        /* cb */ js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ], 
        /* container */ js.UndefOr[String], 
        String
      ] = js.native
    
    var startOnLoad: Boolean = js.native
  }
}
