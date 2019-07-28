package typings.mermaid

import typings.mermaid.mermaidAPIMod.mermaidAPINs.Config
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofmermaidAPI extends js.Object {
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
}

