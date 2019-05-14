package typings
package paperLib.paperNs

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
  var dashArray: js.Array[scala.Double] = js.native
  /**
    * The dash offset of the stroke.
    * Default: 0
    */
  var dashOffset: scala.Double = js.native
  /**
    * The fill color.
    */
  var fillColor: Color | java.lang.String | scala.Null = js.native
  /**
    * The fill-rule with which the shape gets filled. Please note that only modern browsers support fill-rules other than 'nonzero'.
    * Values: 'nonzero', 'evenodd'
    * Default: 'nonzero'
    */
  var fillRule: java.lang.String = js.native
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
  var leading: scala.Double | java.lang.String = js.native
  /**
    * The miter limit of the stroke. When two line segments meet at a sharp angle and miter joins have been specified for strokeJoin, it is possible for the miter to extend far beyond the strokeWidth of the path. The miterLimit imposes a limit on the ratio of the miter length to the strokeWidth.
    * Default: 10
    */
  var miterLimit: scala.Double = js.native
  /**
    * The color the item is highlighted with when selected. If the item does not specify its own color, the color defined by its layer is used instead.
    */
  var selectedColor: Color | java.lang.String | scala.Null = js.native
  /**
    * The shadow's blur radius.
    * Default: 0
    */
  var shadowBlur: scala.Double = js.native
  /**
    * The shadow color.
    */
  var shadowColor: Color | java.lang.String | scala.Null = js.native
  /**
    * The shadow's offset.
    * Default: 0
    */
  var shadowOffset: scala.Double | js.Array[scala.Double] | paperLib.Anon_X | Point = js.native
  /**
    * The shape to be used at the beginning and end of open Path items, when they have a stroke.
    * Values: 'round', 'square', 'butt'
    * Default: 'butt'
    */
  var strokeCap: java.lang.String = js.native
  /**
    * The color of the stroke.
    */
  var strokeColor: Color | java.lang.String | scala.Null = js.native
  /**
    * The shape to be used at the segments and corners of Path items when they have a stroke.
    * Values: 'miter', 'round', 'bevel'
    * Default: 'miter'
    */
  var strokeJoin: java.lang.String = js.native
  /**
    * Specifies whether the stroke is to be drawn taking the current affine transformation into account (the default behavior), or whether it should appear as a non-scaling stroke.
    * Default: true
    */
  var strokeScaling: scala.Boolean = js.native
  /**
    * The width of the stroke.
    * Default: 1
    */
  var strokeWidth: scala.Double = js.native
  /**
    * The view that this style belongs to.
    * Read only.
    */
  val view: View = js.native
  def getFillColor(): Color = js.native
  def getSelectedColor(): Color = js.native
  def getShadowColor(): Color = js.native
  def getStrokeColor(): Color = js.native
  def setFillColor(): scala.Unit = js.native
  def setFillColor(value: java.lang.String): scala.Unit = js.native
  def setFillColor(value: Color): scala.Unit = js.native
  def setSelectedColor(): scala.Unit = js.native
  def setSelectedColor(value: java.lang.String): scala.Unit = js.native
  def setSelectedColor(value: Color): scala.Unit = js.native
  def setShadowColor(): scala.Unit = js.native
  def setShadowColor(value: java.lang.String): scala.Unit = js.native
  def setShadowColor(value: Color): scala.Unit = js.native
  def setStrokeColor(): scala.Unit = js.native
  def setStrokeColor(value: java.lang.String): scala.Unit = js.native
  def setStrokeColor(value: Color): scala.Unit = js.native
}

