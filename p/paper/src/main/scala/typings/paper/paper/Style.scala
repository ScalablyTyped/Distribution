package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * Style is used for changing the visual styles of items
  * contained within a Paper.js project and is returned by
  * {@link Item#style} and {@link Project#currentStyle}.
  * 
  * All properties of Style are also reflected directly in {@link Item},
  * i.e.: {@link Item#fillColor}.
  * 
  * To set multiple style properties in one go, you can pass an object to
  * {@link Item#style}. This is a convenient way to define a style once and
  * apply it to a series of items:
  */
trait Style extends StObject {
  
  /** 
    * Specifies an array containing the dash and gap lengths of the stroke.
    */
  var dashArray: js.Array[Double]
  
  /** 
    * The dash offset of the stroke.
    */
  var dashOffset: Double
  
  /** 
    * The fill color.
    */
  var fillColor: Color | Null
  
  /** 
    * The fill-rule with which the shape gets filled. Please note that only
    * modern browsers support fill-rules other than `'nonzero'`.
    */
  var fillRule: String
  
  /** 
    * The font-family to be used in text content.
    */
  var fontFamily: String
  
  /** 
    * The font size of text content, as a number in pixels, or as a string with
    * optional units `'px'`, `'pt'` and `'em'`.
    */
  var fontSize: Double | String
  
  /** 
    * The font-weight to be used in text content.
    */
  var fontWeight: String | Double
  
  /** 
    * The justification of text paragraphs.
    */
  var justification: String
  
  /** 
    * The text leading of text content.
    */
  var leading: Double | String
  
  /** 
    * The miter limit of the stroke. When two line segments meet at a sharp
    * angle and miter joins have been specified for {@link #strokeJoin}, it is
    * possible for the miter to extend far beyond the {@link #strokeWidth} of
    * the path. The miterLimit imposes a limit on the ratio of the miter length
    * to the {@link #strokeWidth}.
    */
  var miterLimit: Double
  
  /** 
    * The color the item is highlighted with when selected. If the item does
    * not specify its own color, the color defined by its layer is used instead.
    */
  var selectedColor: Color | Null
  
  /** 
    * The shadow's blur radius.
    */
  var shadowBlur: Double
  
  /** 
    * The shadow color.
    */
  var shadowColor: Color | Null
  
  /** 
    * The shadow's offset.
    */
  var shadowOffset: Point
  
  /** 
    * The shape to be used at the beginning and end of open {@link Path} items,
    * when they have a stroke.
    */
  var strokeCap: String
  
  /** 
    * The color of the stroke.
    */
  var strokeColor: Color | Null
  
  /** 
    * The shape to be used at the segments and corners of {@link Path} items
    * when they have a stroke.
    */
  var strokeJoin: String
  
  /** 
    * Specifies whether the stroke is to be drawn taking the current affine
    * transformation into account (the default behavior), or whether it should
    * appear as a non-scaling stroke.
    */
  var strokeScaling: Boolean
  
  /** 
    * The width of the stroke.
    */
  var strokeWidth: Double
  
  /** 
    * The view that this style belongs to.
    */
  val view: View
}
object Style {
  
  @scala.inline
  def apply(
    dashArray: js.Array[Double],
    dashOffset: Double,
    fillRule: String,
    fontFamily: String,
    fontSize: Double | String,
    fontWeight: String | Double,
    justification: String,
    leading: Double | String,
    miterLimit: Double,
    shadowBlur: Double,
    shadowOffset: Point,
    strokeCap: String,
    strokeJoin: String,
    strokeScaling: Boolean,
    strokeWidth: Double,
    view: View
  ): Style = {
    val __obj = js.Dynamic.literal(dashArray = dashArray.asInstanceOf[js.Any], dashOffset = dashOffset.asInstanceOf[js.Any], fillRule = fillRule.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], justification = justification.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], strokeCap = strokeCap.asInstanceOf[js.Any], strokeJoin = strokeJoin.asInstanceOf[js.Any], strokeScaling = strokeScaling.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], fillColor = null, selectedColor = null, shadowColor = null, strokeColor = null)
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashArray(value: js.Array[Double]): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashArrayVarargs(value: Double*): Self = StObject.set(x, "dashArray", js.Array(value :_*))
    
    @scala.inline
    def setDashOffset(value: Double): Self = StObject.set(x, "dashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColor(value: Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorNull: Self = StObject.set(x, "fillColor", null)
    
    @scala.inline
    def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustification(value: String): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeading(value: Double | String): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColor(value: Color): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedColorNull: Self = StObject.set(x, "selectedColor", null)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColor(value: Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorNull: Self = StObject.set(x, "shadowColor", null)
    
    @scala.inline
    def setShadowOffset(value: Point): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(value: String): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColor(value: Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
    
    @scala.inline
    def setStrokeJoin(value: String): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeScaling(value: Boolean): Self = StObject.set(x, "strokeScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
