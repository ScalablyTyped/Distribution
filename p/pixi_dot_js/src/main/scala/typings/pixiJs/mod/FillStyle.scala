package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fill style object for Graphics.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "FillStyle")
@js.native
class FillStyle ()
  extends typings.pixiJs.PIXI.FillStyle {
  /**
    * The alpha value used when filling the Graphics object.
    *
    * @member {number} PIXI.FillStyle#alpha
    * @default 1
    */
  /* CompleteClass */
  override var alpha: Double = js.native
  /**
    * The hex color value used when coloring the Graphics object.
    *
    * @member {number} PIXI.FillStyle#color
    * @default 1
    */
  /* CompleteClass */
  override var color: Double = js.native
  /**
    * The transform aplpied to the texture.
    *
    * @member {string} PIXI.FillStyle#matrix
    * @default 0
    */
  /* CompleteClass */
  override var matrix: String = js.native
  /**
    * The texture to be used for the fill.
    *
    * @member {string} PIXI.FillStyle#texture
    * @default 0
    */
  /* CompleteClass */
  override var texture: String = js.native
  /**
    * If the current fill is visible.
    *
    * @member {boolean} PIXI.FillStyle#visible
    * @default false
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * Destroy and don't use after this
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Reset
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
}

