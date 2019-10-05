package typings.paper.paper

import typings.paper.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Style")
@js.native
class Style () extends Base {
  /**
    * Specifies an array containing the dash and gap lengths of the stroke.
    * Default: []
    */
  var dashArray: js.Array[Double] = js.native
  /**
    * The dash offset of the stroke.
    * Default: 0
    */
  var dashOffset: Double = js.native
  /**
    * The fill color.
    */
  var fillColor: Color | String | Null = js.native
  /**
    * The fill-rule with which the shape gets filled. Please note that only modern browsers support fill-rules other than 'nonzero'.
    * Values: 'nonzero', 'evenodd'
    * Default: 'nonzero'
    */
  var fillRule: String = js.native
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
  var leading: Double | String = js.native
  /**
    * The miter limit of the stroke. When two line segments meet at a sharp angle and miter joins have been specified for strokeJoin, it is possible for the miter to extend far beyond the strokeWidth of the path. The miterLimit imposes a limit on the ratio of the miter length to the strokeWidth.
    * Default: 10
    */
  var miterLimit: Double = js.native
  /**
    * The color the item is highlighted with when selected. If the item does not specify its own color, the color defined by its layer is used instead.
    */
  var selectedColor: Color | String | Null = js.native
  /**
    * The shadow's blur radius.
    * Default: 0
    */
  var shadowBlur: Double = js.native
  /**
    * The shadow color.
    */
  var shadowColor: Color | String | Null = js.native
  /**
    * The shadow's offset.
    * Default: 0
    */
  var shadowOffset: Double | js.Array[Double] | Anon_X | Point = js.native
  /**
    * The shape to be used at the beginning and end of open Path items, when they have a stroke.
    * Values: 'round', 'square', 'butt'
    * Default: 'butt'
    */
  var strokeCap: String = js.native
  /**
    * The color of the stroke.
    */
  var strokeColor: Color | String | Null = js.native
  /**
    * The shape to be used at the segments and corners of Path items when they have a stroke.
    * Values: 'miter', 'round', 'bevel'
    * Default: 'miter'
    */
  var strokeJoin: String = js.native
  /**
    * Specifies whether the stroke is to be drawn taking the current affine transformation into account (the default behavior), or whether it should appear as a non-scaling stroke.
    * Default: true
    */
  var strokeScaling: Boolean = js.native
  /**
    * The width of the stroke.
    * Default: 1
    */
  var strokeWidth: Double = js.native
  /**
    * The view that this style belongs to.
    * Read only.
    */
  val view: View = js.native
  def getFillColor(): Color = js.native
  def getSelectedColor(): Color = js.native
  def getShadowColor(): Color = js.native
  def getStrokeColor(): Color = js.native
  def setFillColor(): Unit = js.native
  def setFillColor(value: String): Unit = js.native
  def setFillColor(value: Color): Unit = js.native
  def setSelectedColor(): Unit = js.native
  def setSelectedColor(value: String): Unit = js.native
  def setSelectedColor(value: Color): Unit = js.native
  def setShadowColor(): Unit = js.native
  def setShadowColor(value: String): Unit = js.native
  def setShadowColor(value: Color): Unit = js.native
  def setStrokeColor(): Unit = js.native
  def setStrokeColor(value: String): Unit = js.native
  def setStrokeColor(value: Color): Unit = js.native
}

