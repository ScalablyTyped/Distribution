package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.TextItem")
@js.native
class TextItem () extends Item {
  /**
    * The text contents of the text item.
    */
  var content: String = js.native
  /**
    * The font-family to be used in text content.
    * Default: 'sans-serif'
    */
  var fontFamily: String = js.native
  /**
    * The font size of text content, as {@Number} in pixels, or as {@String} with optional units 'px', 'pt' and 'em'.
    * Default: 10
    */
  var fontSize: String | Double = js.native
  /**
    * The font-weight to be used in text content.
    * Default: 'normal'
    */
  var fontWeight: String | Double = js.native
  /**
    * The justification of text paragraphs.
    * Values: 'left', 'right', 'center'
    * Default: 'left'
    */
  var justification: String = js.native
  /**
    * The text leading of text content.
    * Default: fontSize * 1.2
    */
  var leading: String | Double = js.native
}

