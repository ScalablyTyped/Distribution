package typings.mermaid.mermaidAPIMod

import typings.mermaid.mermaidAPIMod.mermaidAPI.Config
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mermaid/mermaidAPI", JSImport.Default)
@js.native
object default extends js.Object {
  
  def getConfig(): Config = js.native
  
  def initialize(options: Config): Unit = js.native
  
  def parse(text: String): js.Any = js.native
  
  /**
    * ##render
    * Function that renders an svg with a graph from a chart definition. Usage example below.
    *
    * ```
    * mermaidAPI.initialize({
    *      startOnLoad:true
    *  });
    *  $(function(){
    *      const graphDefinition = 'graph TB\na-->b';
    *      const cb = function(svgGraph){
    *          console.log(svgGraph);
    *      };
    *      mermaidAPI.render('id1',graphDefinition,cb);
    *  });
    * ```
    * @param id the id of the element to be rendered
    * @param txt the graph definition
    * @param cb callback which is called after rendering is finished with the svg code as inparam.
    * @param container selector to element in which a div with the graph temporarily will be inserted. In one is
    * provided a hidden div will be inserted in the body of the page instead. The element will be removed when rendering is
    * completed.
    */
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
  
  @js.native
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel with Double] = js.native
    
    /* 1 */ val Debug: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Debug with Double = js.native
    
    /* 2 */ val Error: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Error with Double = js.native
    
    /* 3 */ val Fatal: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Fatal with Double = js.native
    
    /* 0 */ val Info: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Info with Double = js.native
    
    /* 1 */ val Warn: typings.mermaid.mermaidAPIMod.mermaidAPI.LogLevel.Warn with Double = js.native
  }
}
