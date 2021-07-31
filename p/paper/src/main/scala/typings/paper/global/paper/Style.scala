package typings.paper.global.paper

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
@JSGlobal("paper.Style")
@js.native
class Style protected ()
  extends StObject
     with typings.paper.paper.Style {
  /** 
    * Style objects don't need to be created directly. Just pass an object to
    * {@link Item#style} or {@link Project#currentStyle}, it will be converted
    * to a Style object internally.
    */
  def this(style: js.Object) = this()
  
  /** 
    * Specifies an array containing the dash and gap lengths of the stroke.
    */
  /* CompleteClass */
  var dashArray: js.Array[Double] = js.native
  
  /** 
    * The dash offset of the stroke.
    */
  /* CompleteClass */
  var dashOffset: Double = js.native
  
  /** 
    * The fill color.
    */
  /* CompleteClass */
  var fillColor: typings.paper.paper.Color | Null = js.native
  
  /** 
    * The fill-rule with which the shape gets filled. Please note that only
    * modern browsers support fill-rules other than `'nonzero'`.
    */
  /* CompleteClass */
  var fillRule: String = js.native
  
  /** 
    * The font-family to be used in text content.
    */
  /* CompleteClass */
  var fontFamily: String = js.native
  
  /** 
    * The font size of text content, as a number in pixels, or as a string with
    * optional units `'px'`, `'pt'` and `'em'`.
    */
  /* CompleteClass */
  var fontSize: Double | String = js.native
  
  /** 
    * The font-weight to be used in text content.
    */
  /* CompleteClass */
  var fontWeight: String | Double = js.native
  
  /** 
    * The justification of text paragraphs.
    */
  /* CompleteClass */
  var justification: String = js.native
  
  /** 
    * The text leading of text content.
    */
  /* CompleteClass */
  var leading: Double | String = js.native
  
  /** 
    * The miter limit of the stroke. When two line segments meet at a sharp
    * angle and miter joins have been specified for {@link #strokeJoin}, it is
    * possible for the miter to extend far beyond the {@link #strokeWidth} of
    * the path. The miterLimit imposes a limit on the ratio of the miter length
    * to the {@link #strokeWidth}.
    */
  /* CompleteClass */
  var miterLimit: Double = js.native
  
  /** 
    * The color the item is highlighted with when selected. If the item does
    * not specify its own color, the color defined by its layer is used instead.
    */
  /* CompleteClass */
  var selectedColor: typings.paper.paper.Color | Null = js.native
  
  /** 
    * The shadow's blur radius.
    */
  /* CompleteClass */
  var shadowBlur: Double = js.native
  
  /** 
    * The shadow color.
    */
  /* CompleteClass */
  var shadowColor: typings.paper.paper.Color | Null = js.native
  
  /** 
    * The shadow's offset.
    */
  /* CompleteClass */
  var shadowOffset: typings.paper.paper.Point = js.native
  
  /** 
    * The shape to be used at the beginning and end of open {@link Path} items,
    * when they have a stroke.
    */
  /* CompleteClass */
  var strokeCap: String = js.native
  
  /** 
    * The color of the stroke.
    */
  /* CompleteClass */
  var strokeColor: typings.paper.paper.Color | Null = js.native
  
  /** 
    * The shape to be used at the segments and corners of {@link Path} items
    * when they have a stroke.
    */
  /* CompleteClass */
  var strokeJoin: String = js.native
  
  /** 
    * Specifies whether the stroke is to be drawn taking the current affine
    * transformation into account (the default behavior), or whether it should
    * appear as a non-scaling stroke.
    */
  /* CompleteClass */
  var strokeScaling: Boolean = js.native
  
  /** 
    * The width of the stroke.
    */
  /* CompleteClass */
  var strokeWidth: Double = js.native
  
  /** 
    * The view that this style belongs to.
    */
  /* CompleteClass */
  override val view: typings.paper.paper.View = js.native
}
