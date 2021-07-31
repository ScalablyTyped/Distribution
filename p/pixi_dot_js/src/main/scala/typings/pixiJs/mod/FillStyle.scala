package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fill style object for Graphics.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "FillStyle")
@js.native
class FillStyle ()
  extends StObject
     with typings.pixiJs.PIXI.FillStyle {
  
  /**
    * The alpha value used when filling the Graphics object.
    *
    * @member {number} PIXI.FillStyle#alpha
    * @default 1
    */
  /* CompleteClass */
  var alpha: Double = js.native
  
  /**
    * The hex color value used when coloring the Graphics object.
    *
    * @member {number} PIXI.FillStyle#color
    * @default 0xFFFFFF
    */
  /* CompleteClass */
  var color: Double = js.native
  
  /**
    * Destroy and don't use after this
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The transform aplpied to the texture.
    *
    * @member {PIXI.Matrix} PIXI.FillStyle#matrix
    * @default null
    */
  /* CompleteClass */
  var matrix: typings.pixiJs.PIXI.Matrix = js.native
  
  /**
    * Reset
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /**
    * The texture to be used for the fill.
    *
    * @member {PIXI.Texture} PIXI.FillStyle#texture
    * @default 0
    */
  /* CompleteClass */
  var texture: typings.pixiJs.PIXI.Texture = js.native
  
  /**
    * If the current fill is visible.
    *
    * @member {boolean} PIXI.FillStyle#visible
    * @default false
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
