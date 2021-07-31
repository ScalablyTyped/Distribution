package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fill style object for Graphics.
  *
  * @class
  * @memberof PIXI
  */
trait FillStyle extends StObject {
  
  /**
    * The alpha value used when filling the Graphics object.
    *
    * @member {number} PIXI.FillStyle#alpha
    * @default 1
    */
  var alpha: Double
  
  /**
    * The hex color value used when coloring the Graphics object.
    *
    * @member {number} PIXI.FillStyle#color
    * @default 0xFFFFFF
    */
  var color: Double
  
  /**
    * Destroy and don't use after this
    */
  def destroy(): Unit
  
  /**
    * The transform aplpied to the texture.
    *
    * @member {PIXI.Matrix} PIXI.FillStyle#matrix
    * @default null
    */
  var matrix: Matrix
  
  /**
    * Reset
    */
  def reset(): Unit
  
  /**
    * The texture to be used for the fill.
    *
    * @member {PIXI.Texture} PIXI.FillStyle#texture
    * @default 0
    */
  var texture: Texture
  
  /**
    * If the current fill is visible.
    *
    * @member {boolean} PIXI.FillStyle#visible
    * @default false
    */
  var visible: Boolean
}
object FillStyle {
  
  @scala.inline
  def apply(
    alpha: Double,
    color: Double,
    destroy: () => Unit,
    matrix: Matrix,
    reset: () => Unit,
    texture: Texture,
    visible: Boolean
  ): FillStyle = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), texture = texture.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStyle]
  }
  
  @scala.inline
  implicit class FillStyleMutableBuilder[Self <: FillStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMatrix(value: Matrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
