package typings.mermaid

import org.scalablytyped.runtime.Shortcut
import typings.mermaid.anon.TypeofmermaidAPI
import typings.mermaid.mermaidAPIMod.mermaidAPI.Config
import typings.std.Element
import typings.std.Node
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mermaid", JSImport.Default)
  @js.native
  val default: Mermaid = js.native
  
  trait Mermaid extends StObject {
    
    def contentLoaded(): Unit
    @JSName("contentLoaded")
    var contentLoaded_Original: js.Function0[Unit]
    
    var htmlLabels: Boolean
    
    def init(nodes: String): Unit
    def init(nodes: Node): Unit
    def init(nodes: NodeList): Unit
    @JSName("init")
    var init_Original: js.Function1[/* nodes */ String | Node | NodeList, Unit]
    
    def initialize(config: Config): Unit
    @JSName("initialize")
    var initialize_Original: js.Function1[/* config */ Config, Unit]
    
    var mermaidAPI: TypeofmermaidAPI
    
    def parse(text: String): js.Any
    @JSName("parse")
    var parse_Original: js.Function1[/* text */ String, js.Any]
    
    def render(
      id: String,
      txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ]
    ): String
    def render(
      id: String,
      txt: String,
      cb: js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ],
      container: String
    ): String
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
      ]
    
    var startOnLoad: Boolean
  }
  object Mermaid {
    
    @scala.inline
    def apply(
      contentLoaded: () => Unit,
      htmlLabels: Boolean,
      init: /* nodes */ String | Node | NodeList => Unit,
      initialize: /* config */ Config => Unit,
      mermaidAPI: TypeofmermaidAPI,
      parse: /* text */ String => js.Any,
      render: (/* id */ String, /* txt */ String, /* cb */ js.Function2[
          /* svgCode */ String, 
          /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
          Unit
        ], /* container */ js.UndefOr[String]) => String,
      startOnLoad: Boolean
    ): Mermaid = {
      val __obj = js.Dynamic.literal(contentLoaded = js.Any.fromFunction0(contentLoaded), htmlLabels = htmlLabels.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), initialize = js.Any.fromFunction1(initialize), mermaidAPI = mermaidAPI.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), render = js.Any.fromFunction4(render), startOnLoad = startOnLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mermaid]
    }
    
    @scala.inline
    implicit class MermaidMutableBuilder[Self <: Mermaid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentLoaded(value: () => Unit): Self = StObject.set(x, "contentLoaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHtmlLabels(value: Boolean): Self = StObject.set(x, "htmlLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(value: /* nodes */ String | Node | NodeList => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitialize(value: /* config */ Config => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMermaidAPI(value: TypeofmermaidAPI): Self = StObject.set(x, "mermaidAPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: /* text */ String => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRender(
        value: (/* id */ String, /* txt */ String, /* cb */ js.Function2[
              /* svgCode */ String, 
              /* bindFunctions */ js.Function1[/* element */ Element, Unit], 
              Unit
            ], /* container */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStartOnLoad(value: Boolean): Self = StObject.set(x, "startOnLoad", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Mermaid
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Mermaid = default
}
