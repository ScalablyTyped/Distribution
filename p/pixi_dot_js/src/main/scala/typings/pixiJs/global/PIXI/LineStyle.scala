package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the line style for Graphics.
  * @memberof PIXI
  * @class
  * @extends PIXI.FillStyle
  */
@JSGlobal("PIXI.LineStyle")
@js.native
class LineStyle ()
  extends typings.pixiJs.PIXI.LineStyle {
  /**
    * The alignment of any lines drawn (0.5 = middle, 1 = outer, 0 = inner).
    *
    * @member {number} PIXI.LineStyle#alignment
    * @default 0.5
    */
  /* CompleteClass */
  override var alignment: Double = js.native
  /**
    * The alpha value used when filling the Graphics object.
    *
    * @member {number} PIXI.FillStyle#alpha
    * @default 1
    */
  /* CompleteClass */
  override var alpha: Double = js.native
  /**
    * Line cap style.
    *
    * @member {PIXI.LINE_CAP} PIXI.LineStyle#cap
    * @default PIXI.LINE_CAP.BUTT
    */
  /* CompleteClass */
  override var cap: typings.pixiJs.PIXI.LINE_CAP = js.native
  /**
    * The hex color value used when coloring the Graphics object.
    *
    * @member {number} PIXI.FillStyle#color
    * @default 0xFFFFFF
    */
  /* CompleteClass */
  override var color: Double = js.native
  /**
    * Line join style.
    *
    * @member {PIXI.LINE_JOIN} PIXI.LineStyle#join
    * @default PIXI.LINE_JOIN.MITER
    */
  /* CompleteClass */
  override var join: typings.pixiJs.PIXI.LINE_JOIN = js.native
  /**
    * The transform aplpied to the texture.
    *
    * @member {PIXI.Matrix} PIXI.FillStyle#matrix
    * @default null
    */
  /* CompleteClass */
  override var matrix: typings.pixiJs.PIXI.Matrix = js.native
  /**
    * Miter limit.
    *
    * @member {number} PIXI.LineStyle#miterLimit
    * @default 10
    */
  /* CompleteClass */
  override var miterLimit: Double = js.native
  /**
    * If true the lines will be draw using LINES instead of TRIANGLE_STRIP
    *
    * @member {boolean} PIXI.LineStyle#native
    * @default false
    */
  /* CompleteClass */
  override var native: Boolean = js.native
  /**
    * The texture to be used for the fill.
    *
    * @member {PIXI.Texture} PIXI.FillStyle#texture
    * @default 0
    */
  /* CompleteClass */
  override var texture: typings.pixiJs.PIXI.Texture = js.native
  /**
    * If the current fill is visible.
    *
    * @member {boolean} PIXI.FillStyle#visible
    * @default false
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * The width (thickness) of any lines drawn.
    *
    * @member {number} PIXI.LineStyle#width
    * @default 0
    */
  /* CompleteClass */
  override var width: Double = js.native
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

