package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The TextItem type allows you to create typography. Its functionality
  *     is inherited by different text item types such as {@link PointText}, and
  *     {@link AreaText} (coming soon). They each add a layer of functionality
  *     that is unique to their type, but share the underlying properties and
  *     functions that they inherit from TextItem.
  */
@JSGlobal("paper.TextItem")
@js.native
class TextItem () extends Item {
  /** 
    * The text contents of the text item.
    */
  var content: String = js.native
  /** 
    * The font-family to be used in text content.
    */
  var fontFamily: String = js.native
  /** 
    * The font size of text content, as a number in pixels, or as a string with
    * optional units `'px'`, `'pt'` and `'em'`.
    */
  var fontSize: Double | String = js.native
  /** 
    * The font-weight to be used in text content.
    */
  var fontWeight: String | Double = js.native
  /** 
    * The justification of text paragraphs.
    */
  var justification: String = js.native
  /** 
    * The text leading of text content.
    */
  var leading: Double | String = js.native
}

