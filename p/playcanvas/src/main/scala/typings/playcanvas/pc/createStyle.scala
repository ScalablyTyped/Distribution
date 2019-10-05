package typings.playcanvas.pc

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.createStyle")
@js.native
object createStyle extends js.Object {
  /**
    * @function
    * @name pc.createStyle
    * @description Creates a &lt;style&gt; DOM element from a string that contains CSS
    * @param {String} cssString A string that contains valid CSS
    * @example
    * var css = 'body {height: 100;}';
    * var style = pc.createStyle(css);
    * document.head.appendChild(style);
    * @returns {Element} The style DOM element
    */
  def apply(cssString: String): Element = js.native
}

