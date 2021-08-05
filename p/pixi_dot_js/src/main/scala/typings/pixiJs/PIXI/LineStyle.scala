package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the line style for Graphics.
  * @memberof PIXI
  * @class
  * @extends PIXI.FillStyle
  */
trait LineStyle
  extends StObject
     with FillStyle {
  
  /**
    * The alignment of any lines drawn (0.5 = middle, 1 = outer, 0 = inner).
    *
    * @member {number} PIXI.LineStyle#alignment
    * @default 0.5
    */
  var alignment: Double
  
  /**
    * Line cap style.
    *
    * @member {PIXI.LINE_CAP} PIXI.LineStyle#cap
    * @default PIXI.LINE_CAP.BUTT
    */
  var cap: LINE_CAP
  
  /**
    * Line join style.
    *
    * @member {PIXI.LINE_JOIN} PIXI.LineStyle#join
    * @default PIXI.LINE_JOIN.MITER
    */
  var join: LINE_JOIN
  
  /**
    * Miter limit.
    *
    * @member {number} PIXI.LineStyle#miterLimit
    * @default 10
    */
  var miterLimit: Double
  
  /**
    * If true the lines will be draw using LINES instead of TRIANGLE_STRIP
    *
    * @member {boolean} PIXI.LineStyle#native
    * @default false
    */
  var native: Boolean
  
  /**
    * The width (thickness) of any lines drawn.
    *
    * @member {number} PIXI.LineStyle#width
    * @default 0
    */
  var width: Double
}
object LineStyle {
  
  inline def apply(
    alignment: Double,
    alpha: Double,
    cap: LINE_CAP,
    color: Double,
    destroy: () => Unit,
    join: LINE_JOIN,
    matrix: Matrix,
    miterLimit: Double,
    native: Boolean,
    reset: () => Unit,
    texture: Texture,
    visible: Boolean,
    width: Double
  ): LineStyle = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), join = join.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), texture = texture.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
  
  extension [Self <: LineStyle](x: Self) {
    
    inline def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setCap(value: LINE_CAP): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setJoin(value: LINE_JOIN): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
