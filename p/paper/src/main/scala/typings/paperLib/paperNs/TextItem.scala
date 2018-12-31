package typings
package paperLib.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.TextItem")
@js.native
class TextItem () extends Item {
  /**
    * The text contents of the text item.
    */
  var content: java.lang.String = js.native
  /**
    * The font-family to be used in text content.
    * Default: 'sans-serif'
    */
  var fontFamily: java.lang.String = js.native
  /**
    * The font size of text content, as {@Number} in pixels, or as {@String} with optional units 'px', 'pt' and 'em'.
    * Default: 10
    */
  var fontSize: java.lang.String | scala.Double = js.native
  /**
    * The font-weight to be used in text content.
    * Default: 'normal'
    */
  var fontWeight: java.lang.String | scala.Double = js.native
  /**
    * The justification of text paragraphs.
    * Values: 'left', 'right', 'center'
    * Default: 'left'
    */
  var justification: java.lang.String = js.native
  /**
    * The text leading of text content.
    * Default: fontSize * 1.2
    */
  var leading: java.lang.String | scala.Double = js.native
}

